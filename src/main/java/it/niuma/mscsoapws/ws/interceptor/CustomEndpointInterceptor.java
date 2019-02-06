package it.niuma.mscsoapws.ws.interceptor;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMResult;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.server.EndpointInterceptor;
import org.springframework.ws.soap.SoapBody;
import org.springframework.ws.soap.saaj.SaajSoapMessage;
import org.w3c.dom.Node;

import it.niuma.mscsoapws.repository.VnWsCredentialRepository;
import it.niuma.mscsoapws.ws.GetPOrderRequest;
import it.niuma.mscsoapws.ws.util.AuthUtility;

public class CustomEndpointInterceptor implements EndpointInterceptor {

	@Autowired
	private AuthUtility authUtility;
	
	@Override
	public boolean handleRequest(MessageContext messageContext, Object endpoint) throws Exception {

		SaajSoapMessage saajSoapMessage = (SaajSoapMessage) messageContext.getRequest();
		return true;
	}

	@Override
	public boolean handleResponse(MessageContext messageContext, Object endpoint) throws Exception {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean handleFault(MessageContext messageContext, Object endpoint) throws Exception {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void afterCompletion(MessageContext messageContext, Object endpoint, Exception ex) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
