<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		  <h1>Login</h1>
    	<form action="LoginServlet" method="post">
		<label>Username:</label>
		<input type="text" name="username" required><br><br>
		<label>Password:</label>
		<input type="password" name="password" required><br><br>
		<label>Role:</label>
		<select name="role">
		<option value="admin">Admin</option>
		<option value="teacher">Teacher</option>
		<option value="student">Student</option>
		</select><br><br>
		<input type="submit" value="Login">
		</form>
</body>
</html>