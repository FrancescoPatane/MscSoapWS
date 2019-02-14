package it.niuma.mscsoapws.ws.interceptor;

import java.io.*;
import java.util.*;

import javax.xml.namespace.NamespaceContext;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPMessage;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import it.niuma.mscsoapws.ws.endpoint.UserLoginEndpoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.context.MessageContext;

import org.springframework.ws.server.SmartEndpointInterceptor;
import org.springframework.ws.server.endpoint.MethodEndpoint;
import org.w3c.dom.*;

import it.niuma.mscsoapws.ws.util.AuthUtility;

public class TokekCheckInterceptor implements SmartEndpointInterceptor {

	@Autowired
	private AuthUtility authUtility;

	@Override
	public boolean handleRequest(MessageContext messageContext, Object endpoint) throws Exception {
		WebServiceMessage message = messageContext.getRequest();
		System.out.println("### SOAP REQUEST ###");
		//There is a huge problem: whether the user is logging in or not, this point will always be executed.
		//This means that there will likely be an exception if I'm logging in. For this reason, I'm forcing to
		//return true if SomeEndpoint != UserLoginEndPoint returns false
		if (!(Boolean)messageContext.getProperty("shouldFollow")) {
			//This way, I'm able to proceed with the login logic
			return true;
		}
		InputStream is = null;
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setNamespaceAware(true);
		Document doc = null;
		try {
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			messageContext.getRequest().writeTo(buffer);
			String payload = buffer.toString(java.nio.charset.StandardCharsets.UTF_8.name());
			System.out.println(payload);
			is = new ByteArrayInputStream(payload.getBytes());
			DocumentBuilder builder = factory.newDocumentBuilder();
			doc = builder.parse(is);
		} catch (IOException ex) {
			ex.printStackTrace();
			return false;
		}

		XPath xpath = XPathFactory.newInstance().newXPath();
		xpath.setNamespaceContext(new NamespaceContext() {
			@Override
			public String getNamespaceURI(String prefix) {
				switch(prefix) {
					case "soapenv":
						return "http://schemas.xmlsoap.org/soap/envelope/";
					case "it":
						return "it.niuma.mscsoapws.ws";
					default:
						return null;
				}
			}

			@Override
			public String getPrefix(String namespaceURI) {
				return null;
			}

			@Override
			public Iterator getPrefixes(String namespaceURI) {
				return null;
			}
		});
		XPathExpression expr = xpath.compile("//*//it:accessToken//text()");
		Object result = expr.evaluate(doc, XPathConstants.NODE);
		Node node = (Node) result;
		String token = node.getNodeValue();
		//return authUtility.checkTokenIsValid(token);
		messageContext.setProperty("token", "ciaooooooo");
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

	@Override
	public boolean shouldIntercept(MessageContext messageContext, Object endpoint) {
		if (endpoint instanceof MethodEndpoint) {
			MethodEndpoint methodEndpoint = (MethodEndpoint)endpoint;
			System.out.println(methodEndpoint.getMethod().getDeclaringClass());
			System.out.println(methodEndpoint.getMethod().getDeclaringClass() != UserLoginEndpoint.class);
			messageContext.setProperty("shouldFollow",methodEndpoint.getMethod().getDeclaringClass() != UserLoginEndpoint.class);
			return methodEndpoint.getMethod().getDeclaringClass() != UserLoginEndpoint.class;
		}
		return false;
	}
}
