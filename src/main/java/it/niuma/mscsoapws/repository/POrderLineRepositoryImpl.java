package it.niuma.mscsoapws.repository;

import java.util.HashMap;
import java.util.List;

import it.niuma.mscsoapws.ws.POrderLineXml;
import it.niuma.mscsoapws.ws.POrderXml;
import it.niuma.mscsoapws.ws.util.MappingUtility;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Query;
import org.sql2o.Sql2o;

import it.niuma.mscsoapws.model.POrderLine;


@Repository
public class POrderLineRepositoryImpl implements POrderLineRepository {
	
	private final Sql2o sql2o;
	private final Logger logger = LoggerFactory.getLogger(this.getClass());


	public POrderLineRepositoryImpl(Sql2o sql2o){
		this.sql2o = sql2o;
	}

	@Override
	public List<POrderLine> findByOrderId(long orderId) {
		
		String query = "SELECT LINE, ITEMCODE, ITEMCODEEXTERNAL, ITEMGLCODE, ITEMDESCRIPTION, ITEMUNIT, ITEMRECEIVINGUNIT, UNITFACTOR, QUANTITYAPPROVED, QUANTITYORDERED, QUANTITYRECEIVED, ITEMPRICE, ITEMTAX,ITEMDISCOUNT,ITEMEXPIRY,LINECOMMENT,VENDORITEMCODE, VENDOR_NOTES vendorNotes from P_ORDERLINE where PORDER_REF = :orderId";
//		String query = "SELECT VENDOR_NOTES vendorNotes from P_ORDERLINE where PORDER_REF = :orderId";

//		String query = "SELECT * from P_ORDERLINE where PORDER_REF = :orderId";
		try (Connection con = sql2o.open()) {
			List<POrderLine> results = con.createQuery(query).addParameter("orderId", orderId).executeAndFetch(POrderLine.class);
			return results;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	
	@Override
	public POrderLineXml findById(long id) {
		List<String> columnNames = MappingUtility.getColumnsNames(sql2o, "P_ORDERLINE");
		List<POrderLineXml> results = null;
		HashMap<String, String> mapOfColumns = MappingUtility.getMappingForDb(POrderLineXml.class, columnNames);
		  try (Connection con = sql2o.open()) {
		    final String queryStringMode =
		        "SELECT * FROM P_ORDERLINE WHERE ID = :ID";
		    Query query = con.createQuery(queryStringMode).addParameter("ID", id);
			  for (String key : mapOfColumns.keySet()) {
				  query = query.addColumnMapping(key, mapOfColumns.get(key));
			  }
		    	results = query.executeAndFetch(POrderLineXml.class);
		    } catch (Exception ex) {
		    	ex.printStackTrace();
		    }
		    POrderLineXml obj = results.get(0);
		    return obj;
		  }
		}
