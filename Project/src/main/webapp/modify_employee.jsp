<%@page import="com.wipro.hibernate.app.App"%>
<%@page import="com.wipro.hibernate.bean.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Employee</title>
</head>
<body>
	<%
		int id = -1;
		if (session.getAttribute("id") != null) {
			id = (Integer) session.getAttribute("id");
			out.print(id);
		}

		else {
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Login Please');");
			out.println("location='index.jsp';");
			out.println("</script>");
		}
		if(id!=-1){
		Employee emp=new App().selectEmployee(id);
	%>
	<form action="modifyEmployeeInfo">
	Name : <input name="Name" value="<%= emp.getName()%>" required="required"><br>
	Gender : <input name="Gender" value="<%= emp.getGender()%>" required="required"><br>
	Designation : <input name="Designation" value="<%= emp.getDesignation()%>" required="required"><br>
	Salary : <input type="number" name="Salary" value="<%= emp.getSalary()%>" required="required"><br>
	City : <input name="City" value="<%= emp.getCity()%>" required="required"><br>
	EmailId : <input type="email" name="EmailId" value="<%= emp.getEmailId()%>" required="required"><br>
	MobileNo : <input type="number" name="MobileNo" value="<%= emp.getMobileNo()%>" required="required"><br>
	<input type="submit" value="Update">
	</form>
	<%
		}
	%>
</body>
</html>