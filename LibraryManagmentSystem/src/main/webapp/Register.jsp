<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="RegisterController">
		<input type="text" placeholder="First Name" name="fname">
		<input type="text" placeholder="Last Name" name="lname">
		<label for="cars">Gender : </label>
	 		<select name="gender" id="gender">
			    <option value="male">Male</option>
			    <option value="female">Female</option>
	  		</select>
		<input type="text" placeholder="Mobile Number" name="mobno">
		<input type="text" placeholder="Username" name="uname">
		<input type="text" placeholder="Password" name="pass">   
		<input type="submit" placeholder="Register" >
	</form>
</body>
</html>