<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
    <title>My JSP 'success.jsp' starting page</title>
  </head>
  
  <body>
	操作执行成功，请返回继续选择操作<br/>
	<a href="${pageContext.request.contextPath }/deptAction.do?flag=DeptList">返回主界面</a>
  </body>
</html>
