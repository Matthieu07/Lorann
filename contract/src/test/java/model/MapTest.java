package model;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MapTest {
    private Map map;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
        this.map = new Map(1, "Map test");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testGetId() {
        final int expected = 1;
        assertEquals(expected, this.map.getId());
    }

    @Test
    public void testGetName() {
        final String expected = "Map test";
        assertEquals(expected, this.map.getName());
    }

    @Test
    public void testSetName() {
        String expected = "Map test";
        assertEquals(expected, this.map.getName());
        expected = "Map test modified";
        this.map.setName(expected);
        assertEquals(expected, this.map.getName());
    }

    @Test
    public void testToString() {
        final String expected = "1 : Map test";
        assertEquals(expected, this.map.toString());
    }

}
