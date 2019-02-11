package it.niuma.mscsoapws.service;

import it.niuma.mscsoapws.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;


    public BigDecimal getUserIdByVendorID(BigDecimal vendorID) {
        return userRepository.getUserIdByVendorID(vendorID);
    }

    public BigDecimal getVendorIDFromAccessToken (String accessToken) {
        return userRepository.getVendorIDFromAccessToken(accessToken);
    }

    public boolean hasTokenExpired(String accessToken) {
        return userRepository.hasTokenExpired(accessToken);
    }

}
