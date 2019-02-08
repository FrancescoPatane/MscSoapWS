package it.niuma.mscsoapws.ws.endpoint;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import it.niuma.mscsoapws.model.VnWsCredential;
import it.niuma.mscsoapws.service.POrderService;
import it.niuma.mscsoapws.service.PLotService;
import it.niuma.mscsoapws.ws.CreateNewPLotRequest;
import it.niuma.mscsoapws.ws.CreateNewPLotResponse;
import it.niuma.mscsoapws.ws.GetPOrderRequest;
import it.niuma.mscsoapws.ws.GetPOrderResponse;
import it.niuma.mscsoapws.ws.LoginRequest;
import it.niuma.mscsoapws.ws.LoginResponse;
import it.niuma.mscsoapws.ws.PLotXml;
import it.niuma.mscsoapws.ws.POrderXml;
import it.niuma.mscsoapws.ws.exception.InvalidCredentialsException;
import it.niuma.mscsoapws.ws.exception.PorderNotFoundException;
import it.niuma.mscsoapws.ws.exception.ServerErrorException;
import it.niuma.mscsoapws.ws.util.AuthUtility;


@Endpoint
public class ServiceEndpoint {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	public static final String NAMESPACE= "it.niuma.mscsoapws.ws";
	
	@Autowired
	private POrderService pOrderervice;
	
	@Autowired
	private AuthUtility authUtil;
	
	@Autowired
	PLotService pLotService;
	
	@PayloadRoot(namespace = NAMESPACE, localPart = "getPOrderRequest")
	@ResponsePayload
	public GetPOrderResponse getPOrderRequest(@RequestPayload GetPOrderRequest request) throws PorderNotFoundException, ServerErrorException  {
		logger.info("Received webservice call for getPOrderRequest");
		GetPOrderResponse response = new GetPOrderResponse();
		POrderXml pOrder = pOrderervice.getPOrderFromOrderNumber(request.getPoNumber());
		response.setPOrder(pOrder);
		return response;
	}
	
	@PayloadRoot(namespace = NAMESPACE, localPart = "loginRequest")
	@ResponsePayload
	public LoginResponse executeLoginRequest(@RequestPayload LoginRequest request) throws InvalidCredentialsException {
		logger.info("Received webservice call for executeLoginRequest");
		LoginResponse response = new LoginResponse();
		String username = request.getUsername();
		String password = request.getPassword();
		List<VnWsCredential> storedCredentials = authUtil.getStoredCredentials(username, password);
		if (storedCredentials.size()>0) {
			response.setAccessToken(authUtil.generateToken(storedCredentials.get(0)));
		}else {
			throw new InvalidCredentialsException("Invalid credentials");
		}
		return response;
	}
	
	@PayloadRoot(namespace = NAMESPACE, localPart = "createNewPLotRequest")
	@ResponsePayload
	public CreateNewPLotResponse createNewPLotRequest(@RequestPayload CreateNewPLotRequest request) {
		logger.info("Received webservice call for createNewPLotRequest");
		CreateNewPLotResponse response = new CreateNewPLotResponse();
		POrderXml isItPresent = null;
		try {
			isItPresent = pOrderervice.getPOrderFromOrderNumber(request.getNumeroOrdine());
		} catch(Exception ex) {
			ex.printStackTrace();
			return response;
		}
		//I can assume that the orderNumber is unique
		PLotXml something  = isItPresent != null ? pLotService.deleteAndCreateNewPLot(request.getNumeroOrdine(), 
				request.getNumeroDDT(),request.getDtEmissione(),request.getDtIngresso()) :
					pLotService.createNewPlot(request.getNumeroOrdine(), 
				request.getNumeroDDT(),request.getDtEmissione(),request.getDtIngresso());

		return response;
	}
	
	


}
