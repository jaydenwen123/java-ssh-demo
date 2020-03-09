<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
    <title>My JSP 'questionManager.jsp' starting page</title>
 <!--<link rel="stylesheet" type="text/css" href="./styles.css">-->
  </head>
  
  <body>
   	<h1>试题管理界面</h1>
   	<a href="${pageContext.request.contextPath }/dealQuestion.do?flag=toAddQuestion">录入试题</a><br/>
   	<a href="${pageContext.request.contextPath }/show.do?flag=showQuestion">查看试题</a><br/>
   	<a href="${pageContext.request.contextPath }/login.do?flag=toMainFrame">返回上一级</a>
  </body>
</html>
