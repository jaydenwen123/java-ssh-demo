<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
    <title>My JSP 'unknown.jsp.jsp' starting page</title>
  </head>
  
  <body>
   <h1>
   	<font color="red">
   		非法用户请求，请先登录;
   	</font>
   	<a href="${pageContext.request.contextPath }">去登陆</a>
   </h1>
  </body>
</html>
