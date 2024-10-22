/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whowantstobeamillionaire;

/**
 *
 * @author harshitdhasmana
 */
public class GetNewQuestion extends LifeLine {
    @Override
    protected void useLifeline(Questions question) {
        System.out.println("A new question will be there for you...");
        Questions newQuestion = new QuestionList().getRandomQuestion();
        GameUI.displayQuestion(newQuestion, 0);  
    }
}

