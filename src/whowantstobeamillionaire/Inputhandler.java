/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whowantstobeamillionaire;

/**
 *
 * @author harshitdhasmana
 */
import java.util.Scanner;

public class Inputhandler {
    
    private static Scanner scanner = new Scanner(System.in);

    public static char getAnswerChoice() {
        System.out.print("Enter your answer (A, B, C, D): ");
        return scanner.next().toUpperCase().charAt(0);
    }
    
    public static int getLifelineChoice() {
        System.out.print("Enter the lifeline number: ");
        return scanner.nextInt();
    }
    
    public static String getUserInput(String prompt) {
        System.out.print(prompt);
        return scanner.next();
    }
    
    
    
}
