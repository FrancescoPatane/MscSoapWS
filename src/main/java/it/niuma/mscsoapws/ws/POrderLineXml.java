//
// Questo file Ŕ stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrÓ persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.02.08 alle 04:02:35 PM CET 
//


package it.niuma.mscsoapws.ws;

import java.math.BigDecimal;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java per POrderLineXml complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="POrderLineXml">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="line" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ordID" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="porder_ref" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="itemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="itemCodeExternal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="itemGlCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="itemDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemUnit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemReceivingUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unitFactor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="quantityApproved" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="quantityOrdered" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="quantityReceived" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="itemPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="itemTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="itemDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="itemExpiry" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lineComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vendorItemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vendorNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="annullato" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="modificatoDa" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="dataModifica" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="qtConfirmedOrig" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="noteAlternative" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="quantityLogistic" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="moq" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="quantityApprovedCase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="quantityOrderedCase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="quantityReceivedCase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="quantityConfirmedCase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="quantityLogisticCase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POrderLineXml", propOrder = {
    "id",
    "line",
    "ordID",
    "porderRef",
    "itemCode",
    "itemCodeExternal",
    "itemGlCode",
    "itemDescription",
    "itemUnit",
    "itemReceivingUnit",
    "unitFactor",
    "quantityApproved",
    "quantityOrdered",
    "quantityReceived",
    "itemPrice",
    "itemTax",
    "itemDiscount",
    "itemExpiry",
    "lineComment",
    "vendorItemCode",
    "vendorNotes",
    "annullato",
    "modificatoDa",
    "dataModifica",
    "qtConfirmedOrig",
    "noteAlternative",
    "quantityLogistic",
    "moq",
    "quantityApprovedCase",
    "quantityOrderedCase",
    "quantityReceivedCase",
    "quantityConfirmedCase",
    "quantityLogisticCase"
})
public class POrderLineXml {

    protected long id;
    @XmlElement(required = true)
    protected BigDecimal line;
    @XmlElement(required = true)
    protected BigDecimal ordID;
    @XmlElement(name = "porder_ref")
    protected long porderRef;
    protected String itemCode;
    protected String itemCodeExternal;
    protected String itemGlCode;
    @XmlElement(required = true)
    protected String itemDescription;
    @XmlElement(required = true)
    protected String itemUnit;
    protected String itemReceivingUnit;
    protected BigDecimal unitFactor;
    protected BigDecimal quantityApproved;
    protected BigDecimal quantityOrdered;
    protected BigDecimal quantityReceived;
    protected BigDecimal itemPrice;
    protected BigDecimal itemTax;
    protected BigDecimal itemDiscount;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date itemExpiry;
    protected String lineComment;
    protected String vendorItemCode;
    protected String vendorNotes;
    protected BigDecimal annullato;
    protected BigDecimal modificatoDa;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date dataModifica;
    protected BigDecimal qtConfirmedOrig;
    protected BigDecimal noteAlternative;
    protected BigDecimal quantityLogistic;
    protected BigDecimal moq;
    protected BigDecimal quantityApprovedCase;
    protected BigDecimal quantityOrderedCase;
    protected BigDecimal quantityReceivedCase;
    protected BigDecimal quantityConfirmedCase;
    protected BigDecimal quantityLogisticCase;

    /**
     * Recupera il valore della proprietÓ id.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Imposta il valore della proprietÓ id.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Recupera il valore della proprietÓ line.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLine() {
        return line;
    }

    /**
     * Imposta il valore della proprietÓ line.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLine(BigDecimal value) {
        this.line = value;
    }

    /**
     * Recupera il valore della proprietÓ ordID.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOrdID() {
        return ordID;
    }

    /**
     * Imposta il valore della proprietÓ ordID.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOrdID(BigDecimal value) {
        this.ordID = value;
    }

    /**
     * Recupera il valore della proprietÓ porderRef.
     * 
     */
    public long getPorderRef() {
        return porderRef;
    }

