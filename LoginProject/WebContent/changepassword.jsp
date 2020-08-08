<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Change Password</title>
</head>
<body>
	<script type="text/javascript">
		function validate() {

			var password = document.getElementById("password").value;
			var RetypePassword = document.getElementById("retypePassword").value;

			if (password == RetypePassword) {
				return true;
			}

			alert("Passwords do not match. Plz try it again ...");
			return false;
		}
	</script>
	<div style="margin: 5% 20% 5% 40%;">
		<h1>Create New User ...</h1>
		<form action="change" method="post" onsubmit="return validate()">
			Username : <input name="username" required="required"><br>
			<br> Old Password : <input type="password" name="password"
				required="required"><br> <br> New Password : <input
				type="password" name="newPassword" id="password" required="required"><br>
			<br> Retype Password : <input type="password"
				id="retypePassword" required="required"><br> <br>
			<input type="submit" value="change">
		</form>
	</div>

</body>
</html>