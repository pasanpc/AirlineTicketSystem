<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.DriverManager"%>
	<%@page import="java.sql.ResultSet"%>
	<%@page import="java.sql.Statement"%>
	<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Feedback</title>
</head>
<body>
		
	<jsp:include page="/WEB-INF/views/header.jsp"></jsp:include>
	
	<h2 align="center">Tell us your feedback</h2>
	
	<div id="formdiv" >
	
	<form action="FeedbackInsert" method="post">
		Enter your name :<br> <input type="text" name="Fname" required><br>
		Enter your feedback :<br> <input type="text" name="feedback" required ><br>
		<input type="submit" name="fsubmit" value="submit">
	</form><br><br>
	
	
	
	<%
	String fid = request.getParameter("userId");
	String driverName = "com.mysql.jdbc.Driver";
	String connectionUrl = "jdbc:mysql://localhost:3306/";
	String dbName = "air_line";
	String userId = "root";
	String password = "1234";
	
	try {
	Class.forName(driverName);
	} catch (ClassNotFoundException e) {
	e.printStackTrace();
	}
	
	Connection connection = null;
	Statement statement = null;
	ResultSet resultSet = null;
	%>
	<h3><font><strong>Recent Feedbacks</strong></font></h3>
	<table>
	<tr>
	
	</tr>

	<%
	try{ 
	connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
	statement=connection.createStatement();
	String sql ="SELECT * FROM feedback order by idfeedback desc";
	
	resultSet = statement.executeQuery(sql);
	while(resultSet.next()){
	%>
	
	
	<tr><b><%=resultSet.getString("name") %></b></tr><br>
	<tr><%=resultSet.getString("feedback") %></tr><br><br>
	
	
	<% 
	}
	
	} catch (Exception e) {
	e.printStackTrace();
	}
	%>
	</table>
	</div>
	

</body>

<footer><br><br></footer>
</html>