package it.niuma.mscsoapws.service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import it.niuma.mscsoapws.repository.POrderLineRepository;
import it.niuma.mscsoapws.repository.POrderRepository;
import it.niuma.mscsoapws.ws.PLotLineXml;
import it.niuma.mscsoapws.ws.PLotXml;
import it.niuma.mscsoapws.ws.POrderLineXml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.niuma.mscsoapws.exceptions.ElementNotDeletedException;
import it.niuma.mscsoapws.repository.PLotRepository;

@Service
public class PLotService {
	
	
	@Autowired
	PLotRepository pLotRepository;

	@Autowired
	POrderRepository pOrderRepository;

	@Autowired
	POrderLineRepository pOrderLineRepository;
	
	public PLotXml createNewPlot(String numeroOrdine, String numeroDDT, Date dtEmissione, Date dtIngresso, BigDecimal userID) {
		BigDecimal justCreated = pLotRepository.createNewPlotXml(numeroOrdine, numeroDDT, dtEmissione, dtIngresso, userID);
		return pLotRepository.findPLotById(justCreated);
	}

	public Map<String, Object> executePlotCreationLogic(
			String numeroOrdine,
			String numeroDDT,
			Date dtEmissione,
			Date dtIngresso,
			BigDecimal pesoVariabile,
			BigDecimal nrLotto,
			BigDecimal nrNetto,
			BigDecimal nrLordo,
			BigDecimal quantitaConfermata,
			BigDecimal nrColli,
			BigDecimal nrPezziConf,
			Date dtScadenza,
			BigDecimal docDoganale,
			BigDecimal nDocDoganale,
			BigDecimal userID,
			String codiceSSCCPallett,
			String globalTradeItemNumber,
			BigDecimal nrRiga,
			String codiceArticolo,
			String unitaMisura,
			String paeseOrigine,
			String paeseProvenienza,
			String docSanitario,
			Date dtDocSanitario,
			String dfFattura,
			Date dtFattura,
			String codiceAnimo,
			String sif,
			String voceDoganale,
			String idPallet) {
		HashMap<String,Object> toReturn = new HashMap<>();
		PLotXml lookFor = pLotRepository.findByOrderID(numeroOrdine);
		if (lookFor != null) {
			lookFor.setDtEmissione(dtEmissione);
			lookFor.setDfDocIngresso(numeroDDT);
			lookFor.setDtIngresso(dtIngresso);
			lookFor.setPoNumber(numeroOrdine);
			Boolean justUpdated = null;
			//TODO
			try {
				justUpdated = pLotRepository.updatePLot(lookFor);
				if (!justUpdated) {
					throw new Exception("Update not successful");
				}
			} catch (Exception ex) {
				return null;
			}
			lookFor = pLotRepository.findPLotById(lookFor.getId());
		} else {
			BigDecimal idJustCreated = pLotRepository.createNewPlotXml(numeroOrdine,numeroDDT,dtEmissione,dtIngresso, userID);
			lookFor = pLotRepository.findPLotById(idJustCreated);
		}
		PLotLineXml connectedToLookFor = pLotRepository.findPLotLineByLotID(lookFor.getId());
		if (connectedToLookFor != null) {
			try {
				boolean deletion = pLotRepository.deletePLotLine(connectedToLookFor.getId());
				connectedToLookFor = deletion ? null : connectedToLookFor;
				if (!deletion) {
					throw new ElementNotDeletedException("For some unknown reason, I couldn't delete the line");
				}
			} catch (ElementNotDeletedException ex) {
				ex.printStackTrace();
				return null;
			}
		}
		if (connectedToLookFor == null) {
			BigDecimal idJustCreatedLine = pLotRepository.createNewPLotLineXml(
					lookFor.getId(),
					pesoVariabile,
					nrLotto,
					nrNetto,
					nrLordo,
					quantitaConfermata,
					nrColli,
					nrPezziConf,
					dtScadenza,
					docDoganale,
					nDocDoganale,
					userID,
					codiceSSCCPallett,
					globalTradeItemNumber,
					nrRiga,
					codiceArticolo,
					unitaMisura,
					paeseOrigine,
					paeseProvenienza,
					docSanitario,
					dtDocSanitario,
					dfFattura,
					dtFattura,
					codiceAnimo,
					sif,
					voceDoganale,
					idPallet
			);
			connectedToLookFor = pLotRepository.findPLotLineById(idJustCreatedLine);
		}
		toReturn.put("PLot", lookFor);
		toReturn.put("PLotLine", connectedToLookFor);
		return toReturn;
	}
	
	

}
