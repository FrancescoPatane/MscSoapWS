package it.niuma.mscsoapws.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.sql2o.Connection;
import org.sql2o.Query;
import org.sql2o.Sql2o;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

@Repository
public class UserRepositoryImpl implements UserRepository{


    private final Sql2o sql2o;
    private final Logger logger = LoggerFactory.getLogger(this.getClass());


    public UserRepositoryImpl(Sql2o sql2o){
        this.sql2o = sql2o;
    }

    @Override
    public BigDecimal getUserIdByVendorID(BigDecimal vendorID) {
        logger.info("Looking for user id...");
        BigDecimal toReturn = null;
        try(Connection con = sql2o.open()) {
            String queryString = "SELECT ID_UTENTE FROM UTENTE WHERE ID_FORNITORE = :FORNITORE";
            Query query = con.createQuery(queryString).addParameter("FORNITORE", vendorID);
            List<BigDecimal> result = query.executeAndFetch(BigDecimal.class);
            toReturn = result != null && result.size() > 0 ? result.get(0) : toReturn;
        } catch (Exception ex) {
            logger.error("For some reasons, I couldn't find the associated id to the following vendor id (" + vendorID.toString() + ").\n Reason for exception is: " + ex.getMessage());
        }
        return toReturn;
    }

    @Override
    public BigDecimal getVendorIDFromAccessToken(String accessToken) {
        logger.info("Looking for the vendor id...");
        BigDecimal toReturn = null;
        try (Connection con = sql2o.open()) {
            String queryString = "SELECT VENDOR_ID FROM WS_ACCESSTOKEN WHERE TOKEN = :TOKEN";
            Query query = con.createQuery(queryString).addParameter("TOKEN", accessToken);
            List<BigDecimal> result = query.executeAndFetch(BigDecimal.class);
            toReturn = result != null && result.size() > 0 ? result.get(0) : toReturn;
        } catch (Exception ex) {
            logger.error("For some reasons, I couldn't find the associated vendor id.\n Reason for exception is: " + ex.getMessage());
        }
        return toReturn;
    }

    @Override
    public boolean hasTokenExpired(String accessToken) {
        logger.info("Looking if token has expired...");
        LocalDateTime expiration = null;
        try (Connection con = sql2o.open()) {
            String queryString = "SELECT EXPIRATION_DATE FROM WS_ACCESSTOKEN WHERE TOKEN = :TOKEN";
            Query query = con.createQuery(queryString).addParameter("TOKEN", accessToken);
            List<String> result = query.executeAndFetch(String.class);
            expiration = result != null && result.size() > 0 ? LocalDateTime.parse(result.get(0), DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.S")) : null;
        } catch (Exception ex) {
            logger.error("For some reasons, I couldn't find the associated expiration date.\n Reason for exception is: " + ex.getMessage());
        }
        return expiration.isAfter(LocalDateTime.now());
    }
}
