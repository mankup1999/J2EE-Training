<%@page import="com.wipro.bin.Employee1"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert Employee</title>
</head>
<body>
	<%
		int id=Integer.parseInt(request.getParameter("id"));
			String name=request.getParameter("name");
			String designation=request.getParameter("designation");
			
			Employee1 emp=new Employee1();
			emp.setId(id);
			emp.setName(name);
			emp.setDesignation(designation);
			
			request.setAttribute("emp", emp);
			request.getRequestDispatcher("insert").forward(request, response);
	%>
</body>
</html>