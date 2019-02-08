package it.niuma.mscsoapws.ws.endpoint;

import java.util.List;

import it.niuma.mscsoapws.ws.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import it.niuma.mscsoapws.model.VnWsCredential;
import it.niuma.mscsoapws.service.BusinessService;
import it.niuma.mscsoapws.service.PLotService;
import it.niuma.mscsoapws.ws.exception.InvalidCredentialsException;
import it.niuma.mscsoapws.ws.util.AuthUtility;


@Endpoint
public class ServiceEndpoint {
	
	public static final String NAMESPACE= "it.niuma.mscsoapws.ws";
	
	@Autowired
	private BusinessService service;
	
	@Autowired
	private AuthUtility authUtil;
	
	@Autowired
	PLotService pLotService;
	
	@PayloadRoot(namespace = NAMESPACE, localPart = "getPOrderRequest")
	@ResponsePayload
	public GetPOrderResponse getPOrderRequest(@RequestPayload GetPOrderRequest request) throws Exception {
		GetPOrderResponse response = new GetPOrderResponse();
		POrderXml pOrder = service.getPOrderFromOrderNumber(request.getPoNumber());
		response.setPOrder(pOrder);
		return response;
	}
	
	@PayloadRoot(namespace = NAMESPACE, localPart = "loginRequest")
	@ResponsePayload
	public LoginResponse executeLoginRequest(@RequestPayload LoginRequest request) throws InvalidCredentialsException {
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

	@PayloadRoot(namespace = NAMESPACE, localPart = "getPOrderLineFromID")
	@ResponsePayload
	public GetPOrderLineFromIDResponse getPOrderLineFromID (@RequestPayload GetPOrderLineFromID request)  {
		GetPOrderLineFromIDResponse response = new GetPOrderLineFromIDResponse();
		POrderLineXml pOrderLine = service.findPOrderLineById(request.getId());
		response.setPOrderLine(pOrderLine);
		return response;
	}
	
	@PayloadRoot(namespace = NAMESPACE, localPart = "createNewPLotRequest")
	@ResponsePayload
	public CreateNewPLotResponse createNewPLotRequest(@RequestPayload CreateNewPLotRequest request) {
		CreateNewPLotResponse response = new CreateNewPLotResponse();
		POrderXml isItPresent = null;
		try {
			isItPresent = service.getPOrderFromOrderNumber(request.getNumeroOrdine());
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
