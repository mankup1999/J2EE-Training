<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Change Password : <%= session.getAttribute("username") %></title>
</head>
<body>
	<form action="changePassword">
	Enter old Password :<input name="oldPassword"><br>
	Enter new Password :<input name="newPassword"><br>
	Enter confirm Password :<input name="confirmPassword"><br>
	<input type="submit" value="update"> 
	</form>
</body>
</html>