<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
    <title>My JSP 'a.jsp' starting page</title>
  </head>
  
  <body>
	<c:import url="a.jsp">
		<c:param name="12" value="qwe"></c:param>
	</c:import>
  </body>
</html>
