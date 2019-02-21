<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="stylesheet.css">
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
<meta charset="UTF-8">
<title>MakersBNB: Login Failed</title>
</head>
<body background="./images/bg.jpg" onload="background();">
	<img id="loginLogo" src="./images/logo_white.png">
	<h1>Sorry, that user name and Password combination is incorrect!</h1>
	<h2>Please try again....</h2>
</body>
</html>