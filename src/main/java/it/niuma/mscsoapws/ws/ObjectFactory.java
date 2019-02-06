//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.02.06 alle 12:01:49 PM CET 
//


package it.niuma.mscsoapws.ws;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.niuma.mscsoapws.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.niuma.mscsoapws.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetPOrderResponse }
     * 
     */
    public GetPOrderResponse createGetPOrderResponse() {
        return new GetPOrderResponse();
    }

    /**
     * Create an instance of {@link POrderXml }
     * 
     */
    public POrderXml createPOrderXml() {
        return new POrderXml();
    }

    /**
     * Create an instance of {@link GetPOrderRequest }
     * 
     */
    public GetPOrderRequest createGetPOrderRequest() {
        return new GetPOrderRequest();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link LoginRequest }
     * 
     */
    public LoginRequest createLoginRequest() {
        return new LoginRequest();
    }

    /**
     * Create an instance of {@link POrderLineXml }
     * 
     */
    public POrderLineXml createPOrderLineXml() {
        return new POrderLineXml();
    }

}
