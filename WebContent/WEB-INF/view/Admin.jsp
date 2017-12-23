<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta charset="UTF-8">
<title>Admin page</title>
<link rel="stylesheet" type="text/css" href="resources/style.css" />
<script type="text/javascript">
			function HideFunction(number) {
				switch (number) {
					case 1:
						document.getElementById("EmployeeRegisterForm").style.display = "block";
						document.getElementById("CreateEmployeeAccountButton").style.display = "none";
						document.getElementById("ModifyEmployeeAccountDiv").style.display = "none";
						document.getElementById("DeleteEmployeeAccountDiv").style.display = "none";
						document.getElementById("ViewEmployeeDiv").style.display = "none";
						document.getElementById("LogoutDiv").style.display = "none";
						break;
					case 2:
						document.getElementById("ModifyEmployeeAccountForm").style.display = "block";
						document.getElementById("ModifyEmployeeAccountButton").style.display = "none";
						document.getElementById("CreateEmployeeAccountDiv").style.display = "none";
						document.getElementById("DeleteEmployeeAccountDiv").style.display = "none";
						document.getElementById("ViewEmployeeDiv").style.display = "none";
						document.getElementById("LogoutDiv").style.display = "none";
						break;
					case 3:
						document.getElementById("DeleteEmployeeAccountForm").style.display = "block";
						document.getElementById("CreateEmployeeAccountDiv").style.display = "none";
						document.getElementById("ModifyEmployeeAccountDiv").style.display = "none";
						document.getElementById("DeleteEmployeeAccountButton").style.display = "none";
						document.getElementById("ViewEmployeeDiv").style.display = "none";
						document.getElementById("LogoutDiv").style.display = "none";						
						break;
				}
			}
			
		

			function ShowFunction(number) {
				if (number == 1) {
					document.getElementById("CreateEmployeeAccountButton").style.display = "block";
					document.getElementById("EmployeeRegisterForm").style.display = "none";
					document.getElementById("ModifyEmployeeAccountDiv").style.display = "block";
					document.getElementById("DeleteEmployeeAccountDiv").style.display = "block";
					document.getElementById("ViewEmployeeDiv").style.display = "block";
					document.getElementById("LogoutDiv").style.display = "block";
				} else if (number == 2) {
					document.getElementById("ModifyEmployeeAccountButton").style.display = "block";
					document.getElementById("ModifyEmployeeAccountForm").style.display = "none";
					document.getElementById("CreateEmployeeAccountDiv").style.display = "block";
					document.getElementById("DeleteEmployeeAccountDiv").style.display = "block";
					document.getElementById("ViewEmployeeDiv").style.display = "block";
					document.getElementById("LogoutDiv").style.display = "block";
				} else {
					document.getElementById("DeleteEmployeeAccountButton").style.display = "block";
					document.getElementById("DeleteEmployeeAccountForm").style.display = "none";
					document.getElementById("CreateEmployeeAccountDiv").style.display = "block";
					document.getElementById("ModifyEmployeeAccountDiv").style.display = "block";
					document.getElementById("ViewEmployeeDiv").style.display = "block";
					document.getElementById("LogoutDiv").style.display = "block";
				}
			}
			
			
		</script>
