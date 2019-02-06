//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.02.06 alle 12:52:41 PM CET 
//


package it.niuma.mscsoapws.ws;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="POrderLines" type="{it.niuma.mscsoapws.ws}POrderLineXml" maxOccurs="unbounded" minOccurs="0"/>
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
    "pOrderLines"
})
@XmlRootElement(name = "getPOrderLineFromPOrderRefResponse")
public class GetPOrderLineFromPOrderRefResponse {

    @XmlElement(name = "POrderLines")
    protected List<POrderLineXml> pOrderLines;

    /**
     * Gets the value of the pOrderLines property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pOrderLines property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPOrderLines().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POrderLineXml }
     * 
     * 
     */
    public List<POrderLineXml> getPOrderLines() {
        if (pOrderLines == null) {
            pOrderLines = new ArrayList<POrderLineXml>();
        }
        return this.pOrderLines;
    }

}
