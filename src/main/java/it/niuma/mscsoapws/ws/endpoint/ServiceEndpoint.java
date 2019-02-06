package it.niuma.mscsoapws.ws.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import it.niuma.mscsoapws.service.BusinessService;
import it.niuma.mscsoapws.ws.GetPOrderRequest;
import it.niuma.mscsoapws.ws.GetPOrderResponse;
import it.niuma.mscsoapws.ws.LoginRequest;
import it.niuma.mscsoapws.ws.LoginResponse;
import it.niuma.mscsoapws.ws.POrderXml;


@Endpoint
public class ServiceEndpoint {
	
	public static final String NAMESPACE= "it.niuma.mscsoapws.ws";
	
	@Autowired
	BusinessService service;
	
	@PayloadRoot(namespace = NAMESPACE, localPart = "getPOrderRequest")
	@ResponsePayload
	public GetPOrderResponse getPOrderRequest(@RequestPayload GetPOrderRequest request) throws Exception {
		GetPOrderResponse response = new GetPOrderResponse();
		
		POrderXml pOrder = service.getPOrderFromOrderNumber(request.getPoNumber());//pOrderRepository.findByPoNumber(request.getPoNumber());
		
		response.setPOrder(pOrder);
		
		

		return response;
	}
	
	@PayloadRoot(namespace = NAMESPACE, localPart = "loginRequest")
	@ResponsePayload
	public LoginResponse executeLoginRequest(@RequestPayload LoginRequest request) {
		LoginResponse response = new LoginResponse();
		response.setAccessToken("aaa7777fff");
		return response;
	}
	


}