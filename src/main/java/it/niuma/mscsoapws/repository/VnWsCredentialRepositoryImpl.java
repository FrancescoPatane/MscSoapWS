package it.niuma.mscsoapws.repository;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import it.niuma.mscsoapws.model.VnWsCredential;

@Repository
public class VnWsCredentialRepositoryImpl implements VnWsCredentialRepository{
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	private final Sql2o sql2o;
	
	
	public VnWsCredentialRepositoryImpl(Sql2o sql2o){
		this.sql2o = sql2o;
	}

	@Override
	public List<VnWsCredential> findByUsernameAndPassword(String username, String password) {
		try (Connection con = sql2o.open()) {
			String query = "SELECT VENDOR_ID vendorId, USERNAME, PASSWORD, ISSUE_DATE issueDate FROM VN_WS_CREDENTIALS WHERE USERNAME = :username AND PASSWORD = :password";
			List<VnWsCredential> results = con.createQuery(query).addParameter("username", username).addParameter("password", password).executeAndFetch(VnWsCredential.class);

			return results;
			
		} catch (Exception e) {
			logger.error("Error executing findByUsernameAndPassword"); 
			e.printStackTrace();
			throw e;
		}
	}

}
