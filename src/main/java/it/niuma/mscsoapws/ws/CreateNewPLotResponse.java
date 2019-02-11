
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
 *         &lt;element name="PLotLine" type="{it.niuma.mscsoapws.ws}PLotLineXml"/>
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
    "pLot",
    "pLotLine"
})
@XmlRootElement(name = "createNewPLotResponse", namespace = "it.niuma.mscsoapws.ws")
public class CreateNewPLotResponse {

    @XmlElement(name = "PLot", namespace = "it.niuma.mscsoapws.ws", required = true)
    protected PLotXml pLot;
    @XmlElement(name = "PLotLine", namespace = "it.niuma.mscsoapws.ws", required = true)
    protected PLotLineXml pLotLine;

    /**
     * Recupera il valore della propriet� pLot.
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
     * Imposta il valore della propriet� pLot.
     * 
     * @param value
     *     allowed object is
     *     {@link PLotXml }
     *     
     */
    public void setPLot(PLotXml value) {
        this.pLot = value;
    }

    /**
     * Recupera il valore della propriet� pLotLine.
     * 
     * @return
     *     possible object is
     *     {@link PLotLineXml }
     *     
     */
    public PLotLineXml getPLotLine() {
        return pLotLine;
    }

    /**
     * Imposta il valore della propriet� pLotLine.
     * 
     * @param value
     *     allowed object is
     *     {@link PLotLineXml }
     *     
     */
    public void setPLotLine(PLotLineXml value) {
        this.pLotLine = value;
    }

}
