/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whowantstobeamillionaire;

/**
 *
 * @author harshitdhasmana
 */
import java.util.Map;

public class Questions {
    private String questionText;
    private Map<Character, String> options;
    private char correctAnswer;

    public Questions(String questionText, Map<Character, String> options, char correctAnswer) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public boolean isCorrect(char userAnswer) {
        return userAnswer == correctAnswer;
    }

    public String getQuestionText() {
        return questionText;
    }

    public Map<Character, String> getOptions() {
        return options;
    }
}
