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
    private List<Questions> questions; // List to hold questions
    private Random random; // Random instance to get random questions

    public QuestionList() {
        this.questions = new ArrayList<>(); // Initialize the questions list
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
    }

    // Method to get a random question from the list
    public Questions getRandomQuestion() {
        if (questions.isEmpty()) {
            return null; // Handle case where there are no questions
        }
        int randomIndex = random.nextInt(questions.size()); // Generate a random index
        return questions.get(randomIndex); // Return the question at that index
    }

    // Method to return all questions (if needed)
    public List<Questions> getQuestions() {
        return questions;
    }
}


