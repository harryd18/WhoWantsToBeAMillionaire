/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whowantstobeamillionaire;

/**
 *
 * @author harshitdhasmana
 */
import java.util.*;

public class Game {
    private Player player;
    private QuestionsList questionsList; //QuestionBank
    private PrizeAmount prizeAmount; //PrizeStructure
    private List<Lifeline> lifelines;
    private int currentLevel;
    private boolean gameActive;

    public Game(Player player) {
        this.player = player;
        this.questionsList = new QuestionsList();
        this.prizeAmount = new PrizeAmount();
        this.lifelines = new ArrayList<>();
        lifelines.add(new FiftyFifty());
        lifelines.add(new GetHint());
        lifelines.add(new GetNewQuestion());
        this.currentLevel = 1;
        this.gameActive = true;
    }

    public void startGame() {
        System.out.println("Welcome " + player.getName() + " to Who Wants to Be a Millionaire?");
        while (gameActive && currentLevel <= 15) {
            Question question = questionBank.getRandomQuestion();
            GameUI.displayQuestion(question, currentLevel);
            char answer = InputHandler.getAnswerChoice();
            if (question.isCorrect(answer)) {
                player.increaseLevel();
                player.addWinnings(prizeStructure.getPrizeForLevel(currentLevel));
                currentLevel++;
                System.out.println("Correct! You've won " + player.getCurrentWinnings() + "!" + "Congratulations !!!!");
            } else {
                gameActive = false;
                System.out.println("Incorrect! You leave with " + prizeStructure.getPrizeForLevel(currentLevel - 1));
            }
        }
        endGame();
    }

    private void endGame() {
        System.out.println("Thank you for playing!");
    }

    public List<Lifeline> getLifelines() {
        return lifelines;
    }

    public boolean isGameActive() {
        return gameActive;
    }
}

