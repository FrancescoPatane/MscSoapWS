package it.niuma.mscsoapws.ws.endpoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import it.niuma.mscsoapws.model.VnWsCredential;
import it.niuma.mscsoapws.service.BusinessService;
import it.niuma.mscsoapws.ws.GetPOrderRequest;
import it.niuma.mscsoapws.ws.GetPOrderResponse;
import it.niuma.mscsoapws.ws.LoginRequest;
import it.niuma.mscsoapws.ws.LoginResponse;
import it.niuma.mscsoapws.ws.POrderXml;
import it.niuma.mscsoapws.ws.exception.InvalidCredentialsException;
import it.niuma.mscsoapws.ws.util.AuthUtility;


@Endpoint
public class ServiceEndpoint {
	
	public static final String NAMESPACE= "it.niuma.mscsoapws.ws";
	
	@Autowired
	private BusinessService service;
	
	@Autowired
	private AuthUtility authUtil;
	
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
	


}
