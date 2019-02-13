package it.niuma.mscsoapws.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import it.niuma.mscsoapws.model.WsAccessToken;

@Repository
public class WsAccessTokenRepositoryImpl implements WsAccessTokenRepository{
	
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	private final Sql2o sql2o;
	
	
	public WsAccessTokenRepositoryImpl(Sql2o sql2o){
		this.sql2o = sql2o;
	}


	@Override
	public long insert(long vendorId, String token, LocalDateTime now, LocalDateTime expirationDate) {


		
		try (Connection con = sql2o.open()) {
			
			String insertSql = 
					"INSERT INTO WS_ACCESSTOKEN (VENDOR_ID, TOKEN, ISSUE_DATE, EXPIRATION_DATE) " +
					"VALUES (:vendorId, :token, :now, :expirationDate)";
			
		    BigDecimal id = (BigDecimal) con.createQuery(insertSql, true)
			    .addParameter("vendorId", vendorId)
			    .addParameter("token", token)
			    .addParameter("now", now)
			    .addParameter("expirationDate", expirationDate)
			    .executeUpdate().getKey();
		    return id.longValue();
		}catch (Exception e) {
			logger.error("Error executing insert for table WS_ACCESSTOKEN"); 
			e.printStackTrace();
			throw e;
		}
		
	}


	@Override
	public WsAccessToken findByToken(String token) {
		//Not working: query is wrong, token doesn't get added to the query and can't manage to parse dates from string automatically
		String query = "SELECT VENDOR_ID vendorId, TOKEN, ISSUE_DATE issueDate, EXPIRATION_DATE expirationDate FROM WS_ACCESSTOKEN WHERE token :token ORDER BY id DESC";
		
		try (Connection con = sql2o.open()) {

			List<WsAccessToken> tokenList = con.createQuery(query).addParameter(token, token).executeAndFetch(WsAccessToken.class);
			
			if (tokenList != null && tokenList.size()>0)
				return tokenList.get(0);
			else
				return null;
			
		}catch (Exception e) {
			logger.error("Error executing findByToken"); 
			e.printStackTrace();
			throw e;
		}
		
	}

	@Override
	public LocalDateTime getTokenExpirationDate(String token) {
		String query = "SELECT EXPIRATION_DATE FROM WS_ACCESSTOKEN WHERE TOKEN = :token ORDER BY id DESC";
		LocalDateTime toReturn = null;
		try (Connection con = sql2o.open()) {

			List<String> result = con.createQuery(query).addParameter("token", token).executeAndFetch(String.class);

			if (result != null && result.size()>0) {
				toReturn = LocalDateTime.parse(result.get(0), DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.S"));
			}

		}catch (Exception e) {
			logger.error("Error, for some unknown reason, to find the expiration date from the given token.\n Reason for exception: " +e.getMessage());
			e.printStackTrace();
			throw e;
		}
		return toReturn;
	}


}
