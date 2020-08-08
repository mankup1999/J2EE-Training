<%@page import="com.bean.AuctionBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show Auction</title>
</head>
<body>
	<%
		AuctionBean auctionBean=(AuctionBean)session.getAttribute("auctionBean");
		if(auctionBean==null){
			response.sendRedirect("index.html");
		}
	%>
	
	<center>
		<div style="background-color: yellow;padding-bottom: 50px;">
			<h1>Bid Submitted</h1>
			<p style="font-size: 14px;">Your bid is now active. If your bid is successful, you will be notified within 24 hours of the close of bidding</p>
			<table style="border: 1px white solid;">
				<tr><th style="background-color: black;color:white;border: 1px white solid;"><%= auctionBean.getItemName() %></th></tr>
				<tr><th style="border: 1px white solid;">Item ID: <%= auctionBean.getItemId() %></th></tr>
				<tr><th style="border: 1px white solid;">Name: <%= auctionBean.getYourName() %></th></tr>
				<tr><th style="border: 1px white solid;">Email address: <%= auctionBean.getEmailId() %></th></tr>
				<tr><th style="border: 1px white solid;">Bid Price: Rs<%= auctionBean.getAmountBid() %></th></tr>
				<tr><th style="border: 1px white solid;">Auto-increment: <%= auctionBean.getAutoInc() %></th></tr>
			</table>
		</div>
	</center>
	
</body>
</html>