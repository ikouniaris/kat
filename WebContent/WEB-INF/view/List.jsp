<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta charset="utf-8" />
<title>Table Style</title>
<meta name="viewport"
	content="initial-scale=1.0; maximum-scale=1.0; width=device-width;">
<link rel="stylesheet" type="text/css" href="resources/table.css" />

</head>

<body>
	<div class="table-title"></div>
	<table class="table-fill">
		<thead>
			<tr>
				<th class="text-left">ID</th>
				<th class="text-left">First Name</th>
				<th class="text-left">Last Name</th>
				<th class="text-left">User name</th>
				<th class="text-left">Password</th>
				<th class="text-left">Department</th>
				<th class="text-left">Position</th>
			</tr>
		</thead>
		<tbody class="table-hover">
			<c:forEach var="tempEmployee" items="${employees}">
				<tr>
					<td>${tempEmployee.employeeID}</td>
					<td>${tempEmployee.firstname}</td>
					<td>${tempEmployee.lastname}</td>
					<td>${tempEmployee.username}</td>
					<td>${tempEmployee.email}</td>
					<td>${tempEmployee.department}</td>
					<td>${tempEmployee.position}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<%@ include file="./Footer.jsp"%>
</body>