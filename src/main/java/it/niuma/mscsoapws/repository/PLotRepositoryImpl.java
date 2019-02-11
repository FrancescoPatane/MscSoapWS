package it.niuma.mscsoapws.repository;

import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import it.niuma.mscsoapws.ws.PLotLineXml;
import it.niuma.mscsoapws.ws.PLotXml;
import it.niuma.mscsoapws.ws.util.MappingUtility;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Query;
import org.sql2o.Sql2o;

@Repository
public class PLotRepositoryImpl implements PLotRepository {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	
	@Autowired 
	POrderRepository repo;

	
	@Autowired
	private Sql2o sql2o;

	@Override
	public PLotXml findPLotById(BigDecimal id) {
		PLotXml found = null;
		List<String> columnNames = MappingUtility.getColumnsNames(sql2o, "P_LOT");
		HashMap<String, String> mappedValues = MappingUtility.getMappingForDb(PLotXml.class, columnNames);
		try (Connection con = sql2o.open()) {
			String queryStringMode = "SELECT * FROM P_LOT WHERE ID = :ID";

			Query query =  con.createQuery(queryStringMode).addParameter("ID", id);
			for (String key : mappedValues.keySet()) {
				query = query.addColumnMapping(key, mappedValues.get(key));
			}
			try {
				List<PLotXml> results = query.executeAndFetch(PLotXml.class);
				found = results != null && results.size() > 0 ? results.get(0) : found;
			} catch (Exception ex) {
				ex.printStackTrace();
				logger.error("There was en error by making the following query" + queryStringMode +"\n The parameter arrived as: " + id.toString()
						+ "Reason of exception: " +ex.getMessage());
				return found;
			}
		}
		return found;
	}

	@Override
	public BigDecimal createNewPlotXml(String numeroOrdine, String numeroDDT, Date dtEmissione, Date dtIngresso, BigDecimal userID) {
		BigDecimal key = null;
		
		String entityOrderName = repo.findByPoNumber(numeroOrdine).getEntityName();

		
		LocalDateTime dtEmissioneNew = dtEmissione != null ? dtEmissione.toInstant()
			      .atZone(ZoneId.systemDefault())
			      .toLocalDateTime() : null;
		
		LocalDateTime dtIngressoNew = dtIngresso != null ? dtIngresso.toInstant()
			      .atZone(ZoneId.systemDefault())
			      .toLocalDateTime(): null;
		
		try (Connection con = sql2o.open()) {
			String queryStringMode = "INSERT INTO P_LOT (TP_RECORD, CD_DEPOSITANTE, DT_EMISSIONE, DF_DOCINGRESSO, DT_INGRESSO, CD_CEDENTE, TP_CEDENTE, STATO, INVIATO_DA, DATA_INVIO, EMAIL, PONUMBER, SSCC_AVAILABLE)\n" +
					"VALUES('TD', 'MSC', :dtEmissione, :numeroDDT, :dtIngresso, :nomeCliente, 'SUP', 0, :inviatoDa, '', '', :numeroOrdine, 0)";

			Query query =  con.createQuery(queryStringMode, true).addParameter("dtEmissione", dtEmissioneNew)
					.addParameter("numeroDDT", numeroDDT)
					.addParameter("dtIngresso", dtIngressoNew)
					.addParameter("nomeCliente", entityOrderName)
					.addParameter("inviatoDa", userID)
					.addParameter("numeroOrdine", numeroOrdine);
			key = new BigDecimal(query.executeUpdate().getKey().toString());
			con.commit();
		} catch (Exception ex) {
			logger.error("For some unknown reason, I couldn't insert the new pLot.\n Reason for exception: " + ex.getMessage());
			return null;
		}
		return key;
	}

