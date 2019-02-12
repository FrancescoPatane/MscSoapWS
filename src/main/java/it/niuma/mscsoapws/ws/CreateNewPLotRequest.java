
package it.niuma.mscsoapws.ws;

import it.niuma.mscsoapws.ws.PLotDataFromInput;
import it.niuma.mscsoapws.ws.PLotLineDataFromInput;

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
 *         &lt;element name="accessToken" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="plotToCreate" type="{it.niuma.mscsoapws.ws}pLotDataFromInput"/>
 *         &lt;element name="plotLineToCreate" type="{it.niuma.mscsoapws.ws}pLotLineDataFromInput" maxOccurs="unbounded" minOccurs="0"/>
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
    "accessToken",
    "plotToCreate",
    "plotLineToCreate"
})
@XmlRootElement(name = "createNewPLotRequest", namespace = "it.niuma.mscsoapws.ws")
public class CreateNewPLotRequest {

    @XmlElement(namespace = "it.niuma.mscsoapws.ws", required = true)
    protected String accessToken;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", required = true)
    protected PLotDataFromInput plotToCreate;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected List<PLotLineDataFromInput> plotLineToCreate;

    /**
     * Recupera il valore della propriet� accessToken.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * Imposta il valore della propriet� accessToken.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessToken(String value) {
        this.accessToken = value;
    }

    /**
     * Recupera il valore della propriet� plotToCreate.
     * 
     * @return
     *     possible object is
     *     {@link PLotDataFromInput }
     *     
     */
    public PLotDataFromInput getPlotToCreate() {
        return plotToCreate;
    }

    /**
     * Imposta il valore della propriet� plotToCreate.
     * 
     * @param value
     *     allowed object is
     *     {@link PLotDataFromInput }
     *     
     */
    public void setPlotToCreate(PLotDataFromInput value) {
        this.plotToCreate = value;
    }

    /**
     * Gets the value of the plotLineToCreate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the plotLineToCreate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlotLineToCreate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PLotLineDataFromInput }
     * 
     * 
     */
    public List<PLotLineDataFromInput> getPlotLineToCreate() {
        if (plotLineToCreate == null) {
            plotLineToCreate = new ArrayList<PLotLineDataFromInput>();
        }
        return this.plotLineToCreate;
    }

}
