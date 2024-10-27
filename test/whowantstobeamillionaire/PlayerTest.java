///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
// */
//package whowantstobeamillionaire;
//
//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import static org.junit.Assert.*;
//
///**
// *
// * @author harshitdhasmana
// */
//public class PlayerTest {
//    
//    public PlayerTest() {
//    }
//    
//    @BeforeClass
//    public static void setUpClass() {
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//    }
//    
//    @Before
//    public void setUp() {
//    }
//    
//    @After
//    public void tearDown() {
//    }
//
//    /**
//     * Test of addWinnings method, of class Player.
//     */
//    @Test
//    public void testAddWinnings() {
//        System.out.println("addWinnings");
//        int amount = 0;
//        Player instance = null;
//        instance.addWinnings(amount);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of increaseLevel method, of class Player.
//     */
//    @Test
//    public void testIncreaseLevel() {
//        System.out.println("increaseLevel");
//        Player instance = null;
//        instance.increaseLevel();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getName method, of class Player.
//     */
//    @Test
//    public void testGetName() {
//        System.out.println("getName");
//        Player instance = null;
//        String expResult = "";
//        String result = instance.getName();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getId method, of class Player.
//     */
//    @Test
//    public void testGetId() {
//        System.out.println("getId");
//        Player instance = null;
//        int expResult = 0;
//        int result = instance.getId();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getCurrentWinnings method, of class Player.
//     */
//    @Test
//    public void testGetCurrentWinnings() {
//        System.out.println("getCurrentWinnings");
//        Player instance = null;
//        int expResult = 0;
//        int result = instance.getCurrentWinnings();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getLevel method, of class Player.
//     */
//    @Test
//    public void testGetLevel() {
//        System.out.println("getLevel");
//        Player instance = null;
//        int expResult = 0;
//        int result = instance.getLevel();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    
//}


package whowantstobeamillionaire;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import whowantstobeamillionaire.Player;  // Make sure to import the correct Player class

public class PlayerTest {

    private Player player;

    @Before
    public void setUp() {
        player = new Player("John Doe", 1);  // Initialize Player before each test
    }

    @After
    public void tearDown() {
        player = null;  // Clean up after each test
    }

    @Test
    public void testAddWinnings() {
        int amount = 100;
        player.addWinnings(amount);
        assertEquals(100, player.getCurrentWinnings());
    }

    @Test
    public void testIncreaseLevel() {
        player.increaseLevel();
        assertEquals(2, player.getLevel());  // Assuming level starts at 1
    }

    @Test
    public void testGetName() {
        assertEquals("John Doe", player.getName());
    }

    @Test
    public void testGetId() {
        int id = player.getId();  // Assuming the ID is generated correctly
        assertTrue(id > 0);  // Check that the ID is valid
    }

    @Test
    public void testGetCurrentWinnings() {
        assertEquals(0, player.getCurrentWinnings());  // Initial winnings should be 0
    }

    @Test
    public void testGetLevel() {
        assertEquals(1, player.getLevel());  // Assuming level starts at 1
    }
}
