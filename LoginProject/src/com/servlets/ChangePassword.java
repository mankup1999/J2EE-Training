package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.UserBean;
import com.service.UserService;

/**
 * Servlet implementation class ChangePassword
 */
@WebServlet("/change")
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
		response.sendRedirect("login.html");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String newPassword = request.getParameter("newPassword");

		UserBean user = new UserBean();
		user.setUsername(username);
		user.setPassword(password);

		UserService service = new UserService();

		boolean flag = service.validateUser(user);

		PrintWriter out = response.getWriter();

		if (flag) {
			service.updateUser(user, newPassword);
			out.println("<script type=\"text/javascript\">");
			out.println("alert('user password changed ...');");
			out.println("location='login.html';");
			out.println("</script>");
		}

		else {
			out.println("<script type=\"text/javascript\">");
			out.println("alert('user credentials invalid');");
			out.println("location='login.html';");
			out.println("</script>");
		}

	}

}
