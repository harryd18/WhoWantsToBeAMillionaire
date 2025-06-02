package whowantstobeamillionaire;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author harshitdhasmana
 */
public class QuestionListTest {

    private QuestionList questionList;

    @Before
    public void setUp() {
        questionList = new QuestionList();
    }

    @Test
    public void testQuestionsAreLoaded() {
        List<Questions> questions = questionList.getQuestions();
        assertNotNull("Question list should not be null", questions);
        assertTrue("Question list should contain questions", questions.size() >= 10);
    }

    @Test
    public void testNoDuplicateQuestions() {
        Set<Questions> seen = new HashSet<>();
        Questions q;
        int count = 0;

        while ((q = questionList.getRandomQuestion()) != null) {
            assertFalse("Duplicate question detected!", seen.contains(q));
            seen.add(q);
            count++;
        }

        assertEquals("Should exhaust all unique questions", questionList.getQuestions().size(), count);
    }

    @Test
    public void testGetRandomQuestionReturnsNullWhenExhausted() {
        // Exhaust all questions
        for (int i = 0; i < questionList.getQuestions().size(); i++) {
            assertNotNull("Should return a question", questionList.getRandomQuestion());
        }

        // Now it should return null
        assertNull("Should return null when all questions are used", questionList.getRandomQuestion());
    }

    @Test
    public void testResetUsedQuestions() {
        // Exhaust all questions
        while (questionList.getRandomQuestion() != null);

        // Reset and ensure we can get a question again
        questionList.resetUsedQuestions();
        assertNotNull("Should return a question after reset", questionList.getRandomQuestion());
    }
}
