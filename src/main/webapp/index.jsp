<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>

	<form action=" <%=request.getContextPath()%>/loginServlet" method="POST">

		<p>User name: <input type="text" name="username"/></p>

		<p>Password: <input type="password" name="password" required/></p> 

		<input type="submit" value="Sign in"/>

	</form>

</body>
</html>