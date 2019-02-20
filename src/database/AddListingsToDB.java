package database;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddListingsToDB extends DatabaseConnection {
	
	public void insertListing (String name, String description, int price) {
		System.out.println(name + description + price +"inserted into listing table");
		
		try {
			PreparedStatement listing = dbConnection.prepareStatement("INSERT INTO listings ("
					+ "name, description, price)"
					+ "VALUES (?,?,?)");
			
				listing.setString(1, name);
				listing.setString(2, description);
				listing.setInt(3, price);
				listing.executeUpdate();
				listing.close();
				
		} catch (SQLException e) {
			e.printStackTrace();
		}
				
		}

}
