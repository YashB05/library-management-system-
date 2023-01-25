<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 style="text-align: center;">Login Here</h1>
	<form style="align-items: center;" action="LoginCotroller">
		<input type="text" placeholder="Username" name="uname">
		<input type="text" placeholder="Password" name="pass">   
		<input type="submit" placeholder="Login" >
		<a class="btn" href="Register.jsp">Register</a>
	</form>
</body>
</html>