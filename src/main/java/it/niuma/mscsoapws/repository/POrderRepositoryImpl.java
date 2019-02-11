package it.niuma.mscsoapws.repository;

import java.util.*;

import it.niuma.mscsoapws.ws.POrderXml;
import it.niuma.mscsoapws.ws.util.MappingUtility;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Query;
import org.sql2o.Sql2o;


@Repository
public class POrderRepositoryImpl implements POrderRepository {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	private final Sql2o sql2o;
	
	
	public POrderRepositoryImpl(Sql2o sql2o){
		this.sql2o = sql2o;
	}

		@Override
		public POrderXml findByPoNumber(String poNumber)  {
		List<String> columnNames = MappingUtility.getColumnsNames(sql2o, "P_ORDER");
		HashMap<String, String> mapOfColumns = MappingUtility.getMappingForDb(POrderXml.class, columnNames);
		POrderXml pOrder = null;
		try (Connection con = sql2o.open()) {
			String queryString = "SELECT * FROM P_ORDER WHERE PONUMBER = :poNumber";
			Query query = con.createQuery(queryString).addParameter("poNumber", poNumber);
			for (String key : mapOfColumns.keySet()) {
				query = query.addColumnMapping(key, mapOfColumns.get(key));
			}
			List<POrderXml> results = query.executeAndFetch(POrderXml.class);
			if (results!= null && results.size()>0) {
				pOrder = results.get(0);
			}
		} catch (Exception e) {
			logger.error("Error executing findByPoNumber, poNumber: " + poNumber);
			e.printStackTrace();
			throw e;
		}
		return pOrder;

	}
	
	

}
