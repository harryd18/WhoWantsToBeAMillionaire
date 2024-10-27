/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whowantstobeamillionaire;

/**
 *
 * @author harshitdhasmana
 */

public class Player {
    private String name;
    private int currentWinnings;
    private int level;
    private int id; 

    public Player(String name, int id) {
        this.name = name;
        this.currentWinnings = 0;
        this.level = 1;
        this.id = id;
    }

    public void addWinnings(int amount) {
        this.currentWinnings += amount;
    }

    public void increaseLevel() {
        this.level++;
    }

    public String getName() {
        return name;
    }
    
     public int getId() {  
        return id;
    }

    public int getCurrentWinnings() {
        return currentWinnings;
    }

    public int getLevel() {
        return level;
    }
}

