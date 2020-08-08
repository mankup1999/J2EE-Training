package com.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.AuctionBean;

/**
 * Servlet implementation class AuctionServlet
 */
@WebServlet("/processBid")
public class AuctionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuctionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.sendRedirect("index.html");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		
		int itemId=Integer.parseInt(request.getParameter("itemId"));
		String itemName=request.getParameter("itemName");
		String yourName=request.getParameter("yourName");
		String emailId=request.getParameter("emailId");
		double amountBid=Double.parseDouble(request.getParameter("amountBid"));
		boolean autoInc=true;
		if(request.getParameter("autoInc")==null) {
			autoInc=false;
		}
		
		AuctionBean auctionBean = new AuctionBean();
		auctionBean.setItemId(itemId);
		auctionBean.setItemName(itemName);
		auctionBean.setYourName(yourName);
		auctionBean.setEmailId(emailId);
		auctionBean.setAmountBid(amountBid);
		auctionBean.setAutoInc(autoInc);
		
		HttpSession session=request.getSession();
		session.setAttribute("auctionBean", auctionBean);
		response.sendRedirect("show.jsp");
		
	}

}
