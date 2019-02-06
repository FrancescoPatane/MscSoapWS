package it.niuma.mscsoapws.ws.util;

import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.stereotype.Component;

import it.niuma.mscsoapws.model.POrder;
import it.niuma.mscsoapws.model.POrderLine;
import it.niuma.mscsoapws.ws.POrderLineXml;
import it.niuma.mscsoapws.ws.POrderXml;

@Component
public class MappingUtility {
	
	
	public POrderXml getPOrderXmlFromModel (POrder order) throws DatatypeConfigurationException {
		GregorianCalendar c = new GregorianCalendar();

		POrderXml xmlObject = new POrderXml();
		c.setTime(order.getCreateDate());
		XMLGregorianCalendar createDateXml = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
		xmlObject.setCreateDate(createDateXml);
		c.setTime(order.getDeliveryDate());
		XMLGregorianCalendar deliveryDateXml = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);

		xmlObject.setDeliveryDate(deliveryDateXml);
		xmlObject.setDeliveryPortCode(order.getDeliveryPortCode());
		xmlObject.setEntityId(order.getEntityId());
		xmlObject.setEntityName(order.getEntityName());
		xmlObject.setPoInternalId(order.getPoInternalId());
		xmlObject.setPoNumber(order.getPoNumber());
		xmlObject.setVoyageCode(order.getVoyageCode());
		
		return xmlObject;
	}
	
	public POrderLineXml getPOrderLineXmlFromModel (POrderLine orderLine) throws DatatypeConfigurationException  {
		GregorianCalendar c = new GregorianCalendar();
		POrderLineXml xmlObject = new POrderLineXml();
		
		xmlObject.setItemCode(orderLine.getItemCode());
		xmlObject.setItemCodeExternal(orderLine.getItemCodeExternal());
		xmlObject.setItemDescription(orderLine.getItemDescription());
		xmlObject.setItemDiscount(orderLine.getItemDiscount());
		
		c.setTime(orderLine.getItemExpiry());
		XMLGregorianCalendar itemExpiryDateXml = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);

		
		xmlObject.setItemExpiry(itemExpiryDateXml);
		xmlObject.setItemGlCode(orderLine.getItemGlCode());
		xmlObject.setItemPrice(orderLine.getItemPrice());
		xmlObject.setItemReceivingUnit(orderLine.getItemReceivingUnit());
		xmlObject.setItemTax(orderLine.getItemTax());
		xmlObject.setItemUnit(orderLine.getItemUnit());
		xmlObject.setLine(orderLine.getLine());
		xmlObject.setLineComment(orderLine.getLineComment());
		xmlObject.setQuantityApproved(orderLine.getQuantityApproved());
		xmlObject.setQuantityOrdered(orderLine.getQuantityOrdered());
		xmlObject.setQuantityReceived(orderLine.getQuantityReceived());
		xmlObject.setUnitFactor(orderLine.getUnitFactor());
		xmlObject.setVendorItemCode(orderLine.getVendorItemCode());
		xmlObject.setVendorNotes(orderLine.getVendorNotes());
		
		return xmlObject;
		
	}

	
	

}
