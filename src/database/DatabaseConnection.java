package database;

import java.sql.*;

public class DatabaseConnection {
	
	/* -01 Variables */
	String jdbUrl = "jdbc:postgresql://localhost:5432/makersbnb";

	String username = "sauleguzyte";
	String password = "";
	
	/* -02 Database variables */
	Connection dbConnection = null;
	Statement dbQuery = null;
	ResultSet dbResponse = null;
	
	/* -03 Constructor */
	public DatabaseConnection() {
	}
	
	/**
	 * Connect to database
	 */
	
	public void connect () {
		// Connect to database
		try {
			dbConnection = DriverManager.getConnection(jdbUrl, username, password);
			
			// Print success
			System.out.println("Database connection established");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	} // connect
	
	/**
	 *  Disconnect from Database
	 */
	
	public void disconnect () {
		try {
			if (dbQuery != null) {
				dbQuery.close();
			}
			
			if (dbConnection != null) {
				dbConnection.close();
			}
			
			if (dbResponse != null) {
				dbResponse.close();
			}
			
			System.out.println("Database connection disestablished");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}