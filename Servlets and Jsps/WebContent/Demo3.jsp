<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Demo3</title>
</head>
<body>
	<%! public static long fact(int n){
		
		long f=1;
		for(int i=1;i<=n;i++)
			f*=i;
		return f;
	}
		
		%>
	<table>
		<tr>
			<th>No.</th>
			<th>Factorial</th>
		</tr>
		<%
		for(int i=1;i<=10;i++){
			%>
			<tr>
				<td><% out.println(i); %></td>
				<td><% out.println(fact(i)); %></td>
			</tr>
			<% 
		}
		%>
	</table>
</body>
</html>