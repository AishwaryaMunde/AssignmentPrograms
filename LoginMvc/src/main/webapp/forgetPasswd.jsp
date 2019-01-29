<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<h2>Forget Password</h2>
<body style=margin-top:13em;margin-left:25em;margin-right:5;>

	<form action="forget">
		<table>
			<tr>
			<tr>
			<td>
			Email id : <input type="text" name = "email"></td></tr></tr>
			<tr>
			<td>New Password : <input type="password" name="newPassword"  pattern="((?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,20})" 
					title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" required 
					style = " width: 15em;  height: 2em;"></td></tr>
			<tr>
			<td>Re-enter Password : <input type="password" name ="reenterPassword"></td></tr>
			<tr>
			<td>
			<input type="submit" value = "submit" style = " width: 15em;  height: 2em;"></td></tr>
		</table>
	</form>
</body>
</html>