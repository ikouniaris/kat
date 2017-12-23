<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="resources/style.css" />
<script type="text/javascript">
	function HideFunction(number) {
		if (number == 1) {
			document.getElementById("NewForm").style.display = "none";
			document.getElementById("CheckDiv").style.display = "block";
			document.getElementById("checkForm").style.display = "block";
			document.getElementById("logoutDiv").style.display = "none";
		} else if (number == 2) {
			document.getElementById("NewForm").style.display = "block";
			document.getElementById("CheckDiv").style.display = "none";
			document.getElementById("checkForm").style.display = "none";
			document.getElementById("logoutDiv").style.display = "none";

		} else if (number == 3) {
			document.getElementById("NewForm").style.display = "block";
			document.getElementById("CheckDiv").style.display = "none";
			document.getElementById("checkForm").style.display = "none";
			document.getElementById("logoutDiv").style.display = "block";
		}
	}
</script>
</head>
<body>


	<div id="container" align="center">
		<h2>Choose action</h2>
		<div id="NewFormDiv">
			<form id="NewForm">
				<button type="button" class="button" value="New Form"
					onclick="HideFunction(1)">New Form</button>
			</form>
		</div>



		<div id="CheckDiv" style="display: none">
			<h2>Please enter client name or Id:</h2>
			<form id="checkForm" style="display: none" action="ManagerController"
				method="post">
				<input type="text" placeholder="client name/id" required><br>

				<button type="submit" id="search" name="checkButton">Search</button>
				<input type="button" id="back" value="back"
					onclick="HideFunction(3)" />
			</form>
		</div>



		<div id="logoutDiv">
			<form id="logoutForm" action="ManagerController" method="post">
				<button type="submit" class="button" id="check" name="logoutButton">Logout</button>
			</form>
		</div>
	</div>
	<%@ include file="./Footer.jsp"%>
</body>
</html>