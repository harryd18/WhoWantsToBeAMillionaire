/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package whowantstobeamillionaire;

package views;

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



//////////////// database /////////////

//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionListener;
//
//public class GameGUI extends JFrame {
//    private JLabel questionLabel;
//    private JButton[] answerButtons;
//    private JLabel winningsLabel;
//
//    public GameGUI() {
//        setTitle("Who Wants to Be a Millionaire");
//        setSize(600, 400);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        setLayout(new BorderLayout());
//
//        questionLabel = new JLabel("Question?");
//        add(questionLabel, BorderLayout.NORTH);
//
//        JPanel answersPanel = new JPanel();
//        answersPanel.setLayout(new GridLayout(2, 2));
//        answerButtons = new JButton[4];
//        for (int i = 0; i < 4; i++) {
//            answerButtons[i] = new JButton();
//            answersPanel.add(answerButtons[i]);
//        }
//        add(answersPanel, BorderLayout.CENTER);
//
//        winningsLabel = new JLabel("Current Winnings: $0");
//        add(winningsLabel, BorderLayout.SOUTH);
//    }
//
//    public void displayQuestion(String question, String[] answers) {
//        questionLabel.setText(question);
//        for (int i = 0; i < answers.length; i++) {
//            answerButtons[i].setText(answers[i]);
//        }
//    }
//
//    public void setCurrentWinnings(int winnings) {
//        winningsLabel.setText("Current Winnings: $" + winnings);
//    }
//
//    public void addAnswerListener(ActionListener listener) {
//        for (JButton button : answerButtons) {
//            button.addActionListener(listener);
//        }
//    }
//
//    public void displayMessage(String message) {
//        JOptionPane.showMessageDialog(this, message);
//    }
//}







//import javax.swing.*;
//import java.awt.event.ActionListener;
//
//public class GameGUI {
//    private JFrame frame;
//    private JLabel questionLabel;
//    private JButton[] optionButtons;
//    private JLabel winningsLabel;
//
//    public GameGUI() {
//        setupGUI();
//    }
//
//    private void setupGUI() {
//        frame = new JFrame("Who Wants to Be a Millionaire?");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(400, 300);
//        frame.setLayout(null);
//
//        questionLabel = new JLabel("Question");
//        questionLabel.setBounds(50, 20, 300, 30);
//        frame.add(questionLabel);
//
//        optionButtons = new JButton[4];
//        for (int i = 0; i < 4; i++) {
//            optionButtons[i] = new JButton();
//            optionButtons[i].setBounds(50, 70 + i * 30, 300, 30);
//            frame.add(optionButtons[i]);
//        }
//
//        winningsLabel = new JLabel("Current Winning: $0");
//        winningsLabel.setBounds(50, 200, 300, 30);
//        frame.add(winningsLabel);
//
//        frame.setVisible(true);
//    }
//
//    public JLabel getQuestionLabel() {
//        return questionLabel;
//    }
//
//    public JButton getOptionButton(int index) {
//        return optionButtons[index];
//    }
//
//    public JLabel getWinningsLabel() {
//        return winningsLabel;
//    }
//
//    public void setCurrentWinnings(int winnings) {
//        winningsLabel.setText("Current Winning: $" + winnings);
//    }
//
//    public JButton[] getOptionButtons() {
//        return optionButtons;
//    }
//
//    public void addAnswerListener(ActionListener listener) {
//        for (JButton button : optionButtons) {
//            button.addActionListener(listener);
//        }
//    }
//
//    public void displayQuestion(String question, String[] answers) {
//        questionLabel.setText(question);
//        for (int i = 0; i < answers.length; i++) {
//            optionButtons[i].setText(answers[i]);
//        }
//    }
//
//    public void displayMessage(String message) {
//        JOptionPane.showMessageDialog(frame, message);
//    }
//}







