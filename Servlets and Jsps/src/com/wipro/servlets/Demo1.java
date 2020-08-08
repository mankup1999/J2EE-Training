// Create a Servlet that recognizes the first time visitor 
// to a web application and responds by saying "Welcome, you are visiting for the first time".
//
//When the page is visited for the second time, it should say 'Welcome Back'.

package com.wipro.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Demo1
 */
@WebServlet("/Demo1")
public class Demo1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Demo1() {
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
		int num=Integer.parseInt(request.getParameter("num"));
		List<Integer> list=new ArrayList<Integer>();
		for(int i=2;i<num;i++)
			if(prime(i))
				list.add(i);
		
		request.setAttribute("list", list);
		request.getRequestDispatcher("Demo1.jsp").forward(request, response);

	}
	
	public static boolean prime(int x) {
		for(int i=2;i*i<=x;i++)
			if(x%i==0)
				return false;
		return true;
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
