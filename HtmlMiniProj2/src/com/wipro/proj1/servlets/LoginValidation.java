package com.wipro.proj1.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.wipro.proj1.DBUtil.DBConnection;

/**
 * Servlet implementation class LoginValidation
 */
@WebServlet("/loginValidation")
public class LoginValidation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginValidation() {
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

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		PrintWriter out = response.getWriter();

		try {
			Connection con = new DBConnection().getConnection();
			PreparedStatement pstmt = con.prepareStatement("select userId,password from userRecords");
			ResultSet res = pstmt.executeQuery();

			String user = "";
			String pass = "";

			if (res.next()) {
				user = res.getString("userId");
				pass = res.getString("password");
			}
			if (username.equals(user) && password.equals(pass)) {

				HttpSession session = request.getSession();
				session.setAttribute("username", username);
				session.setAttribute("password", password);
				response.sendRedirect("Home.jsp");

			} else {
				out.println("<script type=\"text/javascript\">");
				out.println("alert('User or password incorrect');");
				out.println("location='Login.html';");
				out.println("</script>");
			}
		} catch (Exception e) {
			e.printStackTrace();
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
