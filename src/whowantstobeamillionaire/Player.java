/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whowantstobeamillionaire;

/**
 *
 * @author harshitdhasmana
 */
//public class Player {
//    private String name;
//    private int currentLevel;
//    private int currentWinningAmount; 
//
//    public Player(String name) {
//        this.name = name;
//        this.currentLevel = 0;
//        this.currentWinningAmount = 0;
//    }
//
//    public void increaseLevel() {
//        currentLevel++;
//    }
//
//    public void addWinnings(int amount) {
//        currentWinningAmount += amount;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getCurrentLevel() {
//        return currentLevel;
//    }
//
//    public int getCurrentWinnings() {
//        return currentWinningAmount;
//    }
//}
//


//public class Player {
//    private String name;
//    private int currentLevel;
//    private int currentWinningAmount; 
//
//    public Player(String name) {
//        this.name = name;
//        this.currentLevel = 0;
//        this.currentWinningAmount = 0;
//    }
//
//    public void increaseLevel() {
//        currentLevel++;
//    }
//
//    public void addWinnings(int amount) {
//        currentWinningAmount += amount;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getCurrentLevel() {
//        return currentLevel;
//    }
//
//    public int getCurrentWinnings() {
//        return currentWinningAmount;
//    }
//}



public class Player {
    private String name;
    private int currentLevel;
    private int currentWinningAmount; 

    public Player(String name) {
        this.name = name;
        this.currentLevel = 0;
        this.currentWinningAmount = 0;
    }

    public void increaseLevel() {
        currentLevel++;
    }

    public void addWinnings(int amount) {
        currentWinningAmount += amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) { // New setter method
        this.name = name;
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public int getCurrentWinnings() {
        return currentWinningAmount;
    }
}
