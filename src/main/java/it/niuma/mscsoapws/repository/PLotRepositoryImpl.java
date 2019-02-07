package it.niuma.mscsoapws.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Query;
import org.sql2o.Sql2o;

import it.niuma.mscsoapws.ws.PLotXml;

@Repository
public class PLotRepositoryImpl implements PLotRepository {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	
	@Autowired 
	POrderRepository repo;

	
	@Autowired
	private Sql2o sql2o;

	@Override
	public PLotXml findById(BigDecimal id) {
		PLotXml found = null;
		try (Connection con = sql2o.open()) {
			String queryStringMode = "SELECT * FROM P_LOT WHERE ID = :ID";

			Query query =  con.createQuery(queryStringMode).addParameter("ID", id);
			try {
				List<PLotXml> results = query.executeAndFetch(PLotXml.class);
				found = results != null && results.size() > 0 ? results.get(0) : found;
			} catch (Exception ex) {
				ex.printStackTrace();
				logger.error("There was en error by making the following query" + queryStringMode +"\n The parameter arrived as: " + id.toString()
						+ "Reason of exception: " +ex.getMessage());
				return found;
			}
		}
		return found;
	}

	@Override
	public PLotXml createNewPlotXml(String numeroOrdine, String numeroDDT, Date dtEmissione, Date dtIngresso) {
		PLotXml justCreated = null;
		
		String entityOrderName = null;
		try {
			entityOrderName = repo.findByPoNumber(numeroOrdine).getEntityName();
		} catch (Exception ex) {
			
		}
		
		LocalDateTime dtEmissioneNew = dtEmissione != null ? dtEmissione.toInstant()
			      .atZone(ZoneId.systemDefault())
			      .toLocalDateTime() : null;
		
		LocalDateTime dtIngressoNew = dtIngresso != null ? dtIngresso.toInstant()
			      .atZone(ZoneId.systemDefault())
			      .toLocalDateTime(): null;
		
		try (Connection con = sql2o.open()) {
			String queryStringMode = "INSERT INTO P_LOT VALUES ( :dtEmissione, :numeroDDT, :dtIngresso, :nomeCliente, :numeroOrdine)";

			Query query =  con.createQuery(queryStringMode, true).addParameter("dtEmissione", dtEmissioneNew)
					.addParameter("numeroDDT", numeroDDT)
					.addParameter("dtIngresso", dtIngressoNew)
					.addParameter("nomeCliente", entityOrderName)
					.addParameter("numeroOrdine", numeroOrdine);
			Object key = query.executeUpdate().getKey();
		}
		return null;
	}

	@Override
	public PLotXml findByOrderID(String orderID) {
		PLotXml pLot = null;
		try (Connection con = sql2o.open()) {
			String queryStringMode = "SELECT * FROM P_LOT WHERE PONUMBER = :ORDERID";

			Query query =  con.createQuery(queryStringMode).addParameter("ORDERID", orderID);
			try {
				List<PLotXml> results = query.executeAndFetch(PLotXml.class);
				pLot = results != null && results.size() > 0 ? results.get(0) : pLot;
			} catch (Exception ex) {
				ex.printStackTrace();
				logger.error("There was en error by making the following query" + queryStringMode +"\n The parameter arrived as: " + orderID
						+ "Reason of exception: " +ex.getMessage());
				return pLot;
			}
		}
		return pLot;
	}

	@Override
	public boolean delete(BigDecimal id) {
		PLotXml hasItBeenDeleted;
	    try (Connection con = sql2o.beginTransaction()) {
	    	String queryStringMode = "DELETE FROM P_LOT WHERE ID = :ID";
	    	Query query = con.createQuery(queryStringMode).addParameter("ID", id);
	    	query.executeUpdate();
	    	con.commit();   	
	    }
    	//It should have been deleted by now
    	//Just to be extremely sure...	 
	    hasItBeenDeleted = findById(id);
	    return hasItBeenDeleted == null;

	}

}
