/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whowantstobeamillionaire;

/**
 *
 * @author harshitdhasmana
 */
public class GetHint extends LifeLine {
    
    @Override
    protected void useLifeline(Questions question) {
        System.out.println("Hint: " + question.getHint());
    }   
}
