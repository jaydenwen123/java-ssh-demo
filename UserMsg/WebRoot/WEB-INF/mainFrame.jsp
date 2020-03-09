<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
    <title>My JSP 'mainFrame.jsp' starting page</title>
  </head>
  
  <body>
    	<h2>欢迎<font color="red">${user.username }! </font>请选择您的操作</h2>
    	<a href="${pageContext.request.contextPath }/dealMessage.do?flag=ToCenter">个人中心</a><br/>
    	<a href="${pageContext.request.contextPath }/dealMessage.do?flag=ToSelectShowWay">查看留言</a><br/>
    	<a href="${pageContext.request.contextPath }/dealMessage.do?flag=ToPubMessage">发表留言</a><br/>
    	<a href="${pageContext.request.contextPath }/loginOrReg.do?flag=Exit">退出系统</a><br/>
  </body>
</html>
