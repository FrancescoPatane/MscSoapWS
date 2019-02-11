
package it.niuma.mscsoapws.ws;

import java.math.BigDecimal;
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
 *         &lt;element name="accessToken" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numeroOrdine" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numeroDDT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dtEmissione" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="dtIngresso" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="pesoVariabile" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="nrLotto" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="quantitaConfermata" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="globalTradeItemNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nrNetto" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="nrLordo" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="nrColli" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="nrPezziConf" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="dtScadenza" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="docDoganale" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="nDocDoganale" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="codiceSSCCPallett" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nrRiga" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="codiceArticolo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="unitaMisura" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="paeseOrigine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paeseProvenienza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="docSanitario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataDocSanitario" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dfFattura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dtFattura" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="codiceAnimo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sif" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="voceDoganale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idPallet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "accessToken",
    "numeroOrdine",
    "numeroDDT",
    "dtEmissione",
    "dtIngresso",
    "pesoVariabile",
    "nrLotto",
    "quantitaConfermata",
    "globalTradeItemNumber",
    "nrNetto",
    "nrLordo",
    "nrColli",
    "nrPezziConf",
    "dtScadenza",
    "docDoganale",
    "nDocDoganale",
    "codiceSSCCPallett",
    "nrRiga",
    "codiceArticolo",
    "unitaMisura",
    "paeseOrigine",
    "paeseProvenienza",
    "docSanitario",
    "dataDocSanitario",
    "dfFattura",
    "dtFattura",
    "codiceAnimo",
    "sif",
    "voceDoganale",
    "idPallet"
})
@XmlRootElement(name = "createNewPLotRequest", namespace = "it.niuma.mscsoapws.ws")
public class CreateNewPLotRequest {

