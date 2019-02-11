package it.niuma.mscsoapws.repository;

import java.math.BigDecimal;

public interface UserRepository {

    public BigDecimal getUserIdByVendorID(BigDecimal vendorID);

    public BigDecimal getVendorIDFromAccessToken (String accessToken);

    public boolean hasTokenExpired(String accessToken);
}
