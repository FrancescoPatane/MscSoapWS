//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.02.06 alle 05:46:57 PM CET 
//


package it.niuma.mscsoapws.ws;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element name="numeroOrdine" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numeroDDT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dtEmissione" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="dtIngresso" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
    "numeroOrdine",
    "numeroDDT",
    "dtEmissione",
    "dtIngresso"
})
@XmlRootElement(name = "createNewPLotRequest")
public class CreateNewPLotRequest {

    @XmlElement(required = true)
    protected String numeroOrdine;
    @XmlElement(required = true)
    protected String numeroDDT;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date dtEmissione;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date dtIngresso;

    /**
     * Recupera il valore della proprietà numeroOrdine.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroOrdine() {
        return numeroOrdine;
    }

    /**
     * Imposta il valore della proprietà numeroOrdine.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroOrdine(String value) {
        this.numeroOrdine = value;
    }

    /**
     * Recupera il valore della proprietà numeroDDT.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDDT() {
        return numeroDDT;
    }

    /**
     * Imposta il valore della proprietà numeroDDT.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDDT(String value) {
        this.numeroDDT = value;
    }

    /**
     * Recupera il valore della proprietà dtEmissione.
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
     * Imposta il valore della proprietà dtEmissione.
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
     * Recupera il valore della proprietà dtIngresso.
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
     * Imposta il valore della proprietà dtIngresso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtIngresso(Date value) {
        this.dtIngresso = value;
    }

}
