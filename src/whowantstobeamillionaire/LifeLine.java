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


import java.util.Map;

public abstract class LifeLine {
    public abstract Map<Character, String> useLifeline(Questions question);
}


