package it.niuma.mscsoapws.ws.util;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import it.niuma.mscsoapws.model.VnWsCredential;
import it.niuma.mscsoapws.model.WsAccessToken;
import it.niuma.mscsoapws.repository.VnWsCredentialRepository;
import it.niuma.mscsoapws.repository.WsAccessTokenRepository;
import it.niuma.mscsoapws.ws.exception.InvalidTokenException;
import it.niuma.mscsoapws.ws.exception.TokenNotFoundException;

@Component
public class AuthUtility {

	@Value("${token.expiration.hours}")
	private String hoursBeforeExpiration;

	@Autowired
	private VnWsCredentialRepository credentialRepository;

	@Autowired
	private WsAccessTokenRepository tokenRepository;

	public String generateToken(VnWsCredential vnWsCredential) {

		LocalDateTime now = LocalDateTime.now();
		LocalDateTime expirationDate = now.plusHours(Integer.parseInt(this.hoursBeforeExpiration));

		long vendorId = vnWsCredential.getVendorId();
		String token =  UUID.randomUUID().toString();
		tokenRepository.insert(vendorId, token, now, expirationDate);

		return token;

	}

	public List<VnWsCredential> getStoredCredentials(String username, String password) {
		List<VnWsCredential> vendorCredential = credentialRepository.findByUsernameAndPassword(username, password);
		return vendorCredential;
	}

	public void checkTokenIsValid (String token) throws InvalidTokenException {
		WsAccessToken storedToken = tokenRepository.findByToken(token);
		if (storedToken == null) {
			throw new InvalidTokenException("Token not valid.");
		} else if (LocalDateTime.now().isAfter(storedToken.getExpirationDate())){
			throw new InvalidTokenException("Token not valid.");
		}
	}

}
