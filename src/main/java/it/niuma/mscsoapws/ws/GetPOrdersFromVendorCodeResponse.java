
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
 *         &lt;element name="statusCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="success" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="orders" type="{it.niuma.mscsoapws.ws}POrderXml" maxOccurs="unbounded" minOccurs="0"/>
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
    "orders"
})
@XmlRootElement(name = "getPOrdersFromVendorCodeResponse", namespace = "it.niuma.mscsoapws.ws")
public class GetPOrdersFromVendorCodeResponse {

    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected int statusCode;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected boolean success;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", required = true)
    protected String message;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected List<POrderXml> orders;

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
     * Gets the value of the orders property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orders property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrders().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POrderXml }
     * 
     * 
     */
    public List<POrderXml> getOrders() {
        if (orders == null) {
            orders = new ArrayList<POrderXml>();
        }
        return this.orders;
    }

}
