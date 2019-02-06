//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.02.06 alle 12:01:49 PM CET 
//


package it.niuma.mscsoapws.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="line" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="itemCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemCodeExternal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemGlCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemUnit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemReceivingUnit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="unitFactor" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="quantityApproved" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="quantityOrdered" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="quantityReceived" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="itemPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="itemTax" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="itemDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="itemExpiry" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="lineComment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vendorItemCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vendor_notes" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "line",
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
    "vendorNotes"
})
public class POrderLineXml {

    @XmlElement(required = true)
    protected BigDecimal line;
    @XmlElement(required = true)
    protected String itemCode;
    @XmlElement(required = true)
    protected String itemCodeExternal;
    @XmlElement(required = true)
    protected String itemGlCode;
    @XmlElement(required = true)
    protected String itemDescription;
    @XmlElement(required = true)
    protected String itemUnit;
    @XmlElement(required = true)
    protected String itemReceivingUnit;
    @XmlElement(required = true)
    protected BigDecimal unitFactor;
    @XmlElement(required = true)
    protected BigDecimal quantityApproved;
    @XmlElement(required = true)
    protected BigDecimal quantityOrdered;
    @XmlElement(required = true)
    protected BigDecimal quantityReceived;
    @XmlElement(required = true)
    protected BigDecimal itemPrice;
    @XmlElement(required = true)
    protected BigDecimal itemTax;
    @XmlElement(required = true)
    protected BigDecimal itemDiscount;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar itemExpiry;
    @XmlElement(required = true)
    protected String lineComment;
    @XmlElement(required = true)
    protected String vendorItemCode;
    @XmlElement(name = "vendor_notes", required = true)
    protected String vendorNotes;

    /**
     * Recupera il valore della proprietà line.
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
     * Imposta il valore della proprietà line.
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
     * Recupera il valore della proprietà itemCode.
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
     * Imposta il valore della proprietà itemCode.
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
     * Recupera il valore della proprietà itemCodeExternal.
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
     * Imposta il valore della proprietà itemCodeExternal.
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
     * Recupera il valore della proprietà itemGlCode.
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
     * Imposta il valore della proprietà itemGlCode.
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
     * Recupera il valore della proprietà itemDescription.
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
     * Imposta il valore della proprietà itemDescription.
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
     * Recupera il valore della proprietà itemUnit.
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
     * Imposta il valore della proprietà itemUnit.
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
     * Recupera il valore della proprietà itemReceivingUnit.
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
     * Imposta il valore della proprietà itemReceivingUnit.
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
     * Recupera il valore della proprietà unitFactor.
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
     * Imposta il valore della proprietà unitFactor.
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
     * Recupera il valore della proprietà quantityApproved.
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
     * Imposta il valore della proprietà quantityApproved.
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
     * Recupera il valore della proprietà quantityOrdered.
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
     * Imposta il valore della proprietà quantityOrdered.
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
     * Recupera il valore della proprietà quantityReceived.
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
     * Imposta il valore della proprietà quantityReceived.
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
     * Recupera il valore della proprietà itemPrice.
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
     * Imposta il valore della proprietà itemPrice.
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
     * Recupera il valore della proprietà itemTax.
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
     * Imposta il valore della proprietà itemTax.
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
     * Recupera il valore della proprietà itemDiscount.
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
     * Imposta il valore della proprietà itemDiscount.
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
     * Recupera il valore della proprietà itemExpiry.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getItemExpiry() {
        return itemExpiry;
    }

    /**
     * Imposta il valore della proprietà itemExpiry.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setItemExpiry(XMLGregorianCalendar value) {
        this.itemExpiry = value;
    }

    /**
     * Recupera il valore della proprietà lineComment.
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
     * Imposta il valore della proprietà lineComment.
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
     * Recupera il valore della proprietà vendorItemCode.
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
     * Imposta il valore della proprietà vendorItemCode.
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
     * Recupera il valore della proprietà vendorNotes.
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
     * Imposta il valore della proprietà vendorNotes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorNotes(String value) {
        this.vendorNotes = value;
    }

}
