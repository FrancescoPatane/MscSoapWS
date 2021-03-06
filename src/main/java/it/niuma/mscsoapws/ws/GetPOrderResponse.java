
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
 *         &lt;element name="statusCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="success" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pOrder" type="{it.niuma.mscsoapws.ws}POrderXml"/>
 *         &lt;element name="requiresLogistic" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "statusCode",
    "success",
    "message",
    "pOrder",
    "requiresLogistic"
})
@XmlRootElement(name = "getPOrderResponse", namespace = "it.niuma.mscsoapws.ws")
public class GetPOrderResponse {

    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected int statusCode;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected boolean success;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", required = true)
    protected String message;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", required = true)
    protected POrderXml pOrder;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected boolean requiresLogistic;

    /**
     * Recupera il valore della propriet� statusCode.
     * 
     */
    public int getStatusCode() {
        return statusCode;
    }

    /**
     * Imposta il valore della propriet� statusCode.
     * 
     */
    public void setStatusCode(int value) {
        this.statusCode = value;
    }

    /**
     * Recupera il valore della propriet� success.
     * 
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * Imposta il valore della propriet� success.
     * 
     */
    public void setSuccess(boolean value) {
        this.success = value;
    }

    /**
     * Recupera il valore della propriet� message.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Imposta il valore della propriet� message.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Recupera il valore della propriet� pOrder.
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
     * Imposta il valore della propriet� pOrder.
     * 
     * @param value
     *     allowed object is
     *     {@link POrderXml }
     *     
     */
    public void setPOrder(POrderXml value) {
        this.pOrder = value;
    }

    /**
     * Recupera il valore della propriet� requiresLogistic.
     * 
     */
    public boolean isRequiresLogistic() {
        return requiresLogistic;
    }

    /**
     * Imposta il valore della propriet� requiresLogistic.
     * 
     */
    public void setRequiresLogistic(boolean value) {
        this.requiresLogistic = value;
    }

}
