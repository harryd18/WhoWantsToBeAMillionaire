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

public class GetNewQuestion extends LifeLine {
    
    @Override
    public Map<Character, String> useLifeline(Questions question) {
     
        Map<Character, String> newQuestionMap = new HashMap<>();
        newQuestionMap.put('N', "New Question Triggered");
        return newQuestionMap;
    }
}



