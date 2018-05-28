package model.dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;

/**
 * <h1>The Class AbstractDAO.</h1>
 * 
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public abstract class AbstractDAO {

    /**
     * Execute query.
     *
     * @param query
     *            the query
     * @return the result set
     */
    protected static ResultSet executeQuery(final String query) {
        return LorannBDDConnector.getInstance().executeQuery(query);
    }

    /**
     * Execute update.
     *
     * @param query
     *            the query
     * @return the int
     */
    protected static int executeUpdate(final String query) {
        return LorannBDDConnector.getInstance().executeUpdate(query);
    }

    /**
     * Prepare call.
     *
     * @param query
     *            the query
     * @return the callable statement
     */
    protected static CallableStatement prepareCall(final String query) {
        return LorannBDDConnector.getInstance().prepareCall(query);
    }
}
