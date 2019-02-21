package controllers;

import java.io.IOException;
import java.sql.DriverManager;
import java.util.concurrent.TimeUnit;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.AddListingsToDB;

/**
 * Servlet implementation class NewListing
 */
@WebServlet("/NewListing")
public class NewListing extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewListing() {
        super();
        
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.sendRedirect("NewListing.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// parameters from form
		String name = request.getParameter("name");
		String description = request.getParameter("description");
		String price = request.getParameter("price");
		
		//create new database object
		AddListingsToDB addToDB = new AddListingsToDB();
		
		//connect to db
		addToDB.connect();
		addToDB.connect();


		System.out.println("connected");

		//add listing into database
		addToDB.insertListing(name, description, Integer.parseInt(price));
	
		//disconnect from db
		addToDB.disconnect();

		//complete load
		response.sendRedirect("HomePage.jsp");
	}

}
