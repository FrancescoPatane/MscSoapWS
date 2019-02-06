package it.niuma.mscsoapws.repository;

import java.util.List;

import it.niuma.mscsoapws.model.POrderLine;


public interface POrderLineRepository {
	
	public List<POrderLine> findByOrderId(long orderId);

}
