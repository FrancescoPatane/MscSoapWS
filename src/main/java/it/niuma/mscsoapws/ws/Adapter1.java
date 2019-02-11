
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
