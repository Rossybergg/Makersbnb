<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="stylesheet.css">
<meta charset="UTF-8">
<meta http-equiv="Content-Type" content="text/html; charset=Shift_JIS">
<meta http-equiv="Content-Script-Type" content="text/javascript">
<title>MakersBnB</title>
</head>
<video autoplay muted loop id="Video">
	<source src="./videos/sunset.mp4" type="video/mp4">
</video>
<body onload="loginFailCheck()">
	<script>
		function loginFailCheck() {
			if (document.getElementById("loginfail").innerHTML == "null") {
				document.getElementById("loginfail").style.opacity = "0";
			}
		}
	</script>
	<img id="loginLogo" src="./images/logo_white.png">
	<div id="title">Holding page for log in</div>
	<a href="HomePage">Click to go to home</a>

	<div class="loginContainer">
		<div id="loginbox">
			<div id="loginTitle">
				<b>Welcome to Makers BnB</b>
			</div>
			<br>
			<div id="loginSubTitle">Please login or sign up to discover
				entire homes and private rooms perfect for any trip.</div>
			<br>
			<div id="loginfail"><%=request.getAttribute("failmessage")%></div>
			<form action="LoginCheck" method="post" id="loginTable">
				<table>
					<tr>
						<td><b>User Name</b></td>
						<td><b>Password</b></td>
					</tr>
					<tr>
						<td><input type="text" name="uname"></td>
						<td><input type="password" name="password"></td>
					</tr>
				</table>
				<div id="loginButtons">
					<input type="submit" value="Login"> <input type="submit"
						value="Signup">
				</div>
			</form>
		</div>
	</div>




</body>
</html>