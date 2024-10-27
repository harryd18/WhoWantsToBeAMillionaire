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
public class PrizeAmountTest {
    
    public PrizeAmountTest() {
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
     * Test of getPrizeForLevel method, of class PrizeAmount.
     */
    @Test
    public void testGetPrizeForLevel() {
        System.out.println("getPrizeForLevel");
        int level = 0;
        PrizeAmount instance = new PrizeAmount();
        int expResult = 0;
        int result = instance.getPrizeForLevel(level);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
