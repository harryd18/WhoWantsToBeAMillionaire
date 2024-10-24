/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whowantstobeamillionaire;

/**
 *
 * @author harshitdhasmana
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestdatabaseConnection {
    public static void main(String[] args) {
        String dbURL = "jdbc:derby:GameDatabase;create=true"; // Change this if needed
        try (Connection connection = DriverManager.getConnection(dbURL)) {
            System.out.println("Connected to the database.");
        } catch (SQLException e) {
            System.err.println("Failed to connect to the database: " + e.getMessage());
        }
    }
}

