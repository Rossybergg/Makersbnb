package database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

public class ShowListingsFromDB extends DatabaseConnection {

	public List<String> displayListings() {

		List<String> listingsWithInfo = new ArrayList<String>();

		try {
			String sql = "SELECT * FROM listings";
			PreparedStatement listings = dbConnection.prepareStatement(sql);
			ResultSet all_listings = listings.executeQuery();

			while (all_listings.next()) {
				listingsWithInfo.add("Title: " + all_listings.getString(2) + " description: "
						+ all_listings.getString(3) + " price: " + all_listings.getString(4));
			}
		}

		catch (SQLException e) {
			e.printStackTrace();
		}
		return listingsWithInfo;
	}

	public  HashMap<String, String> displayTitleListings () {
		
		HashMap<String, String> listingsTitles = new HashMap<String,String>();
		
		try {
			String sql = "SELECT * FROM listings";
			PreparedStatement listings = dbConnection.prepareStatement(sql);
			ResultSet all_listings = listings.executeQuery();
			
			while (all_listings.next()) {
				listingsTitles.put(all_listings.getString(1), all_listings.getString(2));		
			}
		}
		
		catch (SQLException e) {
			e.printStackTrace();
		}
		return listingsTitles;
		
		
	}

	public void findFromTitle(String title) {

		List<String> listing = new ArrayList<String>();

		try {
			String sql = "SELECT name, description, price FROM listings WHERE name = \"" + title + "\"";
			PreparedStatement listings = dbConnection.prepareStatement(sql);
			ResultSet all_listings = listings.executeQuery();

			while (all_listings.next()) {
				listing.add(all_listings.getString(2));
				listing.add(all_listings.getString(3));
				listing.add(all_listings.getString(4));
			}
		}

		catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println(listing);
	}

}