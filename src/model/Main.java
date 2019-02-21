package model;

import database.AddListingsToDB;

public class Main {

	public static void main(String[] args) {
		AddListingsToDB addToDB = new AddListingsToDB();
		
		//connect to db
		addToDB.connect();
		 
		//add listing into database
		addToDB.insertListing("testdsfsd place", "Is a losdfsdvely place", 1001);
		
		//disconnect from db
		addToDB.disconnect();
	}
}
