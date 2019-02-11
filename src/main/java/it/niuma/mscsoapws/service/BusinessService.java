package it.niuma.mscsoapws.service;

import it.niuma.mscsoapws.ws.POrderLineXml;
import it.niuma.mscsoapws.ws.POrderXml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.niuma.mscsoapws.repository.POrderLineRepository;
import it.niuma.mscsoapws.repository.POrderRepository;
import it.niuma.mscsoapws.ws.util.MappingUtility;


@Service 
public class BusinessService {
	
	@Autowired
	private POrderRepository pOrderRepository;
	
	@Autowired

	private POrderLineRepository pOrderLineRepository;

	
	@Autowired
	private MappingUtility mappingUtility;
	
	public POrderXml getPOrderFromOrderNumber(String orderNumber)  {
		
		POrderXml found = pOrderRepository.findByPoNumber(orderNumber);
		return found;
		//Old stuff, keeping it for just in case situation...
		/*POrder pOrder = pOrderRepository.findByPoNumber(orderNumber);
		POrderXml orderXml = mappingUtility.getPOrderXmlFromModel(pOrder);
		long orderId = pOrder.getId();
		List<POrderLine> orderLines = pOrderLineRepository.findByOrderId(orderId);
		List<POrderLineXml> orderLinesXml = orderXml.getOrderLines();
		if (orderLines != null ) {
			for (POrderLine orderLine : orderLines) {
				orderLinesXml.add(mappingUtility.getPOrderLineXmlFromModel(orderLine));
			}
		}
		
		return orderXml;*/
	}

	public POrderLineXml findPOrderLineById (long id) {
		POrderLineXml found = pOrderLineRepository.findById(id);
		return found;
	}

}
