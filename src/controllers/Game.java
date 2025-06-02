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
    private int questionsAnswered = 0;

    private FiftyFifty fiftyFifty;
    private GetHint getHint;
    private GetNewQuestion getNewQuestion;
    private boolean usedFiftyFifty = false;
    private boolean usedGetHint = false;
    private boolean usedNewQuestion = false;
    private boolean isAnsweringAllowed = true;


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
        // Correct Answer — award prize based on how many were answered
        questionsAnswered++; //increment answered count
        currentWinningAmount = prizeAmount.getPrize(questionsAnswered);
        gui.setCurrentWinnings(currentWinningAmount);
        questionCount++; //increment question level
        
        if (questionsAnswered == 15) {
        //All questions answered final win!
        JOptionPane.showMessageDialog(gui, "Congratulations! You’ve completed the game and won $" + currentWinningAmount);
        gui.close(); // or call the custom game over method
        return;
}
        SwingUtilities.invokeLater(() -> displayQuestion());
    } else {
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
            if (!usedFiftyFifty) {
                Map<Character, String> remainingOptions = fiftyFifty.useLifeline(currentQuestion);
                gui.displayFiftyFiftyOptions(remainingOptions);
                usedFiftyFifty = true;
            } else {
                JOptionPane.showMessageDialog(gui, "You have already used the 50/50 lifeline.");
            }
            break;

            case "Get Hint":
            if (!usedGetHint) {
                String hint = currentQuestion.getHint();
                JOptionPane.showMessageDialog(gui, "Hint: " + hint);
                usedGetHint = true;
            } else {
                JOptionPane.showMessageDialog(gui, "You have already used the Get Hint lifeline.");
            }
            break;

          case "New Question":
                if (!usedNewQuestion) {
                    usedNewQuestion = true;
                    displayQuestion();
                } else {
                    JOptionPane.showMessageDialog(gui, "You have already used the New Question lifeline.");
                }
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
    isAnsweringAllowed = true;
    usedFiftyFifty = false;
    usedGetHint = false;
    usedNewQuestion = false;
    questionsAnswered = 0;
    questionList.resetUsedQuestions();
    gui.reset();
    displayQuestion();
}


    public static void main(String[] args) {
        GameGUI gui = new GameGUI();
        new Game(gui);
    }
}
