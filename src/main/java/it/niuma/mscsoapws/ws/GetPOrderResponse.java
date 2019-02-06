//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.02.06 alle 12:01:49 PM CET 
//


package it.niuma.mscsoapws.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pOrder" type="{it.niuma.mscsoapws.ws}POrderXml"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pOrder"
})
@XmlRootElement(name = "getPOrderResponse")
public class GetPOrderResponse {

    @XmlElement(required = true)
    protected POrderXml pOrder;

    /**
     * Recupera il valore della proprietà pOrder.
     * 
     * @return
     *     possible object is
     *     {@link POrderXml }
     *     
     */
    public POrderXml getPOrder() {
        return pOrder;
    }

    /**
     * Imposta il valore della proprietà pOrder.
     * 
     * @param value
     *     allowed object is
     *     {@link POrderXml }
     *     
     */
    public void setPOrder(POrderXml value) {
        this.pOrder = value;
    }

}
