<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
    <title>My JSP 'c_catch.jsp' starting page</title>
  </head>
  
  <body>
  <h1>c:catch 标签的使用</h1>
  <c:catch var="myexception">
    <%
    	int a=8/0;
     %>
  </c:catch>
  <c:out value="${myexception}"></c:out>
  </body>
</html>
