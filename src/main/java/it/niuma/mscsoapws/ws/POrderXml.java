//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.02.06 alle 12:01:49 PM CET 
//


package it.niuma.mscsoapws.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per POrderXml complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="POrderXml">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="poNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="entityId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="entityName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="voyageCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deliveryPortCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="poInternalId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="deliveryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="orderLines" type="{it.niuma.mscsoapws.ws}POrderLineXml" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POrderXml", propOrder = {
    "poNumber",
    "entityId",
    "entityName",
    "voyageCode",
    "deliveryPortCode",
    "poInternalId",
    "deliveryDate",
    "createDate",
    "orderLines"
})
public class POrderXml {

    @XmlElement(required = true)
    protected String poNumber;
    @XmlElement(required = true)
    protected String entityId;
    @XmlElement(required = true)
    protected String entityName;
    @XmlElement(required = true)
    protected String voyageCode;
    @XmlElement(required = true)
    protected String deliveryPortCode;
    protected long poInternalId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deliveryDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDate;
    protected List<POrderLineXml> orderLines;

    /**
     * Recupera il valore della proprietà poNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoNumber() {
        return poNumber;
    }

    /**
     * Imposta il valore della proprietà poNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoNumber(String value) {
        this.poNumber = value;
    }

    /**
     * Recupera il valore della proprietà entityId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityId() {
        return entityId;
    }

    /**
     * Imposta il valore della proprietà entityId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityId(String value) {
        this.entityId = value;
    }

    /**
     * Recupera il valore della proprietà entityName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityName() {
        return entityName;
    }

    /**
     * Imposta il valore della proprietà entityName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityName(String value) {
        this.entityName = value;
    }

    /**
     * Recupera il valore della proprietà voyageCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoyageCode() {
        return voyageCode;
    }

    /**
     * Imposta il valore della proprietà voyageCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoyageCode(String value) {
        this.voyageCode = value;
    }

    /**
     * Recupera il valore della proprietà deliveryPortCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryPortCode() {
        return deliveryPortCode;
    }

    /**
     * Imposta il valore della proprietà deliveryPortCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryPortCode(String value) {
        this.deliveryPortCode = value;
    }

    /**
     * Recupera il valore della proprietà poInternalId.
     * 
     */
    public long getPoInternalId() {
        return poInternalId;
    }

    /**
     * Imposta il valore della proprietà poInternalId.
     * 
     */
    public void setPoInternalId(long value) {
        this.poInternalId = value;
    }

    /**
     * Recupera il valore della proprietà deliveryDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeliveryDate() {
        return deliveryDate;
    }

    /**
     * Imposta il valore della proprietà deliveryDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeliveryDate(XMLGregorianCalendar value) {
        this.deliveryDate = value;
    }

    /**
     * Recupera il valore della proprietà createDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDate() {
        return createDate;
    }

    /**
     * Imposta il valore della proprietà createDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDate(XMLGregorianCalendar value) {
        this.createDate = value;
    }

    /**
     * Gets the value of the orderLines property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderLines property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderLines().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POrderLineXml }
     * 
     * 
     */
    public List<POrderLineXml> getOrderLines() {
        if (orderLines == null) {
            orderLines = new ArrayList<POrderLineXml>();
        }
        return this.orderLines;
    }

}
