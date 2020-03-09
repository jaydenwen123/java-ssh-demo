<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
    <title>My JSP 'login.jsp' starting page</title>
  </head>
  
  <body>
   	<form action="/myssh/login.do?flag=login" method="post">
   		<table>
   			<tr><td>用户ID：</td><td><input type="text" name="id"/></td></tr>
   			<tr><td>密码：</td><td><input type="password" name="password"/></td></tr>
   			<tr><td><input type="submit" value="登录"/></td><td><input  type="reset" value="重置"/></td></tr>
   		</table>
   		<h3>
			<font color="red">
   				${errorMessage}	
			</font>
   		</h3>
   	</form>
  </body>
</html>
