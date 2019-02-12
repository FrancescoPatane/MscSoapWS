package it.niuma.mscsoapws.ws.interceptor;

import java.io.*;
import java.util.*;

import javax.xml.namespace.NamespaceContext;
import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.dom.DOMSource;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import com.sun.org.apache.xerces.internal.dom.DeferredElementImpl;
import org.apache.wss4j.dom.engine.WSSecurityEngine;
import org.apache.wss4j.dom.handler.WSHandlerResult;
import org.apache.wss4j.dom.util.WSSecurityUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.server.EndpointInterceptor;
import org.springframework.ws.soap.SoapBody;
import org.springframework.ws.soap.SoapHeader;
import org.springframework.ws.soap.SoapMessage;
import org.springframework.ws.soap.saaj.SaajSoapMessage;
import org.w3c.dom.*;
import org.xml.sax.InputSource;

import it.niuma.mscsoapws.repository.VnWsCredentialRepository;
import it.niuma.mscsoapws.ws.GetPOrderRequest;
import it.niuma.mscsoapws.ws.util.AuthUtility;

public class CustomEndpointInterceptor implements EndpointInterceptor {

	@Autowired
	private AuthUtility authUtility;
	
	@Override
	public boolean handleRequest(MessageContext messageContext, Object endpoint) throws Exception {

		
		System.out.println("### SOAP REQUEST ###");
		InputStream is = null;
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setNamespaceAware(true);
		Document doc = null;
			//-------

		try {
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			messageContext.getRequest().writeTo(buffer);
			String payload = buffer.toString(java.nio.charset.StandardCharsets.UTF_8.name());
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
				if("soapenv".equals(prefix)){
					return "http://schemas.xmlsoap.org/soap/envelope/";
				}else{
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
		XPathExpression expr = xpath.compile("//soapenv:Envelope//soapenv:Header//text()[normalize-space()]");
		Object result = expr.evaluate(doc, XPathConstants.NODESET);
		NodeList nodes = (NodeList) result;
		Map<String, String> mappedValuesFromHeader = new HashMap<>();
		for (int i = 0; i < nodes.getLength(); i++) {
			Node currentItem = nodes.item(i);
			String key = currentItem.getParentNode().getNodeName().split("wsse:")[1].toLowerCase();
			mappedValuesFromHeader.put(key, currentItem.getNodeValue());
		}

		//String hashedPass = AuthUtility.obtaindMD5Value(mappedValuesFromHeader.get("password"));


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
