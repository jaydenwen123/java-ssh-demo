<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
    <title>My JSP 'center.jsp' starting page</title>
 <!--<link rel="stylesheet" type="text/css" href="./styles.css">-->
  </head>
  	
  <body>
    <table>
  	<caption>个人信息完善</caption>
    	<tr><td>用户名</td><td><input type="text" value="${teacher.username}" readonly="readonly" /></td></tr>
    	<tr><td>手机号</td><td><input type="text" value="12345678912" disabled="disabled"/></td></tr>
    	<tr><td>邮箱</td><td><input type="text" value="2282186474@qq.com" readonly="readonly" disabled="disabled"/></td></tr>
    	<tr><td><a href="${pageContext.request.contextPath }/modifyPwd.do?flag=toModifyPwd">是否修改密码</a>
    			<a href="${pageContext.request.contextPath }/login.do?flag=toMainFrame">返回</a>
    			</td></tr>
    </table>
    <span id="span" style="color: red">${successMsg }</span>
   
  </body>
</html>
