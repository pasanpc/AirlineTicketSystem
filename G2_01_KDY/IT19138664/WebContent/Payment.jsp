<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Payment</title>
</head>
<body>

	<jsp:include page="/WEB-INF/views/header.jsp"></jsp:include>
	
	<h2 align="center">Make Payment</h2>
	
	<div id="formdiv">

	<form action="Insert" method="post">
	Name on card : <input type="text" name="CName" required placeholder="Name On Card"><br>
	Card number  : <input type="text" name="CNum" required pattern="[0-9][0-9][0-9][0-9]-[0-9][0-9][0-9][0-9]-[0-9][0-9][0-9][0-9]-[0-9][0-9][0-9][0-9]" placeholder="xxxx-xxxx-xxxx-xxxx"><br>
	Exp date     : <br><input type="text" name="Edate" required placeholder="mm/yy" pattern="[0-9][0-9]/[0-9][0-9]"><br>
	CVV          : <input type="text" name="CVV" required pattern="[0-9][0-9][0-9]" placeholder="CVV"><br>
	
	<input type="submit" name="submit" value="Proceed">
	</form>
	</div>

</body>
<footer><br><br></footer>
</html>