//import javax.swing.*;
//import java.awt.event.ActionListener;
//import java.util.Map;
//
//public class GameGUI extends JFrame {
//    private JLabel questionLabel;
//    private JButton[] optionButtons;
//    private JLabel winningsLabel;
//
//    public GameGUI() {
//        setupGUI();
//    }
//
//    private void setupGUI() {
//        setTitle("Who Wants to Be a Millionaire?");
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setSize(400, 300);
//        setLayout(null);
//
//        questionLabel = new JLabel("Question");
//        questionLabel.setBounds(50, 20, 300, 30);
//        add(questionLabel);
//
//        optionButtons = new JButton[4];
//        for (int i = 0; i < 4; i++) {
//            optionButtons[i] = new JButton();
//            optionButtons[i].setBounds(50, 70 + i * 30, 300, 30);
//            add(optionButtons[i]);
//        }
//
//        winningsLabel = new JLabel("Current Winning: $0");
//        winningsLabel.setBounds(50, 200, 300, 30);
//        add(winningsLabel);
//
//        setVisible(true);
//    }
//
//    public void displayQuestion(String question, Map<Character, String> options) {
//        questionLabel.setText(question);
//        optionButtons[0].setText(options.get('A'));
//        optionButtons[1].setText(options.get('B'));
//        optionButtons[2].setText(options.get('C'));
//        optionButtons[3].setText(options.get('D'));
//    }
//
//    public void setCurrentWinnings(int winnings) {
//        winningsLabel.setText("Current Winning: $" + winnings);
//    }
//
//    public void addAnswerListener(ActionListener listener) {
//        for (JButton button : optionButtons) {
//            button.addActionListener(listener);
//            button.setActionCommand(button.getText()); // Set action command as button text
//        }
//    }
//
//    public void displayMessage(String message) {
//        JOptionPane.showMessageDialog(this, message);
//    }
//}



///////////////// WORKING , IF LINFE LINE DOESN'T WORK , USE THIS ONE////////

//import javax.swing.*;
//import java.awt.event.ActionListener;
//import java.util.Map;
//
//public class GameGUI extends JFrame {
//    private JLabel questionLabel;
//    private JButton[] optionButtons;
//    private JLabel winningsLabel;
//
//    public GameGUI() {
//        setupGUI();
//    }
//
//    private void setupGUI() {
//        setTitle("Who Wants to Be a Millionaire?");
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setSize(600, 400); // Increased size for longer questions
//        setLayout(null);
//
//        questionLabel = new JLabel("Press Start to play the game");
//        questionLabel.setBounds(50, 20, 500, 50); // Adjusted position and size
//        add(questionLabel);
//
//        optionButtons = new JButton[4];
//        for (int i = 0; i < 4; i++) {
//            optionButtons[i] = new JButton();
//            optionButtons[i].setBounds(50, 90 + i * 40, 500, 40); // Increased button height
//            optionButtons[i].setVisible(false); // Initially hidden
//            add(optionButtons[i]);
//        }
//
//        winningsLabel = new JLabel("Current Winning: $0");
//        winningsLabel.setBounds(50, 320, 500, 30); // Adjusted position
//        add(winningsLabel);
//
//        setVisible(true);
//    }
//
//    public void displayQuestion(String question, Map<Character, String> options) {
//        questionLabel.setText(question);
//        optionButtons[0].setText(options.get('A'));
//        optionButtons[1].setText(options.get('B'));
//        optionButtons[2].setText(options.get('C'));
//        optionButtons[3].setText(options.get('D'));
//
//        for (JButton button : optionButtons) {
//            button.setVisible(true); // Show options when a question is displayed
//        }
//    }
//
//    public void setCurrentWinnings(int winnings) {
//        winningsLabel.setText("Current Winning: $" + winnings);
//    }
//
//    public void resetGame() {
//        questionLabel.setText("Press Start to play the game");
//        for (JButton button : optionButtons) {
//            button.setVisible(false); // Hide buttons when resetting the game
//        }
//        winningsLabel.setText("Current Winning: $0"); // Reset winnings
//    }
//
//    public void addAnswerListener(ActionListener listener) {
//        for (int i = 0; i < optionButtons.length; i++) {
//            final char option = (char) ('A' + i); // A, B, C, D
//            optionButtons[i].addActionListener(listener);
//            optionButtons[i].setActionCommand(String.valueOf(option)); // Set action command as the option character
//        }
//    }
//
//    public void displayMessage(String message) {
//        JOptionPane.showMessageDialog(this, message);
//    }
//}






