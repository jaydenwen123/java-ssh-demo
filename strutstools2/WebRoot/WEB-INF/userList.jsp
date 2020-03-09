<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"   %>
<%@ taglib  prefix="html" uri="http://struts.apache.org/tags-html" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
    <title>My JSP 'userList.jsp' starting page</title>
  </head>
  
  <body>
	<c:forEach items="${users }" var="user">
		${user.username }  <html:img  src="/strutstools2/files/${user.newfilename }" width="100px"/>
		<a href="/strutstools2/downLoad.do?username=${user.username}">点击下载</a>
		<br/>
	</c:forEach>
  </body>
</html>
