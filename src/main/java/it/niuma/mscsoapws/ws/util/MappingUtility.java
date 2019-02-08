package it.niuma.mscsoapws.ws.util;

import java.lang.reflect.Method;
import java.util.*;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import it.niuma.mscsoapws.ws.POrderLineXml;
import it.niuma.mscsoapws.ws.POrderXml;
import org.springframework.stereotype.Component;

import it.niuma.mscsoapws.model.POrder;
import it.niuma.mscsoapws.model.POrderLine;
import org.sql2o.Connection;
import org.sql2o.Query;
import org.sql2o.Sql2o;

@Component
public class MappingUtility {

	public static  List<String> getColumnsNames(Sql2o sql2o, String tableName) {
		String queryText = "SELECT COLUMN_NAME FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_SCHEMA='dbo' AND TABLE_NAME='" + tableName+"'";
		List<String> toReturn = null;
		try(Connection con = sql2o.open()) {
			Query query = con.createQuery(queryText);
			toReturn = query.executeAndFetch(String.class);
		} catch (Exception ex) {
			return toReturn;
		}
		return toReturn;
	}

	public static HashMap<String,String> getMappingForDb(Class classe, List<String> columnNames) {
		HashMap<String,String> toReturn  = new HashMap<>();
		List<String> variableNamesTemp = new ArrayList<>();
		String[] variableNames = new String[columnNames.size()];

		Method[] test = classe.getMethods();
		for (Method metodo : test) {
			if(metodo.getName().contains("set")) {
				String[] arrayToElaborate = metodo.getName().split("set"); //Pos 0 holds "set"; Pos 1 holds the name
				String elaborated = Character.toLowerCase(arrayToElaborate[1].charAt(0)) + arrayToElaborate[1].substring(1,arrayToElaborate[1].length());
				variableNamesTemp.add(elaborated);
			}
		}
		Collections.sort(columnNames);
		Collections.sort(variableNamesTemp);

		for (int i = 0; i < columnNames.size(); i++) {
			String elaboration = columnNames.get(i).contains("_")  ?  columnNames.get(i).split("-|_")[0]+columnNames.get(i).split("-|_")[1] : columnNames.get(i);
			for (int j = 0; j <  variableNamesTemp.size(); j++) {
				if (variableNamesTemp.get(j).toUpperCase().contains(elaboration)) {
					int indexOne = columnNames.indexOf(columnNames.get(i));
					int indexTwo = variableNamesTemp.indexOf(variableNamesTemp.get(j));
					variableNames[indexOne] = variableNamesTemp.get(indexTwo);
					break;
				}
			}
		}
		//Now VariableNames and ColumnsNames both hold the same order and the same elements in the same position
		//That means I can use just one index for iterating
		for (int i = 0; i < columnNames.size(); i++) {
			toReturn.put(columnNames.get(i), variableNames[i]);
		}
		return toReturn;
	}
	
	public POrderXml getPOrderXmlFromModel (POrder order) throws DatatypeConfigurationException {
		GregorianCalendar c = new GregorianCalendar();

		POrderXml xmlObject = new POrderXml();
		c.setTime(order.getCreateDate());
		XMLGregorianCalendar createDateXml = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
		//xmlObject.setCreateDate(createDateXml);
		c.setTime(order.getDeliveryDate());
		XMLGregorianCalendar deliveryDateXml = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);

		//xmlObject.setDeliveryDate(deliveryDateXml);
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

		
	    //xmlObject.setItemExpiry(itemExpiryDateXml);
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