//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionListener;
//import java.util.Map;
//import whowantstobeamillionaire.Questions;
//
//public class GameGUI extends JFrame {
//    private JPanel panel;
//    private JButton[] answerButtons;
//    private JButton[] lifelineButtons;
//    private JButton restartButton; // Restart button
//    private JLabel questionLabel; // Label for displaying the question
//    private JLabel winningsLabel; // Label for showing current winnings
//    private int currentWinnings;
//
//    public GameGUI() {
//        setTitle("Who Wants To Be A Millionaire");
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setSize(400, 300);
//        
//        panel = new JPanel();
//        panel.setLayout(new GridLayout(0, 1));
//
//        // Initialize GUI components
//        questionLabel = new JLabel("Question will appear here", SwingConstants.CENTER);
//        winningsLabel = new JLabel("Current Winnings: $0", SwingConstants.CENTER);
//        
//        // Initialize answer buttons
//        answerButtons = new JButton[4];
//        for (int i = 0; i < answerButtons.length; i++) {
//            answerButtons[i] = new JButton();
//            panel.add(answerButtons[i]);
//        }
//        
//        // Initialize lifeline buttons
//        lifelineButtons = new JButton[3];
//        String[] lifelineNames = {"FiftyFifty", "GetHint", "GetNewQuestion"};
//        for (int i = 0; i < lifelineButtons.length; i++) {
//            lifelineButtons[i] = new JButton(lifelineNames[i]);
//            panel.add(lifelineButtons[i]);
//        }
//
//        // Initialize the restart button
//        restartButton = new JButton("Restart Game");
//        panel.add(restartButton);
//
//        // Add components to the panel
//        panel.add(questionLabel);
//        panel.add(winningsLabel);
//
//        // Finalize frame settings
//        add(panel);
//        setVisible(true); // Set visibility here
//    }
//
//    public void displayQuestion(String question, Map<Character, String> options) {
//        questionLabel.setText(question);
//        int i = 0;
//        for (Map.Entry<Character, String> entry : options.entrySet()) {
//            answerButtons[i].setText(entry.getValue());
//            answerButtons[i].setActionCommand(String.valueOf(entry.getKey()));
//            i++;
//        }
//    }
//
//    public void setCurrentWinnings(int amount) {
//        currentWinnings = amount;
//        winningsLabel.setText("Current Winnings: $" + currentWinnings);
//    }
//
//    // Adding lifeline listener methods
//    public void addLifelineListener(ActionListener listener) {
//        for (JButton lifelineButton : lifelineButtons) {
//            lifelineButton.addActionListener(listener);
//        }
//    }
//
//    // Adding action listener for answer buttons
//    public void addAnswerListener(ActionListener listener) {
//        for (JButton answerButton : answerButtons) {
//            answerButton.addActionListener(listener);
//        }
//    }
//
//    // Adding action listener for restart button
//    public void addRestartListener(ActionListener listener) {
//        restartButton.addActionListener(listener);
//    }
//
//    // Reset game GUI to initial state
//    public void reset() {
//        currentWinnings = 0;
//        winningsLabel.setText("Current Winnings: $0");
//        // Reset other components as needed
//    }
//
//    // Display Fifty-Fifty options
//    public void displayFiftyFiftyOptions(Questions currentQuestion) {
//        // Logic to remove two wrong options from the question
//        // For simplicity, let's just show a dialog
//        JOptionPane.showMessageDialog(this, "Fifty-Fifty activated!");
//    }
//
//    // Display hint
//    public void displayHint(Questions currentQuestion) {
//        // Logic to show a hint for the question
//        JOptionPane.showMessageDialog(this, "Hint activated!");
//    }
//
//    // Dispose method for closing the GUI
//    public void close() {
//        dispose();
//    }
//}






import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Map;
import whowantstobeamillionaire.Questions;

public class GameGUI extends JFrame {
    private JLabel questionLabel;
    private JButton optionAButton;
    private JButton optionBButton;
    private JButton optionCButton;
    private JButton optionDButton;
    private JLabel winningsLabel;
    private JButton restartButton;
    private JButton fiftyFiftyButton;
    private JButton hintButton;
    private JButton newQuestionButton;

