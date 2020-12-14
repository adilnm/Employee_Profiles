<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Employee</title>
</head>
<body>
	<%@ include file="header.jspf" %>
	
	<form action="edit" method="post">
		First Name: <input type="text" name="firstName" value="${employee.firstName}"/><br/>
		Last Name: <input type="text" name="lastName" value="${employee.lastName}"/><br/>
		Position: <input type="text" name="position" value="${employee.position}"/><br/>
		City: <input type="text" name="city" value="${employee.city}"/><br/>
		Password: <input type="password" name="password" value="${employee.password}"/><br/>
		<input type="hidden" name="id" value="${employee.id}"/>
		<input type="submit">
	</form>
</body>
</html>