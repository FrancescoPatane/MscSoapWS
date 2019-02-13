package it.niuma.mscsoapws.ws.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
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

@Component
public class AuthUtility {

	@Value("${token.expiration.hours}")
	private String hoursBeforeExpiration;

	@Autowired
	private VnWsCredentialRepository credentialRepository;

	@Autowired
	private WsAccessTokenRepository tokenRepository;
	
	
	public static String obtaindMD5Value(String toConvert){

		String md5val = "";

		MessageDigest digester;
		try {
			digester = MessageDigest.getInstance("MD5");
			digester.reset();
			digester.update(toConvert.getBytes());
			byte pwdDigest[] = digester.digest();

			 StringBuffer hexString = new StringBuffer();

	         for (int i = 0; i < pwdDigest.length; i++)
	         {
	             String hex = Integer.toHexString(0xFF & pwdDigest[i]);
	             if (hex.length() == 1)
	             {
	                 hexString.append('0');
	             }
	             hexString.append(hex);
	         }
	         md5val = hexString.toString();

		}
		catch (NoSuchAlgorithmException exc) {
			exc.printStackTrace();
		}

         return md5val;
	}
	

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

	public boolean checkTokenIsValid (String token) throws InvalidTokenException {
		LocalDateTime expirationDate = tokenRepository.getTokenExpirationDate(token);
		if (expirationDate == null) {
			throw new InvalidTokenException("Token not valid.");
		}
		System.out.println(expirationDate.isAfter(LocalDateTime.now()));
		return expirationDate.isAfter(LocalDateTime.now());
	}

}
