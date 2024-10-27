/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whowantstobeamillionaire;

/**
 *
 * @author harshitdhasmana
 */

import java.util.HashMap;
import java.util.Map;

public class Questions {
    private String question;
    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;
    private char correctAnswer;
    private int prizeAmount;
    private String hint;

    public Questions(String question, String optionA, String optionB, String optionC, String optionD, char correctAnswer, int prizeAmount, String hint) {
        this.question = question;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.correctAnswer = correctAnswer;
        this.prizeAmount = prizeAmount;
        this.hint = hint;
    }

    public String getQuestion() {
        return question;
    }

    public Map<Character, String> getOptions() {
        Map<Character, String> options = new HashMap<>();
        options.put('A', optionA);
        options.put('B', optionB);
        options.put('C', optionC);
        options.put('D', optionD);
        return options;
    }

    public char getCorrectAnswer() {
        return correctAnswer;
    }

    public int getPrizeAmount() {
        return prizeAmount;
    }

    public String getHint() {
        return hint;
    }
}
