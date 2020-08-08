<%@page import="com.wipro.bin.Employee1"%>
<%@page import="java.util.List"%>
<%@page import="com.wipro.service.EmployeeService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show All Employees</title>
</head>
<body>
	<%
		List<Employee1> list= new EmployeeService().showAll();
			int n=list.size();
			if(n==0){
		out.println("No Records Found");
			}
			else{
	%>
			<center>
			<h1>Employees Details</h1>
			<table>
				<tr>
					<th>EmpID</th>
					<th>EmpName</th>
					<th>Designation</th>
				</tr>
				<%
					for(int i=0;i<n;i++){
								Employee1 emp=list.get(i);
								out.println("<tr>");
								out.println("<td>"+emp.getId()+"</td>");
								out.println("<td>"+emp.getName()+"</td>");
								out.println("<td>"+emp.getDesignation()+"</td>");
								out.println("</tr>");
							}
				%>
			</table>
			</center>
			<% 
		}
	%>
</body>
</html>