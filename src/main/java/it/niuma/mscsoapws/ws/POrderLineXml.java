
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
@XmlType(name = "POrderLineXml", namespace = "it.niuma.mscsoapws.ws", propOrder = {
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

    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected long id;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", required = true)
    protected BigDecimal line;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", required = true)
    protected BigDecimal ordID;
    @XmlElement(name = "porder_ref", namespace = "it.niuma.mscsoapws.ws")
    protected long porderRef;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected String itemCode;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected String itemCodeExternal;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected String itemGlCode;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", required = true)
    protected String itemDescription;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", required = true)
    protected String itemUnit;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected String itemReceivingUnit;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected BigDecimal unitFactor;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected BigDecimal quantityApproved;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected BigDecimal quantityOrdered;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected BigDecimal quantityReceived;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected BigDecimal itemPrice;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected BigDecimal itemTax;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected BigDecimal itemDiscount;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", type = String.class)
    @XmlJavaTypeAdapter(Adapter1.class)
    @XmlSchemaType(name = "dateTime")
    protected Date itemExpiry;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected String lineComment;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected String vendorItemCode;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected String vendorNotes;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected BigDecimal annullato;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected BigDecimal modificatoDa;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", type = String.class)
    @XmlJavaTypeAdapter(Adapter1.class)
    @XmlSchemaType(name = "dateTime")
    protected Date dataModifica;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected BigDecimal qtConfirmedOrig;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected BigDecimal noteAlternative;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected BigDecimal quantityLogistic;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected BigDecimal moq;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected BigDecimal quantityApprovedCase;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected BigDecimal quantityOrderedCase;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected BigDecimal quantityReceivedCase;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected BigDecimal quantityConfirmedCase;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected BigDecimal quantityLogisticCase;

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
     * Recupera il valore della propriet� line.
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
     * Imposta il valore della propriet� line.
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
     * Recupera il valore della propriet� ordID.
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
     * Imposta il valore della propriet� ordID.
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
     * Recupera il valore della propriet� porderRef.
     * 
     */
    public long getPorderRef() {
        return porderRef;
    }

    /**
     * Imposta il valore della propriet� porderRef.
     * 
     */
    public void setPorderRef(long value) {
        this.porderRef = value;
    }

    /**
     * Recupera il valore della propriet� itemCode.
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
     * Imposta il valore della propriet� itemCode.
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
     * Recupera il valore della propriet� itemCodeExternal.
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
     * Imposta il valore della propriet� itemCodeExternal.
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
     * Recupera il valore della propriet� itemGlCode.
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
     * Imposta il valore della propriet� itemGlCode.
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
     * Recupera il valore della propriet� itemDescription.
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
     * Imposta il valore della propriet� itemDescription.
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
     * Recupera il valore della propriet� itemUnit.
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
     * Imposta il valore della propriet� itemUnit.
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
     * Recupera il valore della propriet� itemReceivingUnit.
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
     * Imposta il valore della propriet� itemReceivingUnit.
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
     * Recupera il valore della propriet� unitFactor.
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
     * Imposta il valore della propriet� unitFactor.
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
     * Recupera il valore della propriet� quantityApproved.
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
     * Imposta il valore della propriet� quantityApproved.
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
     * Recupera il valore della propriet� quantityOrdered.
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
     * Imposta il valore della propriet� quantityOrdered.
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
     * Recupera il valore della propriet� quantityReceived.
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
     * Imposta il valore della propriet� quantityReceived.
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
     * Recupera il valore della propriet� itemPrice.
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
     * Imposta il valore della propriet� itemPrice.
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
     * Recupera il valore della propriet� itemTax.
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
     * Imposta il valore della propriet� itemTax.
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
     * Recupera il valore della propriet� itemDiscount.
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
     * Imposta il valore della propriet� itemDiscount.
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
     * Recupera il valore della propriet� itemExpiry.
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
     * Imposta il valore della propriet� itemExpiry.
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
     * Recupera il valore della propriet� lineComment.
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
     * Imposta il valore della propriet� lineComment.
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
     * Recupera il valore della propriet� vendorItemCode.
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
     * Imposta il valore della propriet� vendorItemCode.
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
     * Recupera il valore della propriet� vendorNotes.
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
     * Imposta il valore della propriet� vendorNotes.
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
     * Recupera il valore della propriet� annullato.
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
     * Imposta il valore della propriet� annullato.
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
     * Recupera il valore della propriet� modificatoDa.
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
     * Imposta il valore della propriet� modificatoDa.
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
     * Recupera il valore della propriet� dataModifica.
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
     * Imposta il valore della propriet� dataModifica.
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
     * Recupera il valore della propriet� qtConfirmedOrig.
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
     * Imposta il valore della propriet� qtConfirmedOrig.
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
     * Recupera il valore della propriet� noteAlternative.
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
     * Imposta il valore della propriet� noteAlternative.
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
     * Recupera il valore della propriet� quantityLogistic.
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
     * Imposta il valore della propriet� quantityLogistic.
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
     * Recupera il valore della propriet� moq.
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
     * Imposta il valore della propriet� moq.
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
     * Recupera il valore della propriet� quantityApprovedCase.
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
     * Imposta il valore della propriet� quantityApprovedCase.
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
     * Recupera il valore della propriet� quantityOrderedCase.
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
     * Imposta il valore della propriet� quantityOrderedCase.
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
     * Recupera il valore della propriet� quantityReceivedCase.
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
     * Imposta il valore della propriet� quantityReceivedCase.
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
     * Recupera il valore della propriet� quantityConfirmedCase.
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
     * Imposta il valore della propriet� quantityConfirmedCase.
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
     * Recupera il valore della propriet� quantityLogisticCase.
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
     * Imposta il valore della propriet� quantityLogisticCase.
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
