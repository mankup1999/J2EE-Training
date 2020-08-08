
// Create a servlet that forwards the request to one of three different JSP pages, 
// depending on the value of the operation request parameter.
// Say if input is <10 then page 1 or greater than 10 and less than 99 then page 2 otherwise error page

package com.wipro.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Demo2
 */
@WebServlet("/Demo2")
public class Demo2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Demo2() {
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
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String idStr=request.getParameter("input");
		if(idStr==null) {
			request.getRequestDispatcher("Error.jsp").include(request, response);
		}
		else {
			int id=Integer.parseInt(idStr);
			
			if(id<10)
				request.getRequestDispatcher("First.jsp").include(request, response);
			else if(id>10 && id<99)
				request.getRequestDispatcher("Second.jsp").include(request, response);
			else
				request.getRequestDispatcher("Error.jsp").include(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
