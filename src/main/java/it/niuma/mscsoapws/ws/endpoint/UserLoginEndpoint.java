package it.niuma.mscsoapws.ws.endpoint;

import it.niuma.mscsoapws.model.VnWsCredential;
import it.niuma.mscsoapws.service.UserService;
import it.niuma.mscsoapws.ws.LoginRequest;
import it.niuma.mscsoapws.ws.LoginResponse;
import it.niuma.mscsoapws.ws.exception.InvalidCredentialsException;
import it.niuma.mscsoapws.ws.util.AuthUtility;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.List;

@Endpoint
public class UserLoginEndpoint {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public static final String NAMESPACE= "it.niuma.mscsoapws.ws";

    @Autowired
    UserService userService;


    @Autowired
    private AuthUtility authUtil;


    @PayloadRoot(namespace = NAMESPACE, localPart = "loginRequest")
    @ResponsePayload
    public LoginResponse executeLoginRequest(@RequestPayload LoginRequest request) throws InvalidCredentialsException {
        logger.info("Received webservice call for executeLoginRequest");
        LoginResponse response = new LoginResponse();
        String username = request.getUsername();
        String password = request.getPassword();
        List<VnWsCredential> storedCredentials = authUtil.getStoredCredentials(username, password);
        if (storedCredentials.size()>0) {
            response.setAccessToken(authUtil.generateToken(storedCredentials.get(0)));
        }else {
            throw new InvalidCredentialsException("Invalid credentials");
        }
        return response;
    }
}
