package view;

/**
 * <h1>The Interface IView.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public interface IView {

    /**
     * ViewFacade.
     *
     * @param level
     *            the level
     */
    void ViewFacade(String level);

    /**
     * printMap.
     * 
     * @param string
     * 
     */
	void printMap(String string);
}
