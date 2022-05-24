<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Welcome to Spring MVC with View as JSP</h2>
<form action="checkUser" method="post">
	<label>Email</label>
	<input type="email" name="email"/><br/>
	<label>Email</label>
	<input type="password" name="password"/><br/>
	<input type="submit" value="submit"/>
	<input type="reset" value="reset"/>
</form>
</body>
</html>