package it.niuma.mscsoapws.repository;

import java.math.BigDecimal;
import java.util.Date;

import it.niuma.mscsoapws.ws.PLotXml;

public interface PLotRepository {
	
	public PLotXml findById(BigDecimal id);
	
	public PLotXml createNewPlotXml(String numeroOrdine, String numeroDDT, Date dtEmissione, Date dtIngresso);
	
	public PLotXml findByOrderID(String orderID);
	
	public boolean delete(BigDecimal id);

}
