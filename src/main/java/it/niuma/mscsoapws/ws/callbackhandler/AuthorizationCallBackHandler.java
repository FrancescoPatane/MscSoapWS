package it.niuma.mscsoapws.ws.callbackhandler;

import java.io.IOException;
import java.util.List;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.wss4j.common.ext.WSPasswordCallback;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.soap.security.wss4j2.callback.UsernameTokenPrincipalCallback;

import it.niuma.mscsoapws.model.VnWsCredential;
import it.niuma.mscsoapws.repository.VnWsCredentialRepository;
import it.niuma.mscsoapws.ws.util.AuthUtility;


public class AuthorizationCallBackHandler implements CallbackHandler{
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	VnWsCredentialRepository credentialsRepo;
	
	@Autowired
	AuthUtility authUtil;
	
	@Override
	public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {

		if (callbacks[0] instanceof WSPasswordCallback) {
			WSPasswordCallback pc = (WSPasswordCallback) callbacks[0];
			
			String username = pc.getIdentifier();
			VnWsCredential credentials = credentialsRepo.findByUsername(username);
			logger.info("Request of authentication for username" + username);
			String p =				pc.getPassword();
			// set the password on the callback. This will be compared to the
			// password which was sent from the client.
			if (credentials == null) {
				pc.setPassword(null);
				

			}else {
//				String encodedPsw = authUtil.obtaindMD5Value(credentials.getPassword()); 
//				pc.setPassword(encodedPsw);
				pc.setPassword(credentials.getPassword());
			}
						
		}
		
		if (callbacks[0] instanceof UsernameTokenPrincipalCallback) {
			UsernameTokenPrincipalCallback pc = (UsernameTokenPrincipalCallback) callbacks[0];
			pc.getPrincipal();
		}
		


	}

}
