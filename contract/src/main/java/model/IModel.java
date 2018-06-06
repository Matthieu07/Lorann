package model;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * <h1>The Interface IModel.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public interface IModel {

    /**
     * Gets the map by id.
     *
     * @param id
     *            the id
     * @return the map by id
     * @throws SQLException
     *             the SQL exception
     */
	String getMapById(int id) throws SQLException;

    /**
     * Gets the map by name.
     *
     * @param name
     *            the name
     * @return the map by name
     * @throws SQLException
     *             the SQL exception
     */
	String getMapByName(String name) throws SQLException;

    /**
     * Gets the all maps.
     *
     * @return all the maps 
     * @throws SQLException
     *             the SQL exception
     */
    List<String> getAllMaps() throws SQLException;
}
