<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
	
	<div id="formdiv">
	
	<table>
	<c:forEach var="InFeed" items="${InFeedback}">
	
	<c:set var="id" value="${InFeed.id}"/>
	<c:set var="UserName" value="${InFeed.name}"/>
	<c:set var="UserFeedback" value="${InFeed.feedback}"/>
	
	<tr>
		<td>Feedback Id:</td>
		<td>${InFeed.id}</td>
	</tr>
	<tr>
		<td>Name:</td>
		<td>${InFeed.name}</td>
	</tr>
	<tr>
		<td>Comment:</td>
		<td>${InFeed.feedback}</td>
	</tr>
	
	</c:forEach>
	</table>
	
	<c:url value="UpdateFeedback.jsp" var="feedUpdate">
		<c:param name="id" value="${id}"/>
		<c:param name="UserName" value="${UserName}"/>
		<c:param name="UserFeedback" value="${UserFeedback}"/>
	</c:url>
	
	<a href="${feedUpdate}">
	<input type="button" name="edit" value="Edit">
	</a>
	
	
	<c:url value="DeleteFeedback.jsp" var="DeleteFeed">
		<c:param name="id" value="${id}"/>
		<c:param name="UserName" value="${UserName}"/>
		<c:param name="UserFeedback" value="${UserFeedback}"/>
	</c:url>
	<a href = "${DeleteFeed}">
	<input type="button" name="delete" value="Delete" ><br><br>
	</a>
	
	
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