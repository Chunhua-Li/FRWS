/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataaccesslayer;

/**
 *
 * @author lchca
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



/**
 * Manages the connection to the database using the Singleton Design Pattern.
 * This class ensures that only one instance of the database connection is created throughout the execution of the program.
 */

public class DBConnection {
	
	private static Connection connection = null;
        private static DBConnection instance = null;
	
	private String serverUrl = "jdbc:mysql://localhost:3306/fwrp";
	private String userString = "root";
	private String passwordString = "wxl780319";
	private String driverString = "com.mysql.cj.jdbc.Driver";
        
    /**
     * Private constructor to prevent external instantiation.
     * Loads the JDBC driver and establishes the database connection.
     */
        private DBConnection() {
            try {
                // Load the JDBC driver
                Class.forName(driverString);
                // Establish the database connection
                connection = DriverManager.getConnection(serverUrl, userString, passwordString);
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }

    /**
     * Gets the single instance of the database connection.
     * @return The database connection instance.
     */
        public static Connection getConnection() {
            if (instance == null) {
                instance = new DBConnection();
            }
            return connection;
    }
	
}