package it.niuma.mscsoapws.service;

import it.niuma.mscsoapws.ws.POrderXml;
import org.apache.tomcat.jni.Local;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.niuma.mscsoapws.repository.POrderLineRepository;
import it.niuma.mscsoapws.repository.POrderRepository;
import it.niuma.mscsoapws.ws.exception.PorderNotFoundException;
import it.niuma.mscsoapws.ws.exception.ServerErrorException;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Service 
public class POrderService {
	
	@Autowired
	private POrderRepository pOrderRepository;
	
	@Autowired
	private POrderLineRepository pOrderLineRepository;

	public List<POrderXml> findPOrdersByVendorCode(String vendorCode) {
		return pOrderRepository.findByVendorCode(vendorCode);
	}

	public List<POrderXml> ordersByVendorCodeThatRequireLogistic(List<POrderXml> orders) {
		List<POrderXml> toReturn = new ArrayList<>();
		for (POrderXml order: orders) {
			BigDecimal toExamine = order.getLogistic();
			if (toExamine == null) {
				continue;
			}
			boolean needsLogistic = doesOrderRequireLogistic(order); //Condition 1: the order requires the logistic
			LocalDateTime timeLimitForLogistic = findTimeLimitForLogisticByPONumber(order.getPoNumber());
			boolean hasTimePassed = LocalDateTime.now().isBefore(timeLimitForLogistic);
			if (needsLogistic && !hasTimePassed||
					(!needsLogistic && !hasTimePassed && !toExamine.equals(new BigDecimal(1)))
			) {
				//If either one between option 1 or option 2 (logistic value in PORDER != 1) are true AND there is still time for compiling (Option 3)
				toReturn.add(order);
				continue; //And I keep on with the iteration
			}


		}

		return toReturn;
	}

	public LocalDateTime findTimeLimitForLogisticByPONumber (String poNumber) {
		return pOrderRepository.findTimeLimitForLogisticByPONumber(poNumber);
	}

	public boolean doesOrderRequireLogistic(POrderXml order) {
		//First condition: Entity ID is holding one from "MAGAESTERO","MAGAGECONT","MAGAGENOVA", "MAGAESTUK", "MAGAGENUK", "MAGACONTUK"
		boolean toReturn = false;
		String entityID = order.getEntityId();
		switch (entityID) {
			case "MAGAESTRO":
				return true;
			case "MAGAGECONT":
				return true;
			case "MAGAGENOVA":
				return true;
			case "MAGAESTUK":
				return true;
			case "MAGAGENUK":
				return true;
			case "MAGACONTUK":
				return true;
			default:
				break;
		}
		//If I'm here, I need to check the second condition: COVENDORCODE has to be equal to “NPL”
		String coVendorCode = order.getCoVendorCode();
		if (coVendorCode.equals("NPL")) {
			return true;
		}
		//If I am here, this means I have to check the last condition: PONUMBER starts either with “8699” or “8697”
		String poNumber = order.getPoNumber();
		String toMatch = "869";
		for (int i = 0; i < 4; i++) {
			boolean checkCondition = i != 3 ? poNumber.charAt(i) == toMatch.charAt(i) : poNumber.charAt(i) == Character.valueOf('9') || poNumber.charAt(i) == Character.valueOf('7');
			if (checkCondition && i == 3) {
				//If I reach this line, it means that the checkCondition variable has hold a value of true for 3 iterations and that I'm in the last iteration
				return true;
			}
			if (!checkCondition) {
				break;
			}
		}
		//If I arrive here, it means that the order doesn't require logistic
		return false;
	}

	
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
