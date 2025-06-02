///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
// */



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
