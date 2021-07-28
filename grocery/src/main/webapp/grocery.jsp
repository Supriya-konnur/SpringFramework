<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Grocery Details</title>

</head>
<body>
<h3>${ msg }</h3>
<form action="grocery.all" method="post">
	Grocery Name: <input type="text" name="groceryName">
	Grocery Quantity: <input type="text" name= "groceryQuantity">
	Grocery Price: <input type="text" name = "groceryPrice">
	Mfg Date: <input type="text" name = "mfgDate">
	<input type="submit" value="SUBMIT">
	
	
	</form>
</body>
</html>