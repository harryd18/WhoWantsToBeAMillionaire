/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whowantstobeamillionaire;

/**
 *
 * @author harshitdhasmana
 */
//import java.util.*;
//
//
//public class Game {
//    private Player player;
//    private QuestionList questionList; 
//    private PrizeAmount prizeAmount; 
//    private List<LifeLine> lifelines;
//    private int currentLevel;
//    private boolean gameActive;
//
//    public Game(Player player) {
//        this.player = player;
//        this.questionList = new QuestionList();
//        this.prizeAmount = new PrizeAmount();
//        this.lifelines = new ArrayList<>();
//        lifelines.add(new FiftyFifty());
//        lifelines.add(new GetHint());
//        lifelines.add(new GetNewQuestion());
//        this.currentLevel = 1;
//        this.gameActive = true;
//    }
//
//    public void startGame() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Welcome " + player.getName() + " to Who Wants to Be a Millionaire?");
//        
//        while (gameActive && currentLevel <= 15) {
//            Questions question = questionList.getRandomQuestion();
//            GameUI.displayQuestion(question, currentLevel);
//            
//             boolean answered = false;
//            while (!answered) {
//                System.out.println("Press 1 to use a lifeline, 0 to quit, or enter your answer (A, B, C, D):");
//                String choice = scanner.nextLine().toUpperCase();
//                
//                
//                if (choice.equals("1")) {
//                    useLifeline(question);
//                } else if (choice.equals("0")) {
//                    gameActive = false;
//                    System.out.println("You've chosen to quit the game. You leave with " + "$" +prizeAmount.getPrizeForLevel(currentLevel - 1));
//                    answered = true; 
//                } else if (choice.matches("[A-D]")) {
//                    char answer = choice.charAt(0);
//                    if (question.isCorrect(answer)) {
//                        player.increaseLevel();
//                        player.addWinnings(prizeAmount.getPrizeForLevel(currentLevel));
//                        currentLevel++;
//                        System.out.println("Correct Answer! You've won " + "$" + player.getCurrentWinnings() + "!");
//                        answered = true;
//                    } else {
//                        gameActive = false;
//                        System.out.println("Incorrect Answer! You leave with " + "$" + prizeAmount.getPrizeForLevel(currentLevel - 1));
//                        answered = true; 
//                    }
//                } else {
//                    System.out.println("Invalid choice. Please enter 1 to use a lifeline, 0 to quit, or your answer (A, B, C, D).");
//                }
//            }
//        }
//        endGame();
//    }
//                
//                
//                
//    
//    private void useLifeline(Questions question) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Available Lifelines:");
//        for (int i = 0; i < lifelines.size(); i++) {
//            System.out.println((i + 1) + ". " + lifelines.get(i).getClass().getSimpleName() + " (Uses Left: " + lifelines.get(i).getUsesLeft() + ")");
//        }
//
//        System.out.print("Choose a lifeline (enter number): ");
//        int lifelineChoice = scanner.nextInt();
//        scanner.nextLine(); 
//
//        if (lifelineChoice > 0 && lifelineChoice <= lifelines.size()) {
//            LifeLine chosenLifeline = lifelines.get(lifelineChoice - 1);
//            chosenLifeline.use(question);  
//        } else {
//            System.out.println("Invalid lifeline choice.");
//        }
//    }
//    
//    
//    
//    
//
//    private void endGame() {
//        System.out.println("Thank you for playing the game! I hope you enjoyed it.");
//    }
//
//    public List<LifeLine> getLifelines() { 
//        return lifelines;
//    }
//
//    public boolean isGameActive() {
//        return gameActive;
//    }
//
//   
//}


///////////////////////////////// 2nd (It works) ////////////////////////////////


