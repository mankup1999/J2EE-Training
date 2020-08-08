<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Demo1</title>
</head>
<body>
	<jsp:useBean id="emp" class="com.wipro.bean.Employee"></jsp:useBean>
	<jsp:setProperty property="*" name="emp" />
	Employee Salary :
	<jsp:getProperty property="salary" name="emp" /><br>

</body>
</html>