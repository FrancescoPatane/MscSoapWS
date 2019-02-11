package it.niuma.mscsoapws.repository;

import it.niuma.mscsoapws.ws.POrderXml;

public interface POrderRepository {
	
	public POrderXml findByPoNumber(String poNumber) ;
	

}
