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
public class QuestionListTest {
    
    public QuestionListTest() {
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
     * Test of getQuestions method, of class QuestionList.
     */
    @Test
    public void testGetQuestions() {
        System.out.println("getQuestions");
        QuestionList instance = new QuestionList();
        List<Questions> expResult = null;
        List<Questions> result = instance.getQuestions();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRandomQuestion method, of class QuestionList.
     */
    @Test
    public void testGetRandomQuestion() {
        System.out.println("getRandomQuestion");
        QuestionList instance = new QuestionList();
        Questions expResult = null;
        Questions result = instance.getRandomQuestion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
