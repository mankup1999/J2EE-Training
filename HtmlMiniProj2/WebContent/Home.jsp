<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home page</title>
</head>
<body>
	<center>
		<h1>Home Page</h1>
		<h2>Welcome to <%= session.getAttribute("username") %><a href="ChangePassword.jsp">Change Password</a></h2>
	</center>
</body>
</html>