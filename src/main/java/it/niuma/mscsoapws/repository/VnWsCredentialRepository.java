package it.niuma.mscsoapws.repository;

import java.util.List;

import it.niuma.mscsoapws.model.VnWsCredential;

public interface VnWsCredentialRepository {
	
	public VnWsCredential findByUsername (String username);
	
	public List<VnWsCredential> findByUsernameAndPassword(String username, String password);
	
	

}
