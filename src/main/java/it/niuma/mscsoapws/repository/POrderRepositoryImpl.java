package it.niuma.mscsoapws.repository;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import it.niuma.mscsoapws.model.POrder;
import it.niuma.mscsoapws.ws.POrderXml;



@Repository
public class POrderRepositoryImpl implements POrderRepository {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	private final Sql2o sql2o;
	
	
	public POrderRepositoryImpl(Sql2o sql2o){
		this.sql2o = sql2o;
	}
		
		
		
		@Override
		public POrderXml findByPoNumber(String poNumber) throws Exception {
			try (Connection con = sql2o.open()) {
				POrderXml pOrder = null;
				String query = "SELECT ID, PONUMBER, ENTITYID, ENTITYNAME, POINTERNALID, DELIVERYDATE, CREATEDATE, DELIVERYPORTCODE, VOYAGECODE FROM P_ORDER WHERE ponumber = :poNumber";
				List<POrderXml> results = con.createQuery(query).addParameter("poNumber", poNumber).executeAndFetch(POrderXml.class);

				if (results!= null && results.size()>0) {
					pOrder = results.get(0);
				}
				
				return pOrder;
			} catch (Exception e) {
				e.printStackTrace();
				throw e;
			}


	}
	
	

}
