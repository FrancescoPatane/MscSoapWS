package it.niuma.mscsoapws.ws.endpoint;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import it.niuma.mscsoapws.service.POrderService;
import it.niuma.mscsoapws.service.UserService;
import it.niuma.mscsoapws.ws.*;
import it.niuma.mscsoapws.ws.exception.PorderNotFoundException;
import it.niuma.mscsoapws.ws.exception.ServerErrorException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import it.niuma.mscsoapws.service.PLotService;

import javax.websocket.MessageHandler;

@Endpoint
public class ServiceEndpoint {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public static final String NAMESPACE= "it.niuma.mscsoapws.ws";
	
	@Autowired
	private POrderService pOrderService;

	@Autowired
	PLotService pLotService;

	@Autowired
	UserService userService;

	@PayloadRoot(namespace = NAMESPACE, localPart = "getPOrderRequest")
	@ResponsePayload
	public GetPOrderResponse getPOrderRequest(@RequestPayload GetPOrderRequest request, MessageContext context) throws PorderNotFoundException, ServerErrorException {
		logger.info("Received webservice call for getPOrderRequest");
		GetPOrderResponse response = new GetPOrderResponse();
		POrderXml pOrder = pOrderService.getPOrderFromOrderNumber(request.getPoNumber());
		response.setPOrder(pOrder);
		response.setRequiresLogistic(pOrder != null ? pOrderService.doesOrderRequireLogistic(pOrder) : false);
		response.setStatusCode(pOrder != null ? 200 : 500);
		String toAdd = response.isRequiresLogistic() ? "richiede " : "non richiede " + "la logistica";
		response.setMessage(pOrder != null ? "Ricerca effettuata con successo: l'ordine " + toAdd : "Si è verificato un errore");
		return response;
	}

	@PayloadRoot(namespace = NAMESPACE, localPart = "getPOrdersFromVendorCodeRequest")
	@ResponsePayload
	public GetPOrdersFromVendorCodeResponse getPOrderRequest(@RequestPayload GetPOrdersFromVendorCodeRequest request) throws PorderNotFoundException, ServerErrorException {
		logger.info("Received webservice call for getPOrdersFromVendorCodeResponse");
		GetPOrdersFromVendorCodeResponse response = new GetPOrdersFromVendorCodeResponse();
		List<POrderXml> orders = pOrderService.findPOrdersByVendorCode(request.getVendorCode());
		List<POrderXml> thoseWhoRequireLogistic = pOrderService.ordersByVendorCodeThatRequireLogistic(orders);
		response.getOrders().addAll(thoseWhoRequireLogistic);
		response.setStatusCode(thoseWhoRequireLogistic != null && thoseWhoRequireLogistic.size() > 0 ? 200 : 500);
		response.setSuccess(thoseWhoRequireLogistic != null && thoseWhoRequireLogistic.size() > 0 ? true : false);
		response.setMessage(thoseWhoRequireLogistic != null && thoseWhoRequireLogistic.size() > 0 ? "Ricerca effettuata con successo " : "Si è verificato un errore");
		return response;
	}


	@PayloadRoot(namespace = NAMESPACE, localPart = "createNewPLotRequest")
	@ResponsePayload
	public CreateNewPLotResponse createNewPLotRequest(@RequestPayload CreateNewPLotRequest request) {
		logger.info("Received webservice call for createNewPLotRequest");
		CreateNewPLotResponse response = new CreateNewPLotResponse();
		String accessToken = "";
		if (userService.hasTokenExpired(accessToken)) {
			BigDecimal vendorID = userService.getVendorIDFromAccessToken(accessToken);
			BigDecimal userID = userService.getUserIdByVendorID(vendorID);
			PLotDataFromInput plotFromInput = request.getPlotToCreate();
			Map<String, Object> newLine = null;
			List<PLotLineXml> toReturnPLotLines = new ArrayList<>();
			PLotXml toReturnPLot = null;
			for (PLotLineDataFromInput riga : request.getPlotLineToCreate()) {
				//I can assume that the orderNumber is unique and that it already exists
				 newLine  = pLotService.executePlotCreationLogic(
						 plotFromInput.getNumeroOrdine(),
						 plotFromInput.getNumeroDDT(),
						 plotFromInput.getDtEmissione(),
						 plotFromInput.getDtIngresso(),
						 riga.getPesoVariabile(),
						 riga.getNrLotto(),
						 riga.getNrNetto(),
						 riga.getNrLordo(),
						 riga.getQuantitaConfermata(),
						 riga.getNrColli(),
						 riga.getNrPezziConf(),
						 riga.getDtScadenza(),
						 riga.getDocDoganale(),
						 riga.getNDocDoganale(),
						userID,
						 riga.getCodiceSSCCPallett(),
						 riga.getGlobalTradeItemNumber(),
						 riga.getNrRiga(),
						 riga.getCodiceArticolo(),
						 riga.getUnitaMisura(),
						 riga.getPaeseOrigine(),
						 riga.getPaeseProvenienza(),
						 riga.getDocSanitario(),
						 riga.getDataDocSanitario(),
						 riga.getDfFattura(),
						 riga.getDtFattura(),
						 riga.getCodiceAnimo(),
						 riga.getSif(),
						 riga.getVoceDoganale(),
						 riga.getIdPallet()
				);
				 if (toReturnPLot == null) {
				 	toReturnPLot = (PLotXml) newLine.get("PLot");
				 }
				 toReturnPLotLines.add((PLotLineXml) newLine.get("PLotLine"));
			}

			response.setPLot(toReturnPLot);
			response.getPLotLine().addAll(toReturnPLotLines);
		}
		return response;
	}

	


}
