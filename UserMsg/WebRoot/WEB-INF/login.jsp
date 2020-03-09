<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
    <title>My JSP 'login.jsp' starting page</title>
  </head>
  
  <body>
   <form action="${pageContext.request.contextPath }/loginOrReg.do?flag=Login" method="post">
    	<table>
    		<caption>用户登录</caption>
			<tr><td>用户名：</td><td><input type="text"  name="username" size="15"/></td></tr>
			<tr><td>密码：</td><td><input  type="password" name="password" size="15"/></td></tr>
			<tr><td><input type="submit" value="登录" align="left"/></td>
				<td><input type="reset"  value="重置" align="right"/></td>
			</tr>
			<tr><td>       <td>${registerok }</td></tr>	
			<caption align="bottom">如果您还没有进行注册，请点击
			<a href="${pageContext.request.contextPath }/loginOrReg.do?flag=ToRegister">
			这里</a>注册</caption>
		</table>
		<font color="red">${errMsg }</font>
    </form>
  </body>
</html>
