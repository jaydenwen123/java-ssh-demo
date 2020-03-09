<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
    <title>My JSP 'MyJsp.jsp' starting page</title>
  </head>
  
  <body>
	<c:set var="abc" value="12343"/> <br />
	<c:out value="${abc }"></c:out>
  </body>
</html>
