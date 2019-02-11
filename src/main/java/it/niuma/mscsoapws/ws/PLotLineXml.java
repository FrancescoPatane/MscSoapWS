
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
 * <p>Classe Java per PLotLineXml complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PLotLineXml">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="idLot" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="tpRecord" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdDepositante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdCollo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nrRiga" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="cdGtin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdArticolo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cdVoceDoganale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdMisura" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="flPesoVariabile" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="nrPrezzo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="dfValuta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stContabile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nrLotto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="qtPrevista" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="nrNetto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="nrLordo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="nrColli" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="nrPzConf" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="nrListaIngresso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tpListaIngresso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nrRigaListaIngresso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdProprietarioStock" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tpProprietarioStock" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dtScadenza" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="cdPaeseOrigine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdPaeseProvenienza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dfDvce" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dtDvce" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dfAnimo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dfSif" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flDogana" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="flContainer" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="dfFattura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dtFattura" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dfMrn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdClienteRiserva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tpClienteRiserva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dfRiserva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stato" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="compilatoDa" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="dataCompilazione" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="palletID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="moq" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PLotLineXml", namespace = "it.niuma.mscsoapws.ws", propOrder = {
    "id",
    "idLot",
    "tpRecord",
    "cdDepositante",
    "cdCollo",
    "nrRiga",
    "cdGtin",
    "cdArticolo",
    "cdVoceDoganale",
    "cdMisura",
    "flPesoVariabile",
    "nrPrezzo",
    "dfValuta",
    "stContabile",
    "nrLotto",
    "qtPrevista",
    "nrNetto",
    "nrLordo",
    "nrColli",
    "nrPzConf",
    "nrListaIngresso",
    "tpListaIngresso",
    "nrRigaListaIngresso",
    "cdProprietarioStock",
    "tpProprietarioStock",
    "dtScadenza",
    "cdPaeseOrigine",
    "cdPaeseProvenienza",
    "dfDvce",
    "dtDvce",
    "dfAnimo",
    "dfSif",
    "flDogana",
    "flContainer",
    "dfFattura",
    "dtFattura",
    "dfMrn",
    "cdClienteRiserva",
    "tpClienteRiserva",
    "dfRiserva",
    "stato",
    "compilatoDa",
    "dataCompilazione",
    "palletID",
    "moq"
})
public class PLotLineXml {

    @XmlElement(namespace = "it.niuma.mscsoapws.ws", required = true)
    protected BigDecimal id;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected BigDecimal idLot;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", defaultValue = "TR")
    protected String tpRecord;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", defaultValue = "MSC")
    protected String cdDepositante;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected String cdCollo;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", required = true)
    protected BigDecimal nrRiga;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected String cdGtin;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", required = true)
    protected String cdArticolo;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected String cdVoceDoganale;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", required = true)
    protected String cdMisura;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected BigDecimal flPesoVariabile;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected BigDecimal nrPrezzo;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected String dfValuta;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected String stContabile;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected String nrLotto;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected BigDecimal qtPrevista;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected BigDecimal nrNetto;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected BigDecimal nrLordo;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected BigDecimal nrColli;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected BigDecimal nrPzConf;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected String nrListaIngresso;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", defaultValue = "ACQ")
    protected String tpListaIngresso;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected String nrRigaListaIngresso;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected String cdProprietarioStock;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", defaultValue = "OWN")
    protected String tpProprietarioStock;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", type = String.class)
    @XmlJavaTypeAdapter(Adapter1.class)
    @XmlSchemaType(name = "dateTime")
    protected Date dtScadenza;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected String cdPaeseOrigine;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected String cdPaeseProvenienza;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected String dfDvce;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", type = String.class)
    @XmlJavaTypeAdapter(Adapter1.class)
    @XmlSchemaType(name = "dateTime")
    protected Date dtDvce;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected String dfAnimo;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected String dfSif;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected BigDecimal flDogana;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected BigDecimal flContainer;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected String dfFattura;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", type = String.class)
    @XmlJavaTypeAdapter(Adapter1.class)
    @XmlSchemaType(name = "dateTime")
    protected Date dtFattura;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected String dfMrn;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected String cdClienteRiserva;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", defaultValue = "CUS")
    protected String tpClienteRiserva;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected String dfRiserva;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected BigDecimal stato;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected BigDecimal compilatoDa;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws", type = String.class)
    @XmlJavaTypeAdapter(Adapter1.class)
    @XmlSchemaType(name = "dateTime")
    protected Date dataCompilazione;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected String palletID;
    @XmlElement(namespace = "it.niuma.mscsoapws.ws")
    protected BigDecimal moq;

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
     * Recupera il valore della propriet� idLot.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIdLot() {
        return idLot;
    }

