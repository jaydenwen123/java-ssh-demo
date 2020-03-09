<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
    <title>My JSP 'StuManager.jsp' starting page</title>
  </head>
  
  <body>
	<h2 >
  		<font color="green">欢迎${teacher.username },请选择对学生的操纵</font>
  	</h2>
  	<table >
  			<tr><td><a href="${pageContext.request.contextPath }/dealStu.do?flag=toAddStu">添加学生</a></td></tr>
  			<tr><td><a href="${pageContext.request.contextPath }/show.do?flag=showStu">查看学生</a></td></tr>
  			<tr><td><a href="${pageContext.request.contextPath }/login.do?flag=toMainFrame">返回</a></td></tr>
  	</table>

  </body>
</html>
