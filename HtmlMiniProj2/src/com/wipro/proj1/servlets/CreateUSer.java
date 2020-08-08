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

import com.wipro.proj1.DBUtil.DBConnection;

/**
 * Servlet implementation class CreateUSer
 */
@WebServlet("/createUser")
public class CreateUSer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateUSer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String userId=(String)request.getParameter("userId");
		String password=(String)request.getParameter("password");
		String date=(String)request.getParameter("date");
		String gender=(String)request.getParameter("gender");
		String state=(String)request.getParameter("state");
		String contact=(String)request.getParameter("contact");
		String address=(String)request.getParameter("address");
		
		Connection con=new DBConnection().getConnection();
		if(con!=null) {
			try {
				PreparedStatement pstmt=con.prepareStatement("insert into userRecords(userId,password,date,gender,state,contact,address)"
						+ "values (?,?,?,?,?,?,?)");
				pstmt.setString(1, userId);
				pstmt.setString(2, password);
				pstmt.setString(3, date);
				pstmt.setString(4, gender);
				pstmt.setString(5, state);
				pstmt.setString(6, contact);
				pstmt.setString(7, address);
				
				pstmt.executeUpdate();
				
				PrintWriter out=response.getWriter();
				out.println("<script type=\"text/javascript\">");
				out.println("alert('User successfully');");
				out.println("location='Login.html';");
				out.println("</script>");
				
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
