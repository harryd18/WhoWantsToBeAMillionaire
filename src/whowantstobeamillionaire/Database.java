/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whowantstobeamillionaire;

/**
 *
 * @author harshitdhasmana
 */


//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class Database {
//    
//    public static final String DB_URL = "jdbc:derby:who_wants_to_be_a_millionaire;create=true"; 
//
//    public static void initialize() {
//        try (Connection conn = DriverManager.getConnection(DB_URL);
//             Statement stmt = conn.createStatement()) {
//            // Create tables
//            stmt.execute("CREATE TABLE Questions ("
//                    + "id INT PRIMARY KEY, "
//                    + "question VARCHAR(255), "
//                    + "answer_a VARCHAR(255), "
//                    + "answer_b VARCHAR(255), "
//                    + "answer_c VARCHAR(255), "
//                    + "answer_d VARCHAR(255), "
//                    + "correct_answer CHAR(1), "
//                    + "prize_amount INT)");
//
//            stmt.execute("CREATE TABLE Players ("
//                    + "id INT PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1), "
//                    + "name VARCHAR(100), "
//                    + "current_winnings INT DEFAULT 0, "
//                    + "level INT DEFAULT 1)");
//
//            stmt.execute("CREATE TABLE Scores ("
//                    + "player_id INT, "
//                    + "winnings INT, "
//                    + "FOREIGN KEY (player_id) REFERENCES Players(id))");
//
//            // Insert sample questions
//            stmt.execute("INSERT INTO Questions VALUES "
//                    + "(1, 'What is the capital of France?', 'Paris', 'London', 'Berlin', 'Rome', 'A', 100), "
//                    + "(2, 'Which planet is known as the Red Planet?', 'Mars', 'Earth', 'Venus', 'Jupiter', 'A', 200)");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }   
//}


////////// DB ///////

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.ArrayList;
//import java.util.List;
//
//public class Database {
//    public static final String DB_URL = "jdbc:derby:your_database_name;create=true"; // Change this to your actual database name
//
//    public List<Questions> fetchQuestionsFromDB() {
//        List<Questions> questions = new ArrayList<>();
//        try (Connection conn = DriverManager.getConnection(DB_URL);
//             Statement stmt = conn.createStatement();
//             ResultSet rs = stmt.executeQuery("SELECT * FROM Questions")) {
//            
//            while (rs.next()) {
//                String questionText = rs.getString("question");
//                String optionA = rs.getString("answer_a");
//                String optionB = rs.getString("answer_b");
//                String optionC = rs.getString("answer_c");
//                String optionD = rs.getString("answer_d");
//                char correctAnswer = rs.getString("correct_answer").charAt(0); // Assuming correct_answer is stored as a single char
//                String hint = rs.getString("hint");
//
//                // Ensure questionText and options are not null or empty
//                if (questionText != null && !questionText.isEmpty()) {
//                    questions.add(new Questions(questionText, optionA, optionB, optionC, optionD, correctAnswer, hint));
//                }
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return questions;
//    }
//    
//    
//    public static void initialize() {
//        String createTableSQL = "CREATE TABLE Questions ("
//                + "id INT PRIMARY KEY GENERATED ALWAYS AS IDENTITY,"
//                + "question VARCHAR(255),"
//                + "answer_a VARCHAR(255),"
//                + "answer_b VARCHAR(255),"
//                + "answer_c VARCHAR(255),"
//                + "answer_d VARCHAR(255),"
//                + "correct_answer CHAR(1),"
//                + "prize_amount INT,"
//                + "hint VARCHAR(255))"; // Include hint in the create statement
//
//        try (Connection conn = DriverManager.getConnection(DB_URL);
//             Statement stmt = conn.createStatement()) {
//
//            // Check if the table already exists
//            ResultSet rs = stmt.executeQuery("SELECT * FROM SYS.SYSTABLES WHERE TABLENAME = 'QUESTIONS'");
//            if (!rs.next()) { // If no result, the table does not exist
//                stmt.executeUpdate(createTableSQL);
//            }
//
//            // Check if the 'hint' column exists
//            ResultSet columnCheck = stmt.executeQuery("SELECT * FROM Questions WHERE 1=0");
//            boolean hintExists = false;
//
//            if (columnCheck.getMetaData().getColumnCount() > 0) {
//                for (int i = 1; i <= columnCheck.getMetaData().getColumnCount(); i++) {
//                    if ("HINT".equalsIgnoreCase(columnCheck.getMetaData().getColumnName(i))) {
//                        hintExists = true;
//                        break;
//                    }
//                }
//            }
//
//            // Add the 'hint' column if it doesn't exist
//            if (!hintExists) {
//                stmt.executeUpdate("ALTER TABLE Questions ADD COLUMN hint VARCHAR(255)");
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    // You can add more methods for handling other database operations, such as inserting questions,
//    // fetching player scores, etc.
//}







