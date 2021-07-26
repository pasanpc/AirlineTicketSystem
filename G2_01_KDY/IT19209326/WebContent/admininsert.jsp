<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>""</title>

<link href="ertyuiop.css" rel="stylesheet" type="text/css"></head>
</head>
<body>
    <h1>   Data insert </h1>
	
	<form action="insert" method="post">
		Flightid <input type="text" name="flightid"><br><br>
		Dep Airport <input type="text" name="depAir"><br><br>
		Arr Airport <input type="text" name="arrAir"><br><br>
		Dep date <input type="text" name="depDate"><br><br>
		Arr date <input type="text" name="arrDate"><br><br>
		Airline <input type="text" name="airline"><br><br>
	    Price <input type="text" name="price"><br><br>
		
		<input type="submit" name="submit" value="Create Customer">
	</form>

<a href="table.jsp"><input type="button" value="ShowDetails"></a>



</body>
</html>








