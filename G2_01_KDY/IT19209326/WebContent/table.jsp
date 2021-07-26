<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



<table>
	<tr>
	<th>FlightID</th>
	<th>Depair</th>
	<th>arrair</th>
	<th>depdate</th>
	<th>airdate</th>
	<th>aidline</th>
	<th>price</th>
	</tr>
	
	<c:forEach var="ad" value="${adminDetail}">
	

	<tr>
		<td><input type = "text" value="${ad.flightid}"></td>
		<td><input type = "text" value="${ad.depAir}"></td>
		<td><input type = "text" value="${ad.arrAir}"></td>
		<td><input type = "text" value="${ad.depDate}"></td>
		<td><input type = "text" value="${ad.arrDate}"></td>
		<td><input type = "text" value="${ad.airline}"></td>
		<td><input type = "text" value="${ad.price}"></td>	
	</tr>
	
	</c:forEach>
	

</table>


</body>
</html>