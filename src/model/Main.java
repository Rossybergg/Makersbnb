package model;

import database.ShowListingsFromDB;

public class Main {

	public static void main(String[] args) {
		ShowListingsFromDB showToDB = new ShowListingsFromDB();
		
		//connect to db
		showToDB.connect();
		 
		//add listing into database
		showToDB.displayListings();
		
		//disconnect from db
		showToDB.disconnect();
	}
}
