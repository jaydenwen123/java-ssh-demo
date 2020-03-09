<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
    <title>My JSP 'operok.jsp' starting page</title>
  </head>
  
  <body>
    <h2>
    	<font color="green">
    		操作执行成功
    	</font>
    </h2>
    <a href="${pageContext.request.contextPath}/login.do?flag=returnMainFrame">返回主界面</a>
  </body>
</html>
