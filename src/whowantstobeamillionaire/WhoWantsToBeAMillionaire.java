/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package whowantstobeamillionaire;

import javax.swing.JOptionPane;

/**
 *
 * @author harshitdhasmana
 * This is the main program for the game "Who wants to be a Millionaire ?"
 */
//public class WhoWantsToBeAMillionaire {
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        
//        Player player = new Player(Inputhandler.getUserInput("Please enter your name to start the game: "));
//        Game game = new Game(player);
//        GameGUI gui = new GameGUI(game); // updated
//        
//        gui.updateQuestion(game.getCurrentQuestion());//updated
//        game.startGame();
//        
//    }
//    
//}
    

//public class WhoWantsToBeAMillionaire {
//
//    public static void main(String[] args) {
//        
//        Player player = new Player(Inputhandler.getUserInput("Please enter your name to start the game: "));
//        Game game = new Game(player);
//        GameGUI gui = new GameGUI(game); // Create the GUI
//        
//        
//        gui.updateQuestion(game.getCurrentQuestion()); // Update question in GUI
//       
//    }
//}




public class WhoWantsToBeAMillionaire {
    public static void main(String[] args) {
        GameGUI gui = new GameGUI(); // Initialize GUI
        JOptionPane.showMessageDialog(gui, "Enter your name in the field and click OK to start the game.");
        String playerName = gui.getPlayerName(); // Get the name from the field
        Player player = new Player(playerName);
        Game game = new Game(player);
        gui.setGame(game); // Set the game in GUI

        // Start the game with GUI interaction
        game.initGame(gui); // Use the new method to start the game
    }
}