</head>
<body>
	<div id="container" align="center">
		<c:out value=" ${greeting}" />
		<h1>Choose action</h1>
		<div id="CreateEmployeeAccountDiv">
			<input type="button" id="CreateEmployeeAccountButton" class="button"
				onclick="HideFunction(1)" value="Create Employee Account"><br>
			<form modelAttribute="employee" id="EmployeeRegisterForm"
				style="display: none" action="AdminController" method="post">
				Create new user account:<br></br> Please enter user name: <input
					type="text" placeholder="first name" name="firstname" required><br>
				Please enter User surname: <input type="text"
					placeholder="last name" name="lastname" required><br>
				Please enter user password: <input type="text"
					placeholder="password" name="email" required><br>
				Please enter the username: <input type="text"
					placeholder="user name" name="username" required><br>
				<br> Please enter user's department :<br> <input
					type="radio" name="department" value="1" checked>1 <input
					type="radio" name="department" value="2">2 <input
					type="radio" name="department" value="3">3 <input
					type="radio" name="department" value="4">4 <input
					type="radio" name="department" value="5"> 5<br>
				<br> Please enter user's position :<br> <input
					type="radio" name="position" value="manager" checked>
				Manager <input type="radio" name="position" value="director">
				Director<br>
				<br> <input type="submit" id="submit" name="addButton"
					value="Submit">
				<button type="reset" id="reset" class="Cbutton">Clear</button>
				<input type="button" id="back" class="Bbutton" value="Back"
					onclick="ShowFunction(1)">
			</form>
		</div>
		<div id="ModifyEmployeeAccountDiv">
			<input type="button" class="button" id="ModifyEmployeeAccountButton"
				onclick="HideFunction(2)" value="Modify Employee Account"><br>
			<form modelAttribute="employee" id="ModifyEmployeeAccountForm"
				style="display: none" action="AdminController" method="post">
				Modify user's account:<br></br> Insert id:<br> <input
					type="int" name="employeeID" required><br> Please
				enter firstname:<br> <input type="text" placeholder="new name"
					name="firstname" required><br> Please Please enter
				lastname:<br> <input type="text" placeholder="new surname"
					name="lastname" required><br> Please enter user name:<br>
				<input type="text" placeholder="new username" name="username"
					required><br> Please enter password:<br> <input
					type="text" placeholder="new password" name="email" required><br>
				Please enter user's department :<br> <input type="radio"
					name="department" value="1" checked>1 <input type="radio"
					name="department" value="2">2 <input type="radio"
					name="department" value="3">3 <input type="radio"
					name="department" value="4">4 <input type="radio"
					name="department" value="5"> 5<br>
				<br> Please enter user's position :<br> <input
					type="radio" name="position" value="manager" checked>
				Manager <input type="radio" name="position" value="director">
				Director<br>
				<br> <input type="submit" id="submit" name="modifyButton"
					value="Submit">
				<button type="reset" id="reset" class="Cbutton">Clear</button>
				<input type="button" id="back" class="Bbutton" value="Back"
					onclick="ShowFunction(2)">
			</form>
		</div>
		<div id="DeleteEmployeeAccountDiv">
			<input type="button" class="button" id="DeleteEmployeeAccountButton"
				onclick="HideFunction(3)" value="Delete User Account"><br>
			<form id="DeleteEmployeeAccountForm" style="display: none"
				action="AdminController" method="post">
				Delete user's account:<br></br> Choose an id:<br> <input
					type="text" name="id" required><br> <input
					type="submit" id="submit" name="deleteButton" value="Submit">
				<button type="reset" id="reset" class="Cbutton">Clear</button>
				<input type="button" id="back" class="Bbutton" value="Back"
					onclick="ShowFunction(3)">
			</form>
		</div>
		<div id="ViewEmployeeDiv">
			<form action="AdminController" method="post">
				<input type="submit" class="button" name="viewCustomers"
					value="View Employees"><br>
			</form>
		</div>
		<div>
			<input type="button" id="CreateEmployeeAccountButton" class="button"
				onclick="HideFunction(1)" value="Create Customer Account"><br>

		</div>
		<div>
			<input type="button" class="button" id="ModifyEmployeeAccountButton"
				onclick="HideFunction(2)" value="Modify Customer Account"><br>

		</div>
		<div id="DeleteCustomerAccountDiv"></div>
		<div id="LogoutDiv">
			<form action="AdminController" method="post">
				<input type="submit" class="button" name="logoutButton"
					value="Logout"><br>
			</form>
		</div>

	</div>
	<div id="footer">
		<%@ include file="./Footer.jsp"%>
	</div>
</body>
</html>

















