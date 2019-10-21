/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Michael
 */
public class ResistorTest {
    
    public ResistorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNodes method, of class Resistor.
     */
    @Test
    public void testGetNodes() {
        System.out.println("Test getNodes");
        //Removed [Down]
        Node n1 = new Node();
        Node n2 = new Node();
        Resistor inst = new Resistor(5, n1, n2);
        Node[] result = {n1,n2};
        Node[] instanceResult = inst.getNodes();//gets nodes of [0] and [1]
        //Removed [Up]
        assertArrayEquals(result, instanceResult);
        n1 = null;
        n2 = null;
        inst = null;
        //Removed default call to fail
    }

    /**
     * Test of toString method, of class Resistor.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        //Removed [Down]
        Node n1 = new Node();
        Node n2 = new Node();
        Resistor inst = new Resistor(5, n1, n2);
        String result = "R2 1 2 5.0\u2126";
        //result is "R2 1 2 5.0\u2126 because JUnit test runs testGetNodes() and testToString() together"
        //This causes the static variables in Node/Resistor classes to stay the same; not resetting ID numbers
        //JUnit will create 4 nodes, and 2 Resistors
        //Removed [Up]
        String instanceResult = inst.toString();
        assertEquals(result, instanceResult);
        //Removed default call to fail
    }
}
