
package it.niuma.mscsoapws.ws;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java per pLotDataFromInput complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="pLotDataFromInput">
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
@XmlType(name = "pLotDataFromInput", namespace = "it.niuma.mscsoapws.ws", propOrder = {
    "numeroOrdine",
    "numeroDDT",
    "dtEmissione",
    "dtIngresso"
})
public class PLotDataFromInput {

    @XmlElement(namespace = "it.niuma.mscsoapws.ws", required = true)
    protected String numeroOrdine;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", required = true)
    protected String numeroDDT;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1.class)
    @XmlSchemaType(name = "dateTime")
    protected Date dtEmissione;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1.class)
    @XmlSchemaType(name = "dateTime")
    protected Date dtIngresso;

    /**
     * Recupera il valore della propriet� numeroOrdine.
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
     * Imposta il valore della propriet� numeroOrdine.
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
     * Recupera il valore della propriet� numeroDDT.
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
     * Imposta il valore della propriet� numeroDDT.
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

}
