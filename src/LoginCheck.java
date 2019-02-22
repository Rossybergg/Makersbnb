
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.QueryUserTable;

/**
 * Servlet implementation class LoginCheck
 */
@WebServlet("/LoginCheck")
public class LoginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginCheck() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String uname = request.getParameter("uname");
		String password = request.getParameter("password");
		QueryUserTable qut = new QueryUserTable();
		qut.connect();
		qut.connect();
		if (qut.isUsernameValid(uname)) {
			if (qut.isPasswordValid(uname, password)) {
				qut.disconnect();
				response.sendRedirect("HomePage.jsp");
			} else {
				request.setAttribute("failmessage",
						"The username and password you entered did not match our records. Please double-check and try again.");
				RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
				qut.disconnect();
				rd.include(request, response);
			}
		} else {
			request.setAttribute("failmessage",
					"The username and password you entered did not match our records. Please double-check and try again.");
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			qut.disconnect();
			rd.include(request, response);
		}
	}

}
