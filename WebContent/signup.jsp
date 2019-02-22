<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MakersBnB: Signup</title>
<link rel="stylesheet" type="text/css" href="stylesheet.css">
</head>
<script type="text/javascript">
	function background() {
		var BG = Math.floor(Math.random() * 4);
		//Math.random() creates random number. 
		//Math.floor() switches random number to its integer value.
		// "Math.random() * 4"  means a random number generates between 0 to 3.

		if (BG == 0) {
			document.body.background = "./images/bg.jpg";
		} else if (BG == 1) {
			document.body.background = "./images/bg1.jpg";
		} else if (BG == 2) {
			document.body.background = "./images/bg2.jpg";
		} else {
			document.body.background = "./images/bg3.jpg";
		}
		//If generated random integer is 0, image1.jpeg will be displayed for background image. It it is 1,  image2.jpeg will be displayed.... and so on.

	}
</script>
<body background="image1.jpeg" onload="background();">

</body>
<img id="loginLogo" src="./images/logo_black.png">

<div class="SignupContainer">
<div id="signupbox">
<div id="loginTitle">
				<b>Signup to Makers BnB</b>
			</div>
			<br>
			<div id="loginSubTitle">Please enter your details below to complete your signup.</div>
			<br>
<form action="signup" method="post" id="signupTable">
<table>
					<tr>
						<td><b>User Name</b></td>
						<td><b>Password</b></td>
					</tr>
					<tr>
						<td><input type="text" name="uname"></td>
						<td><input type="password" name="password"></td>
					</tr>
					<tr>
						<td><b>First Name</b></td>
						<td><b>Surname</b></td>
					</tr>
					<tr>
						<td><input type="text" name="fname"></td>
						<td><input type="password" name="sname"></td>
					</tr>
				</table>
				<div id="signupButtons">
					<input type="submit"
						value="Signup">
						</form>
				</div>
</div>
</div>
</html>