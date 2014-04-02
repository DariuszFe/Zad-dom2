<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>

	<jsp:useBean id="storage"
		class="com.example.DariuszFe.service.StorageService"
		scope="application" />
	<jsp:useBean id="user" class="com.example.DariuszFe.domain.User"
		scope="session" />

	<form action="loginServlet.jsp" method="post">

		login :<input type="text" name="login" value="${user.login}" /><br />
		password :<input type="text" name="password" value="${user.password}" /><br />
		<input type="submit" value=" OK ">

	</form>
	<p><h2>Wrong password or invalid user name</h2></p>
</body>
</html>