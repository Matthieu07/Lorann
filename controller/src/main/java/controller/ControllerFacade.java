package controller;

import java.sql.SQLException;
import java.util.List;

import model.Map;
import model.IModel;
import view.IView;

/**
 * <h1>The Class ControllerFacade provides a facade of the Controller component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ControllerFacade implements IController {

    /** The view. */
    private final IView  view;

    /** The model. */
    private final IModel model;

    /**
     * Instantiates a new controller facade.
     *
     * @param view
     *            the view
     * @param model
     *            the model
     */
    public ControllerFacade(final IView view, final IModel model) {
        super();
        this.view = view;
        this.model = model;
    }

    /**
     * Start.
     *
     * @throws SQLException
     *             the SQL exception
     */
    public void start() throws SQLException {
        this.getView().displayMessage(this.getModel().getMapById(1).toString());

        this.getView().displayMessage(this.getModel().getMapByName("Map 2").toString());

        final List<Map> maps = this.getModel().getAllMaps();
        final StringBuilder message = new StringBuilder();
        for (final Map map : maps) {
            message.append(map);
            message.append('\n');
        }
        this.getView().displayMessage(message.toString());
    }

    /**
     * Gets the view.
     *
     * @return the view
     */
    public IView getView() {
        return this.view;
    }

    /**
     * Gets the model.
     *
     * @return the model
     */
    public IModel getModel() {
        return this.model;
    }
}
