
package it.niuma.mscsoapws.ws;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="interfaceID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="entityId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="poInternalId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="entityName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="entityGl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hqID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hqGl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="invoicingHqCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="invoicingHqName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="buyerGroup" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deliveryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="deliveryPortCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="voyageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="poNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="orderRequestID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="vendorCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vendorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vendorGL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vendorExternalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentTerms" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deliveryTerms" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="portAgentCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="portAgentName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="currencyRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="documentValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="coEnabled" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="coVendorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coVendorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="container" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="discountGlobal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="taxGlobal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="fullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentPoID" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="poCancelledStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="exportFileRevision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="externalRequestID" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="destinationPoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statusID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="coDateSupplier" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="deliveryPortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inviatoDa" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="dataInvio" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="checkValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="saved" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="viewed" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="infoContainer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rejectionReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="logistic" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="limitToSend" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="division" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="invoice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
@XmlType(name = "POrderXml", namespace = "it.niuma.mscsoapws.ws", propOrder = {
    "id",
    "interfaceID",
    "entityId",
    "poInternalId",
    "entityName",
    "entityGl",
    "hqID",
    "hqGl",
    "invoicingHqCode",
    "invoicingHqName",
    "buyerGroup",
    "deliveryDate",
    "createDate",
    "deliveryPortCode",
    "voyageCode",
    "poNumber",
    "orderRequestID",
    "vendorCode",
    "vendorName",
    "vendorGL",
    "vendorExternalCode",
    "paymentTerms",
    "deliveryTerms",
    "portAgentCode",
    "portAgentName",
    "currency",
    "currencyRate",
    "documentValue",
    "coEnabled",
    "coVendorCode",
    "coVendorName",
    "coDate",
    "container",
    "discountGlobal",
    "taxGlobal",
    "fullName",
    "documentComment",
    "parentPoID",
    "poCancelledStatus",
    "exportFileRevision",
    "externalRequestID",
    "destinationPoc",
    "statusID",
    "coDateSupplier",
    "deliveryPortName",
    "inviatoDa",
    "dataInvio",
    "checkValue",
    "saved",
    "viewed",
    "infoContainer",
    "rejectionReason",
    "logistic",
    "limitToSend",
    "division",
    "invoice",
    "orderLines"
})
public class POrderXml {

    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected long id;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", required = true)
    protected String interfaceID;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", required = true)
    protected String entityId;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected long poInternalId;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", required = true)
    protected String entityName;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", required = true)
    protected String entityGl;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", required = true)
    protected String hqID;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", required = true)
    protected String hqGl;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", required = true)
    protected String invoicingHqCode;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", required = true)
    protected String invoicingHqName;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", required = true)
    protected String buyerGroup;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", type = String.class)
    @XmlJavaTypeAdapter(Adapter1.class)
    @XmlSchemaType(name = "dateTime")
    protected Date deliveryDate;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date createDate;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", required = true)
    protected String deliveryPortCode;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected String voyageCode;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", required = true)
    protected String poNumber;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected long orderRequestID;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", required = true)
    protected String vendorCode;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected String vendorName;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", required = true)
    protected String vendorGL;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected String vendorExternalCode;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", required = true)
    protected String paymentTerms;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", required = true)
    protected String deliveryTerms;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", required = true)
    protected String portAgentCode;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", required = true)
    protected String portAgentName;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", required = true)
    protected String currency;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected BigDecimal currencyRate;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected BigDecimal documentValue;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected int coEnabled;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected String coVendorCode;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected String coVendorName;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date coDate;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected int container;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected BigDecimal discountGlobal;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected BigDecimal taxGlobal;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected String fullName;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected String documentComment;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected BigDecimal parentPoID;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected int poCancelledStatus;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected String exportFileRevision;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected BigDecimal externalRequestID;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected String destinationPoc;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected int statusID;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date coDateSupplier;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected String deliveryPortName;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected BigDecimal inviatoDa;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date dataInvio;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected BigDecimal checkValue;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected BigDecimal saved;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected BigDecimal viewed;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected String infoContainer;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected String rejectionReason;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected BigDecimal logistic;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date limitToSend;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected BigDecimal division;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected BigDecimal invoice;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected List<POrderLineXml> orderLines;

