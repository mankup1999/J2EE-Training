<%@page import="com.bean.UserBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
	<%
		UserBean user=(UserBean)session.getAttribute("user");
		if(user==null){
			response.sendRedirect("login.html");
		}
	%>
	
	<h1>Hello <%= user.getUsername() %></h1>
</body>
</html>