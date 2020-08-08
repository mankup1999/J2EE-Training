<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Record</title>
</head>
<body>
	<h1>Choose Employee</h1>
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
	<form action="selectEmployee" method="post">

		Enter Employee Id : <input type="number" name="id" required="required"><br>
		<br> <input type="submit">

	</form>
</body>
</html>