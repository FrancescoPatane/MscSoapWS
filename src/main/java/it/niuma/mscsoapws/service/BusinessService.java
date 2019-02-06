package it.niuma.mscsoapws.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.niuma.mscsoapws.model.POrder;
import it.niuma.mscsoapws.model.POrderLine;
import it.niuma.mscsoapws.repository.POrderLineRepository;
import it.niuma.mscsoapws.repository.POrderRepository;
import it.niuma.mscsoapws.ws.POrderLineXml;
import it.niuma.mscsoapws.ws.POrderXml;
import it.niuma.mscsoapws.ws.util.MappingUtility;


@Service 
public class BusinessService {
	
	@Autowired
	POrderRepository pOrderRepository;
	
	@Autowired
	POrderLineRepository pOrderLineRepository;
	
	@Autowired
	private MappingUtility mappingUtility;
	
	public POrderXml getPOrderFromOrderNumber(String orderNumber) throws Exception {
		POrder pOrder = pOrderRepository.findByPoNumber(orderNumber);
		POrderXml orderXml = mappingUtility.getPOrderXmlFromModel(pOrder);
		long orderId = pOrder.getId();
		List<POrderLine> orderLines = pOrderLineRepository.findByOrderId(orderId);
		List<POrderLineXml> orderLinesXml = orderXml.getOrderLines();
		if (orderLines != null ) {
			for (POrderLine orderLine : orderLines) {
				orderLinesXml.add(mappingUtility.getPOrderLineXmlFromModel(orderLine));
			}
		}
		
		return orderXml;
	}

}
