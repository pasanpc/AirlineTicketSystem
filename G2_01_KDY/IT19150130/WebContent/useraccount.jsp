<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile</title>
</head>
<body>

<jsp:include page="/WEB-INF/views/header.jsp"></jsp:include>

<div id="formdiv">

<br><h4 align = "center">Profile</h4><br>

<table>

	<c:forEach var = "use" items = "${userDetails}">
	
	<c:set var="fname" value="${use.fname}"/>
	<c:set var="lname" value="${use.lname}"/>
	<c:set var="username" value="${use.userName}"/>
	<c:set var="nic" value="${use.nic}"/>
	<c:set var="phone" value="${use.phone}"/>
	<c:set var="email" value="${use.email}"/>
	<c:set var="address" value="${use.address1}"/>
	<c:set var="password" value="${use.password}"/>
	
	
	<tr>
		<td>User ID : </td>
		<td>${use.id}</td>
	</tr>
	<tr>
		<td>First Name : </td>
		<td>${use.fname}</td>
	</tr>
	<tr>
		<td>Last Name : </td>
		<td>${use.lname}</td>
	</tr>
	<tr>
		<td>User Name : </td>
		<td>${use.userName}</td>
	</tr>
	<tr>
		<td>NIC : </td>
		<td>${use.nic}</td>
	</tr>
	<tr>
		<td>Phone Number : </td>
		<td>${use.phone}</td>
	</tr>
	<tr>
		<td>Email : </td>
		<td>${use.email}</td>
	</tr>
	<tr>
		<td>Address : </td>
		<td>${use.address1}</td>
	</tr>
	<tr   style="display: none">
		<td>${use.password}</td>
	</tr>

	</c:forEach>
</table>



	<c:url value="userUpdate.jsp" var="update">
	
		<c:param name="fname" value="${fname}"/>
		<c:param name="lname" value="${lname}"/>
		<c:param name="uname" value="${username}"/>
		<c:param name="nic" value="${nic}"/>
		<c:param name="phone" value="${phone}"/>
		<c:param name="email" value="${email}"/>
		<c:param name="address" value="${address}"/>
		<c:param name="password" value="${password}"/>
		
	</c:url>

	<a href="${update}">
	<input type="button" name="update" value="Edit Profile">
	</a>
	
	<c:url value="userDelete.jsp" var="userdelete">
		<c:param name="fname" value="${fname}"/>
		<c:param name="lname" value="${lname}"/>
		<c:param name="uname" value="${username}"/>
		<c:param name="nic" value="${nic}"/>
		<c:param name="phone" value="${phone}"/>
		<c:param name="email" value="${email}"/>
		<c:param name="address" value="${address}"/>
		<c:param name="password" value="${password}"/>
	</c:url>
	
	<a href="${userdelete}">
	<input type="button" name="delete" value="Delete Profile">
	</a>
	
	<input type="button" name="update" value="Home">
	
</div>

</body>
</html>