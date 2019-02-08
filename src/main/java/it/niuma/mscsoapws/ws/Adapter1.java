//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.02.08 alle 04:02:35 PM CET 
//


package it.niuma.mscsoapws.ws;

import java.util.Calendar;
import java.util.Date;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter1
    extends XmlAdapter<String, Date>
{


    public Date unmarshal(String value) {
        return (javax.xml.bind.DatatypeConverter.parseDate(value).getTime());
    }

    public String marshal(Date value) {
        if (value == null) {
            return null;
        }
        Calendar data = Calendar.getInstance();
        data.setTime(value);
        return (javax.xml.bind.DatatypeConverter.printDate(data));
    }

}
