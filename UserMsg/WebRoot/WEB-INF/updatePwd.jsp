<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
    <title>My JSP 'updatePwd.jsp' starting page</title>
  </head>
  
  <body>
		<form action="${pageContext.request.contextPath }/updatepwd.do?flag=UpdatePwd" method="post">
			<table>
				<caption align="top">修改密码   <a href="${pageContext.request.contextPath }/dealMessage.do?flag=ToCenter">返回</a></caption> 
				<tr><td>旧密码：</td><td><input type="password" name="oldPwd"/></td></tr>
				<tr><td>新密码：</td><td><input type="password" name="newPwd"/></td></tr>
				<tr><td>再输一次：</td><td><input type="password" name="againPwd"/></td></tr>
				<tr><td><input type="submit" value="确认"/></td><td align="center"><input type="reset" value="取消"/></td></tr>
			</table>
			${updateerr }
		</form>
  </body>
</html>
