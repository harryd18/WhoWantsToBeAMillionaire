package controllers;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

import views.GameGUI;
import whowantstobeamillionaire.*;

public class Game {
    private GameGUI gui;
    private QuestionList questionList;
    private Questions currentQuestion;

    private FiftyFifty fiftyFifty;
    private GetHint getHint;
    private GetNewQuestion getNewQuestion;

    private PrizeAmount prizeAmount;        // 💰 Manages prize levels
    private int currentWinningAmount;       // 💰 Tracks what player has won
    private int questionCount;              // 🔢 How many questions answered correctly

    public Game(GameGUI gui) {
        this.gui = gui;

        // Initialize lifelines and game logic
        this.questionList = new QuestionList();
        this.fiftyFifty = new FiftyFifty();
        this.getHint = new GetHint();
        this.getNewQuestion = new GetNewQuestion();
        this.prizeAmount = new PrizeAmount();

        // Start state
        this.currentWinningAmount = 0;
        this.questionCount = 1;

        // Display first question
        displayQuestion();

        // Listener for answer buttons
        gui.addAnswerListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleOptionSelected(e.getActionCommand());
            }
        });

        // Listener for restart button
        gui.addRestartListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetGame();
            }
        });

        // Listener for lifelines
        gui.addLifelineListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleLifelineSelected(e.getActionCommand());
            }
        });
    }

    /**
     * Displays a new question if available
     */
    private void displayQuestion() {
        currentQuestion = questionList.getRandomQuestion();

       if (currentQuestion != null) {
            gui.enableAllAnswerButtons();
            Map<Character, String> options = currentQuestion.getOptions();
            gui.displayQuestion(currentQuestion.getQuestion(), options);
        } else {
            JOptionPane.showMessageDialog(gui, "🎉 Congratulations! You’ve completed the game and won $" + currentWinningAmount);
            gui.close();
        }}

    /**
     * Handles when a user selects an answer
     */
    private void handleOptionSelected(String selectedOption) {
        char correctAnswer = currentQuestion.getCorrectAnswer();

        if (selectedOption.length() > 0 && selectedOption.charAt(0) == correctAnswer) {
            // 🎯 Correct Answer — award prize based on how many were answered
            currentWinningAmount = prizeAmount.getPrize(questionCount);
            questionCount++; // increment question level
            gui.setCurrentWinnings(currentWinningAmount);
           // Defer the call to show next question AFTER GUI update
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    displayQuestion();
                }
            });
        } else {
            // ❌ Wrong answer — end game
            showGameOver();
        }
        System.out.println("You clicked: " + selectedOption + ", Correct: " + correctAnswer);

    }

    /**
     * Handles lifeline use
     */
    private void handleLifelineSelected(String selectedLifeline) {
        switch (selectedLifeline) {
            case "50/50 Lifeline":
                Map<Character, String> remainingOptions = fiftyFifty.useLifeline(currentQuestion);
                gui.displayFiftyFiftyOptions(remainingOptions);
                break;

            case "Get Hint":
                String hint = currentQuestion.getHint();
                JOptionPane.showMessageDialog(gui, "Hint: " + hint);
                break;

            case "New Question":
                displayQuestion(); // Skip current question
                break;

            default:
                JOptionPane.showMessageDialog(gui, "Unknown lifeline selected!");
        }
    }

    /**
     * Ends the game and shows final winnings
     */
    private void showGameOver() {
        JOptionPane.showMessageDialog(gui, "Game Over! You've won $" + currentWinningAmount);
        gui.close();
    }

    /**
     * Resets the entire game
     */
    private void resetGame() {
        currentWinningAmount = 0;
        questionCount = 1;
        questionList.resetUsedQuestions();
        gui.reset();
        displayQuestion();
    }

    public static void main(String[] args) {
        GameGUI gui = new GameGUI();
        new Game(gui);
    }
}