//import java.util.*;
//
//
//public class Game {
//    private Player player;
//    private QuestionList questionList; 
//    private PrizeAmount prizeAmount; 
//    private List<LifeLine> lifelines;
//    private int currentLevel;
//    private boolean gameActive;
//
//    public Game(Player player) {
//        this.player = player;
//        this.questionList = new QuestionList();
//        this.prizeAmount = new PrizeAmount();
//        this.lifelines = new ArrayList<>();
//        lifelines.add(new FiftyFifty());
//        lifelines.add(new GetHint());
//        lifelines.add(new GetNewQuestion());
//        this.currentLevel = 1;
//        this.gameActive = true;
//    }
//
//    public void startGame() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Welcome " + player.getName() + " to Who Wants to Be a Millionaire?");
//        
//        while (gameActive && currentLevel <= 15) {
//            Questions question = questionList.getRandomQuestion();
//            GameUI.displayQuestion(question, currentLevel);
//            
//             boolean answered = false;
//            while (!answered) {
//                System.out.println("Press 1 to use a lifeline, 0 to quit, or enter your answer (A, B, C, D):");
//                String choice = scanner.nextLine().toUpperCase();
//                
//                
//                if (choice.equals("1")) {
//                    useLifeline(question);
//                } else if (choice.equals("0")) {
//                    gameActive = false;
//                    System.out.println("You've chosen to quit the game. You leave with " + "$" +prizeAmount.getPrizeForLevel(currentLevel - 1));
//                    answered = true; 
//                } else if (choice.matches("[A-D]")) {
//                    char answer = choice.charAt(0);
//                    if (question.isCorrect(answer)) {
//                        player.increaseLevel();
//                        player.addWinnings(prizeAmount.getPrizeForLevel(currentLevel));
//                        currentLevel++;
//                        System.out.println("Correct Answer! You've won " + "$" + player.getCurrentWinnings() + "!");
//                        answered = true;
//                    } else {
//                        gameActive = false;
//                        System.out.println("Incorrect Answer! You leave with " + "$" + prizeAmount.getPrizeForLevel(currentLevel - 1));
//                        answered = true; 
//                    }
//                } else {
//                    System.out.println("Invalid choice. Please enter 1 to use a lifeline, 0 to quit, or your answer (A, B, C, D).");
//                }
//            }
//        }
//        endGame();
//    }
//                
//                
//                
//    
//    private void useLifeline(Questions question) {
//    Scanner scanner = new Scanner(System.in);
//    boolean validChoice = false;
//
//    while (!validChoice) {
//        try {
//            System.out.println("Available Lifelines:");
//            for (int i = 0; i < lifelines.size(); i++) {
//                System.out.println((i + 1) + ". " + lifelines.get(i).getClass().getSimpleName() + " (Uses Left: " + lifelines.get(i).getUsesLeft() + ")");
//            }
//
//            System.out.print("Choose a lifeline (enter number): ");
//            int lifelineChoice = scanner.nextInt();
//
//            if (lifelineChoice >= 1 && lifelineChoice <= lifelines.size()) {
//                lifelines.get(lifelineChoice - 1).use(question);  // Use the selected lifeline
//                validChoice = true;
//            } else {
//                System.out.println("Invalid choice. Please choose a valid lifeline number.");
//            }
//
//        } catch (InputMismatchException e) {
//            System.out.println("Invalid input. Please enter a valid number.");
//            scanner.next(); // Clear the invalid input
//        }
//    }
//}
//
//    
//    
//    
//    
//
//    private void endGame() {
//        System.out.println("Thank you for playing the game! I hope you enjoyed it.");
//    }
//
//    public List<LifeLine> getLifelines() { 
//        return lifelines;
//    }
//
//    public boolean isGameActive() {
//        return gameActive;
//    }
//
//   
//}



////////////////////////////// 3rd for GUI /////////////////////////



//import java.util.*;
//
//public class Game {
//    private Player player;
//    private QuestionList questionList; 
//    private PrizeAmount prizeAmount; 
//    private List<LifeLine> lifelines;
//    private int currentLevel;
//    private boolean gameActive;
//    private Questions currentQuestion;
//
//    public Game(Player player) {
//        this.player = player;
//        this.questionList = new QuestionList();
//        this.prizeAmount = new PrizeAmount();
//        this.lifelines = new ArrayList<>();
//        lifelines.add(new FiftyFifty());
//        lifelines.add(new GetHint());
//        lifelines.add(new GetNewQuestion());
//        this.currentLevel = 1;
//        this.gameActive = true;
//        this.currentQuestion = questionList.getRandomQuestion();  // Initialize with the first question
//    }
//
//    // Fetch the current question to display on GUI
//    public Questions getCurrentQuestion() {
//        return currentQuestion;
//    }
//
//    // Check if the given answer is correct
//    public boolean checkAnswer(char answer) {
//        return currentQuestion.isCorrect(answer);
//    }
//
//    // Get the player object
//    public Player getPlayer() {
//        return player;
//    }
//
//    public void startGame() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Welcome " + player.getName() + " to Who Wants to Be a Millionaire?");
//        
//        while (gameActive && currentLevel <= 15) {
//            currentQuestion = questionList.getRandomQuestion(); // Fetch a new question
//            GameUI.displayQuestion(currentQuestion, currentLevel);
//            
//            boolean answered = false;
//            while (!answered) {
//                System.out.println("Press 1 to use a lifeline, 0 to quit, or enter your answer (A, B, C, D):");
//                String choice = scanner.nextLine().toUpperCase();
//                
//                if (choice.equals("1")) {
//                    useLifeline(currentQuestion);
//                } else if (choice.equals("0")) {
//                    gameActive = false;
//                    System.out.println("You've chosen to quit the game. You leave with " + "$" +prizeAmount.getPrizeForLevel(currentLevel - 1));
//                    answered = true; 
//                } else if (choice.matches("[A-D]")) {
//                    char answer = choice.charAt(0);
//                    if (checkAnswer(answer)) {
//                        player.increaseLevel();
//                        player.addWinnings(prizeAmount.getPrizeForLevel(currentLevel));
//                        currentLevel++;
//                        System.out.println("Correct Answer! You've won " + "$" + player.getCurrentWinnings() + "!");
//                        answered = true;
//                    } else {
//                        gameActive = false;
//                        System.out.println("Incorrect Answer! You leave with " + "$" + prizeAmount.getPrizeForLevel(currentLevel - 1));
//                        answered = true; 
//                    }
//                } else {
//                    System.out.println("Invalid choice. Please enter 1 to use a lifeline, 0 to quit, or your answer (A, B, C, D).");
//                }
//            }
//        }
//        endGame();
//    }
//
//    private void useLifeline(Questions question) {
//        // Lifeline handling logic...
//    }
//
//    private void endGame() {
//        System.out.println("Thank you for playing the game! I hope you enjoyed it.");
//    }
//}


