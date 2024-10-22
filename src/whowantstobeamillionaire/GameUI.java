/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whowantstobeamillionaire;

/**
 *
 * @author harshitdhasmana
 */
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
public class GameUI {
    
    public static void displayQuestion(Questions question, int level) { 
        System.out.println("Level " + level);
        System.out.println(question.getQuestionText());
        
        Map<Character, String> sortedOptions = new TreeMap<>(question.getOptions());
        
        sortedOptions.forEach((k, v) -> System.out.println(k + ": " + v));
    }
    
    public static void displayLifelines(List<LifeLine> lifelines) {
        System.out.println("Available Lifelines:");
        for (int i = 0; i < lifelines.size(); i++) {
            System.out.println((i + 1) + ": " + lifelines.get(i).getClass().getSimpleName());
        }
      
    }
    
    
}