//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class Database {
//
//    private static final String DB_URL = "jdbc:derby:GameDatabase"; // Update this if needed
//    private static final String USERNAME = "app"; // Default user for Derby
//    private static final String PASSWORD = "app"; // Default password for Derby
//
//    public static Connection connect() {
//        Connection conn = null;
//        try {
//            conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
//            System.out.println("Database connected successfully.");
//        } catch (SQLException e) {
//            System.out.println("Failed to connect to the database: " + e.getMessage());
//        }
//        return conn;
//    }
//
//    public static void createQuestionsTable(Connection conn) {
//        String createTableSQL = "CREATE TABLE QUESTIONS ("
//                + "id INT PRIMARY KEY, "
//                + "question VARCHAR(255), "
//                + "answer VARCHAR(255))";
//        try (Statement stmt = conn.createStatement()) {
//            stmt.executeUpdate(createTableSQL);
//            System.out.println("QUESTIONS table created.");
//        } catch (SQLException e) {
//            // Check for the specific error code for table already exists
//            if (e.getSQLState().equals("42X05")) { // Table already exists
//                System.out.println("QUESTIONS table already exists.");
//            } else {
//                System.out.println("Error creating table: " + e.getMessage());
//            }
//        }
//    }
//
//    public static void fetchQuestionsFromDB(Connection conn) {
//        String query = "SELECT * FROM QUESTIONS";
//        try (Statement stmt = conn.createStatement();
//             ResultSet rs = stmt.executeQuery(query)) {
//            while (rs.next()) {
//                int id = rs.getInt("id");
//                String question = rs.getString("question");
//                String answer = rs.getString("answer");
//                System.out.println("ID: " + id + ", Question: " + question + ", Answer: " + answer);
//            }
//        } catch (SQLException e) {
//            System.out.println("Error fetching questions: " + e.getMessage());
//        }
//    }
//    
//    
//
//
//    
//    public static void initialize() {
//    Connection conn = connect();
//    if (conn != null) {
//        createQuestionsTable(conn);
//        // Add any other initialization tasks here
//        try {
//            conn.close();
//        } catch (SQLException e) {
//            System.out.println("Error closing connection: " + e.getMessage());
//        }
//    }
//}
//    
//     
//    
//
//
//    public static void main(String[] args) {
//        Connection conn = connect();
//        if (conn != null) {
//            createQuestionsTable(conn);
//            fetchQuestionsFromDB(conn);
//            try {
//                conn.close();
//            } catch (SQLException e) {
//                System.out.println("Error closing connection: " + e.getMessage());
//            }
//        }
//    }
//
//    public List<Questions> fetchQuestionsFromDB() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//}




