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
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class QuestionList {
    private List<Questions> questions; // List to hold questions
    private Set<Integer> usedIndexes;
    private Random random; // Random instance to get random questions

    public QuestionList() {
        this.questions = new ArrayList<>(); // Initialize the questions list
        this.usedIndexes = new HashSet<>();
        this.random = new Random(); // Initialize the random instance
        loadQuestions(); // Load questions into the list
    }

    // Method to load questions into the list
    private void loadQuestions() {
        questions.add(new Questions(
            "In which year did the Titanic sink?", 
            "1912", 
            "1905", 
            "1898", 
            "1920", 
            'A', 
            700, 
            "It was on its maiden voyage."
        ));
        
        questions.add(new Questions(
            "What is the capital of France?", 
            "Paris", 
            "London", 
            "Berlin", 
            "Madrid", 
            'A', 
            100, 
            "The city is known as the City of Lights."
        ));
        
        questions.add(new Questions(
            "Which planet is known as the Red Planet?", 
            "Earth", 
            "Mars", 
            "Jupiter", 
            "Saturn", 
            'B', 
            300, 
            "It's named after the Roman god of war."
        ));
        
        questions.add(new Questions(
            "Who wrote 'Romeo and Juliet'?", 
            "Charles Dickens", 
            "Mark Twain", 
            "William Shakespeare", 
            "J.K. Rowling", 
            'C', 
            500, 
            "He is often called England's national poet."
        ));
        
        questions.add(new Questions(
            "What is the largest mammal in the world?", 
            "Elephant", 
            "Blue Whale", 
            "Giraffe", 
            "Great White Shark", 
            'B', 
            800, 
            "It can weigh as much as 200 tons."
        ));
        
        questions.add(new Questions(
            "Which element has the chemical symbol 'O'?", 
            "Oxygen", 
            "Gold", 
            "Silver", 
            "Hydrogen", 
            'A', 
            600, 
            "Essential for respiration in living organisms."
        ));
        
        questions.add(new Questions(
            "What year did World War II end?", 
            "1945", 
            "1944", 
            "1939", 
            "1950", 
            'A', 
            900, 
            "It was a global conflict that lasted from 1939 to 1945."
        ));
        
        questions.add(new Questions(
            "What is the hardest natural substance on Earth?", 
            "Gold", 
            "Diamond", 
            "Iron", 
            "Platinum", 
            'B', 
            200, 
            "Used in jewelry and industrial cutting tools."
        ));
        
        questions.add(new Questions(
            "Which country is known as the Land of the Rising Sun?", 
            "China", 
            "Japan", 
            "Thailand", 
            "South Korea", 
            'B', 
            400, 
            "It's an island nation in East Asia."
        ));
        
        questions.add(new Questions(
            "What is the main ingredient in guacamole?", 
            "Tomato", 
            "Avocado", 
            "Pepper", 
            "Onion", 
            'B', 
            150, 
            "This fruit is known for its creamy texture."
        ));
        
        questions.add(new Questions(
            "Which ocean is the largest in the world?",
            "Atlantic Ocean",
            "Indian Ocean",
            "Pacific Ocean",
            "Arctic Ocean",
            'C',
            1000,
            "It covers more than 30% of Earth's surface."
        ));
        
        
        questions.add(new Questions(
            "Who painted the Mona Lisa?",
            "Leonardo da Vinci",
            "Pablo Picasso",
            "Vincent van Gogh",
            "Claude Monet",
            'A',
            2000,
            "The artist was also an inventor and engineer."
        ));
      
        questions.add(new Questions(
            "How many continents are there on Earth?",
            "Five",
            "Six",
            "Seven",
            "Eight",
            'C',
            4000,
            "Includes Asia, Africa, Europe..."
        ));
        
        
        questions.add(new Questions(
            "What gas do plants absorb from the atmosphere?",
            "Oxygen",
            "Carbon Dioxide",
            "Nitrogen",
            "Hydrogen",
            'B',
            8000,
            "It's essential for photosynthesis."
        ));

        questions.add(new Questions(
            "What is the smallest prime number?",
            "0",
            "1",
            "2",
            "3",
            'C',
            16000,
            "It's the only even prime number."
        ));
        
        questions.add(new Questions(
            "Which language is the most widely spoken in the world?",
            "Spanish",
            "Mandarin Chinese",
            "English",
            "Hindi",
            'B',
            32000,
            "It has the most native speakers globally."
        ));
        
        questions.add(new Questions(
            "Which is the only planet that rotates clockwise?",
            "Earth",
            "Venus",
            "Uranus",
            "Mars",
            'B',
            125000,
            "It's sometimes called Earth's twin, but it spins backward."
        ));

        
        questions.add(new Questions(
            "Who was the first person to walk on the moon?",
            "Buzz Aldrin",
            "Yuri Gagarin",
            "Neil Armstrong",
            "Michael Collins",
            'C',
            250000,
            "He famously said: 'That's one small step for man...'"
        ));
    }

    // Method to get a random, unused question from the list
    public Questions getRandomQuestion() {
        if (usedIndexes.size() == questions.size()) {
            return null; // All questions have been used
        }

        int index;
        do {
            index = random.nextInt(questions.size());
        } while (usedIndexes.contains(index));

        usedIndexes.add(index);
        return questions.get(index);
    }

    //  reset question usage (if needed for replay)
    public void resetUsedQuestions() {
        usedIndexes.clear();
    }

    // Return all questions if needed
    public List<Questions> getQuestions() {
        return questions;
    }
}


