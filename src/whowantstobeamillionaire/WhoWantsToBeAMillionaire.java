/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package whowantstobeamillionaire;

import controllers.Game;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

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




//public class WhoWantsToBeAMillionaire {
//    public static void main(String[] args) {
//        GameGUI gui = new GameGUI(); // Initialize GUI
//        JOptionPane.showMessageDialog(gui, "Enter your name in the field and click OK to start the game.");
//        String playerName = gui.getPlayerName(); // Get the name from the field
//        Player player = new Player(playerName);
//        Game game = new Game(player);
//        gui.setGame(game); // Set the game in GUI
//
//        // Start the game with GUI interaction
//        game.initGame(gui); // Use the new method to start the game
//    }
//}

//import java.util.Arrays;
//import java.util.List;
//
//public class WhoWantsToBeAMillionaire {
//    public static void main(String[] args) {
//        // Create a list of questions (replace with your question logic)
//        Questions q1 = new Questions("What is the capital of France?", new String[]{"Paris", "London", "Berlin", "Rome"}, "Paris", 100);
//        Questions q2 = new Questions("Which planet is known as the Red Planet?", new String[]{"Mars", "Earth", "Venus", "Jupiter"}, "Mars", 200);
//        List<Questions> questions = Arrays.asList(q1, q2);
//
//        // Create the GUI and pass the game logic
//        GameGUI gui = new GameGUI(new Game(gui, questions));
//    }
//}



//import views.GameGUI;
//import controllers.Game;
//
//
//public class WhoWantsToBeAMillionaire {
//    public static void main(String[] args) {
//        GameGUI gui = new GameGUI();
//        gui.setVisible(true);
//        new Game(gui);
//    }
//}



