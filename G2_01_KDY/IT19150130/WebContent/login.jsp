<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>


	<jsp:include page="/WEB-INF/views/header.jsp"></jsp:include>
	
	<div id="formdiv">
	
	<br><h4 align = "center">Login</h4><br>

	<form action="login" method="post">
	<table>
		<tr>
			<td>User Name</td>
			<td><input type="text" name="uid" placeholder = "Enter Your Username"></td>
		</tr>
		<tr>
			<td>Password</td>
			<td> <input type="password" name="pass" placeholder = "Enter Your Password"></td>
		</tr>	
	</table>
	<input type="submit" name="submit" value="login">
	</form>
	
	
	
	</div>

</body>
</html>