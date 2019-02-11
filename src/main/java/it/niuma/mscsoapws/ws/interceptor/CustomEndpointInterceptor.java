package it.niuma.mscsoapws.ws.interceptor;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.util.Iterator;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPMessage;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.dom.DOMSource;

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
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
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
        try {
            ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            Source s = messageContext.getRequest().getPayloadSource();
            messageContext.getRequest().writeTo(buffer);
            String payload = buffer.toString(java.nio.charset.StandardCharsets.UTF_8.name());
            System.out.println(payload);
            
            
            DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            InputSource src = new InputSource();
            src.setCharacterStream(new StringReader(payload));

            Document doc = builder.parse(src);
            String password = doc.getElementsByTagName("wsse:Password").item(0).getTextContent();
//            String name = doc.getElementsByTagName("name").item(0).getTextContent();
            System.out.println(password);

            
        } catch (IOException e) {
//            throw new WebServiceClientException("Can not write the SOAP request into the out stream", e) {
//                private static final long serialVersionUID = -7118480620416458069L;
            };

		
		
//		SaajSoapMessage saajSoapMessage = (SaajSoapMessage) messageContext.getRequest();
//		SOAPMessage soapMessage = saajSoapMessage.getSaajMessage();
//		SOAPBody soapBody = soapMessage.getSOAPBody();		
//		soapenv:Bod
//		Iterator it =soapBody.getAllAttributes();
//		
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}
		
//		WebServiceMessage webServiceMessageRequest = messageContext.getRequest();
//		SoapMessage soapMessage = (SoapMessage) webServiceMessageRequest;
//		SoapHeader soapHeader = soapMessage.getSoapHeader();
		
//		Source bodySource = soapHeader.getSource();
//		DOMSource bodyDomSource = (DOMSource) bodySource;
//		Node bodyNode = bodyDomSource.getNode();	
		
//		Document envelopeAsDocument = soapMessage.getDocument();
//        Element elem = WSSecurityUtil.getSecurityHeader(envelopeAsDocument, "");
//        WSSecurityEngine secegine = new WSSecurityEngine();
//        WSHandlerResult result = secegine.processSecurityHeader(elem, validationData);
		
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
