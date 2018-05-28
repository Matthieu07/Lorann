package showboard;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.util.Observer;

import javax.swing.JFrame;

/**
 * <h1>The Class BoardFrame.</h1>
 * <p>
 * This class is just used to load the BoardPanel. It extends JPanel and implements IBoard.
 * </p>
 * <p>
 * As the BoardPanel is a private class, BoardPanel is a Facade.
 * </p>
 *
 * @author Anne-Emilie DIET
 * @version 3.0
 * @see JFrame
 * @see BoardPanel
 * @see Dimension
 * @see Rectangle
 * @see IBoard
 * @see ISquare
 * @see IPawn
 */
public class BoardFrame extends JFrame implements IBoard {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -6563585351564617603L;

    /** The initial frame size. */
    private static final int  defaultFrameSize = 700;

    /** The board panel. */
    private final BoardPanel  boardPanel;

    /**
     * Instantiates a new board frame.
     *
     * @param title
     *            the title of the frame
     * @param decorated
     *            the decorated
     */
    public BoardFrame(final String title, final Boolean decorated) {
        super();
        this.setTitle(title);
        this.setSize(defaultFrameSize, defaultFrameSize);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setUndecorated(decorated);
        this.boardPanel = new BoardPanel();
        this.setContentPane(this.boardPanel);
        this.setResizable(false);
        this.setVisible(true);
    }

    /**
     * Instantiates a new board frame.
     *
     * @param title
     *            the title
     */
    public BoardFrame(final String title) {
        this(title, false);
    }

    /**
     * Instantiates a new board frame.
     */
    public BoardFrame() {
        this("", false);
    }

    /**
     * Instantiates a new board frame.
     *
     * @param decorated
     *            the decorated
     */
    public BoardFrame(final Boolean decorated) {
        this("", decorated);
    }

    /*
     * (non-Javadoc)
     * @see fr.exia.showboard.IBoard#addSquare(fr.exia.showboard.ISquare, int, int)
     */
    @Override
    public final void addSquare(final ISquare square, final int x, final int y) {
        this.getBoardPanel().addSquare(square, x, y);
    }

    /*
     * (non-Javadoc)
     * @see fr.exia.showboard.IBoard#addPawn(fr.exia.showboard.IPawn)
     */
    @Override
    public final void addPawn(final IPawn pawn) {
        this.getBoardPanel().addPawn(pawn);
    }

    /*
     * (non-Javadoc)
     * @see fr.exia.showboard.IBoard#getObserver()
     */
    @Override
    public final Observer getObserver() {
        return this.getBoardPanel();
    }

    /*
     * (non-Javadoc)
     * @see fr.exia.showboard.IBoard#setDimension(java.awt.Dimension)
     */
    @Override
    public final void setDimension(final Dimension dimension) {
        this.getBoardPanel().setDimension(dimension);
    }

    /*
     * (non-Javadoc)
     * @see fr.exia.showboard.IBoard#getDimension()
     */
    @Override
    public final Dimension getDimension() {
        return this.getBoardPanel().getDimension();
    }

    /**
     * Gets the display frame.
     *
     * @return the display frame
     */
    public final Rectangle getDisplayFrame() {
        return this.getBoardPanel().getDisplayFrame();
    }

    /*
     * (non-Javadoc)
     * @see fr.exia.showboard.IBoard#setDisplayFrame(java.awt.Rectangle)
     */
    @Override
    public final void setDisplayFrame(final Rectangle displayFrame) {
        this.getBoardPanel().setDisplayFrame(displayFrame);
    }

    /**
     * Gets the board panel.
     *
     * @return the board panel
     */
    private BoardPanel getBoardPanel() {
        return this.boardPanel;
    }

    /**
     * Checks if is width looped.
     *
     * @return the boolean
     */
    public final Boolean isWidthLooped() {
        return this.getBoardPanel().isWidthLooped();
    }

    /**
     * Sets the width looped.
     *
     * @param widthLooped
     *            the new width looped
     */
    public final void setWidthLooped(final Boolean widthLooped) {
        this.getBoardPanel().setWidthLooped(widthLooped);
    }

    /**
     * Checks if is height looped.
     *
     * @return the boolean
     */
    public final Boolean isHeightLooped() {
        return this.getBoardPanel().isHeightLooped();
    }

    /**
     * Sets the height looped.
     *
     * @param heightLooped
     *            the new height looped
     */
    public final void setHeightLooped(final Boolean heightLooped) {
        this.getBoardPanel().setHeightLooped(heightLooped);
    }
}