    /**
     * Imposta il valore della proprietÓ porderRef.
     * 
     */
    public void setPorderRef(long value) {
        this.porderRef = value;
    }

    /**
     * Recupera il valore della proprietÓ itemCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * Imposta il valore della proprietÓ itemCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemCode(String value) {
        this.itemCode = value;
    }

    /**
     * Recupera il valore della proprietÓ itemCodeExternal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemCodeExternal() {
        return itemCodeExternal;
    }

    /**
     * Imposta il valore della proprietÓ itemCodeExternal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemCodeExternal(String value) {
        this.itemCodeExternal = value;
    }

    /**
     * Recupera il valore della proprietÓ itemGlCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemGlCode() {
        return itemGlCode;
    }

    /**
     * Imposta il valore della proprietÓ itemGlCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemGlCode(String value) {
        this.itemGlCode = value;
    }

    /**
     * Recupera il valore della proprietÓ itemDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemDescription() {
        return itemDescription;
    }

    /**
     * Imposta il valore della proprietÓ itemDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemDescription(String value) {
        this.itemDescription = value;
    }

    /**
     * Recupera il valore della proprietÓ itemUnit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemUnit() {
        return itemUnit;
    }

    /**
     * Imposta il valore della proprietÓ itemUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemUnit(String value) {
        this.itemUnit = value;
    }

    /**
     * Recupera il valore della proprietÓ itemReceivingUnit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemReceivingUnit() {
        return itemReceivingUnit;
    }

    /**
     * Imposta il valore della proprietÓ itemReceivingUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemReceivingUnit(String value) {
        this.itemReceivingUnit = value;
    }

    /**
     * Recupera il valore della proprietÓ unitFactor.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnitFactor() {
        return unitFactor;
    }

    /**
     * Imposta il valore della proprietÓ unitFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnitFactor(BigDecimal value) {
        this.unitFactor = value;
    }

    /**
     * Recupera il valore della proprietÓ quantityApproved.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantityApproved() {
        return quantityApproved;
    }

    /**
     * Imposta il valore della proprietÓ quantityApproved.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantityApproved(BigDecimal value) {
        this.quantityApproved = value;
    }

    /**
     * Recupera il valore della proprietÓ quantityOrdered.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantityOrdered() {
        return quantityOrdered;
    }

    /**
     * Imposta il valore della proprietÓ quantityOrdered.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantityOrdered(BigDecimal value) {
        this.quantityOrdered = value;
    }

    /**
     * Recupera il valore della proprietÓ quantityReceived.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantityReceived() {
        return quantityReceived;
    }

    /**
     * Imposta il valore della proprietÓ quantityReceived.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantityReceived(BigDecimal value) {
        this.quantityReceived = value;
    }

    /**
     * Recupera il valore della proprietÓ itemPrice.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getItemPrice() {
        return itemPrice;
    }

    /**
     * Imposta il valore della proprietÓ itemPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setItemPrice(BigDecimal value) {
        this.itemPrice = value;
    }

    /**
     * Recupera il valore della proprietÓ itemTax.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getItemTax() {
        return itemTax;
    }

    /**
     * Imposta il valore della proprietÓ itemTax.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setItemTax(BigDecimal value) {
        this.itemTax = value;
    }

    /**
     * Recupera il valore della proprietÓ itemDiscount.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getItemDiscount() {
        return itemDiscount;
    }

    /**
     * Imposta il valore della proprietÓ itemDiscount.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setItemDiscount(BigDecimal value) {
        this.itemDiscount = value;
    }

    /**
     * Recupera il valore della proprietÓ itemExpiry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getItemExpiry() {
        return itemExpiry;
    }

    /**
     * Imposta il valore della proprietÓ itemExpiry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemExpiry(Date value) {
        this.itemExpiry = value;
    }

    /**
     * Recupera il valore della proprietÓ lineComment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineComment() {
        return lineComment;
    }

    /**
     * Imposta il valore della proprietÓ lineComment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineComment(String value) {
        this.lineComment = value;
    }

    /**
     * Recupera il valore della proprietÓ vendorItemCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorItemCode() {
        return vendorItemCode;
    }

    /**
     * Imposta il valore della proprietÓ vendorItemCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorItemCode(String value) {
        this.vendorItemCode = value;
    }

    /**
     * Recupera il valore della proprietÓ vendorNotes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorNotes() {
        return vendorNotes;
    }

    /**
     * Imposta il valore della proprietÓ vendorNotes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorNotes(String value) {
        this.vendorNotes = value;
    }

    /**
     * Recupera il valore della proprietÓ annullato.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAnnullato() {
        return annullato;
    }

    /**
     * Imposta il valore della proprietÓ annullato.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAnnullato(BigDecimal value) {
        this.annullato = value;
    }

    /**
     * Recupera il valore della proprietÓ modificatoDa.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getModificatoDa() {
        return modificatoDa;
    }

    /**
     * Imposta il valore della proprietÓ modificatoDa.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setModificatoDa(BigDecimal value) {
        this.modificatoDa = value;
    }

    /**
     * Recupera il valore della proprietÓ dataModifica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getDataModifica() {
        return dataModifica;
    }

    /**
     * Imposta il valore della proprietÓ dataModifica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataModifica(Date value) {
        this.dataModifica = value;
    }

    /**
     * Recupera il valore della proprietÓ qtConfirmedOrig.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQtConfirmedOrig() {
        return qtConfirmedOrig;
    }

    /**
     * Imposta il valore della proprietÓ qtConfirmedOrig.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQtConfirmedOrig(BigDecimal value) {
        this.qtConfirmedOrig = value;
    }

    /**
     * Recupera il valore della proprietÓ noteAlternative.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNoteAlternative() {
        return noteAlternative;
    }

    /**
     * Imposta il valore della proprietÓ noteAlternative.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNoteAlternative(BigDecimal value) {
        this.noteAlternative = value;
    }

    /**
     * Recupera il valore della proprietÓ quantityLogistic.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantityLogistic() {
        return quantityLogistic;
    }

    /**
     * Imposta il valore della proprietÓ quantityLogistic.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantityLogistic(BigDecimal value) {
        this.quantityLogistic = value;
    }

    /**
     * Recupera il valore della proprietÓ moq.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMoq() {
        return moq;
    }

    /**
     * Imposta il valore della proprietÓ moq.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMoq(BigDecimal value) {
        this.moq = value;
    }

    /**
     * Recupera il valore della proprietÓ quantityApprovedCase.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantityApprovedCase() {
        return quantityApprovedCase;
    }

    /**
     * Imposta il valore della proprietÓ quantityApprovedCase.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantityApprovedCase(BigDecimal value) {
        this.quantityApprovedCase = value;
    }

    /**
     * Recupera il valore della proprietÓ quantityOrderedCase.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantityOrderedCase() {
        return quantityOrderedCase;
    }

    /**
     * Imposta il valore della proprietÓ quantityOrderedCase.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantityOrderedCase(BigDecimal value) {
        this.quantityOrderedCase = value;
    }

    /**
     * Recupera il valore della proprietÓ quantityReceivedCase.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantityReceivedCase() {
        return quantityReceivedCase;
    }

    /**
     * Imposta il valore della proprietÓ quantityReceivedCase.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantityReceivedCase(BigDecimal value) {
        this.quantityReceivedCase = value;
    }

    /**
     * Recupera il valore della proprietÓ quantityConfirmedCase.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantityConfirmedCase() {
        return quantityConfirmedCase;
    }

    /**
     * Imposta il valore della proprietÓ quantityConfirmedCase.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantityConfirmedCase(BigDecimal value) {
        this.quantityConfirmedCase = value;
    }

    /**
     * Recupera il valore della proprietÓ quantityLogisticCase.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantityLogisticCase() {
        return quantityLogisticCase;
    }

    /**
     * Imposta il valore della proprietÓ quantityLogisticCase.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantityLogisticCase(BigDecimal value) {
        this.quantityLogisticCase = value;
    }

}
