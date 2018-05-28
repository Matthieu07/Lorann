package showboard;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.util.Observer;

/**
 * <h1>The Interface IBoard.</h1>
 *
 * @author Anne-Emilie DIET
 * @version 1.0
 * @see Dimension
 * @see Rectangle
 * @see ISquare
 * @see IPawn
 */
public interface IBoard {

    /**
     * Adds the square.
     *
     * @param square
     *            the square
     * @param x
     *            the x
     * @param y
     *            the y
     */
    void addSquare(ISquare square, int x, int y);

    /**
     * Adds the pawn.
     *
     * @param pawn
     *            the pawn
     */
    void addPawn(IPawn pawn);

    /**
     * Gets the observer.
     *
     * @return the observer
     */
    Observer getObserver();

    /**
     * Sets the dimension.
     *
     * @param dimension
     *            the new dimension
     */
    void setDimension(Dimension dimension);

    /**
     * Gets the dimension.
     *
     * @return the dimension
     */
    Dimension getDimension();

    /**
     * Sets the display frame.
     *
     * @param displayFrame
     *            the new display frame
     */
    void setDisplayFrame(Rectangle displayFrame);
}
