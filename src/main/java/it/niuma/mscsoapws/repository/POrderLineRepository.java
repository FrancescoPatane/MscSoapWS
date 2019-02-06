package it.niuma.mscsoapws.repository;

import java.util.List;

import it.niuma.mscsoapws.model.POrderLine;
import it.niuma.mscsoapws.ws.POrderLineXml;


public interface POrderLineRepository {
	
	public List<POrderLine> findByOrderId(long orderId);
	
	public POrderLineXml findById(long id);

}