//import java.sql.*;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class Database {
//    private static final String DB_URL = "jdbc:derby:GameDatabase;create=true"; // Update as necessary
//    private Connection connection;
//
//    public void initialize() {
//        try {
//            connection = DriverManager.getConnection(DB_URL);
//            System.out.println("Connected to the database.");
//
//            // Create the QUESTIONS table if it doesn't exist
//            createQuestionsTable();
//            // Optionally, you can populate the table with default questions if needed
//        } catch (SQLException e) {
//            System.out.println("Failed to connect to the database: " + e.getMessage());
//            e.printStackTrace();
//        }
//    }
//
//   private void createQuestionsTable() {
//    String createTableSQL = "CREATE TABLE QUESTIONS ("
//            + "ID INT PRIMARY KEY GENERATED ALWAYS AS IDENTITY, "
//            + "QUESTION VARCHAR(255), "
//            + "OPTION_A VARCHAR(255), "
//            + "OPTION_B VARCHAR(255), "
//            + "OPTION_C VARCHAR(255), "
//            + "OPTION_D VARCHAR(255), "
//            + "CORRECT_ANSWER CHAR(1), "
//            + "PRIZE_AMOUNT INT)";
//
//    try (Statement stmt = connection.createStatement()) {
//        stmt.executeUpdate(createTableSQL);
//        System.out.println("QUESTIONS table created.");
//    } catch (SQLException e) {
//        // Use getSQLState() for more reliable error handling
//        if ("42X05".equals(e.getSQLState())) { // Table already exists
//            System.out.println("QUESTIONS table already exists.");
//        } else {
//            System.out.println("Error creating QUESTIONS table: " + e.getMessage());
//        }
//    }
//}
//
//
//    public void insertQuestion(String question, Map<Character, String> options, char correctAnswer, int prizeAmount) {
//        String insertSQL = "INSERT INTO QUESTIONS (QUESTION, OPTION_A, OPTION_B, OPTION_C, OPTION_D, CORRECT_ANSWER, PRIZE_AMOUNT) VALUES (?, ?, ?, ?, ?, ?, ?)";
//
//        try (PreparedStatement pstmt = connection.prepareStatement(insertSQL)) {
//            pstmt.setString(1, question);
//            pstmt.setString(2, options.get('A'));
//            pstmt.setString(3, options.get('B'));
//            pstmt.setString(4, options.get('C'));
//            pstmt.setString(5, options.get('D'));
//            pstmt.setString(6, String.valueOf(correctAnswer));
//            pstmt.setInt(7, prizeAmount);
//            pstmt.executeUpdate();
//            System.out.println("Question inserted successfully.");
//        } catch (SQLException e) {
//            System.out.println("Error inserting question: " + e.getMessage());
//        }
//    }
//
//    public List<Questions> fetchQuestionsFromDB() {
//    List<Questions> questionList = new ArrayList<>();
//    String selectSQL = "SELECT * FROM QUESTIONS";
//
//    try (Statement stmt = connection.createStatement(); ResultSet rs = stmt.executeQuery(selectSQL)) {
//        while (rs.next()) {
//            String questionText = rs.getString("QUESTION");
//            Map<Character, String> options = new HashMap<>();
//            options.put('A', rs.getString("OPTION_A"));
//            options.put('B', rs.getString("OPTION_B"));
//            options.put('C', rs.getString("OPTION_C"));
//            options.put('D', rs.getString("OPTION_D"));
//            char correctAnswer = rs.getString("CORRECT_ANSWER").charAt(0); // Assuming single character
//            int prizeAmount = rs.getInt("PRIZE_AMOUNT");
//
//            // Ensure this constructor matches your Questions class
//            Questions question = new Questions(question, options, correctAnswer, prizeAmount, hint);
//            questionList.add(question);
//        }
//    } catch (SQLException e) {
//        System.out.println("Error fetching questions: " + e.getMessage());
//    }
//
//    return questionList;
//}
//
//
//    public void close() {
//        try {
//            if (connection != null && !connection.isClosed()) {
//                connection.close();
//                System.out.println("Database connection closed.");
//            }
//        } catch (SQLException e) {
//            System.out.println("Error closing the database connection: " + e.getMessage());
//        }
//    }
//}

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Database {
    private Connection connection;

    public Database() {
    try {
        // Load the Derby database driver
        Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        // Create or connect to the database
        connection = DriverManager.getConnection("jdbc:derby:GameDatabase");
        System.out.println("Connected to the database.");
    } catch (ClassNotFoundException | SQLException e) {
        System.out.println("Failed to connect to the database: " + e.getMessage());
    }
}


//    public void initialize() {
//        createQuestionsTable();
//        insertSampleQuestions();
//    }
    
    
    public void initialize() {
    try {
        Statement stmt = connection.createStatement();
        
        // Check if the QUESTIONS table already exists
        ResultSet rs = stmt.executeQuery("SELECT * FROM SYS.SYSTABLES WHERE TABLENAME = 'QUESTIONS'");
        if (rs.next()) {
            System.out.println("QUESTIONS table already exists.");
        } else {
            // Create the QUESTIONS table if it doesn't exist
            stmt.executeUpdate("CREATE TABLE QUESTIONS ("
                    + "ID INT PRIMARY KEY GENERATED ALWAYS AS IDENTITY, "
                    + "QUESTION VARCHAR(255), "
                    + "OPTIONS VARCHAR(255), "
                    + "CORRECT_ANSWER CHAR(1), "
                    + "PRIZE_AMOUNT INT, "
                    + "HINT VARCHAR(255))");
            System.out.println("QUESTIONS table created successfully.");
        }

        // Insert sample questions into the table
        insertSampleQuestions();
        
    } catch (SQLException e) {
        System.out.println("Error creating QUESTIONS table: " + e.getMessage());
    }
}

    
    
    
    

    private void createQuestionsTable() {
        String createTableSQL = "CREATE TABLE QUESTIONS ("
                + "ID INT PRIMARY KEY GENERATED ALWAYS AS IDENTITY, "
                + "QUESTION VARCHAR(255), "
                + "OPTION_A VARCHAR(255), "
                + "OPTION_B VARCHAR(255), "
                + "OPTION_C VARCHAR(255), "
                + "OPTION_D VARCHAR(255), "
                + "CORRECT_ANSWER CHAR(1), "
                + "PRIZE_AMOUNT INT, "
                + "HINT VARCHAR(255))"; // Added HINT column

        try (Statement stmt = connection.createStatement()) {
            stmt.executeUpdate(createTableSQL);
            System.out.println("QUESTIONS table created.");
        } catch (SQLException e) {
            if ("42X05".equals(e.getSQLState())) { // Table already exists
                System.out.println("QUESTIONS table already exists.");
            } else {
                System.out.println("Error creating QUESTIONS table: " + e.getMessage());
            }
        }
    }

    private void insertSampleQuestions() {
        String insertSQL = "INSERT INTO QUESTIONS (QUESTION, OPTION_A, OPTION_B, OPTION_C, OPTION_D, CORRECT_ANSWER, PRIZE_AMOUNT, HINT) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = connection.prepareStatement(insertSQL)) {
            // Sample question data
            String[] questions = {
                "What is the capital of France?|Paris|London|Berlin|Madrid|A|1000|It's known as the City of Lights.",
                "What is 2 + 2?|3|4|5|6|B|1000|It's the first even number.",
                "What is the color of the sky?|Blue|Green|Red|Yellow|A|1000|It's the color of the ocean."
            };

            for (String q : questions) {
                String[] parts = q.split("\\|");
                pstmt.setString(1, parts[0]); // QUESTION
                pstmt.setString(2, parts[1]); // OPTION_A
                pstmt.setString(3, parts[2]); // OPTION_B
                pstmt.setString(4, parts[3]); // OPTION_C
                pstmt.setString(5, parts[4]); // OPTION_D
                pstmt.setString(6, parts[5]); // CORRECT_ANSWER
                pstmt.setInt(7, Integer.parseInt(parts[6])); // PRIZE_AMOUNT
                pstmt.setString(8, parts[7]); // HINT

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
                char correctAnswer = rs.getString("CORRECT_ANSWER").charAt(0); // Assuming single character
                int prizeAmount = rs.getInt("PRIZE_AMOUNT");
                String hint = rs.getString("HINT"); // Fetching hint

                Questions question = new Questions(questionText, options, correctAnswer, prizeAmount, hint);
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

