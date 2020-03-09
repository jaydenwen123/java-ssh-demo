<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html>
  <head>
    <title>My JSP 'mainFrame.jsp' starting page</title>
  </head>
  
  <body>  	
  	<h2 >
  		<font color="red">欢迎${teacher.username },请选择您的操作</font>
  	</h2>
  	<table >
  			<tr><td><a href="${pageContext.request.contextPath }/modifyPwd.do?flag=toCenter">个人中心</a></td></tr>
  			<tr><td><a href="${pageContext.request.contextPath }/dealStu.do?flag=toManager">管理学生</a></td></tr>
  			<tr><td><a href="${pageContext.request.contextPath }/dealQuestion.do?flag=toQuestionManager">管理试题</a></td></tr>
  			<tr><td><a href="${pageContext.request.contextPath }/login.do?flag=exitLogin">退出系统</a></td></tr>
  	</table>
  </body>
</html>