	@Override
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
										   String idPallet) {
		BigDecimal toReturn = null;
		String queryString = "INSERT INTO P_LOTLINE\n" +
				"(ID_LOT, TP_RECORD, CD_DEPOSITANTE, NR_RIGA, CD_GTIN, CD_ARTICOLO, CD_MISURA, FL_PESO_VARIABILE, NR_LOTTO, QT_PREVISTA, NR_NETTO, NR_LORDO, NR_COLLI, NR_PZCONF, TP_LISTA_INGRESSO, TP_PROPRIETARIO_STOCK, DT_SCADENZA, CD_PAESE_ORIGINE, CD_PAESE_PROVENIENZA, DF_DVCE, DT_DVCE, DF_ANIMO, DF_SIF, FL_DOGANA, DF_FATTURA, DT_FATTURA, DF_MRN, TP_CLIENTE_RISERVA, COMPILATO_DA)\n" +
				"VALUES(:IDLOT, :TPRECORD, :CDDEPOSITANTE, :NRRIGA, :CDGTIN, :CDARTICOLO,:CDMISURA, :FLPESOVARIABILE, :NRLOTTO, :QTPREVISTA, :NRNETTO, :NRLORDO, :NRCOLLI, :NRPZCONF, :TPLISTAINGRESSO, :TPPROPRIETARIOSTOCK, :DTSCADENZA, :CDPAESEORIGINE, :CDPAESEPROVENIENZA, :DFDVCE, :DTDVCE, :DFANIMO, :DFSIF, :FLDOGANA, :DFFATTURA, :DTFATTURA, :DFMRN, :TPCLIENTERISERVA, :COMPILATODA )\n";
		try (Connection con = sql2o.beginTransaction()) {
			Query query = con.createQuery(queryString)
					.addParameter("IDLOT", idLot)
					.addParameter("TPRECORD", "TR")
					.addParameter("CDGTIN", globalTradeItemNumber)
					.addParameter("COMPILATODA", userID)
					.addParameter("CDARTICOLO",codiceArticolo)
					.addParameter("CDMISURA", unitaMisura)
					.addParameter("CDDEPOSITANTE", "MSC")
					.addParameter("TPLISTAINGRESSO","ACQ")
					.addParameter("DFDVCE", docSanitario != null ? docSanitario : "")
					.addParameter("DTDVCE", dtDocSanitario != null ? dtDocSanitario : "")
					.addParameter("NRRIGA", nrRiga)
					.addParameter("TPPROPRIETARIOSTOCK", "OWN")
					.addParameter("TPCLIENTERISERVA", "CUS")
					.addParameter("FLPESOVARIABILE", pesoVariabile != null ? pesoVariabile : 0)
					.addParameter("NRLOTTO", nrLotto)
					.addParameter("NRNETTO", nrNetto)
					.addParameter("NRLORDO", nrLordo)
					.addParameter("NRCOLLI", nrColli)
					.addParameter("QTPREVISTA", quantitaConfermata)
					.addParameter("NRPZCONF", nrPezziConf)
					.addParameter("DTSCADENZA", dtScadenza)
					.addParameter("CDPAESEORIGINE", paeseOrigine != null ? paeseOrigine : "")
					.addParameter("CDPAESEPROVENIENZA", paeseProvenienza != null ? paeseProvenienza : "")
					.addParameter("DFANIMO", codiceAnimo != null ? codiceAnimo : "")
					.addParameter("DFSIF", sif != null ? sif : "")
					.addParameter("DFFATTURA", dfFattura != null ? dfFattura : "")
					.addParameter("DTFATTURA", dtFattura != null ? dtFattura : "")
					.addParameter("FLDOGANA", docDoganale != null ? docDoganale : "")
					.addParameter("DFMRN", nDocDoganale != null ? nDocDoganale : "");
			toReturn = new BigDecimal(query.executeUpdate().getKey().toString());
			con.commit();
		} catch (Exception ex) {
			logger.error("For some unknown reason, I wasn't able to insert the new entity.\n Reason for exception: " + ex.getMessage());
			return toReturn;
		}
		return toReturn;
	}

	@Override
	public PLotXml findByOrderID(String orderID) {
		PLotXml pLot = null;
		List<String> columnNames = MappingUtility.getColumnsNames(sql2o, "P_LOT");
		HashMap<String, String> mappedValues = MappingUtility.getMappingForDb(PLotXml.class, columnNames);
		try (Connection con = sql2o.open()) {
			String queryStringMode = "SELECT * FROM P_LOT WHERE PONUMBER = :ORDERID";
			Query query =  con.createQuery(queryStringMode).addParameter("ORDERID", orderID);
			for (String key : mappedValues.keySet()) {
				query = query.addColumnMapping(key, mappedValues.get(key));
			}
			try {
				List<PLotXml> results = query.executeAndFetch(PLotXml.class);
				pLot = results != null && results.size() > 0 ? results.get(0) : pLot;
			} catch (Exception ex) {
				ex.printStackTrace();
				logger.error("There was en error by making the following query" + queryStringMode +"\n The parameter arrived as: " + orderID
						+ "Reason of exception: " +ex.getMessage());
				return pLot;
			}
		}
		return pLot;
	}

	@Override
	public boolean deletePLot(BigDecimal id) {
		PLotXml hasItBeenDeleted;
	    try (Connection con = sql2o.beginTransaction()) {
	    	String queryStringMode = "DELETE FROM P_LOT WHERE ID = :ID";
	    	Query query = con.createQuery(queryStringMode).addParameter("ID", id);
	    	query.executeUpdate();
	    	con.commit();   	
	    }
    	//It should have been deleted by now
    	//Just to be extremely sure...	 
	    hasItBeenDeleted = findPLotById(id);
	    return hasItBeenDeleted == null;

	}

	@Override
	public boolean deletePLotLine(BigDecimal id) {
		PLotLineXml hasItBeenDeleted;
		try (Connection con = sql2o.beginTransaction()) {
			String queryStringMode = "DELETE FROM P_LOTLINE WHERE ID = :ID";
			Query query = con.createQuery(queryStringMode).addParameter("ID", id);
			query.executeUpdate();
			con.commit();
		}
		//It should have been deleted by now
		//Just to be extremely sure...
		hasItBeenDeleted = findPLotLineById(id);
		return hasItBeenDeleted == null;

	}


	@Override
	public PLotLineXml findPLotLineById(BigDecimal id) {
		PLotLineXml toReturn = null;
		List<String> columnNames = MappingUtility.getColumnsNames(sql2o, "P_LOTLINE");
		HashMap<String, String> mappedValues = MappingUtility.getMappingForDb(PLotLineXml.class, columnNames);
		try(Connection con = sql2o.open()) {
			String queryString = "SELECT * FROM P_LOTLINE WHERE ID = :ID";
			Query query = con.createQuery(queryString).addParameter("ID", id);
			for (String key : mappedValues.keySet()) {
				query = query.addColumnMapping(key, mappedValues.get(key));
			}
			List<PLotLineXml> results = query.executeAndFetch(PLotLineXml.class);
			toReturn = results != null &&  results.size() > 0 ? results.get(0) : toReturn;
		} catch (Exception ex) {
			logger.error("For some reason, I wasn't able to find the PLotLine with ID " + id.toString() + "\n Reason for exception: "+ex.getMessage());
			return toReturn;
		}
		return toReturn;
	}

	@Override
	public PLotLineXml findPLotLineByLotID(BigDecimal id) {
		PLotLineXml toReturn = null;
		List<String> columnNames = MappingUtility.getColumnsNames(sql2o, "P_LOTLINE");
		HashMap<String, String> mappedValues = MappingUtility.getMappingForDb(PLotLineXml.class, columnNames);
		try(Connection con = sql2o.open()) {
			String queryString = "SELECT * FROM P_LOTLINE WHERE ID_LOT = :IDLOT";
			Query query = con.createQuery(queryString).addParameter("IDLOT", id);
			for (String key : mappedValues.keySet()) {
				query = query.addColumnMapping(key, mappedValues.get(key));
			}
			List<PLotLineXml> results = query.executeAndFetch(PLotLineXml.class);
			toReturn = results != null &&  results.size() > 0 ? results.get(0) : toReturn;
		} catch (Exception ex) {
			logger.error("For some reason, I wasn't able to find the PLotLine with ID_LOT " + id.toString() + "\n Reason for exception: "+ex.getMessage());
			return toReturn;
		}
		return toReturn;
	}

	@Override
	public Boolean updatePLot(PLotXml pLot) {
		Boolean toReturn = null;
		List<String> columnNames = MappingUtility.getColumnsNames(sql2o, "P_LOT");
		HashMap<String, String> mappedValues = MappingUtility.getMappingForDb(PLotXml.class, columnNames);
		try (Connection con = sql2o.open()) {
			String queryStringMode = "UPDATE P_LOT SET TP_RECORD = :TPRECORD, CD_DEPOSITANTE = :CDDEPOSITANTE, DT_EMISSIONE=:DTEMISSIONE, DF_DOCINGRESSO = :DFDOCINGRESSO, DT_INGRESSO = :DTINGRESSO, CD_CEDENTE = :CDCEDENTE, TP_CEDENTE=:TPCEDENTE, STATO = :STATO, INVIATO_DA = :INVIATODA, DATA_INVIO = :DATAINVIO, EMAIL = :EMAIL, PONUMBER = :PONUMBER, SSCC_AVAILABLE = :SSCCAVAILABLE WHERE ID = :ID";
			Query query = con.createQuery(queryStringMode)
					.addParameter("TPRECORD", pLot.getTpRecord())
					.addParameter("CDDEPOSITANTE", pLot.getCdDepositante())
					.addParameter("DTEMISSIONE", pLot.getDtEmissione())
					.addParameter("DFDOCINGRESSO", pLot.getDfDocIngresso())
					.addParameter("DTINGRESSO", pLot.getDtIngresso())
					.addParameter("CDCEDENTE", pLot.getCdCedente())
					.addParameter("TPCEDENTE", pLot.getTpCedente())
					.addParameter("STATO", pLot.getStato())
					.addParameter("INVIATODA", pLot.getInviatoDa())
					.addParameter("DATAINVIO", pLot.getDataInvio())
					.addParameter("EMAIL", pLot.getEmail())
					.addParameter("PONUMBER", pLot.getPoNumber())
					.addParameter("SSCCAVAILABLE", pLot.getSsccAvailable())
					.addParameter("ID", pLot.getId());
			query.executeUpdate();
			con.commit();
		} catch (Exception ex) {
			logger.error("Well, something went wrong in the update of a PLot object with ID " + pLot.getId().toString() + "\n Reason for exception: " + ex.getMessage());
			return toReturn;
		}
		PLotXml toCheck = this.findPLotById(pLot.getId());

		Method[] metodi = Arrays.asList(PLotXml.class.getMethods()).stream().filter(s -> s.getName().contains("get")).toArray(Method[]::new);
		for(int i = 0; i < metodi.length; i++) {
			try {
				Object valueOne = metodi[i].invoke(toCheck, null);
				Object valueTwo = metodi[i].invoke(pLot, null);
				if (!valueOne.equals(valueTwo)) {
					toReturn = true;
					break;
				}
			} catch (Exception ex) {
				logger.error("Error with reflection on update.\n Reason for exception: " + ex.getMessage());
				return toReturn;
			}
		}
		toReturn = toReturn == null ?  false : toReturn;
		return toReturn;
	}

}
