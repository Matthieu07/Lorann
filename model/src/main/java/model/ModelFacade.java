package model;

import java.sql.SQLException;
import java.util.List;

import model.dao.MapDAO;

/**
 * <h1>The Class ModelFacade provides a facade of the Model component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public final class ModelFacade implements IModel {

    /**
     * Instantiates a new model facade.
     */
    public ModelFacade() {
        super();
    }

    /**
     * @param id
     * 			the map identifier.
     * 
     * return the map by using the id.
     * 
     * @return the id of the map. 
     * 
     * @throws SQLException if the SQL have exceptions.
     * 
     * @see model.IModel#getMapById(int)
     */
    @Override
    public String getMapById(final int id) throws SQLException {
        return MapDAO.getMapById(id);
    }

    /**
     * @param name
     * 			the name of the map.
     * 
     * return the name of the map.
     * 
     * @return the name of the map. 
     * 
     * @throws SQLException if the SQL have exceptions.
     * 
     * @see model.IModel#getMapByName(java.lang.String)
     */
    @Override
    public String getMapByName(final String name) throws SQLException {
        return MapDAO.getMapByName(name);
    }

    /**
     * return the list of all the maps.
     * 
     * @return the list of all the maps.
     * 
     * @throws SQLException if the SQL have exceptions.
     * 
     * @see model.IModel#getAllMaps()
     */
    @Override
    public List<String> getAllMaps() throws SQLException {
        return MapDAO.getAllMaps();
    }

}
