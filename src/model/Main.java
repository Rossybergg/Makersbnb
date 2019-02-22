package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;

import database.ShowListingsFromDB;

public class Main {

	public static void main(String[] args) {
		ShowListingsFromDB showToDB = new ShowListingsFromDB();
		
		//connect to db
		showToDB.connect();
		 
		//add listing into database
		showToDB.findFromId("1");
		
		//disconnect from db
		showToDB.disconnect();
		

		
	}
}
