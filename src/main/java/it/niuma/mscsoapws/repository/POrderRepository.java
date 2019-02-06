package it.niuma.mscsoapws.repository;

import it.niuma.mscsoapws.model.POrder;

public interface POrderRepository {
	
	public POrder findByPoNumber(String poNumber) throws Exception;
	

}
