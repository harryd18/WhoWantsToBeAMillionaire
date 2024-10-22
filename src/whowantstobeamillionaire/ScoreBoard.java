/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whowantstobeamillionaire;

/**
 *
 * @author harshitdhasmana
 */
import java.util.HashSet;
import java.util.Set;
public class ScoreBoard {
    private Set<Player> players;
    
     public ScoreBoard() { 
        players = new HashSet<>();
    }
      public void addPlayerScore(Player player) {
        players.add(player);
    }
      public void displayScoreboard() { 
        System.out.println("Scoreboard:");
        players.forEach(player -> System.out.println(player.getName() + ": " + player.getCurrentWinnings()));
    }
    
}
