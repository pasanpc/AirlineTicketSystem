<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FLight List</title>
</head>
<body>
<jsp:include page="/WEB-INF/views/header.jsp"></jsp:include>
	
	<div>
	<table border = 1 >
	
		<tr>
     		 <th>Flight ID</th>
    		 <th>Departure Airport</th>
     		 <th>Destination Airport</th>
    		 <th>Departure Date</th>
    		 <th>Arrival Date</th>
    	 	 <th>Airline</th>
    	 	 <th>Price</th>
    	 	 <th>Select</th>
    	</tr>
	
	<c:forEach var="fli" items="${fliDetails}">
	
	<c:set var="flightId" value="${fli.flightId}"/>
	<c:set var="depAir" value="${fli.depAir}"/>
	<c:set var="arrAir" value="${fli.arrAir}"/>
	<c:set var="depDate" value="${fli.depDate}"/>
	<c:set var="arrDate" value="${fli.arrDate}"/>
	<c:set var="airline" value="${fli.airline}"/>
	<c:set var="price" value="${fli.price}"/>
	

    
	<tr>
		<td> ${fli.flightId} </td>
		<td> ${fli.depAir} </td>
		<td> ${fli.arrAir} </td>
		<td> ${fli.depDate} </td>
		<td> ${fli.arrDate} </td>
		<td> ${fli.airline} </td>
		<td> ${fli.price}</td>	
		
		<c:url value="bookticket.jsp" var="booktick">
		<c:param name="flightId" value="${flightId}"/>
		<c:param name="depAir" value="${depAir}"/>
		<c:param name="arrAir" value="${arrAir}"/>
		<c:param name="depDate" value="${depDate}"/>
		<c:param name="arrDate" value="${arrDate}"/>
		<c:param name="airline" value="${airline}"/>
		<c:param name="price" value="${price}"/>
		
	</c:url>
	<td>
	<a href="${booktick}">
	<input type="button" name="book" value="Select Flight" id="buttonstyle">
	</a>
	</td>

	</tr>

	</c:forEach>
	</table>
	</div>

	
</body>
</html>

