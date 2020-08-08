<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Employee</title>
</head>
<body>
	<h1>Add Employee</h1>
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


	<form action="addEmployee">
		Name : <input name="Name" required="required"><br> <br>
		Gender : <input name="Gender" required="required"><br>
		<br> Designation : <input name="Designation" required="required"><br>
		<br> Salary : <input type="number" name="Salary"
			required="required"><br>
		<br> City : <input name="City" required="required"><br>
		<br> EmailId : <input type="email" name="EmailId"
			required="required"><br>
		<br> MobileNo : <input type="number" name="MobileNo"
			required="required"><br>
		<br> <input type="submit" value="Register">
	</form>
</body>
</html>