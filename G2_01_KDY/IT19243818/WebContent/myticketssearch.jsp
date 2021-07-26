<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My Bookings</title>
</head>
<body>

<jsp:include page="/WEB-INF/views/header.jsp"></jsp:include>

	<div>
	<table border = 1>
	
		<tr>
			 <th>ticket No</th>
     		 <th>Flight ID</th>
    		 <th>Departure Airport</th>
     		 <th>Destination Airport</th>
    		 <th>Departure Date</th>
    		 <th>Arrival Date</th>
    	 	 <th>Airline</th>
    	 	 <th>Price</th>
    	 	 <th>Customer No</th>
    	 	 <th>Class</th>
    	 	 <th>Update</th>
    	 	 <th>Remove</th>
    	 	 <th>checkout</th>
    	</tr>
	
	<c:forEach var="tick" items="${tickDetails}">
	
	<c:set var="ticketId" value="${tick.ticketId}"/>
	<c:set var="flightId" value="${tick.flightId}"/>
	<c:set var="depAir" value="${tick.depAir}"/>
	<c:set var="arrAir" value="${tick.arrAir}"/>
	<c:set var="depDate" value="${tick.depDate}"/>
	<c:set var="arrDate" value="${tick.arrDate}"/>
	<c:set var="airline" value="${tick.airline}"/>
	<c:set var="price" value="${tick.price}"/>
	<c:set var="custNo" value="${tick.custNo}"/>
	<c:set var="tcls" value="${tick.tcls}"/>

    
	<tr>
		<td> ${tick.ticketId} </td>
		<td> ${tick.flightId} </td>
		<td> ${tick.depAir} </td>
		<td> ${tick.arrAir} </td>
		<td> ${tick.depDate} </td>
		<td> ${tick.arrDate} </td>
		<td> ${tick.airline}</td>	
		<td> ${tick.price} </td>
		<td> ${tick.custNo}</td>
		<td> ${tick.tcls}</td>
				
		<c:url value="updateticket.jsp" var="tickupdate">
		<c:param name="ticketId" value="${ticketId}"/>
		<c:param name="flightId" value="${flightId}"/>
		<c:param name="depAir" value="${depAir}"/>
		<c:param name="arrAir" value="${arrAir}"/>
		<c:param name="depDate" value="${depDate}"/>
		<c:param name="arrDate" value="${arrDate}"/>
		<c:param name="airline" value="${airline}"/>
		<c:param name="price" value="${price}"/>
		<c:param name="custNo" value="${custNo}"/>
		<c:param name="tcls" value="${ticketcls}"/>
		
	</c:url>
	<td>
	<a href="${tickupdate}">
	<input type="button" name="update" value="Update My Ticket" id="buttonstyle">
	</a>
	</td>
	
		<c:url value="deleteticket.jsp" var="tickdelete">
		<c:param name="ticketId" value="${ticketId}"/>
		<c:param name="flightId" value="${flightId}"/>
		<c:param name="depAir" value="${depAir}"/>
		<c:param name="arrAir" value="${arrAir}"/>
		<c:param name="depDate" value="${depDate}"/>
		<c:param name="arrDate" value="${arrDate}"/>
		<c:param name="airline" value="${airline}"/>
		<c:param name="price" value="${price}"/>
		<c:param name="custNo" value="${custNo}"/>
		<c:param name="tcls" value="${tcls}"/>
		</c:url>
		
	<td>
	<a href="${tickdelete}">
	<input type="button" name="delete" value="Remove" id="buttonstyle">
	</a>
	</td>
	
	<td>
	<a href="${update}">
	<input type="button" name="book" value="checkout" id="buttonstyle">
	</a>
	</td>
		
	</tr>

	</c:forEach>
	</table>
	
	</div>
	
</body>
</html>