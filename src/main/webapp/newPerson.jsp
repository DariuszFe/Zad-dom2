<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="rejestracja"
		class="com.example.DariuszFe.domain.rejestracja" scope="session" />

	<jsp:setProperty name="rejestracja" property="*" />

	<jsp:useBean id="storagee" class="com.example.DariuszFe.service.Rejestracja" scope="application" />

<% 
  storagee.add(rejestracja);
%>

	<p>Zarejestrowano</p>
	<p>Login: ${rejestracja.login}</p>
	<p>Password: ${rejestracja.password}</p>
	<p>Email: ${rejestracja.email}</p>
	
	<form action="login.jsp" method="post">
	<input type="submit" value="LogIn page">
	</form>
</body>
    
</html>