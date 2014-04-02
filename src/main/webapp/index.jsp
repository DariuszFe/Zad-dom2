<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Projekt DariuszFe</title>
</head>
<body>
<table border=1 width="100%">
	<tr><td><center><h2>Registration for racing in Kościerzyna</h2></center></td></tr>
</table>
	
	<p>To subscribe to the racing must log</p>
	<p>
		<a href="login.jsp">Log in</a>
	</p>
	 <form method="post" action="register">
        Name:<input type="text" name="name" /><br/>
        Email ID:<input type="text" name="email" /><br/>
        Password:<input type="text" name="pass" /><br/>
        <input type="submit" value="register" />
      </form>
</body>
</html>
