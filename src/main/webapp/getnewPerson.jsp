<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<jsp:useBean id="storagee" class="com.example.DariuszFe.service.Rejestracja" scope="application" />
	<jsp:useBean id="rejestracja" class="com.example.DariuszFe.domain.rejestracja" scope="session" />

	<form action="newPerson.jsp">

		Login :<input type="text" name="login" value="${rejestracja.login}" /><br />  
		Password :<input type="text" name="password" value="${rejestracja.password}" /><br />
		Email:<input type="text" name="email" value="${rejestracja.email}" /><br />
		<input type="submit" value=" OK ">

	</form>
	<form action="index.jsp" method="post">
	<input type="submit" value="Home page">
	</form>

</body>
</html>