///////////////////////////////// 4th /////////////////////////////

//import java.util.*;
//
//public class Game {
//    private Player player;
//    private QuestionList questionList; 
//    private PrizeAmount prizeAmount; 
//    private List<LifeLine> lifelines;
//    private int currentLevel;
//    private boolean gameActive;
//    private Questions currentQuestion;
//
//    public Game(Player player) {
//        this.player = player;
//        this.questionList = new QuestionList();
//        this.prizeAmount = new PrizeAmount();
//        this.lifelines = new ArrayList<>();
//        lifelines.add(new FiftyFifty());
//        lifelines.add(new GetHint());
//        lifelines.add(new GetNewQuestion());
//        this.currentLevel = 1;
//        this.gameActive = true;
//        this.currentQuestion = questionList.getRandomQuestion();  // Initialize with the first question
//    }
//    
//     public PrizeAmount getPrizeAmount() {
//        return prizeAmount;
//    }
//
//    // Fetch the current question to display on GUI
//    public Questions getCurrentQuestion() {
//        return currentQuestion;
//    }
//
//    // Check if the given answer is correct
//    public boolean checkAnswer(char answer) {
//        return currentQuestion.isCorrect(answer);
//    }
//
//    // Get the player object
//    public Player getPlayer() {
//        return player;
//    }
//
//    public void nextQuestion() {
//        if (currentLevel <= 15) {
//            currentQuestion = questionList.getRandomQuestion(); // Fetch a new question
//        } else {
//            gameActive = false; // End game logic when levels exceed
//        }
//    }
//
//    public boolean isGameActive() {
//        return gameActive;
//    }
//
//    public void increasePlayerLevel() {
//        player.increaseLevel();
//        currentLevel++;
//    }
//
//    public int getCurrentLevel() {
//        return currentLevel;
//    }
//
//    public void endGame() {
//        System.out.println("Thank you for playing the game! I hope you enjoyed it.");
//    }
//}
//





////////////////////// 5th ///////////////////


import java.util.*;

public class Game {
    private Player player;
    private QuestionList questionList; 
    private PrizeAmount prizeAmount; 
    private List<LifeLine> lifelines;
    private int currentLevel;
    private boolean gameActive;
    private Questions currentQuestion;

    public Game(Player player) {
        this.player = player;
        this.questionList = new QuestionList();
        this.prizeAmount = new PrizeAmount();
        this.lifelines = new ArrayList<>();
        lifelines.add(new FiftyFifty());
        lifelines.add(new GetHint());
        lifelines.add(new GetNewQuestion());
        this.currentLevel = 1;
        this.gameActive = true;
        this.currentQuestion = questionList.getRandomQuestion();  // Initialize with the first question
    }

    // Fetch the current question to display on GUI
    public Questions getCurrentQuestion() {
        return currentQuestion;
    }

    // Check if the given answer is correct
    public boolean checkAnswer(char answer) {
        return currentQuestion.isCorrect(answer);
    }

    // Get the player object
    public Player getPlayer() {
        return player;
    }

    public void initGame(GameGUI gui) {
        // Start the game logic through the GUI
        while (gameActive && currentLevel <= 15) {
            currentQuestion = questionList.getRandomQuestion(); // Fetch a new question
            gui.updateQuestion(currentQuestion); // Update GUI with new question
            gui.setCurrentLevel(currentLevel); // Update level in GUI
            gui.setWinningAmount(player.getCurrentWinnings()); // Update winnings in GUI
            
            // Wait for the answer to be selected
            gui.waitForAnswer(answer -> {
                if (answer.equals("0")) { // If user quits
                    gameActive = false;
                    System.out.println("You've chosen to quit the game. You leave with " + "$" + prizeAmount.getPrizeForLevel(currentLevel - 1));
                    gui.displayMessage("You've chosen to quit. Your winnings: $" + prizeAmount.getPrizeForLevel(currentLevel - 1));
                } else {
                    char selectedAnswer = answer.charAt(0);
                    if (checkAnswer(selectedAnswer)) {
                        player.increaseLevel();
                        player.addWinnings(prizeAmount.getPrizeForLevel(currentLevel));
                        currentLevel++;
                        gui.displayMessage("Correct Answer! You've won $" + player.getCurrentWinnings() + "!");
                    } else {
                        gameActive = false;
                        gui.displayMessage("Incorrect Answer! You leave with $" + prizeAmount.getPrizeForLevel(currentLevel - 1));
                    }
                }
            });
        }
        endGame();
    }

    private void endGame() {
        System.out.println("Thank you for playing the game! I hope you enjoyed it.");
    }
}


