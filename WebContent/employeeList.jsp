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
	<table class="table table-bordered table-hover">
			<thead class="thead-dark">
				<th>Name</th>
				<th>Course</th>
				<th>Email</th>
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
						<td><a href="employeeDetail?id=${employee.id}">Detail</a>   <a href="employeeDelete?employee_id=${employee.id}">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
</body>
</html>