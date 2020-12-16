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
	<div class="container">
	<form action="edit" method="post">
		<div class="form-group">
			<label class="font-weight-bold">First Name</label>
			<input type="text" name="firstName" value="${employee.firstName}" class="form-control col-md-3" placeholder="First Name" /><br/>
			<label class="font-weight-bold">Last Name</label>	
			<input type="text" name="lastName" value="${employee.lastName}" class="form-control col-md-3" placeholder="Last Name"/><br/>
			<label class="font-weight-bold">Position</label>
			<input type="text" name="position" value="${employee.position}" class="form-control col-md-3" placeholder="Postion"/><br/>
			<label class="font-weight-bold">City</label>
			<input type="text" name="city" value="${employee.city}" class="form-control col-md-3" placeholder="City"/><br/>
			<label class="font-weight-bold">Password</label>
			<input type="password" name="password" value="${employee.password}" class="form-control col-md-3" placeholder="Password"/><br/>
			<input type="hidden" name="id" value="${employee.id}"/>
			<input type="submit" class="btn btn-primary col-md-3">
		</div>
	</form>
	</div>
</body>
</html>