    /**
     * Recupera il valore della propriet� id.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Imposta il valore della propriet� id.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Recupera il valore della propriet� interfaceID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterfaceID() {
        return interfaceID;
    }

    /**
     * Imposta il valore della propriet� interfaceID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterfaceID(String value) {
        this.interfaceID = value;
    }

    /**
     * Recupera il valore della propriet� entityId.
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
     * Imposta il valore della propriet� entityId.
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
     * Recupera il valore della propriet� poInternalId.
     * 
     */
    public long getPoInternalId() {
        return poInternalId;
    }

    /**
     * Imposta il valore della propriet� poInternalId.
     * 
     */
    public void setPoInternalId(long value) {
        this.poInternalId = value;
    }

    /**
     * Recupera il valore della propriet� entityName.
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
     * Imposta il valore della propriet� entityName.
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
     * Recupera il valore della propriet� entityGl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityGl() {
        return entityGl;
    }

    /**
     * Imposta il valore della propriet� entityGl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityGl(String value) {
        this.entityGl = value;
    }

    /**
     * Recupera il valore della propriet� hqID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHqID() {
        return hqID;
    }

    /**
     * Imposta il valore della propriet� hqID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHqID(String value) {
        this.hqID = value;
    }

    /**
     * Recupera il valore della propriet� hqGl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHqGl() {
        return hqGl;
    }

    /**
     * Imposta il valore della propriet� hqGl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHqGl(String value) {
        this.hqGl = value;
    }

    /**
     * Recupera il valore della propriet� invoicingHqCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoicingHqCode() {
        return invoicingHqCode;
    }

    /**
     * Imposta il valore della propriet� invoicingHqCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoicingHqCode(String value) {
        this.invoicingHqCode = value;
    }

    /**
     * Recupera il valore della propriet� invoicingHqName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoicingHqName() {
        return invoicingHqName;
    }

    /**
     * Imposta il valore della propriet� invoicingHqName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoicingHqName(String value) {
        this.invoicingHqName = value;
    }

    /**
     * Recupera il valore della propriet� buyerGroup.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerGroup() {
        return buyerGroup;
    }

    /**
     * Imposta il valore della propriet� buyerGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerGroup(String value) {
        this.buyerGroup = value;
    }

    /**
     * Recupera il valore della propriet� deliveryDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getDeliveryDate() {
        return deliveryDate;
    }

    /**
     * Imposta il valore della propriet� deliveryDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryDate(Date value) {
        this.deliveryDate = value;
    }

    /**
     * Recupera il valore della propriet� createDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * Imposta il valore della propriet� createDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateDate(Date value) {
        this.createDate = value;
    }

    /**
     * Recupera il valore della propriet� deliveryPortCode.
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
     * Imposta il valore della propriet� deliveryPortCode.
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
     * Recupera il valore della propriet� voyageCode.
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
     * Imposta il valore della propriet� voyageCode.
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
     * Recupera il valore della propriet� poNumber.
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
     * Imposta il valore della propriet� poNumber.
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
     * Recupera il valore della propriet� orderRequestID.
     * 
     */
    public long getOrderRequestID() {
        return orderRequestID;
    }

    /**
     * Imposta il valore della propriet� orderRequestID.
     * 
     */
    public void setOrderRequestID(long value) {
        this.orderRequestID = value;
    }

