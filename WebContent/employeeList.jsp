<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List Of Employees</title>
</head>
<body>
<%@ include file="header.jspf" %>
<div class="container">
	<c:if test="${message ne null}">
 		<h5 class="alert alert-success">${message}</h5>
	</c:if>
	
	<c:if test="${updateMessage ne null}">
 		<h5 class="alert alert-success">${updateMessage}</h5>
	</c:if>
	
	<c:if test="${deleteMessage ne null}">
 		<h5 class="alert alert-danger">${deleteMessage}</h5>
	</c:if>
	<table class="table table-bordered table-hover">
			<thead class="thead-dark">
				<th>First Name</th>
				<th>Last Name</th>
				<th>Position</th>
				<th>City</th>
				<th>Action</th>
			</thead>
			<tbody>
				<c:forEach items="${employees}" var="employee">
					<tr>
						<td>${employee.firstName}</td>
						<td>${employee.lastName}</td>
						<td>${employee.position}</td>
						<td>${employee.city }</td>
						<td><a href="employeeDetail?employee_id=${employee.id}"><img alt="" src="img/details.jpg" width="80" height="30"></a><a href="employeeDelete?employee_id=${employee.id}"><img alt="" src="img/delete.png" width="30" height="30"></a><a href="edit?employee_id=${employee.id}"><img alt="" src="img/edit.png" width="30" height="30"></a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
</div>		
</body>
</html>