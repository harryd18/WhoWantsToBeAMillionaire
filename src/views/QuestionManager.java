/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;

/**
 *
 * @author harshitdhasmana
 */


import java.util.Collections;
import java.util.List;
import whowantstobeamillionaire.Database;
import whowantstobeamillionaire.Questions;

public class QuestionManager {
    private List<Questions> questionPool;
    private int currentQuestionIndex;

    public QuestionManager(Database database) {
        // Fetch questions from the database and shuffle them for randomness
        questionPool = database.fetchQuestionsFromDB();
        Collections.shuffle(questionPool);
        currentQuestionIndex = 0;
    }

    // Retrieve the next question
    public Questions getNextQuestion() {
        if (currentQuestionIndex < questionPool.size()) {
            return questionPool.get(currentQuestionIndex++);
        }
        return null; // No more questions available
    }

    // Check if there are more questions
    public boolean hasMoreQuestions() {
        return currentQuestionIndex < questionPool.size();
    }

    // Reset the question manager for a new game
    public void reset() {
        Collections.shuffle(questionPool); // Re-shuffle questions
        currentQuestionIndex = 0;
    }
}
