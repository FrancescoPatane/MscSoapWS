//
// Questo file � stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andr� persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.02.08 alle 04:02:35 PM CET 
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
 *         &lt;element name="itemExpiry" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "itemExpiry"
})
@XmlRootElement(name = "getPOrderLineFromItemExpiry")
public class GetPOrderLineFromItemExpiry {

    @XmlElement(required = true)
    protected String itemExpiry;

    /**
     * Recupera il valore della propriet� itemExpiry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemExpiry() {
        return itemExpiry;
    }

    /**
     * Imposta il valore della propriet� itemExpiry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemExpiry(String value) {
        this.itemExpiry = value;
    }

}
