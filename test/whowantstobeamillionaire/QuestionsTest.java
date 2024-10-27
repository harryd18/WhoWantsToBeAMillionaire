/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package whowantstobeamillionaire;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Map;

public class QuestionsTest {

    private Questions question;

    @Before
    public void setUp() {
        question = new Questions(
            "What is the capital of France?", 
            "Paris", 
            "London", 
            "Berlin", 
            "Madrid", 
            'A', 
            1000, 
            "It's also known as the City of Light."
        );
    }

    @After
    public void tearDown() {
        question = null;
    }

    @Test
    public void testGetQuestion() {
        System.out.println("Testing getQuestion()");
        assertEquals("What is the capital of France?", question.getQuestion());
    }

    @Test
    public void testGetOptions() {
        System.out.println("Testing getOptions()");
        Map<Character, String> options = question.getOptions();
        assertEquals("Paris", options.get('A'));
        assertEquals("London", options.get('B'));
        assertEquals("Berlin", options.get('C'));
        assertEquals("Madrid", options.get('D'));
    }

    @Test
    public void testGetCorrectAnswer() {
        System.out.println("Testing getCorrectAnswer()");
        assertEquals('A', question.getCorrectAnswer());
    }

    @Test
    public void testGetPrizeAmount() {
        System.out.println("Testing getPrizeAmount()");
        assertEquals(1000, question.getPrizeAmount());
    }

    @Test
    public void testGetHint() {
        System.out.println("Testing getHint()");
        assertEquals("It's also known as the City of Light.", question.getHint());
    }
}
