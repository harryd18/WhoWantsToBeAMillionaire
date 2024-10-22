/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whowantstobeamillionaire;

/**
 *
 * @author harshitdhasmana
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class QuestionList {
    
    private List<Questions> questions;
    
    public QuestionList(){
        questions = new ArrayList<>();
        
        questions.add(new Questions("What is the capital of France?", Map.of('A', "Paris", 'B', "London", 'C', "Berlin", 'D', "Madrid"), 'A', "It's known as the city of love."));
        
        questions.add(new Questions("What is the capital of Japan?", Map.of('A', "Osaka", 'B', "Hokkaido", 'C', "Tokyo", 'D', "Kyoto"), 'C', "It has a very famous Tower named after the city."));
        
        questions.add(new Questions("Which organ pumps blood throughout the human body?", Map.of('A', "Lungs", 'B', "Heart", 'C', "Brain", 'D', "Intestine"), 'B', "It's often associated with love."));
        
        questions.add(new Questions("What is the largest planet in our solar system?", Map.of('A', "Saturn", 'B', "Pluto", 'C', "Jupiter", 'D', "Uranus"), 'C', "It's named after the king of the Roman gods."));
        
        questions.add(new Questions("What is the chemical symbol for the element with the atomic number 79?", Map.of('A', "Au(Gold)", 'B', "Ag(Silver)", 'C', "Cu(Copper)", 'D', "K(Potassium)"), 'A', "This element is precious and often used in jewelry."));
        
        questions.add(new Questions("Who was the first woman to win a Nobel Prize?", Map.of('A', "Donna Strickland", 'B', "Mother Teresa", 'C', "Andrea Ghez", 'D', "Marie Curie"), 'D', "She was a physicist and chemist known for her work on radioactivity."));
        
        questions.add(new Questions("In what year was the United Nations founded?", Map.of('A', "1942", 'B', "1968", 'C', "1947", 'D', "1945"), 'D', "It was shortly after the end of World War II."));
        
        questions.add(new Questions("Which country has the most natural lakes in the world?", Map.of('A', "USA", 'B', "New Zealand", 'C', "Canada", 'D', "Denmark"), 'C', "It's the second-largest country by land area."));
        
        questions.add(new Questions("Which country has the most natural lakes in the world?", Map.of('A', "USA", 'B', "New Zealand", 'C', "Canada", 'D', "Denmark"), 'C', "It's the second-largest country by land area."));
        
        questions.add(new Questions("What is the name of the toy cowboy in Toy Story?", Map.of('A', "Woody", 'B', "Jessie", 'C', "Rex", 'D', "Buzz Lightyear"), 'A', "His best friend is a space ranger."));
        
        questions.add(new Questions("What is the hardest natural substance on Earth?", Map.of('A', "Diamond", 'B', "Gold", 'C', "Copper", 'D', "Aluminium"), 'A', "Its often found in engagement rings."));
        
        questions.add(new Questions("Which famous structure in Egypt is one of the Seven Wonders of the Ancient World?", Map.of('A', "Taj Mahal", 'B', "The Great Pyramid of Giza", 'C', "The Colosseum", 'D', "Petra"), 'B', "It's a massive triangular monument."));
        
        questions.add(new Questions("Who developed the theory of general relativity?", Map.of('A', "Isaac Newton", 'B', "Lussac Gay", 'C', "Thomas Edison", 'D', "Albert Einstein"), 'D', "He had a famous equation, E=mc²."));
        
        questions.add(new Questions("Which Football Club has won the most UEFA Champions League titles?", Map.of('A', "F.C Barcelona", 'B', "Real Madrid", 'C', "Manchester United", 'D', "Atletico Madrid"), 'B', "Cristiano Ronaldo used to play for this club"));
        
        questions.add(new Questions("Which Football Club did Lionel Messi moved to after transferring from P.S.G?", Map.of('A', "F.C Barcelona", 'B', "Real Madrid", 'C', "Inter Miami", 'D', "Al-Hilal"), 'C', "David Beckham owns this club."));
        
        
        
        
    }
    
    public Questions getRandomQuestion() {
        return questions.get(new Random().nextInt(questions.size()));
    }

    
    
    
    
}
