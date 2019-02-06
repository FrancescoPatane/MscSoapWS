package it.niuma.mscsoapws.repository;

import java.time.LocalDateTime;

import it.niuma.mscsoapws.model.WsAccessToken;

public interface WsAccessTokenRepository {
	
	public long insert(long vendorId, String token, LocalDateTime now, LocalDateTime expirationDate);

	public WsAccessToken findByToken (String token);
	
	
	
}
