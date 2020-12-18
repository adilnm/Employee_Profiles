<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="header.jspf" %>
	<div class="container">
	<form action="login" method="post">
		<div class="form-group">
			<label class="font-weight-bold">First Name</label>
			<input type="text" name="firstName" class="form-control col-md-3" placeholder="First Name" /><br/>
			<label class="font-weight-bold">Password</label>
			<input type="password" name="password" class="form-control col-md-3" placeholder="Password"/><br/>
			<input type="submit" class="btn btn-primary col-md-3">
		</div>
	</form>
	</div>
</body>
</html>