/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package whowantstobeamillionaire;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author harshitdhasmana
 */
public class InputhandlerTest {
    
    public InputhandlerTest() {
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
     * Test of getAnswerChoice method, of class Inputhandler.
     */
    @Test
    public void testGetAnswerChoice() {
        System.out.println("getAnswerChoice");
        char expResult = ' ';
        char result = Inputhandler.getAnswerChoice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLifelineChoice method, of class Inputhandler.
     */
    @Test
    public void testGetLifelineChoice() {
        System.out.println("getLifelineChoice");
        int expResult = 0;
        int result = Inputhandler.getLifelineChoice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserInput method, of class Inputhandler.
     */
    @Test
    public void testGetUserInput() {
        System.out.println("getUserInput");
        String prompt = "";
        String expResult = "";
        String result = Inputhandler.getUserInput(prompt);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
