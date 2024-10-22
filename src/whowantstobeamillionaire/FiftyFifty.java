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
import java.util.Random;
import java.util.HashMap;

public class FiftyFifty extends LifeLine {
    @Override
    public void useLifeline(Questions question) {
        
        Map<Character, String> mutableOptions = new HashMap<>(question.getOptions());
        Character correctAnswer = question.getCorrectAnswer(); 
        
        Random random = new Random();
        int removed = 0;

       
        while (mutableOptions.size() > 2 && removed < 2) {
            Character optionToRemove = (Character) mutableOptions.keySet().toArray()[random.nextInt(mutableOptions.size())];
            if (!optionToRemove.equals(correctAnswer)) {
                mutableOptions.remove(optionToRemove);
                removed++;
            }
        }
        
        System.out.println("Fifty-Fifty Lifeline used. Remaining options:");
        mutableOptions.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}