    /**
     * Recupera il valore della propriet� vendorCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorCode() {
        return vendorCode;
    }

    /**
     * Imposta il valore della propriet� vendorCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorCode(String value) {
        this.vendorCode = value;
    }

    /**
     * Recupera il valore della propriet� vendorName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorName() {
        return vendorName;
    }

    /**
     * Imposta il valore della propriet� vendorName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorName(String value) {
        this.vendorName = value;
    }

    /**
     * Recupera il valore della propriet� vendorGL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorGL() {
        return vendorGL;
    }

    /**
     * Imposta il valore della propriet� vendorGL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorGL(String value) {
        this.vendorGL = value;
    }

    /**
     * Recupera il valore della propriet� vendorExternalCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorExternalCode() {
        return vendorExternalCode;
    }

    /**
     * Imposta il valore della propriet� vendorExternalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorExternalCode(String value) {
        this.vendorExternalCode = value;
    }

    /**
     * Recupera il valore della propriet� paymentTerms.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentTerms() {
        return paymentTerms;
    }

    /**
     * Imposta il valore della propriet� paymentTerms.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentTerms(String value) {
        this.paymentTerms = value;
    }

    /**
     * Recupera il valore della propriet� deliveryTerms.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryTerms() {
        return deliveryTerms;
    }

    /**
     * Imposta il valore della propriet� deliveryTerms.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryTerms(String value) {
        this.deliveryTerms = value;
    }

    /**
     * Recupera il valore della propriet� portAgentCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortAgentCode() {
        return portAgentCode;
    }

    /**
     * Imposta il valore della propriet� portAgentCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortAgentCode(String value) {
        this.portAgentCode = value;
    }

    /**
     * Recupera il valore della propriet� portAgentName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortAgentName() {
        return portAgentName;
    }

    /**
     * Imposta il valore della propriet� portAgentName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortAgentName(String value) {
        this.portAgentName = value;
    }

    /**
     * Recupera il valore della propriet� currency.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Imposta il valore della propriet� currency.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Recupera il valore della propriet� currencyRate.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrencyRate() {
        return currencyRate;
    }

    /**
     * Imposta il valore della propriet� currencyRate.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrencyRate(BigDecimal value) {
        this.currencyRate = value;
    }

    /**
     * Recupera il valore della propriet� documentValue.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDocumentValue() {
        return documentValue;
    }

    /**
     * Imposta il valore della propriet� documentValue.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDocumentValue(BigDecimal value) {
        this.documentValue = value;
    }

    /**
     * Recupera il valore della propriet� coEnabled.
     * 
     */
    public int getCoEnabled() {
        return coEnabled;
    }

    /**
     * Imposta il valore della propriet� coEnabled.
     * 
     */
    public void setCoEnabled(int value) {
        this.coEnabled = value;
    }

    /**
     * Recupera il valore della propriet� coVendorCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoVendorCode() {
        return coVendorCode;
    }

    /**
     * Imposta il valore della propriet� coVendorCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoVendorCode(String value) {
        this.coVendorCode = value;
    }

    /**
     * Recupera il valore della propriet� coVendorName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoVendorName() {
        return coVendorName;
    }

    /**
     * Imposta il valore della propriet� coVendorName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoVendorName(String value) {
        this.coVendorName = value;
    }

    /**
     * Recupera il valore della propriet� coDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getCoDate() {
        return coDate;
    }

    /**
     * Imposta il valore della propriet� coDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoDate(Date value) {
        this.coDate = value;
    }

    /**
     * Recupera il valore della propriet� container.
     * 
     */
    public int getContainer() {
        return container;
    }

    /**
     * Imposta il valore della propriet� container.
     * 
     */
    public void setContainer(int value) {
        this.container = value;
    }

    /**
     * Recupera il valore della propriet� discountGlobal.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountGlobal() {
        return discountGlobal;
    }

    /**
     * Imposta il valore della propriet� discountGlobal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountGlobal(BigDecimal value) {
        this.discountGlobal = value;
    }

    /**
     * Recupera il valore della propriet� taxGlobal.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxGlobal() {
        return taxGlobal;
    }

    /**
     * Imposta il valore della propriet� taxGlobal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxGlobal(BigDecimal value) {
        this.taxGlobal = value;
    }

    /**
     * Recupera il valore della propriet� fullName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Imposta il valore della propriet� fullName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

    /**
     * Recupera il valore della propriet� documentComment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentComment() {
        return documentComment;
    }

    /**
     * Imposta il valore della propriet� documentComment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentComment(String value) {
        this.documentComment = value;
    }

    /**
     * Recupera il valore della propriet� parentPoID.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getParentPoID() {
        return parentPoID;
    }

    /**
     * Imposta il valore della propriet� parentPoID.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setParentPoID(BigDecimal value) {
        this.parentPoID = value;
    }

    /**
     * Recupera il valore della propriet� poCancelledStatus.
     * 
     */
    public int getPoCancelledStatus() {
        return poCancelledStatus;
    }

    /**
     * Imposta il valore della propriet� poCancelledStatus.
     * 
     */
    public void setPoCancelledStatus(int value) {
        this.poCancelledStatus = value;
    }

