<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Passport Login</title>
</head>
<body>
<h3>${ msg }</h3>
<h3 style="color: white; font-family: cursive;font-weight: bolder;"> WELCOME TO PASSPORT SEVA</h3>
<form action="login.all" method="post">
<pre>
Login Id <input type="text" name="loginId" placeholder="Login Id" required="required">
Password <input type="password" name="password" placeholder="Password" required="required">
<button type="submit">Sign in</button>
</pre>
</form>
<p style="color: white;">Don't have an account? <a href="PassportUserRegistration.jsp">Sign up here!</a></p>
</body>
</html>