    public GameGUI() {
        // Set frame size and title
        setTitle("Who Wants to Be a Millionaire?");
        setSize(800, 600); // Bigger window size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window on the screen

        // Set Layout
        setLayout(new BorderLayout(10, 10));

        // Create main panel for question and options
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Add padding between components

        // Question label (bigger font)
        questionLabel = new JLabel("Question will appear here");
        questionLabel.setFont(new Font("Arial", Font.BOLD, 22));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        mainPanel.add(questionLabel, gbc);

        // Option buttons (larger buttons for easier clicking)
        optionAButton = new JButton("Option A");
        optionBButton = new JButton("Option B");
        optionCButton = new JButton("Option C");
        optionDButton = new JButton("Option D");

        // Increase button size and font
        Dimension buttonSize = new Dimension(300, 60); // Wider and taller buttons
        optionAButton.setPreferredSize(buttonSize);
        optionBButton.setPreferredSize(buttonSize);
        optionCButton.setPreferredSize(buttonSize);
        optionDButton.setPreferredSize(buttonSize);

        Font buttonFont = new Font("Arial", Font.PLAIN, 18); // Larger font for buttons
        optionAButton.setFont(buttonFont);
        optionBButton.setFont(buttonFont);
        optionCButton.setFont(buttonFont);
        optionDButton.setFont(buttonFont);

        // Button placement in grid
        gbc.gridwidth = 1;
        gbc.gridx = 0;
        gbc.gridy = 1;
        mainPanel.add(optionAButton, gbc);

        gbc.gridx = 1;
        mainPanel.add(optionBButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        mainPanel.add(optionCButton, gbc);

        gbc.gridx = 1;
        mainPanel.add(optionDButton, gbc);

        // Add main panel to center of the frame
        add(mainPanel, BorderLayout.CENTER);

        // Winnings label
        winningsLabel = new JLabel("Current Winnings: $0");
        winningsLabel.setFont(new Font("Arial", Font.BOLD, 16));
        add(winningsLabel, BorderLayout.NORTH);

        // Create a bottom panel for the restart and lifeline buttons
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        // Lifeline buttons
        fiftyFiftyButton = new JButton("50/50 Lifeline");
        hintButton = new JButton("Get Hint");
        newQuestionButton = new JButton("New Question");

        bottomPanel.add(fiftyFiftyButton);
        bottomPanel.add(hintButton);
        bottomPanel.add(newQuestionButton);

        // Restart button
        restartButton = new JButton("Restart Game");
        bottomPanel.add(restartButton);

        // Add bottom panel to frame
        add(bottomPanel, BorderLayout.SOUTH);

        // Make the frame visible
        setVisible(true);
    }

    // Method to display question and options
    public void displayQuestion(String question, Map<Character, String> options) {
        questionLabel.setText(question);
        optionAButton.setText("A: " + options.get('A'));
        optionBButton.setText("B: " + options.get('B'));
        optionCButton.setText("C: " + options.get('C'));
        optionDButton.setText("D: " + options.get('D'));
    }

    // Method to update the winnings label
    public void setCurrentWinnings(int amount) {
        winningsLabel.setText("Current Winnings: $" + amount);
    }

    // Method to add ActionListener for option buttons
    public void addAnswerListener(ActionListener listener) {
        optionAButton.addActionListener(listener);
        optionBButton.addActionListener(listener);
        optionCButton.addActionListener(listener);
        optionDButton.addActionListener(listener);
    }

    // Method to add ActionListener for restart button
    public void addRestartListener(ActionListener listener) {
        restartButton.addActionListener(listener);
    }

    // Method to add ActionListener for lifeline buttons
    public void addLifelineListener(ActionListener listener) {
        fiftyFiftyButton.addActionListener(listener);
        hintButton.addActionListener(listener);
        newQuestionButton.addActionListener(listener);
    }

    // Method to reset the GUI when restarting
    public void reset() {
        winningsLabel.setText("Current Winnings: $0");
        questionLabel.setText("Question will appear here");
        optionAButton.setText("Option A");
        optionBButton.setText("Option B");
        optionCButton.setText("Option C");
        optionDButton.setText("Option D");
    }

    // Method to close the GUI
    public void close() {
        dispose();
    }

    // Method to handle 50/50 lifeline (dummy for now)
    public void displayFiftyFiftyOptions(Questions question) {
        // Hide two incorrect options (you can improve this logic)
        optionAButton.setText("A: " + question.getOptions().get('A')); // Display correct option
        optionBButton.setText(""); // Hide this one
        optionCButton.setText("C: " + question.getOptions().get('C')); // Display correct option
        optionDButton.setText(""); // Hide this one
    }

    // Method to display a hint
    public void displayHint(Questions question) {
        JOptionPane.showMessageDialog(this, "Hint: " + question.getHint());
    }
}
