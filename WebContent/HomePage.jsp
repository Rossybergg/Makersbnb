<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

<%@ page import="java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<link rel="stylesheet" type="text/css" href="stylesheet.css">
<html>
<head>
<meta charset="UTF-8">
<title>MakersBnb: Home</title>
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
</head>
<body background="image1.jpeg" onload="background();">
<h1>Welcome to MakersBnB</h1>
<div class="hostLinks">
<a href="NewListing">Add a new listing</a> <a href="CurrentListings">View your current listings</a>
</div>

<div class="listingsContainer">

<c:forEach items="${listingsArray}" var="listing">
   <a href=""><c:out value="${listing.value}"/></a>
   <br>
</c:forEach> 

</div>



</body>
</html>