//
//import views.GameGUI;
//
//import javax.swing.*;
//
//public class WhoWantsToBeAMillionaire {
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(() -> {
//            GameGUI gui = new GameGUI(); // Create an instance of GameGUI
//            Game game = new Game(gui); // Create a new game instance
//            gui.setVisible(true); // Make the GUI visible
//        });
//    }
//}


//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class WhoWantsToBeAMillionaire extends JFrame {
//    private QuestionList questionList;
//    private Questions currentQuestion;
//    private int totalPrize;
//    private JLabel questionLabel;
//    private JButton optionAButton, optionBButton, optionCButton, optionDButton;
//    private JLabel resultLabel;
//
//    public WhoWantsToBeAMillionaire() {
//        questionList = new QuestionList();
//        totalPrize = 0;
//
//        setTitle("Who Wants to Be a Millionaire?");
//        setSize(400, 300);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        setLayout(new GridLayout(6, 1));
//
//        questionLabel = new JLabel("Press 'Start' to begin the game.");
//        questionLabel.setHorizontalAlignment(SwingConstants.CENTER);
//        add(questionLabel);
//
//        optionAButton = new JButton("A");
//        optionBButton = new JButton("B");
//        optionCButton = new JButton("C");
//        optionDButton = new JButton("D");
//
//        add(optionAButton);
//        add(optionBButton);
//        add(optionCButton);
//        add(optionDButton);
//
//        resultLabel = new JLabel("");
//        resultLabel.setHorizontalAlignment(SwingConstants.CENTER);
//        add(resultLabel);
//
//        JButton startButton = new JButton("Start");
//        startButton.addActionListener(new StartGameAction());
//        add(startButton);
//    }
//
//    private class StartGameAction implements ActionListener {
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            loadNextQuestion();
//        }
//    }
//
//    private void loadNextQuestion() {
//        currentQuestion = questionList.getRandomQuestion();
//        if (currentQuestion == null) {
//            questionLabel.setText("No more questions available!");
//            optionAButton.setEnabled(false);
//            optionBButton.setEnabled(false);
//            optionCButton.setEnabled(false);
//            optionDButton.setEnabled(false);
//            return;
//        }
//
//        questionLabel.setText(currentQuestion.getQuestion());
//        optionAButton.setText("A: " + currentQuestion.getOptions().get('A'));
//        optionBButton.setText("B: " + currentQuestion.getOptions().get('B'));
//        optionCButton.setText("C: " + currentQuestion.getOptions().get('C'));
//        optionDButton.setText("D: " + currentQuestion.getOptions().get('D'));
//
//        optionAButton.setEnabled(true);
//        optionBButton.setEnabled(true);
//        optionCButton.setEnabled(true);
//        optionDButton.setEnabled(true);
//
//        resultLabel.setText("");
//
//        optionAButton.addActionListener(new OptionAction(currentQuestion.getCorrectAnswer(), 'A'));
//        optionBButton.addActionListener(new OptionAction(currentQuestion.getCorrectAnswer(), 'B'));
//        optionCButton.addActionListener(new OptionAction(currentQuestion.getCorrectAnswer(), 'C'));
//        optionDButton.addActionListener(new OptionAction(currentQuestion.getCorrectAnswer(), 'D'));
//    }
//
//    private class OptionAction implements ActionListener {
//        private char correctAnswer;
//        private char selectedOption;
//
//        public OptionAction(char correctAnswer, char selectedOption) {
//            this.correctAnswer = correctAnswer;
//            this.selectedOption = selectedOption;
//        }
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            if (selectedOption == correctAnswer) {
//                totalPrize += currentQuestion.getPrizeAmount();
//                resultLabel.setText("Correct! You've won: $" + totalPrize);
//                loadNextQuestion(); // Load the next question
//            } else {
//                resultLabel.setText("Incorrect answer. Game Over. You've won $" + totalPrize);
//                optionAButton.setEnabled(false);
//                optionBButton.setEnabled(false);
//                optionCButton.setEnabled(false);
//                optionDButton.setEnabled(false);
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(() -> {
//            WhoWantsToBeAMillionaire game = new WhoWantsToBeAMillionaire();
//            game.setVisible(true);
//        });
//    }
//}


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WhoWantsToBeAMillionaire extends JFrame {
    private QuestionList questionList;
    private Questions currentQuestion;
    private int totalPrize;
    private JLabel questionLabel;
    private JButton optionAButton, optionBButton, optionCButton, optionDButton;
    private JLabel resultLabel;
    private JLabel currentWinningLabel; // Label to show current winning amount
    private JButton restartButton; // Restart button

    public WhoWantsToBeAMillionaire() {
        questionList = new QuestionList();
        totalPrize = 0;

        setTitle("Who Wants to Be a Millionaire?");
        setSize(800, 600); // Increased frame size for better visibility
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(9, 1)); // Adjusted layout to accommodate more components

        questionLabel = new JLabel("Press 'Start' to begin the game.");
        questionLabel.setHorizontalAlignment(SwingConstants.CENTER);
        questionLabel.setFont(new Font("Arial", Font.BOLD, 16)); // Increased font size for visibility
        add(questionLabel);

        currentWinningLabel = new JLabel("Current Winning Amount: $0"); // Label for current winning amount
        currentWinningLabel.setHorizontalAlignment(SwingConstants.CENTER);
        currentWinningLabel.setFont(new Font("Arial", Font.PLAIN, 14)); // Font for winning amount
        add(currentWinningLabel);

        // Initialize buttons with placeholder text
        optionAButton = new JButton("A: ");
        optionBButton = new JButton("B: ");
        optionCButton = new JButton("C: ");
        optionDButton = new JButton("D: ");

        disableOptions(); // Disable buttons until the game starts
        add(optionAButton);
        add(optionBButton);
        add(optionCButton);
        add(optionDButton);

        resultLabel = new JLabel("");
        resultLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(resultLabel);

        // Initialize Restart button
        restartButton = new JButton("Restart");
        restartButton.addActionListener(new RestartGameAction());
        restartButton.setVisible(false); // Initially hidden
        add(restartButton);

        // Start the game immediately
        startGame();
    }

    private void startGame() {
        totalPrize = 0; // Reset prize on start
        currentWinningLabel.setText("Current Winning Amount: $" + totalPrize); // Reset label
        resultLabel.setText(""); // Clear any previous results
        loadNextQuestion();
        toggleButtons(); // Show the Restart button
    }

    private class RestartGameAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            startGame(); // Restart the game
        }
    }

    private void loadNextQuestion() {
        currentQuestion = questionList.getRandomQuestion();
        if (currentQuestion == null) {
            questionLabel.setText("No more questions available!");
            disableOptions();
            return;
        }

        questionLabel.setText(currentQuestion.getQuestion());
        optionAButton.setText("A: " + currentQuestion.getOptions().get('A'));
        optionBButton.setText("B: " + currentQuestion.getOptions().get('B'));
        optionCButton.setText("C: " + currentQuestion.getOptions().get('C'));
        optionDButton.setText("D: " + currentQuestion.getOptions().get('D'));

        enableOptions();
        resultLabel.setText("");

        // Remove previous listeners to prevent duplication
        for (ActionListener listener : optionAButton.getActionListeners()) {
            optionAButton.removeActionListener(listener);
        }
        for (ActionListener listener : optionBButton.getActionListeners()) {
            optionBButton.removeActionListener(listener);
        }
        for (ActionListener listener : optionCButton.getActionListeners()) {
            optionCButton.removeActionListener(listener);
        }
        for (ActionListener listener : optionDButton.getActionListeners()) {
            optionDButton.removeActionListener(listener);
        }

        optionAButton.addActionListener(new OptionAction(currentQuestion.getCorrectAnswer(), 'A'));
        optionBButton.addActionListener(new OptionAction(currentQuestion.getCorrectAnswer(), 'B'));
        optionCButton.addActionListener(new OptionAction(currentQuestion.getCorrectAnswer(), 'C'));
        optionDButton.addActionListener(new OptionAction(currentQuestion.getCorrectAnswer(), 'D'));
    }

    private void disableOptions() {
        optionAButton.setEnabled(false);
        optionBButton.setEnabled(false);
        optionCButton.setEnabled(false);
        optionDButton.setEnabled(false);
    }

    private void enableOptions() {
        optionAButton.setEnabled(true);
        optionBButton.setEnabled(true);
        optionCButton.setEnabled(true);
        optionDButton.setEnabled(true);
    }

    private void toggleButtons() {
        restartButton.setVisible(true); // Show the restart button
    }

    private class OptionAction implements ActionListener {
        private char correctAnswer;
        private char selectedOption;

        public OptionAction(char correctAnswer, char selectedOption) {
            this.correctAnswer = correctAnswer;
            this.selectedOption = selectedOption;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (selectedOption == correctAnswer) {
                totalPrize += currentQuestion.getPrizeAmount();
                currentWinningLabel.setText("Current Winning Amount: $" + totalPrize); // Update the current winning amount
                resultLabel.setText("Correct! You've won: $" + totalPrize);
                loadNextQuestion(); // Load the next question
            } else {
                resultLabel.setText("Incorrect answer. Game Over. You've won $" + totalPrize);
                disableOptions();
                restartButton.setVisible(true); // Show restart button
                optionAButton.setEnabled(false);
                optionBButton.setEnabled(false);
                optionCButton.setEnabled(false);
                optionDButton.setEnabled(false);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            WhoWantsToBeAMillionaire game = new WhoWantsToBeAMillionaire();
            game.setVisible(true);
        });
    }
}
