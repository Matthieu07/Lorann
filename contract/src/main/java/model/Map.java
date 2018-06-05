package model;

/**
 * <h1>The Class Map.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class Map {

    /** The id. */
    private int id;

    /** The name. */
    private String    name;

    /**
     * Instantiates a new map.
     *
     * @param id
     *            the id
     * @param name
     *            the name
     */
    public Map(final int id, final String name) {
        super();
        this.id = id;
        this.name = name;
    }

    /**
     * Gets the id.
     *
     * @return the id
     */
    public int getId() {
        return this.id;
    }
    
    /**
     * Sets the id.
     *
     * @param id
     *            the new id
     */
    public void setId(final int id) {
        this.id = id;
    }


    /**
     * Gets the name.
     *
     * @return the name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets the name.
     *
     * @param name
     *            the new name
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * return the id and the name of a map
     * 
     * @return the id and the name of a map
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return this.getId() + " : " + this.getName();
    }
}
