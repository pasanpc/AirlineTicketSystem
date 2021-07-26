<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update My Ticket</title>
</head>
<body>
<jsp:include page="/WEB-INF/views/header.jsp"></jsp:include>

	<%
	String ticketId = request.getParameter("ticketId");
	String flightId = request.getParameter("flightId");
	String depAir = request.getParameter("depAir");
	String arrAir = request.getParameter("arrAir");
	String depDate = request.getParameter("depDate");
	String arrDate = request.getParameter("arrDate");
	String airline = request.getParameter("airline");
	String price = request.getParameter("price");
	String custNo = request.getParameter("custNo");
	String tcls = request.getParameter("tcls");
	%>
	
	<div id="formdiv">
	<form action="updateticket" method="post">

		<label>Ticket No</label> 
		 <input type="text" name="ticketId" value="<%= ticketId %>" readonly><br>		
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
		<label>Price</label> 
		 <input type="text" name=price value="<%= price %>"readonly><br>
		<label>Enter your Customer Number</label>
		 <input type="text" name="custNo" value="<%= custNo %>"readonly><br>
		<label>Choose The Class</label>
		 <select name="tcls">
 			 <option value="Economy">Economy</option>
 			 <option value="Business">Business</option>
		</select> <br><br>
		
		<input type="submit" name="submit" value="Update My ticket"><br>
	</form>
	</div>
</body>
</html>