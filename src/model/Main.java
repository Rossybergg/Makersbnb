package model;

import database.AddListingsToDB;

public class Main {

	public static void main(String[] args) {
		AddListingsToDB addToDB = new AddListingsToDB();
		
		//connect to db
		addToDB.connect();
		 
		//add listing into database
		addToDB.insertListing("test place", "Is a lovely place", 100);
		
		//disconnect from db
		addToDB.disconnect();
	}
}
