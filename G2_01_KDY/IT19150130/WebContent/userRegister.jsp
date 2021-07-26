<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Join Now</title>
</head>
<body>

<jsp:include page="/WEB-INF/views/header.jsp"></jsp:include>

<div id="formdiv">

<br><h4 align = "center">Create New Account</h4><br>

<form action="register" method="post">

		First Name <input type="text" name="fname"><br><br>
		
		Last Name <input type="text" name="lname"><br><br>
		
		User Name <input type="text" name="uname"><br><br>
		
		Password <input type="password" name="psw"><br><br>
		
		NIC <input type="text" name="nic"><br><br>
		
		Phone Number <input type="text" name="phone"><br><br>
		
		Email <input type="text" name="email"><br><br>
		
		Address <input type="text" name="address"><br><br>
		
		
		<input type="submit" name="submit" value="Create Account">
		
	</form>
	
</div>	

</body>
</html>