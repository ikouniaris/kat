<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="resources/style.css" />
<script type="text/javascript">
			function HideFunction(number){
				if( number == 1){
					document.getElementById("NewForm").style.display = "none";
					document.getElementById("addFormDiv").style.display = "block";
					document.getElementById("logoutDiv").style.display = "none";
				} else if (number == 2){
					document.getElementById("NewForm").style.display = "block";
				document.getElementById("addFormDiv").style.display = "none";
				document.getElementById("logoutDiv").style.display = "none";
				
			} else if (number == 3) {
				document.getElementById("NewForm").style.display = "block";
					document.getElementById("addFormDiv").style.display = "none";
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
				<button type="button" class="button" value="Check form"
					onclick="HideFunction(1)">New Form</button>
			</form>
		</div>



		<div id="addFormDiv" style="display: none">
			<form id="LoanForm" style="display: block"
				action="ManagerController" method="post">
				<input type="text" placeholder="id" name="id" required><br>
				<input type="text" placeholder="amount" name="amount" required><br>
				<input type="text" placeholder="duration in years" name="duration"
					required><br> <input type="text"
					placeholder="driver's license" name="licence" required><br>
				<input type="text" placeholder="clearing" name="clearing" required><br>
				Please choose purchase type :<br> <input type="radio"
					name="position" value="New" checked> New <input
					type="radio" name="position" value="Used"> Used<br>
				<br>
				<button type="submit" id="submitLoan" name="submitLoan">Submit</button>
				<button type="reset" id="reset">Reset</button>
				<button type="button" id="back" onclick="HideFunction(3)">Back</button>
			</form>
		</div>



		<div id="logoutDiv">
			<form id="logoutForm" action="ManagerController" method="post">
				<button type="submit" class="button" name="logoutButton">Logout</button>
			</form>
		</div>
	</div>
	<%@ include file="./Footer.jsp"%>
</body>
</html>