/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whowantstobeamillionaire;

/**
 *
 * @author harshitdhasmana
 */

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Database {
    private Connection connection;

    public Database() {
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            connection = DriverManager.getConnection("jdbc:derby:GameDatabase;create=true");
            System.out.println("Connected to the database.");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Failed to connect to the database: " + e.getMessage());
        }
    }

    public void initialize() {
        try (Statement stmt = connection.createStatement()) {
            ResultSet rs = stmt.executeQuery("SELECT * FROM SYS.SYSTABLES WHERE TABLENAME = 'QUESTIONS'");
            if (rs.next()) {
                System.out.println("QUESTIONS table already exists.");
            } else {
                stmt.executeUpdate("CREATE TABLE QUESTIONS (" +
                        "ID INT PRIMARY KEY GENERATED ALWAYS AS IDENTITY, " +
                        "QUESTION VARCHAR(255), " +
                        "OPTION_A VARCHAR(255), " +
                        "OPTION_B VARCHAR(255), " +
                        "OPTION_C VARCHAR(255), " +
                        "OPTION_D VARCHAR(255), " +
                        "CORRECT_ANSWER CHAR(1), " +
                        "PRIZE_AMOUNT INT, " +
                        "HINT VARCHAR(255))");
                insertSampleQuestions();
                System.out.println("QUESTIONS table created successfully.");
            }
        } catch (SQLException e) {
            System.out.println("Error initializing QUESTIONS table: " + e.getMessage());
        }
    }

    private void insertSampleQuestions() {
        String insertSQL = "INSERT INTO QUESTIONS (QUESTION, OPTION_A, OPTION_B, OPTION_C, OPTION_D, CORRECT_ANSWER, PRIZE_AMOUNT, HINT) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = connection.prepareStatement(insertSQL)) {
            Object[][] sampleQuestions = {
                    {"What is the capital of France?", "Paris", "London", "Berlin", "Madrid", "A", 1000, "Known as the City of Light"},
                    {"What is 2 + 2?", "3", "4", "5", "6", "B", 500, "Basic arithmetic"},
                    // Add more sample questions as needed
            };

            for (Object[] questionData : sampleQuestions) {
                pstmt.setString(1, (String) questionData[0]);
                pstmt.setString(2, (String) questionData[1]);
                pstmt.setString(3, (String) questionData[2]);
                pstmt.setString(4, (String) questionData[3]);
                pstmt.setString(5, (String) questionData[4]);
                pstmt.setString(6, (String) questionData[5]);
                pstmt.setInt(7, (Integer) questionData[6]);
                pstmt.setString(8, (String) questionData[7]);
                pstmt.executeUpdate();
            }
            System.out.println("Sample questions inserted.");
        } catch (SQLException e) {
            System.out.println("Error inserting sample questions: " + e.getMessage());
        }
    }

    public List<Questions> fetchQuestionsFromDB() {
        List<Questions> questionList = new ArrayList<>();
        String selectSQL = "SELECT * FROM QUESTIONS";

        try (Statement stmt = connection.createStatement(); ResultSet rs = stmt.executeQuery(selectSQL)) {
            while (rs.next()) {
                String questionText = rs.getString("QUESTION");
                Map<Character, String> options = new HashMap<>();
                options.put('A', rs.getString("OPTION_A"));
                options.put('B', rs.getString("OPTION_B"));
                options.put('C', rs.getString("OPTION_C"));
                options.put('D', rs.getString("OPTION_D"));
                char correctAnswer = rs.getString("CORRECT_ANSWER").charAt(0);
                int prizeAmount = rs.getInt("PRIZE_AMOUNT");
                String hint = rs.getString("HINT");

                Questions question = new Questions(
                        questionText,
                        options.get('A'),
                        options.get('B'),
                        options.get('C'),
                        options.get('D'),
                        correctAnswer,
                        prizeAmount,
                        hint
                );

                questionList.add(question);
            }
        } catch (SQLException e) {
            System.out.println("Error fetching questions: " + e.getMessage());
        }
        return questionList;
    }

    public void close() {
        try {
            if (connection != null) {
                connection.close();
                System.out.println("Database connection closed.");
            }
        } catch (SQLException e) {
            System.out.println("Error closing the database connection: " + e.getMessage());
        }
    }
}
