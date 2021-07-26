<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Booking Tickets</title>
</head>
<body>
<jsp:include page="/WEB-INF/views/header.jsp"></jsp:include>
	<%
		String flightId = request.getParameter("flightId");
		String depAir = request.getParameter("depAir");
		String arrAir = request.getParameter("arrAir");
		String depDate = request.getParameter("depDate");
		String arrDate = request.getParameter("arrDate");
		String airline = request.getParameter("airline");
		String price = request.getParameter("price");
	%>
	
	<div id="formdiv">
	<form action="book" method="post">
			
		<label>Flight ID</label> 
		 <input type="text" name="flightId" value="<%= flightId %>" readonly><br>
		<label>Departure Airport</label> 
		 <input type="text" name="depAir" value="<%= depAir %>"readonly><br>
		<label>Arrival Airport</label>
		 <input type="text" name="arrAir" value="<%= arrAir %>"readonly><br>
		<label>Departure Date</label> 
	     <input type="text" name="depDate" value="<%= depDate %>"readonly><br>
		<label>Arrival Date</label> 
		 <input type="text" name="arrDate" value="<%= arrDate %>"readonly><br>
		<label>Airline</label> 
		 <input type="text" name="airline" value="<%= airline %>"readonly><br>
		<label>price</label> 
		 <input type="text" name=price value="<%= price %>"readonly><br>
		<label>Enter your Customer Number</label>
		 <input type="text" name="custNo"><br>
		<label>Choose The Class</label>
		 <select name="tcls">
 			 <option value="Economy">Economy</option>
 			 <option value="Business">Business</option>
		</select> <br><br>
		
		<input type="submit" name="submit" value="Book ticket"><br>
	</form>
	</div>>
</body>
</html>