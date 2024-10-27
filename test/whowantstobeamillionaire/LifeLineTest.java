/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package whowantstobeamillionaire;





import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.Map;
import static org.junit.Assert.*;
import java.util.HashMap;

public class LifeLineTest {
    
    private LifeLineImpl lifeline;
    private Questions question;

    @Before
    public void setUp() {
        lifeline = new LifeLineImpl(); // Initialize the test instance
        question = new Questions("What is the capital of France?", "Paris", "London", "Berlin", "Madrid", 'A', 1000, "It's also known as the City of Light");
    }

    @After
    public void tearDown() {
        lifeline = null;
        question = null;
    }

    /**
     * Test of useLifeline method, of class LifeLine.
     */
    @Test
    public void testUseLifeline() {
        System.out.println("Testing useLifeline()");

        Map<Character, String> result = lifeline.useLifeline(question);
        assertNotNull("Lifeline result should not be null", result);

        // Assert that at least one incorrect option has been removed, leaving at most 2 options.
        assertTrue("Lifeline should return two options (one correct, one incorrect)", result.size() <= 2);
        assertTrue("Lifeline should contain the correct answer", result.containsKey(question.getCorrectAnswer()));
    }

    /**
     * Test that the lifeline returns only the correct answer and one other option.
     */
    @Test
    public void testLifelineCorrectAnswerIncluded() {
        System.out.println("Testing lifeline includes correct answer");

        Map<Character, String> result = lifeline.useLifeline(question);
        assertTrue("The result should include the correct answer", result.containsKey(question.getCorrectAnswer()));
    }

    public class LifeLineImpl extends LifeLine {
        @Override
        public Map<Character, String> useLifeline(Questions question) {
            Map<Character, String> options = new HashMap<>(question.getOptions());
            options.entrySet().removeIf(entry -> entry.getKey() != question.getCorrectAnswer() && options.size() > 2);
            return options; // Mock implementation to remove all but one wrong answer
        }
    }
}
