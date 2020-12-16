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
		<ul class="list-group">
 	 		 <li class="list-group-item disabled">First Name:  ${employee.firstName }</li>
  			 <li class="list-group-item">Last Name:  ${employee.lastName }</li>
  			 <li class="list-group-item">Position:  ${employee.position }</li>
  			 <li class="list-group-item">City:  ${employee.city}</li>
		</ul>
	</div>
</body>
</html>