    @XmlElement(namespace = "it.niuma.mscsoapws.ws", required = true)
    protected String accessToken;
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
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", defaultValue = "0")
    protected BigDecimal pesoVariabile;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", required = true)
    protected BigDecimal nrLotto;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", required = true)
    protected BigDecimal quantitaConfermata;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", required = true)
    protected String globalTradeItemNumber;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", required = true)
    protected BigDecimal nrNetto;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", required = true)
    protected BigDecimal nrLordo;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", required = true)
    protected BigDecimal nrColli;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", required = true)
    protected BigDecimal nrPezziConf;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1.class)
    @XmlSchemaType(name = "dateTime")
    protected Date dtScadenza;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", required = true)
    protected BigDecimal docDoganale;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected BigDecimal nDocDoganale;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", defaultValue = "")
    protected String codiceSSCCPallett;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", required = true)
    protected BigDecimal nrRiga;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", required = true)
    protected String codiceArticolo;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", required = true)
    protected String unitaMisura;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", defaultValue = "")
    protected String paeseOrigine;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", defaultValue = "")
    protected String paeseProvenienza;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", defaultValue = "")
    protected String docSanitario;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", type = String.class)
    @XmlJavaTypeAdapter(Adapter1.class)
    @XmlSchemaType(name = "dateTime")
    protected Date dataDocSanitario;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", defaultValue = "")
    protected String dfFattura;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", type = String.class)
    @XmlJavaTypeAdapter(Adapter1.class)
    @XmlSchemaType(name = "dateTime")
    protected Date dtFattura;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", defaultValue = "")
    protected String codiceAnimo;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", defaultValue = "")
    protected String sif;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", defaultValue = "")
    protected String voceDoganale;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", defaultValue = "")
    protected String idPallet;

    /**
     * Recupera il valore della propriet� accessToken.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * Imposta il valore della propriet� accessToken.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessToken(String value) {
        this.accessToken = value;
    }

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

    /**
     * Recupera il valore della propriet� pesoVariabile.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPesoVariabile() {
        return pesoVariabile;
    }

    /**
     * Imposta il valore della propriet� pesoVariabile.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPesoVariabile(BigDecimal value) {
        this.pesoVariabile = value;
    }

    /**
     * Recupera il valore della propriet� nrLotto.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNrLotto() {
        return nrLotto;
    }

    /**
     * Imposta il valore della propriet� nrLotto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNrLotto(BigDecimal value) {
        this.nrLotto = value;
    }

    /**
     * Recupera il valore della propriet� quantitaConfermata.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantitaConfermata() {
        return quantitaConfermata;
    }

    /**
     * Imposta il valore della propriet� quantitaConfermata.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantitaConfermata(BigDecimal value) {
        this.quantitaConfermata = value;
    }

    /**
     * Recupera il valore della propriet� globalTradeItemNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalTradeItemNumber() {
        return globalTradeItemNumber;
    }

    /**
     * Imposta il valore della propriet� globalTradeItemNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalTradeItemNumber(String value) {
        this.globalTradeItemNumber = value;
    }

    /**
     * Recupera il valore della propriet� nrNetto.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNrNetto() {
        return nrNetto;
    }

    /**
     * Imposta il valore della propriet� nrNetto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNrNetto(BigDecimal value) {
        this.nrNetto = value;
    }

    /**
     * Recupera il valore della propriet� nrLordo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNrLordo() {
        return nrLordo;
    }

    /**
     * Imposta il valore della propriet� nrLordo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNrLordo(BigDecimal value) {
        this.nrLordo = value;
    }

    /**
     * Recupera il valore della propriet� nrColli.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNrColli() {
        return nrColli;
    }

    /**
     * Imposta il valore della propriet� nrColli.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNrColli(BigDecimal value) {
        this.nrColli = value;
    }

    /**
     * Recupera il valore della propriet� nrPezziConf.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNrPezziConf() {
        return nrPezziConf;
    }

    /**
     * Imposta il valore della propriet� nrPezziConf.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNrPezziConf(BigDecimal value) {
        this.nrPezziConf = value;
    }

    /**
     * Recupera il valore della propriet� dtScadenza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getDtScadenza() {
        return dtScadenza;
    }

    /**
     * Imposta il valore della propriet� dtScadenza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtScadenza(Date value) {
        this.dtScadenza = value;
    }

    /**
     * Recupera il valore della propriet� docDoganale.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDocDoganale() {
        return docDoganale;
    }

    /**
     * Imposta il valore della propriet� docDoganale.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDocDoganale(BigDecimal value) {
        this.docDoganale = value;
    }

    /**
     * Recupera il valore della propriet� nDocDoganale.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNDocDoganale() {
        return nDocDoganale;
    }

    /**
     * Imposta il valore della propriet� nDocDoganale.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNDocDoganale(BigDecimal value) {
        this.nDocDoganale = value;
    }

    /**
     * Recupera il valore della propriet� codiceSSCCPallett.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceSSCCPallett() {
        return codiceSSCCPallett;
    }

    /**
     * Imposta il valore della propriet� codiceSSCCPallett.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceSSCCPallett(String value) {
        this.codiceSSCCPallett = value;
    }

    /**
     * Recupera il valore della propriet� nrRiga.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNrRiga() {
        return nrRiga;
    }

    /**
     * Imposta il valore della propriet� nrRiga.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNrRiga(BigDecimal value) {
        this.nrRiga = value;
    }

    /**
     * Recupera il valore della propriet� codiceArticolo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceArticolo() {
        return codiceArticolo;
    }

    /**
     * Imposta il valore della propriet� codiceArticolo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceArticolo(String value) {
        this.codiceArticolo = value;
    }

    /**
     * Recupera il valore della propriet� unitaMisura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitaMisura() {
        return unitaMisura;
    }

    /**
     * Imposta il valore della propriet� unitaMisura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitaMisura(String value) {
        this.unitaMisura = value;
    }

    /**
     * Recupera il valore della propriet� paeseOrigine.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaeseOrigine() {
        return paeseOrigine;
    }

    /**
     * Imposta il valore della propriet� paeseOrigine.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaeseOrigine(String value) {
        this.paeseOrigine = value;
    }

    /**
     * Recupera il valore della propriet� paeseProvenienza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaeseProvenienza() {
        return paeseProvenienza;
    }

    /**
     * Imposta il valore della propriet� paeseProvenienza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaeseProvenienza(String value) {
        this.paeseProvenienza = value;
    }

    /**
     * Recupera il valore della propriet� docSanitario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocSanitario() {
        return docSanitario;
    }

    /**
     * Imposta il valore della propriet� docSanitario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocSanitario(String value) {
        this.docSanitario = value;
    }

    /**
     * Recupera il valore della propriet� dataDocSanitario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getDataDocSanitario() {
        return dataDocSanitario;
    }

    /**
     * Imposta il valore della propriet� dataDocSanitario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataDocSanitario(Date value) {
        this.dataDocSanitario = value;
    }

    /**
     * Recupera il valore della propriet� dfFattura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDfFattura() {
        return dfFattura;
    }

    /**
     * Imposta il valore della propriet� dfFattura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDfFattura(String value) {
        this.dfFattura = value;
    }

    /**
     * Recupera il valore della propriet� dtFattura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getDtFattura() {
        return dtFattura;
    }

    /**
     * Imposta il valore della propriet� dtFattura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtFattura(Date value) {
        this.dtFattura = value;
    }

    /**
     * Recupera il valore della propriet� codiceAnimo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceAnimo() {
        return codiceAnimo;
    }

    /**
     * Imposta il valore della propriet� codiceAnimo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceAnimo(String value) {
        this.codiceAnimo = value;
    }

    /**
     * Recupera il valore della propriet� sif.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSif() {
        return sif;
    }

    /**
     * Imposta il valore della propriet� sif.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSif(String value) {
        this.sif = value;
    }

    /**
     * Recupera il valore della propriet� voceDoganale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoceDoganale() {
        return voceDoganale;
    }

    /**
     * Imposta il valore della propriet� voceDoganale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoceDoganale(String value) {
        this.voceDoganale = value;
    }

    /**
     * Recupera il valore della propriet� idPallet.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPallet() {
        return idPallet;
    }

    /**
     * Imposta il valore della propriet� idPallet.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPallet(String value) {
        this.idPallet = value;
    }

}
