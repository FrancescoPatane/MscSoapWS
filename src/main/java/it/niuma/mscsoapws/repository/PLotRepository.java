package it.niuma.mscsoapws.repository;

import it.niuma.mscsoapws.ws.PLotLineXml;
import it.niuma.mscsoapws.ws.PLotXml;

import java.math.BigDecimal;
import java.util.Date;

public interface PLotRepository {
	
	public PLotXml findPLotById(BigDecimal id);
	
	public BigDecimal createNewPlotXml(String numeroOrdine, String numeroDDT, Date dtEmissione, Date dtIngresso, BigDecimal userID);

	public BigDecimal createNewPLotLineXml(BigDecimal idLot,
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
										   String idPallet);

	public PLotXml findByOrderID(String orderID);
	
	public boolean deletePLot(BigDecimal id);

	public boolean deletePLotLine(BigDecimal id);

	public PLotLineXml findPLotLineById(BigDecimal id);

	public PLotLineXml findPLotLineByLotID (BigDecimal id);

	public Boolean updatePLot(PLotXml pLot);

}
