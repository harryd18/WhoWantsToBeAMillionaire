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
public class FiftyFiftyTest {
    
    public FiftyFiftyTest() {
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
     * Test of useLifeline method, of class FiftyFifty.
     */
    @Test
    public void testUseLifeline() {
        System.out.println("useLifeline");
        Questions question = null;
        FiftyFifty instance = new FiftyFifty();
        instance.useLifeline(question);
        
        fail("The test case is a prototype.");
    }
    
}
