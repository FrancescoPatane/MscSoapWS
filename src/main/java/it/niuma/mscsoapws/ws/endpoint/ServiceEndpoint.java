package it.niuma.mscsoapws.ws.endpoint;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import it.niuma.mscsoapws.service.UserService;
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

	@Autowired
	UserService userService;
	
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
		String accessToken = request.getAccessToken();
		if (userService.hasTokenExpired(accessToken)) {
			BigDecimal vendorID = userService.getVendorIDFromAccessToken(accessToken);
			BigDecimal userID = userService.getUserIdByVendorID(vendorID);
			//I can assume that the orderNumber is unique and that it already exists
			Map<String, Object> newLine  = pLotService.executePlotCreationLogic(
					request.getNumeroOrdine(),
					request.getNumeroDDT(),
					request.getDtEmissione(),
					request.getDtIngresso(),
					request.getPesoVariabile(),
					request.getNrLotto(),
					request.getNrNetto(),
					request.getNrLordo(),
					request.getQuantitaConfermata(),
					request.getNrColli(),
					request.getNrPezziConf(),
					request.getDtScadenza(),
					request.getDocDoganale(),
					request.getNDocDoganale(),
					userID,
					request.getCodiceSSCCPallett(),
					request.getGlobalTradeItemNumber(),
					request.getNrRiga(),
					request.getCodiceArticolo(),
					request.getUnitaMisura(),
					request.getPaeseOrigine(),
					request.getPaeseProvenienza(),
					request.getDocSanitario(),
					request.getDataDocSanitario(),
					request.getDfFattura(),
					request.getDtFattura(),
					request.getCodiceAnimo(),
					request.getSif(),
					request.getVoceDoganale(),
					request.getIdPallet()
			);
			PLotXml plot = (PLotXml) newLine.get("PLot");
			PLotLineXml pLotLineXml = (PLotLineXml) newLine.get("PLotLine");
			response.setPLot(plot);
			response.setPLotLine(pLotLineXml);
		}
		return response;
	}

	


}
