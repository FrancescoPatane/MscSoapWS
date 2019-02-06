package it.niuma.mscsoapws.repository;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import it.niuma.mscsoapws.model.POrderLine;


@Repository
public class POrderLineRepositoryImpl implements POrderLineRepository {
	
	private final Sql2o sql2o;

	
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
	
	

}
