<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
    <title>My JSP 'register.jsp' starting page</title>
  </head>
  
  <body>
    <form action="${pageContext.request.contextPath }/loginOrReg.do?flag=Register" method="post">
    	<table>
    			<caption  >用户注册</caption>
			<tr><td>用户名：</td><td><input type="text"  name="username" size="15"/></td></tr>
			<tr><td>密码：</td><td><input  type="password" name="password" size="16"/></td></tr>
			<tr><td>邮箱</td><td><input type="text" name="email" size="15"/></td></tr>
			<tr><td><input type="submit" value="注册" align="left"/></td>
				<td align="right"><input type="reset"  value="重置" align="right"/></td>
			</tr>
  			
		</table>
		<a href="${pageContext.request.contextPath }">返回登录界面</a>
		${reqistererr }<br/>
    </form>
  </body>
</html>
