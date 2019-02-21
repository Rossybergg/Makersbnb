<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<link rel="stylesheet" type="text/css" href="stylesheet.css">
<html>
<head>
<meta charset="UTF-8">
<title>New listing</title>
</head>
<body>
<h1>Holding back for a new listing</h1>
<a href="HomePage">back</a>

<form action="NewListing" method="post">
<input id="name" type="text" name="name">
<input id="description" type="text" name="description">
<input id="price" type="text" name="price">
<input type="submit">
</form>

</body>
</html>