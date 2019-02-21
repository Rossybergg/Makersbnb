<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="stylesheet.css">
<meta charset="UTF-8">
<meta http-equiv="Content-Type" content="text/html; charset=Shift_JIS">
<meta http-equiv="Content-Script-Type" content="text/javascript">
<title>Random Background</title>
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
<title>MakersBnB: Welcome</title>
</head>
<body background="image1.jpeg" onload="background();">
	<div id="title">Holding page for log in</div>
	<a href="HomePage">Click to go to home</a>

	<form action="LoginCheck" method="post">
		<table>
			<tr>
				<td>User Name</td>
				<td><input type="text" name="uname"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="login"></td>
			</tr>
		</table>
	</form>





</body>
</html>