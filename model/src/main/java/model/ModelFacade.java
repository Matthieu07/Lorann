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

    /*
     * (non-Javadoc)
     * @see model.IModel#getExampleById(int)
     */
    @Override
    public Map getMapById(final int id) throws SQLException {
        return MapDAO.getMapById(id);
    }

    /*
     * (non-Javadoc)
     * @see model.IModel#getExampleByName(java.lang.String)
     */
    @Override
    public Map getMapByName(final String name) throws SQLException {
        return MapDAO.getMapByName(name);
    }

    /*
     * (non-Javadoc)
     * @see model.IModel#getAllMaps()
     */
    @Override
    public List<Map> getAllMaps() throws SQLException {
        return MapDAO.getAllMaps();
    }

}
