<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<link rel="stylesheet" type="text/css" href="resources/style.css" />
<title>Signin</title>
</head>

<body>
	<div id="container" align="center">
		<form class="form-signin" action="SigninController" method="post">
			<h2>Please sign in</h2>
			<input type="text" style="height: 20px; font-size: 14pt;"
				id="inputEmail" name="username" placeholder="user name" required><br>
			<input type="password" style="height: 20px; font-size: 14pt;"
				id="inputPassword" name="password" placeholder="Password" required><br>
			<button type="submit" id="submit">Sign in</button>
		</form>
	</div>
	<%@ include file="./Footer.jsp"%>
</body>
</html>