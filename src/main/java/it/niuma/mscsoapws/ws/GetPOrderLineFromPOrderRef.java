
package it.niuma.mscsoapws.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="porder_ref" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "porderRef"
})
@XmlRootElement(name = "getPOrderLineFromPOrderRef", namespace = "it.niuma.mscsoapws.ws")
public class GetPOrderLineFromPOrderRef {

    @XmlElement(name = "porder_ref", namespace = "it.niuma.mscsoapws.ws")
    protected long porderRef;

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

}
