<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
    <title>My JSP 'modifyPwd.jsp' starting page</title>
 <!--<link rel="stylesheet" type="text/css" href="./styles.css">-->
  </head>
  
  <body>
  	<span>密码修改界面</span><br/>
   <form action="${pageContext.request.contextPath }/modifyPwd.do?flag=modifyPwd" method="post">
   <table>
  	<tr> <td>旧密码:</td><td>	<input type="password" name="oldPwd"/></td></tr>
   	<tr> <td>新密码:</td><td><input type="password" name="newPwd"/></td> </tr>
   	<tr><td>确认密码:</td> <td><input type="password" name="newPwdAgain"/> </td></tr>
   	<tr><td><input type="submit" value="修改"/></td>
   		<td><a href="${pageContext.request.contextPath }/modifyPwd.do?flag=toCenter">返回</a></td></tr>
   </table>
   	<span style="color: red;">${errorMsg }</span>
   </form>
  </body>
</html>
