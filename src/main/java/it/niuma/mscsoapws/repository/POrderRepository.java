package it.niuma.mscsoapws.repository;

import it.niuma.mscsoapws.ws.POrderXml;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public interface POrderRepository {
	
	public POrderXml findByPoNumber(String poNumber) ;

	public List<POrderXml> findByVendorCode(String vendorCode);

	public LocalDateTime findTimeLimitForLogisticByPONumber(String poNumber);

}
