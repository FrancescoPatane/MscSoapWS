package it.niuma.mscsoapws.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.niuma.mscsoapws.model.POrder;
import it.niuma.mscsoapws.model.POrderLine;
import it.niuma.mscsoapws.repository.PLotRepository;
import it.niuma.mscsoapws.repository.POrderLineRepository;
import it.niuma.mscsoapws.repository.POrderRepository;
import it.niuma.mscsoapws.ws.PLotXml;
import it.niuma.mscsoapws.ws.POrderLineXml;
import it.niuma.mscsoapws.ws.POrderXml;
import it.niuma.mscsoapws.ws.exception.PorderNotFoundException;
import it.niuma.mscsoapws.ws.exception.ServerErrorException;
import it.niuma.mscsoapws.ws.util.MappingUtility;
import it.niuma.mscsoapws.ws.util.AuthUtility;


@Service 
public class POrderService {
	
	@Autowired
	private POrderRepository pOrderRepository;
	
	@Autowired
	private POrderLineRepository pOrderLineRepository;

	
	public POrderXml getPOrderFromOrderNumber(String orderNumber) throws PorderNotFoundException, ServerErrorException {
		
		POrderXml pOrder;
		try {
			pOrder = pOrderRepository.findByPoNumber(orderNumber);
			if (pOrder != null) {
				pOrder.getOrderLines().addAll(pOrderLineRepository.findByOrderId(pOrder.getId()));
				return pOrder;
			}else {
				throw new PorderNotFoundException("No order found for order number: " + orderNumber);
			}
		} catch (PorderNotFoundException e) {
			throw e;
		} catch (Exception e) {
			throw new ServerErrorException("Error executing request getPOrderFromOrderNumber for order number:" + orderNumber);
		}

		
	}

}
