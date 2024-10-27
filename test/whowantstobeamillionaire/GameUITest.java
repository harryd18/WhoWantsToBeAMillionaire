/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package whowantstobeamillionaire;

import java.util.List;
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
public class GameUITest {
    
    public GameUITest() {
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
     * Test of displayQuestion method, of class GameUI.
     */
    @Test
    public void testDisplayQuestion() {
        System.out.println("displayQuestion");
        Questions question = null;
        int level = 0;
        GameUI.displayQuestion(question, level);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayLifelines method, of class GameUI.
     */
    @Test
    public void testDisplayLifelines() {
        System.out.println("displayLifelines");
        List<LifeLine> lifelines = null;
        GameUI.displayLifelines(lifelines);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayMessage method, of class GameUI.
     */
    @Test
    public void testDisplayMessage() {
        System.out.println("displayMessage");
        String message = "";
        GameUI.displayMessage(message);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
