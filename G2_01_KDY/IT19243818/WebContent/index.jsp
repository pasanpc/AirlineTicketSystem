<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body >

<jsp:include page="/WEB-INF/views/header.jsp"></jsp:include>
	
	<div id="formdiv">
	<form action="flights" method="post">
		<label>Departure Airport</label>
		 <input type="text" name="depair"><br><br>
		<label>Destination Airport </label>
		 <input type="text" name="desair"><br><br>
		<label>Departure Date </label>
		 <input type="date" name="depDate"><br><br>
		<label>Arrival Date</label>
		 <input type="date" name="arrDate"><br><br>
		
		<input type="submit" name="submit" value="See flights">
	</form>
	</div>

</body>
</html>