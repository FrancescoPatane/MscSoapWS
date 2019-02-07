//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.02.06 alle 05:46:57 PM CET 
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
 *         &lt;element name="PLot" type="{it.niuma.mscsoapws.ws}PLotXml"/>
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
    "pLot"
})
@XmlRootElement(name = "createNewPLotResponse")
public class CreateNewPLotResponse {

    @XmlElement(name = "PLot", required = true)
    protected PLotXml pLot;

    /**
     * Recupera il valore della proprietà pLot.
     * 
     * @return
     *     possible object is
     *     {@link PLotXml }
     *     
     */
    public PLotXml getPLot() {
        return pLot;
    }

    /**
     * Imposta il valore della proprietà pLot.
     * 
     * @param value
     *     allowed object is
     *     {@link PLotXml }
     *     
     */
    public void setPLot(PLotXml value) {
        this.pLot = value;
    }

}
