<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete Employee</title>
</head>
<body>
	<%
		int id=Integer.parseInt(request.getParameter("id"));
		
		request.setAttribute("id", id);
		request.getRequestDispatcher("delete").forward(request, response);
		
	%>
</body>
</html>