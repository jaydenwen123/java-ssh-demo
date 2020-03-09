<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>My  Jsp</title>
</head>
<body>
${error }
		<form action="login.do" method="post">
		用户登录<br>
		<hr>		
		用户名<input type="text" name="userId"><br>
		密码<input type="text" name="password"><br>
		<input type="submit" value="登录">
	</form>
</body>
</html>