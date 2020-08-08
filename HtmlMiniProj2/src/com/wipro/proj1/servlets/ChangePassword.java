package com.wipro.proj1.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.wipro.proj1.DBUtil.DBConnection;

/**
 * Servlet implementation class ChangePassword
 */
@WebServlet("/changePassword")
public class ChangePassword extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ChangePassword() {
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

		HttpSession session = request.getSession();
		String password = (String) session.getAttribute("password");

		String oldPassword = request.getParameter("oldPassword");
		String newPassword = request.getParameter("newPassword");
		String confirmPassword = request.getParameter("confirmPassword");

		PrintWriter out = response.getWriter();

		if (newPassword.equals(confirmPassword) == false) {
			out.println("<script type=\"text/javascript\">");
			out.println("alert('new password and confirm password do not match');");
			out.println("location='ChangePassword.jsp';");
			out.println("</script>");
		}

		else if (password.equals(oldPassword) == false) {
			out.println("<script type=\"text/javascript\">");
			out.println("alert('please type old password correctly');");
			out.println("location='ChangePassword.jsp';");
			out.println("</script>");
		}

		else {
			try {
				String userId=(String)request.getSession().getAttribute("username");
				Connection con=new DBConnection().getConnection();
				PreparedStatement pstmt=con.prepareStatement("update userRecords set password=? where userId=?");
				pstmt.setString(1, newPassword);
				pstmt.setString(2, userId);
				
				pstmt.executeUpdate();
				
				out.println("<script type=\"text/javascript\">");
				out.println("alert('password updated successfully');");
				out.println("location='Login.html';");
				out.println("</script>");
			}
			catch(Exception e) {
				e.printStackTrace();
			}

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
