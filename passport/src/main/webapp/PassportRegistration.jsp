<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Passport registration</title>
</head>
<body>
<h3>${ msg }</h3>
<form action="registration.all" method="post">
<pre>
Registration to apply at <input type="radio" name="office" value ="CPV Delhi">CPV Delhi <input type="radio" name="office" value="Passport Office">Passport Office
passport Office <select name="selectLocation">
<option value="Bangalore">Bangalore</option>
<option value="Bagalkot">Bagalkot</option>
<option value="Belgaum">Belgaum</option>
<option value="Mysore">Mysore</option>
<option value="vijaypur">Vijaypur</option>

</select>
Given Name <input type="text" name="givenName">
Surname <input type="text" name="surName">
Date of Birth  <input type="date" name="dateOfBirth">
E-mail Id <input type="email" name="emailId">
Login Id <input type="text" name="loginId">
Password <input type="password" name="password">
Confirm Password <input type="password" name="confirmPassword">
<input type="submit" value="Register"><input type="reset" value="Clear">
</pre>

</form>
</body>
</html>