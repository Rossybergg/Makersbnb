package database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ShowListingsFromDB extends DatabaseConnection {
	
	public List<String> displayListings () {
		
		List<String> listingsWithInfo = new ArrayList<String>();
		
		
		try {
			String sql = "SELECT * FROM listings";
			PreparedStatement listings = dbConnection.prepareStatement(sql);
			ResultSet all_listings = listings.executeQuery();
			
			while (all_listings.next()) {
				listingsWithInfo.add("Title: " + all_listings.getString(2) + " description: " + all_listings.getString(3) + " price: " + all_listings.getString(4));			
			}
		}
		
		catch (SQLException e) {
			e.printStackTrace();
		}
		return listingsWithInfo;
	}

}