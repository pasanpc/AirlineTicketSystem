<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search My Bookings</title>
</head>
<body>
<jsp:include page="/WEB-INF/views/header.jsp"></jsp:include>
	
	<div id="formdiv">
	<form action="book" method="post">
			
		<label>Enter your Customer Number</label>
		 <input type="text" name="custNo"><br>

 		<br><br>
		
		<input type="submit" name="submit" value="See My Tickets"><br>
	</form>
	</div>>
</body>
</html>