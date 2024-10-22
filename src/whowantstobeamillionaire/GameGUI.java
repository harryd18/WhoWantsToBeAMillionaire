/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whowantstobeamillionaire;

/**
 *
 * @author harshitdhasmana
 */


//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class GameGUI extends JFrame {
//    private Game game;  // Reference to the game logic
//    private Player player; // Reference to the player
//    private JLabel questionLabel;
//    private JButton[] answerButtons;
//    private JLabel scoreLabel;
//    private JButton lifelineButton1, lifelineButton2, lifelineButton3;
//
//    public GameGUI(Game game) {
//        this.game = game;
//        this.player = game.getPlayer(); // Initialize player reference
//        setTitle("Who Wants to Be a Millionaire?");
//        setSize(600, 400);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setLayout(new BorderLayout());
//
//        // Initialize components
//        questionLabel = new JLabel("Question will be here", SwingConstants.CENTER);
//        scoreLabel = new JLabel("Current Winnings: $" + player.getCurrentWinnings(), SwingConstants.CENTER); // Show initial winnings
//        answerButtons = new JButton[4];
//        
//        // Create answer buttons
//        for (int i = 0; i < answerButtons.length; i++) {
//            answerButtons[i] = new JButton();
//            answerButtons[i].addActionListener(new AnswerButtonListener());
//        }
//
//        // Create lifeline buttons
//        lifelineButton1 = new JButton("Fifty-Fifty");
//        lifelineButton2 = new JButton("Get Hint");
//        lifelineButton3 = new JButton("Get New Question");
//
//        // Add components to the frame
//        add(questionLabel, BorderLayout.NORTH);
//        JPanel centerPanel = new JPanel(new GridLayout(2, 2));
//        for (JButton button : answerButtons) {
//            centerPanel.add(button);
//        }
//        add(centerPanel, BorderLayout.CENTER);
//        add(scoreLabel, BorderLayout.SOUTH);
//        
//        JPanel lifelinePanel = new JPanel();
//        lifelinePanel.add(lifelineButton1);
//        lifelinePanel.add(lifelineButton2);
//        lifelinePanel.add(lifelineButton3);
//        add(lifelinePanel, BorderLayout.EAST);
//
//        setVisible(true);
//    }
//
//    // Method to update the question and answers
//    public void updateQuestion(Questions question) {
//        questionLabel.setText(question.getQuestionText());
//        char option = 'A';
//        for (int i = 0; i < answerButtons.length; i++) {
//            answerButtons[i].setText(option + ": " + question.getOptions().get(option));
//            option++;
//        }
//    }
//
//    // Method to update the score label
//    public void updateScore() {
//        scoreLabel.setText("Current Winnings: $" + player.getCurrentWinnings());
//    }
//
//    // Method to set the current level
//    public void setCurrentLevel(int level) {
//        System.out.println("Current Level: " + level);
//    }
//
//    // Listener for answer buttons
//    private class AnswerButtonListener implements ActionListener {
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            String selectedAnswer = ((JButton) e.getSource()).getText().substring(0, 1); // Get the option letter
//            if (game.checkAnswer(selectedAnswer.charAt(0))) { // Check answer using game logic
//                player.increaseLevel(); // Increase player's level
//                player.addWinnings(1000); // Add winnings for this level (you might want to adjust this)
//                updateScore(); // Update the displayed score
//                game.increasePlayerLevel(); // Increase level in game logic
//                setCurrentLevel(player.getCurrentLevel()); // Update the current level
//                game.nextQuestion(); // Fetch the next question
//                updateQuestion(game.getCurrentQuestion()); // Update the GUI with the new question
//            } else {
//                JOptionPane.showMessageDialog(GameGUI.this, "Incorrect Answer! Game Over!");
//                game.endGame(); // Handle game over condition
//            }
//        }
//    }
//    
//    // You can add action listeners for lifeline buttons here as well
//}


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameGUI extends JFrame {
    private JTextField playerNameField;
    private JLabel scoreLabel;
    private JLabel levelLabel;
    private JButton[] answerButtons;
    private Game game;

    public GameGUI() {
        setTitle("Who Wants to Be a Millionaire");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        playerNameField = new JTextField(20);
        add(new JLabel("Enter your name:"));
        add(playerNameField);

        JButton startButton = new JButton("Start Game");
        startButton.addActionListener(e -> {
            // You might want to add logic here to start the game
        });
        add(startButton);

        scoreLabel = new JLabel("Current Winnings: $0");
        levelLabel = new JLabel("Current Level: 1");
        add(scoreLabel);
        add(levelLabel);

        answerButtons = new JButton[4];
        for (int i = 0; i < answerButtons.length; i++) {
            answerButtons[i] = new JButton("Answer " + (char) ('A' + i));
            add(answerButtons[i]);
        }

        setVisible(true);
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public void updateQuestion(Questions question) {
        // Update the GUI with the new question
    }

    public void setCurrentLevel(int level) {
        levelLabel.setText("Current Level: " + level);
    }

    public void setWinningAmount(int amount) {
        scoreLabel.setText("Current Winnings: $" + amount);
    }

    public void waitForAnswer(AnswerListener listener) {
        for (JButton button : answerButtons) {
            button.addActionListener(e -> {
                String answer = button.getText().substring(7, 8); // Get the selected answer (A, B, C, or D)
                listener.onAnswerSelected(answer);
            });
        }
    }

    public void displayMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }

    public String getPlayerName() {
        return playerNameField.getText();
    }

    // Interface to handle answer selection
    interface AnswerListener {
        void onAnswerSelected(String answer);
    }
}
