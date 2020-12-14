<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Detail</title>
</head>
<body>
	<%@ include file="header.jspf" %>
	
	<div class="container">
		<h4>First Name: ${employee.firstName }</h4>
		<h4>Last Name: ${employee.lastName }</h4>
		<h4>Position: ${employee.position }</h4>
		<h4>City: ${employee.city}</h4>
	</div>
</body>
</html>