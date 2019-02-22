package database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class QueryUserTable extends DatabaseConnection {
	
	// Returns list of usernames
	public List<String> allUsers() {
		
		List<String> listOfUsers = new ArrayList<String>();
		
		try {
			String sql = "SELECT username FROM users";
			PreparedStatement users = dbConnection.prepareStatement(sql);
			ResultSet databaseResponse = users.executeQuery();
			
			while (databaseResponse.next()) {
				listOfUsers.add(databaseResponse.getString(1));			
			}
		}
		
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		return listOfUsers;
	}
	
	// Predicate method checking that username passed in as argument is found in db
	public boolean isUsernameValid(String username) {
		return this.allUsers().contains(username) ? true : false;
	}
	
	// Predicate method checking that password is valid for username
	public boolean isPasswordValid(String username, String password) {
		String actualPassword = "";
		
		try {
			String sql = "SELECT password from users WHERE username = '" + username +"';";
			PreparedStatement users = dbConnection.prepareStatement(sql);
			ResultSet databaseResponse = users.executeQuery();
			
			while (databaseResponse.next()) {
				actualPassword += (databaseResponse.getString(1));			
			}

		}
		
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		return actualPassword.equals(password);
	}
	
	// Connects to database and adds row for user
	public void addUser(String first_name, String surname, String username, String password) {
		this.connect();
		this.connect();
		
		try {
			String sql = "INSERT INTO 'public'.'users' ('username', 'first_name', 'surname', 'password') VALUES ('"
					+ first_name + "', '"
					+ surname + "', '"
					+ username + "', '"
					+ surname +"');";
			dbConnection.prepareStatement(sql);
		}
		
		catch (SQLException e) {
			e.printStackTrace();
		}
		this.disconnect();
	}
	
}
