/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package whowantstobeamillionaire;
package controllers;

import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import views.GameGUI;
import whowantstobeamillionaire.Database;
import whowantstobeamillionaire.Questions;

/**
 *
 * @author harshitdhasmana
 */


import whowantstobeamillionaire.Database;
import whowantstobeamillionaire.Questions;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Map;
import views.GameGUI;
import whowantstobeamillionaire.FiftyFifty;
import whowantstobeamillionaire.GetHint;
import whowantstobeamillionaire.GetNewQuestion;

public class Game {
    private Database database;
    private List<Questions> questions;
    private int currentQuestionIndex;
    private int currentWinningAmount;
    private GameGUI gui;
    private FiftyFifty fiftyFifty;
    private GetHint getHint;
    private GetNewQuestion getNewQuestion;

    public Game(GameGUI gui) {
        this.gui = gui;
        database = new Database();
        database.initialize();

        questions = database.fetchQuestionsFromDB();
        currentQuestionIndex = 0;
        currentWinningAmount = 0;

        fiftyFifty = new FiftyFifty();
        getHint = new GetHint();
        getNewQuestion = new GetNewQuestion();

        displayQuestion();

        gui.addAnswerListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleOptionSelected(e.getActionCommand());
            }
        });

        gui.addRestartListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetGame();
            }
        });

        gui.addLifelineListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleLifelineSelected(e.getActionCommand());
            }
        });
    }

    private void displayQuestion() {
        if (currentQuestionIndex < questions.size()) {
            Questions currentQuestion = questions.get(currentQuestionIndex);
            Map<Character, String> options = currentQuestion.getOptions();
            gui.displayQuestion(currentQuestion.getQuestion(), options);
        } else {
            showGameOver();
        }
    }

    private void handleOptionSelected(String selectedOption) {
        Questions currentQuestion = questions.get(currentQuestionIndex);
        char correctAnswer = currentQuestion.getCorrectAnswer();

        if (selectedOption.length() > 0 && selectedOption.charAt(0) == correctAnswer) {
            currentWinningAmount += currentQuestion.getPrizeAmount();
            gui.setCurrentWinnings(currentWinningAmount);
            currentQuestionIndex++;
            displayQuestion();
        } else {
            showGameOver();
        }
    }

    private void handleLifelineSelected(String selectedLifeline) {
        Questions currentQuestion = questions.get(currentQuestionIndex);

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
                currentQuestionIndex++;
                displayQuestion();
                break;
            default:
                JOptionPane.showMessageDialog(gui, "Unknown lifeline selected!");
        }
    }

    private void showGameOver() {
        JOptionPane.showMessageDialog(gui, "Game Over! You've won $" + currentWinningAmount);
        gui.close();
    }

    private void resetGame() {
        currentWinningAmount = 0;
        currentQuestionIndex = 0;
        gui.reset();
        displayQuestion();
    }

    public static void main(String[] args) {
        GameGUI gui = new GameGUI();
        new Game(gui);
    }
}
