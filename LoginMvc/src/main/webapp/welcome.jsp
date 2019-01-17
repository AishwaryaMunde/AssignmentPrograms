<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
         body {
            background-image: url("https://sg.fiverrcdn.com/photos/107059101/original/e650a1c4585b87315b1789b5f8273d4448338971.jpg?1516952324");
			background-repeat: no-repeat;  
			background-size: 1300px 700px;       
         }
</style>
</head>
<body style=margin-top:14em;margin-left:32em;>
	<%
		if(session.getAttribute("userName")==null)
		{
			RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
			dispatcher.forward(request, response);
		}
		%>
</body>
<form action="logout">
	<h1>Welcome User</h1>
	<input type="submit" value="Logout" style = " width: 15em;  height: 2em;">
	</form>

</html>