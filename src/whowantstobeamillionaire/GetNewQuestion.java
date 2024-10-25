/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whowantstobeamillionaire;

/**
 *
 * @author harshitdhasmana
 */
//public class GetNewQuestion extends LifeLine {
//    @Override
//    protected void useLifeline(Questions question) {
//        System.out.println("A new question will be there for you...");
//        Questions newQuestion = new QuestionList().getRandomQuestion();
//        GameUI.displayQuestion(newQuestion, 0);  




import java.util.HashMap;
import java.util.Map;

public class GetNewQuestion extends LifeLine {
    
    @Override
    public Map<Character, String> useLifeline(Questions question) {
        // This lifeline doesn't modify the current question directly
        // Instead, the Game class can interpret this as a signal to skip or replace the question
        Map<Character, String> newQuestionMap = new HashMap<>();
        newQuestionMap.put('N', "New Question Triggered");
        return newQuestionMap;
    }
}