    /**
     * Imposta il valore della propriet� idLot.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIdLot(BigDecimal value) {
        this.idLot = value;
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
     * Recupera il valore della propriet� cdCollo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdCollo() {
        return cdCollo;
    }

    /**
     * Imposta il valore della propriet� cdCollo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdCollo(String value) {
        this.cdCollo = value;
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
     * Recupera il valore della propriet� cdGtin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdGtin() {
        return cdGtin;
    }

    /**
     * Imposta il valore della propriet� cdGtin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdGtin(String value) {
        this.cdGtin = value;
    }

    /**
     * Recupera il valore della propriet� cdArticolo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdArticolo() {
        return cdArticolo;
    }

    /**
     * Imposta il valore della propriet� cdArticolo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdArticolo(String value) {
        this.cdArticolo = value;
    }

    /**
     * Recupera il valore della propriet� cdVoceDoganale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdVoceDoganale() {
        return cdVoceDoganale;
    }

    /**
     * Imposta il valore della propriet� cdVoceDoganale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdVoceDoganale(String value) {
        this.cdVoceDoganale = value;
    }

    /**
     * Recupera il valore della propriet� cdMisura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdMisura() {
        return cdMisura;
    }

    /**
     * Imposta il valore della propriet� cdMisura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdMisura(String value) {
        this.cdMisura = value;
    }

    /**
     * Recupera il valore della propriet� flPesoVariabile.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFlPesoVariabile() {
        return flPesoVariabile;
    }

    /**
     * Imposta il valore della propriet� flPesoVariabile.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFlPesoVariabile(BigDecimal value) {
        this.flPesoVariabile = value;
    }

    /**
     * Recupera il valore della propriet� nrPrezzo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNrPrezzo() {
        return nrPrezzo;
    }

    /**
     * Imposta il valore della propriet� nrPrezzo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNrPrezzo(BigDecimal value) {
        this.nrPrezzo = value;
    }

    /**
     * Recupera il valore della propriet� dfValuta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDfValuta() {
        return dfValuta;
    }

    /**
     * Imposta il valore della propriet� dfValuta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDfValuta(String value) {
        this.dfValuta = value;
    }

    /**
     * Recupera il valore della propriet� stContabile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStContabile() {
        return stContabile;
    }

    /**
     * Imposta il valore della propriet� stContabile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStContabile(String value) {
        this.stContabile = value;
    }

    /**
     * Recupera il valore della propriet� nrLotto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrLotto() {
        return nrLotto;
    }

    /**
     * Imposta il valore della propriet� nrLotto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrLotto(String value) {
        this.nrLotto = value;
    }

    /**
     * Recupera il valore della propriet� qtPrevista.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQtPrevista() {
        return qtPrevista;
    }

    /**
     * Imposta il valore della propriet� qtPrevista.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQtPrevista(BigDecimal value) {
        this.qtPrevista = value;
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
     * Recupera il valore della propriet� nrPzConf.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNrPzConf() {
        return nrPzConf;
    }

    /**
     * Imposta il valore della propriet� nrPzConf.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNrPzConf(BigDecimal value) {
        this.nrPzConf = value;
    }

    /**
     * Recupera il valore della propriet� nrListaIngresso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrListaIngresso() {
        return nrListaIngresso;
    }

    /**
     * Imposta il valore della propriet� nrListaIngresso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrListaIngresso(String value) {
        this.nrListaIngresso = value;
    }

    /**
     * Recupera il valore della propriet� tpListaIngresso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpListaIngresso() {
        return tpListaIngresso;
    }

    /**
     * Imposta il valore della propriet� tpListaIngresso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpListaIngresso(String value) {
        this.tpListaIngresso = value;
    }

    /**
     * Recupera il valore della propriet� nrRigaListaIngresso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrRigaListaIngresso() {
        return nrRigaListaIngresso;
    }

    /**
     * Imposta il valore della propriet� nrRigaListaIngresso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrRigaListaIngresso(String value) {
        this.nrRigaListaIngresso = value;
    }

    /**
     * Recupera il valore della propriet� cdProprietarioStock.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdProprietarioStock() {
        return cdProprietarioStock;
    }

    /**
     * Imposta il valore della propriet� cdProprietarioStock.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdProprietarioStock(String value) {
        this.cdProprietarioStock = value;
    }

    /**
     * Recupera il valore della propriet� tpProprietarioStock.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpProprietarioStock() {
        return tpProprietarioStock;
    }

    /**
     * Imposta il valore della propriet� tpProprietarioStock.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpProprietarioStock(String value) {
        this.tpProprietarioStock = value;
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
     * Recupera il valore della propriet� cdPaeseOrigine.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdPaeseOrigine() {
        return cdPaeseOrigine;
    }

    /**
     * Imposta il valore della propriet� cdPaeseOrigine.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdPaeseOrigine(String value) {
        this.cdPaeseOrigine = value;
    }

    /**
     * Recupera il valore della propriet� cdPaeseProvenienza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdPaeseProvenienza() {
        return cdPaeseProvenienza;
    }

    /**
     * Imposta il valore della propriet� cdPaeseProvenienza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdPaeseProvenienza(String value) {
        this.cdPaeseProvenienza = value;
    }

    /**
     * Recupera il valore della propriet� dfDvce.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDfDvce() {
        return dfDvce;
    }

    /**
     * Imposta il valore della propriet� dfDvce.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDfDvce(String value) {
        this.dfDvce = value;
    }

    /**
     * Recupera il valore della propriet� dtDvce.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getDtDvce() {
        return dtDvce;
    }

    /**
     * Imposta il valore della propriet� dtDvce.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtDvce(Date value) {
        this.dtDvce = value;
    }

    /**
     * Recupera il valore della propriet� dfAnimo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDfAnimo() {
        return dfAnimo;
    }

    /**
     * Imposta il valore della propriet� dfAnimo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDfAnimo(String value) {
        this.dfAnimo = value;
    }

    /**
     * Recupera il valore della propriet� dfSif.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDfSif() {
        return dfSif;
    }

    /**
     * Imposta il valore della propriet� dfSif.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDfSif(String value) {
        this.dfSif = value;
    }

    /**
     * Recupera il valore della propriet� flDogana.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFlDogana() {
        return flDogana;
    }

    /**
     * Imposta il valore della propriet� flDogana.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFlDogana(BigDecimal value) {
        this.flDogana = value;
    }

    /**
     * Recupera il valore della propriet� flContainer.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFlContainer() {
        return flContainer;
    }

    /**
     * Imposta il valore della propriet� flContainer.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFlContainer(BigDecimal value) {
        this.flContainer = value;
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
     * Recupera il valore della propriet� dfMrn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDfMrn() {
        return dfMrn;
    }

    /**
     * Imposta il valore della propriet� dfMrn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDfMrn(String value) {
        this.dfMrn = value;
    }

    /**
     * Recupera il valore della propriet� cdClienteRiserva.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdClienteRiserva() {
        return cdClienteRiserva;
    }

    /**
     * Imposta il valore della propriet� cdClienteRiserva.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdClienteRiserva(String value) {
        this.cdClienteRiserva = value;
    }

    /**
     * Recupera il valore della propriet� tpClienteRiserva.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpClienteRiserva() {
        return tpClienteRiserva;
    }

    /**
     * Imposta il valore della propriet� tpClienteRiserva.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpClienteRiserva(String value) {
        this.tpClienteRiserva = value;
    }

    /**
     * Recupera il valore della propriet� dfRiserva.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDfRiserva() {
        return dfRiserva;
    }

    /**
     * Imposta il valore della propriet� dfRiserva.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDfRiserva(String value) {
        this.dfRiserva = value;
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
     * Recupera il valore della propriet� compilatoDa.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCompilatoDa() {
        return compilatoDa;
    }

    /**
     * Imposta il valore della propriet� compilatoDa.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCompilatoDa(BigDecimal value) {
        this.compilatoDa = value;
    }

    /**
     * Recupera il valore della propriet� dataCompilazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getDataCompilazione() {
        return dataCompilazione;
    }

    /**
     * Imposta il valore della propriet� dataCompilazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataCompilazione(Date value) {
        this.dataCompilazione = value;
    }

    /**
     * Recupera il valore della propriet� palletID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPalletID() {
        return palletID;
    }

    /**
     * Imposta il valore della propriet� palletID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPalletID(String value) {
        this.palletID = value;
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

}
