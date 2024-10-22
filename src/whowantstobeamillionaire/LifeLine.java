/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whowantstobeamillionaire;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author harshitdhasmana
 * This class handles everything related to the different types of Lifelines this game has to offer.
 */
public abstract class LifeLine {
     private int usesLeft = 2;
     
     public void use(Questions question){
         if(usesLeft > 0){
             useLifeline(question);
             usesLeft--;
             System.out.println("You have " + usesLeft + " uses left for this lifeline.");
         }else{
             System.out.println("You've already used this lifeline twice. You can't use it again.");
         }
     }
     
     protected abstract void useLifeline(Questions question);
      public int getUsesLeft() {
        return usesLeft;
    }
}


