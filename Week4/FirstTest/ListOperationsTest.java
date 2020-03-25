package mypackage;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ListOperationsTest {

    private ListOperations listOperations;

    @BeforeClass
    public static void setUpClass() {

    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        listOperations = new ListOperations();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testAddNameToList() {
        boolean changed = listOperations.addNameToList("Andy");
        assertTrue(changed);
    }

    @Test
    public void testAddNameToListCheckSize() {
        listOperations.addNameToList("Andy");
        int sizeOfList = listOperations.getSizeOfList();
        assertEquals(1, sizeOfList);
    }

    @Test
    public void testAddNameToListCheckName() {
        String name = "Andy";
        listOperations.addNameToList(name);
        int sizeOfList = listOperations.getSizeOfList();
        String actual = listOperations.getNames().get(sizeOfList - 1);
        assertEquals(name, actual);

    }
       @Test
    public void testGetSizeOfList() {
        listOperations.addNameToList("Max");
        listOperations.addNameToList("Bob");
        int sizeOfList = listOperations.getSizeOfList();
        assertEquals(2, sizeOfList);
    }

    @Test
    public void testRemoveNameToList() {
        listOperations.addNameToList("Max");
        listOperations.addNameToList("Bob");
        listOperations.removeNameToList("Max");
        int sizeOfList = listOperations.getSizeOfList();
        String actual = listOperations.getNames().get(sizeOfList - 1);
        assertEquals("Bob", actual);

    }

    @Test
    public void testRemoveNameCheckSize() {
        listOperations.addNameToList("Max");
        listOperations.addNameToList("Bob");
        listOperations.removeNameToList("Max");
        int sizeOfList = listOperations.getSizeOfList();
        assertEquals(1, sizeOfList);
    }

 

}
