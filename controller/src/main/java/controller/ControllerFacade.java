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
    	this.getView().printMap("NNFFGGGGGGGGGGGGGGGF"
				                + "NFFNNNNNNNNNNNNNNANH"
				                + "FFNNNNNNNNNNNNNNNNNH"
				                + "FNDNFGGGGGGGFMFNFGGF"
				                + "HNNNHNNNNJNNNNHNNNNH"
				                + "HNNNHNFGGGGGGGFGGFNH"
				                + "HNNNHNNNNLNNNMHNNNNH"
				                + "HNNNFGGGGGGGFNFNFGGF"
				                + "HNNNHNNNNKNNNMHNNNNH"
				                + "FGFNHNFGGGGGGFFGGFNH"
				                + "HCNNHNNNNINNMHMNMNNH"
				                + "FGGGFGGGGGGGGFGGGGGF");
        /*this.getView().displayMessage(this.getModel().getExampleById(1).toString());

        this.getView().displayMessage(this.getModel().getExampleByName("Example 2").toString());

        final List<Example> examples = this.getModel().getAllExamples();
        final StringBuilder message = new StringBuilder();
        for (final Example example : examples) {
            message.append(example);
            message.append('\n');
        }
        this.getView().displayMessage(message.toString());*/
    }
    
    /**
     * get the model.
     * @return
     */
	private IModel getModel() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * get the view.
	 * @return
	 */
	private IView getView(){
		// TODO Auto-generated method stub
		return null;
	}

		/*getTypeBlock();
		setLorannPos();
		getLorannPos();*/

}
