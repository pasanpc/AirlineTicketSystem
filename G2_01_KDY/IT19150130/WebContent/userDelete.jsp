<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile Delete</title>
</head>
<body>

<jsp:include page="/WEB-INF/views/header.jsp"></jsp:include>

	<%
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String username = request.getParameter("uname");
		String nic = request.getParameter("nic");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		String password = request.getParameter("password");
	%>
	
<div id="formdiv">
	
	<br><h4 align = "center">Profile Delete</h4><br>
	
	<form action="delete" method="post">

	First Name <input type = "text" name = "fname" value = "<%=fname%>" disabled> <br><br>
	Last Name <input type = "text" name = "lname" value = "<%=lname%>"disabled> <br><br>
	User Name <input type = "text" name = "uname" value = "<%=username%>" readonly> <br><br>
	NIC <input type = "text" name = "nic" value = "<%=nic%>"disabled> <br><br>
	Phone Number <input type = "text" name = "phone" value = "<%=phone%>"disabled> <br><br>
	Email <input type = "text" name = "email" value = "<%=email%>"disabled> <br><br>
	Address <input type = "text" name = "address" value = "<%=address%>"disabled> <br><br>
	
	<br><h2>Please Confirm that you want to Delete the Account</h2><br>
	
	<input type="submit" name="submit" value="Confirm Delete">
	

</form>

</div>

</body>
</html>