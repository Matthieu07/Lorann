package controller;

import java.sql.SQLException;
import java.util.List;

import model.Map;
import model.IModel;
import view.IView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * <h1>The Class ControllerFacade provides a facade of the Controller component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ControllerFacade implements IController  {

    /** The view and the model */
    private final IView  view;
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
    	this.getView().ViewFacade(this.getModel().getMapById(1));
        
    }
    
    /**
     * get the model.
     * @return
     */
	private IModel getModel() {
		// TODO Auto-generated method stub
		return model;
	}

	/**
	 * get the view.
	 * @returns
	 */
	private IView getView(){
		// TODO Auto-generated method stub
		return view;
	}

		/*getTypeBlock();
		setLorannPos();
		getLorannPos();*/

}
