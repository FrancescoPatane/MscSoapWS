package it.niuma.mscsoapws.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.niuma.mscsoapws.exceptions.ElementNotDeletedException;
import it.niuma.mscsoapws.repository.PLotRepository;
import it.niuma.mscsoapws.ws.PLotXml;

@Service
public class PLotService {
	
	
	@Autowired
	PLotRepository pLotRepository;
	
	public PLotXml createNewPlot(String numeroOrdine, String numeroDDT, Date dtEmissione, Date dtIngresso) {
		PLotXml justCreated = pLotRepository.createNewPlotXml(numeroOrdine, numeroDDT, dtEmissione, dtIngresso);
		return justCreated;
	}
	
	
	public PLotXml deleteAndCreateNewPLot(String numeroOrdine, String numeroDDT, Date dtEmissione, Date dtIngresso) {
		//Got to check first of all if there is already a PLot with that orderID!
		PLotXml justCreated = null;
		PLotXml existance = pLotRepository.findByOrderID(numeroOrdine);
		if (existance != null) {
			//(The following try-catch block is done just because I don't know how sql2o handles delete. JPA, for an instance, still kept the 
			//element if there was any error)
		  try {
			  //Try to delete it...
				boolean delete = pLotRepository.delete(existance.getId());
			if (!delete) {
				//... but if I don't manage, I throw a custom exception 

				throw new ElementNotDeletedException("Operazione di delete sull'elemento con numero ordine " + numeroOrdine + " fallita. Si prega di riprovare" );
			}
		  } catch(ElementNotDeletedException ex) {
				return justCreated; //and return a value that right now is null
			}
		}
		//No else because even after I delete it, I have to recreate it
		justCreated = pLotRepository.createNewPlotXml(numeroOrdine, numeroDDT, dtEmissione, dtIngresso);
		return justCreated;
	}
	
	

}
