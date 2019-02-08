package it.niuma.mscsoapws.ws.callbackhandler;

import java.io.IOException;
import java.util.List;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.wss4j.common.ext.WSPasswordCallback;
import org.springframework.beans.factory.annotation.Autowired;

import it.niuma.mscsoapws.model.VnWsCredential;
import it.niuma.mscsoapws.repository.VnWsCredentialRepository;


public class AuthorizationCallBackHandler implements CallbackHandler{
	
	@Autowired
	VnWsCredentialRepository credentialsRepo;
	
	@Override
	public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {

		if (callbacks[0] instanceof WSPasswordCallback) {
			WSPasswordCallback pc = (WSPasswordCallback) callbacks[0];
			
			String username = pc.getIdentifier();
			VnWsCredential credentials = credentialsRepo.findByUsername(username);
			// set the password on the callback. This will be compared to the
			// password which was sent from the client.

			if (credentials == null) {
				pc.setPassword(null);
			}else {
				pc.setPassword(credentials.getPassword());
			}
						
		}
		
		


	}

}
