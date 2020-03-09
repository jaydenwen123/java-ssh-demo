<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
    <title>My JSP 'MyJsp.jsp' starting page</title>
  </head>
  
  <body>
  <%
  	request.setAttribute("abc123", "12334");
   %>
	<c:out value="${abc }"></c:out><br />
	<c:remove var="abc123" scope="request" />
	<c:out value="${abc123 }" default="no value"></c:out><br/>
  </body>
</html>
