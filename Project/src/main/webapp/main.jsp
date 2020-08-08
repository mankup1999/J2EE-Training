<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hibernate Project</title>
</head>
<body>
	<h1>Main Page</h1>
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
	%>
	<a href="add_employee.jsp">ADD Employee</a>
	<br>
	<br>
	<a href="delete_employee.jsp">DELETE Employee</a>
	<br>
	<br>
	<a href="modify_employee.jsp">MODIFY Employee</a>
	<br>
	<br>
	<a href="select_employee.jsp">SELECT Employee by id</a>
	<br>
	<br>
	<a href="selectAllEmployee">SELECT ALL Employee</a>
	<br>
	<br>
</body>
</html>