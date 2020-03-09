<%@ page import="com.wen.domain.Rat"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
    <title>My JSP 'MyJsp.jsp' starting page</title>
  </head>
  
  <body>
  		<%
  			request.setAttribute("aaa", "123;12321;3213;34543;5435;4;65;7");
  		 %>
  	
	<h1>
		<font color="green">
			迭代标签dortoken的使用
		</font>
	</h1>
	<c:forTokens items="${aaa }" delims=";" var="temp" begin="1" end="6" step="2">
			${temp }----->
	</c:forTokens>
  </body>
</html>
