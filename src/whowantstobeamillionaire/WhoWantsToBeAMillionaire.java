/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package whowantstobeamillionaire;


/**
 *
 * @author harshitdhasmana
 * This is the main program for the game "Who wants to be a Millionaire ?"
 */
import controllers.Game;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import views.GameGUI;
import javax.swing.*;

public class WhoWantsToBeAMillionaire {
    public WhoWantsToBeAMillionaire() {
        GameGUI gameGUI = new GameGUI();
        Game game = new Game(gameGUI); // Pass the GameGUI to Game
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new WhoWantsToBeAMillionaire());
    }
}



