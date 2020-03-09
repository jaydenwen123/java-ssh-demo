<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
    <title>My JSP 'error.jsp' starting page</title>
  </head>
  
  <body>
	操作失败，请返回主界面 <br/>
	<a href="${pageContext.request.contextPath }/loginAndOut.do?flag=ToReturn">返回</a>
  </body>
</html>
