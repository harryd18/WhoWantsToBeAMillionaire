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
public class ScoreBoardTest {
    
    public ScoreBoardTest() {
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
     * Test of addPlayerScore method, of class ScoreBoard.
     */
    @Test
    public void testAddPlayerScore() {
        System.out.println("addPlayerScore");
        Player player = null;
        ScoreBoard instance = new ScoreBoard();
        instance.addPlayerScore(player);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayScoreboard method, of class ScoreBoard.
     */
    @Test
    public void testDisplayScoreboard() {
        System.out.println("displayScoreboard");
        ScoreBoard instance = new ScoreBoard();
        instance.displayScoreboard();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
