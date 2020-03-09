<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
    <title>个人中心</title>
  </head>
  
  <body>
   	<table>
   		<caption>个人中心</caption>
   		<tr><td>用户名：</td><td><input type="text" value="${user.username }" readonly="readonly"/></td></tr>
   		<tr><td>邮箱：</td><td><input type="text" value="${user.email }" readonly="readonly"/></td></tr>
   		<tr><td><a href="${pageContext.request.contextPath }/updatepwd.do?flag=ToUpdatePwd">修改密码</a></td>
   			<td><a href="${pageContext.request.contextPath }/loginOrReg.do?flag=ToMainFrame">返回主界面</a></td></tr>
  	</table>
  	
  		${updateok }
  </body>
</html>
