
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
 * <p>Classe Java per PLotXml complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PLotXml">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="tpRecord" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdDepositante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dtEmissione" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dfDocIngresso" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dtIngresso" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="cdCedente" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tpCedente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stato" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="inviatoDa" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="dataInvio" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="poNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ssccAvailable" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PLotXml", namespace = "it.niuma.mscsoapws.ws", propOrder = {
    "id",
    "tpRecord",
    "cdDepositante",
    "dtEmissione",
    "dfDocIngresso",
    "dtIngresso",
    "cdCedente",
    "tpCedente",
    "stato",
    "inviatoDa",
    "dataInvio",
    "email",
    "poNumber",
    "ssccAvailable"
})
public class PLotXml {

    @XmlElement(namespace = "it.niuma.mscsoapws.ws", required = true)
    protected BigDecimal id;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", defaultValue = "TD")
    protected String tpRecord;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", defaultValue = "MSC")
    protected String cdDepositante;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", type = String.class)
    @XmlJavaTypeAdapter(Adapter1.class)
    @XmlSchemaType(name = "dateTime")
    protected Date dtEmissione;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", required = true)
    protected String dfDocIngresso;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date dtIngresso;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", required = true)
    protected String cdCedente;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", defaultValue = "SUP")
    protected String tpCedente;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected BigDecimal stato;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected BigDecimal inviatoDa;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date dataInvio;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected String email;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected String poNumber;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected BigDecimal ssccAvailable;

    /**
     * Recupera il valore della propriet� id.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * Imposta il valore della propriet� id.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setId(BigDecimal value) {
        this.id = value;
    }

    /**
     * Recupera il valore della propriet� tpRecord.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpRecord() {
        return tpRecord;
    }

    /**
     * Imposta il valore della propriet� tpRecord.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpRecord(String value) {
        this.tpRecord = value;
    }

    /**
     * Recupera il valore della propriet� cdDepositante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdDepositante() {
        return cdDepositante;
    }

    /**
     * Imposta il valore della propriet� cdDepositante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdDepositante(String value) {
        this.cdDepositante = value;
    }

    /**
     * Recupera il valore della propriet� dtEmissione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getDtEmissione() {
        return dtEmissione;
    }

    /**
     * Imposta il valore della propriet� dtEmissione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtEmissione(Date value) {
        this.dtEmissione = value;
    }

    /**
     * Recupera il valore della propriet� dfDocIngresso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDfDocIngresso() {
        return dfDocIngresso;
    }

    /**
     * Imposta il valore della propriet� dfDocIngresso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDfDocIngresso(String value) {
        this.dfDocIngresso = value;
    }

    /**
     * Recupera il valore della propriet� dtIngresso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getDtIngresso() {
        return dtIngresso;
    }

    /**
     * Imposta il valore della propriet� dtIngresso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtIngresso(Date value) {
        this.dtIngresso = value;
    }

    /**
     * Recupera il valore della propriet� cdCedente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdCedente() {
        return cdCedente;
    }

    /**
     * Imposta il valore della propriet� cdCedente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdCedente(String value) {
        this.cdCedente = value;
    }

    /**
     * Recupera il valore della propriet� tpCedente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpCedente() {
        return tpCedente;
    }

    /**
     * Imposta il valore della propriet� tpCedente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpCedente(String value) {
        this.tpCedente = value;
    }

    /**
     * Recupera il valore della propriet� stato.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStato() {
        return stato;
    }

    /**
     * Imposta il valore della propriet� stato.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStato(BigDecimal value) {
        this.stato = value;
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
     * Recupera il valore della propriet� email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Imposta il valore della propriet� email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
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
     * Recupera il valore della propriet� ssccAvailable.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSsccAvailable() {
        return ssccAvailable;
    }

    /**
     * Imposta il valore della propriet� ssccAvailable.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSsccAvailable(BigDecimal value) {
        this.ssccAvailable = value;
    }

}
