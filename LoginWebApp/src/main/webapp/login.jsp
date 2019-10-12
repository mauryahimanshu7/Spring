<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${logonerror}
	<form action="login">
		username : <input type="text" name="username" size="30" required /><br>
		password : <input type="password" name="password" size="30" required /><br>
		<hr>
		<input type="submit" value="Login" />
	</form>
</body>
</html>