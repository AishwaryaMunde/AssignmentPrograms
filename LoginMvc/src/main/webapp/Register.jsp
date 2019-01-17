<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<style>
         body {
            background-image: url("https://c8.alamy.com/comp/F3MGX8/blury-nature-background-F3MGX8.jpg");
			background-repeat: no-repeat;  
			background-size: 1300px 730px;       
         }
</style>
<h1 style="color:Purple;">Registration Page</h1>
<body style=margin-top:5em;margin-left:23em;>

<form action="regLogin" method="post">
	<table>
		<tr>
				<td><h2 style="color:black;">Enter First Name</h2></td>
				<td><input type="text" name="firstname" style = " width: 15em;  height: 2em;" required></td>
			</tr>
		<tr>
				<td><h2 style="color:black;">Enter Last Name</h2></td>
				<td><input type="text" name="lastname" style = " width: 15em;  height: 2em;" required></td>
			</tr>
		<tr>
				<td><h2 style="color:black;">Enter Mobile No</h2></td>
				<td><input type="text" name="mobno" style = " width: 15em;  height: 2em; required"></td>
			</tr>	
		<tr>
				<td><h2 style="color:black;">Enter Email ID</h2></td>
				<td><input type="text" name="emailid" style = " width: 15em;  height: 2em; required"></td>
			</tr>
		<tr>
				<td><h2 style="color:black;">Enter User Name</h2></td>
				<td><input type="text" name="uname" style = " width: 15em;  height: 2em; required"></td>
			</tr>
		<tr>
				<td><h2 style="color:black;">Enter Password</h2></td>
				<td><input type="password" name="password" pattern="((?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,20})" 
					title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" required 
					style = " width: 15em;  height: 2em;"></td>
			</tr>
		<tr>
		<td></td>
				<td><input type="submit" value="Register" style = " width: 15em;  height: 2em;"></td>
			</tr>
			</table>
			</form>
			</body>
</html>