    /**
     * Recupera il valore della propriet� exportFileRevision.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExportFileRevision() {
        return exportFileRevision;
    }

    /**
     * Imposta il valore della propriet� exportFileRevision.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExportFileRevision(String value) {
        this.exportFileRevision = value;
    }

    /**
     * Recupera il valore della propriet� externalRequestID.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExternalRequestID() {
        return externalRequestID;
    }

    /**
     * Imposta il valore della propriet� externalRequestID.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExternalRequestID(BigDecimal value) {
        this.externalRequestID = value;
    }

    /**
     * Recupera il valore della propriet� destinationPoc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationPoc() {
        return destinationPoc;
    }

    /**
     * Imposta il valore della propriet� destinationPoc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationPoc(String value) {
        this.destinationPoc = value;
    }

    /**
     * Recupera il valore della propriet� statusID.
     * 
     */
    public int getStatusID() {
        return statusID;
    }

    /**
     * Imposta il valore della propriet� statusID.
     * 
     */
    public void setStatusID(int value) {
        this.statusID = value;
    }

    /**
     * Recupera il valore della propriet� coDateSupplier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getCoDateSupplier() {
        return coDateSupplier;
    }

    /**
     * Imposta il valore della propriet� coDateSupplier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoDateSupplier(Date value) {
        this.coDateSupplier = value;
    }

    /**
     * Recupera il valore della propriet� deliveryPortName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryPortName() {
        return deliveryPortName;
    }

    /**
     * Imposta il valore della propriet� deliveryPortName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryPortName(String value) {
        this.deliveryPortName = value;
    }

    /**
     * Recupera il valore della propriet� inviatoDa.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInviatoDa() {
        return inviatoDa;
    }

    /**
     * Imposta il valore della propriet� inviatoDa.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInviatoDa(BigDecimal value) {
        this.inviatoDa = value;
    }

    /**
     * Recupera il valore della propriet� dataInvio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getDataInvio() {
        return dataInvio;
    }

    /**
     * Imposta il valore della propriet� dataInvio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataInvio(Date value) {
        this.dataInvio = value;
    }

    /**
     * Recupera il valore della propriet� checkValue.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCheckValue() {
        return checkValue;
    }

    /**
     * Imposta il valore della propriet� checkValue.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCheckValue(BigDecimal value) {
        this.checkValue = value;
    }

    /**
     * Recupera il valore della propriet� saved.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSaved() {
        return saved;
    }

    /**
     * Imposta il valore della propriet� saved.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSaved(BigDecimal value) {
        this.saved = value;
    }

    /**
     * Recupera il valore della propriet� viewed.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getViewed() {
        return viewed;
    }

    /**
     * Imposta il valore della propriet� viewed.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setViewed(BigDecimal value) {
        this.viewed = value;
    }

    /**
     * Recupera il valore della propriet� infoContainer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoContainer() {
        return infoContainer;
    }

    /**
     * Imposta il valore della propriet� infoContainer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoContainer(String value) {
        this.infoContainer = value;
    }

    /**
     * Recupera il valore della propriet� rejectionReason.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejectionReason() {
        return rejectionReason;
    }

    /**
     * Imposta il valore della propriet� rejectionReason.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRejectionReason(String value) {
        this.rejectionReason = value;
    }

    /**
     * Recupera il valore della propriet� logistic.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLogistic() {
        return logistic;
    }

    /**
     * Imposta il valore della propriet� logistic.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLogistic(BigDecimal value) {
        this.logistic = value;
    }

    /**
     * Recupera il valore della propriet� limitToSend.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getLimitToSend() {
        return limitToSend;
    }

    /**
     * Imposta il valore della propriet� limitToSend.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitToSend(Date value) {
        this.limitToSend = value;
    }

    /**
     * Recupera il valore della propriet� division.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDivision() {
        return division;
    }

    /**
     * Imposta il valore della propriet� division.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDivision(BigDecimal value) {
        this.division = value;
    }

    /**
     * Recupera il valore della propriet� invoice.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInvoice() {
        return invoice;
    }

    /**
     * Imposta il valore della propriet� invoice.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInvoice(BigDecimal value) {
        this.invoice = value;
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
