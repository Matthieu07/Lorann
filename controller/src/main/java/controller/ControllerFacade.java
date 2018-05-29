package controller;

import java.sql.SQLException;
import java.util.List;

import model.Example;
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
public class ControllerFacade implements IController, KeyListener  {

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
    


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	//https://stackoverflow.com/questions/10876491/how-to-use-keylistener

	@Override
	public void keyPressed(KeyEvent key) {
		
		int touche = key.getKeyCode();
		
		switch (touche)
		{
        case KeyEvent.VK_Z: // si la touche enfoncée est celle du haut
        	System.out.println("z");
            //fonctionPourAvancer();
            break;
        case KeyEvent.VK_Q: // si la touche enfoncée est celle de gauche
        	System.out.println("q");
            //fonctionPourAllerAGauche();
            break;
        case KeyEvent.VK_S: // si la touche enfoncée est celle de droite
        	System.out.println("s");
            //fonctionPourAllerADroite();
            break;
        case KeyEvent.VK_D: // si la touche enfoncée est celle du bas
        	System.out.println("d");
            //fonctionPourReculer();
            break;
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
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
