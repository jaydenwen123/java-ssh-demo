<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
    <title>My JSP 'opererr.jsp' starting page</title>
  </head>
  
  <body>
   	${updateMsg }${deleteMsg }<br/>
   	<a href="${pageContext.request.contextPath }/show.do?flag=showQuestion">返回</a>
  </body>
</html>
