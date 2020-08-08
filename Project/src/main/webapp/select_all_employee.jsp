<%@page import="com.wipro.hibernate.bean.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All employees</title>
</head>
<body>
	<h1>Employees Information</h1>
	<%
		int id = -1;
		if (session.getAttribute("id") != null) {
			id = (Integer) session.getAttribute("id");
		}

		else {
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Login Please');");
			out.println("location='index.jsp';");
			out.println("</script>");
		}

		if (session.getAttribute("emps") != null) {
			List<Employee> emps = (List<Employee>) session.getAttribute("emps");
			for (Employee e : emps) {
				out.println(e+"<br>");
			}
		}
	%>
</body>
</html>