<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
    <title>My JSP 'selectWay.jsp' starting page</title>
  </head>
  
  <body>
    	<h2>请选择显示方式</h2>
    	<h3>
    	<a href="${pageContext.request.contextPath }/dealMessage.do?flag=ShowMessageList1">方式一</a>
    	</h3>
    	<h3>
    	<a  href="${pageContext.request.contextPath }/dealMessage.do?flag=ShowMessageList2">方式二</a>
    	</h3>
  </body>
</html>
