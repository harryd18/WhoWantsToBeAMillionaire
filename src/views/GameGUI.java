package views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Map;

public class GameGUI extends JFrame {
    private JLabel questionLabel;
    private JButton[] answerButtons;
    private JButton fiftyFiftyButton;
    private JButton getHintButton;
    private JButton newQuestionButton;
    private JButton restartButton;
    private JLabel winningsLabel;

    public GameGUI() {
        setTitle("Who Wants to Be a Millionaire");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLayout(new BorderLayout());

        // Top panel with question and winnings
        JPanel topPanel = new JPanel(new BorderLayout());
        questionLabel = new JLabel("Question will be displayed here", SwingConstants.CENTER);
        winningsLabel = new JLabel("Current Winnings: $0", SwingConstants.CENTER);
        topPanel.add(questionLabel, BorderLayout.CENTER);
        topPanel.add(winningsLabel, BorderLayout.SOUTH);
        add(topPanel, BorderLayout.NORTH);

        // Answer buttons
        JPanel answerPanel = new JPanel(new GridLayout(2, 2, 10, 10));
        answerButtons = new JButton[4];
        for (int i = 0; i < answerButtons.length; i++) {
            answerButtons[i] = new JButton();
            answerPanel.add(answerButtons[i]);
        }
        add(answerPanel, BorderLayout.CENTER);

        // Lifeline and control buttons
        JPanel bottomPanel = new JPanel(new FlowLayout());
        fiftyFiftyButton = new JButton("50/50 Lifeline");
        getHintButton = new JButton("Get Hint");
        newQuestionButton = new JButton("New Question");
        restartButton = new JButton("Restart");
        bottomPanel.add(fiftyFiftyButton);
        bottomPanel.add(getHintButton);
        bottomPanel.add(newQuestionButton);
        bottomPanel.add(restartButton);
        add(bottomPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    // ✅ Enables all answer buttons after using 50/50 or for new question
    public void enableAllAnswerButtons() {
        for (JButton answerButton : answerButtons) {
            answerButton.setEnabled(true);
        }
    }

    // Displays the current question and its options
    public void displayQuestion(String question, Map<Character, String> options) {
        questionLabel.setText(question);
        int i = 0;
        for (Map.Entry<Character, String> entry : options.entrySet()) {
            answerButtons[i].setText(entry.getKey() + ": " + entry.getValue());
            answerButtons[i].setActionCommand(String.valueOf(entry.getKey()));
            answerButtons[i].setEnabled(true); // also reset button state here
            i++;
        }
    }

    public void addAnswerListener(ActionListener listener) {
        for (JButton answerButton : answerButtons) {
            answerButton.addActionListener(listener);
        }
    }

    public void addLifelineListener(ActionListener listener) {
        fiftyFiftyButton.addActionListener(listener);
        getHintButton.addActionListener(listener);
        newQuestionButton.addActionListener(listener);
    }

    public void addRestartListener(ActionListener listener) {
        restartButton.addActionListener(listener);
    }

    public void setCurrentWinnings(int amount) {
        winningsLabel.setText("Current Winnings: $" + amount);
    }

    // Disables buttons not included in the 50/50 lifeline response
    public void displayFiftyFiftyOptions(Map<Character, String> remainingOptions) {
        for (JButton answerButton : answerButtons) {
            if (remainingOptions.containsKey(answerButton.getActionCommand().charAt(0))) {
                answerButton.setEnabled(true);
            } else {
                answerButton.setEnabled(false);
            }
        }
    }

    public void reset() {
        questionLabel.setText("Question will be displayed here");
        winningsLabel.setText("Current Winnings: $0");
        for (JButton answerButton : answerButtons) {
            answerButton.setEnabled(true);
            answerButton.setText("");
        }
    }

    public void close() {
        dispose();
    }
}
