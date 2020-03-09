<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
    <title>My JSP 'htmltag.jsp' starting page</title>
  </head>
  
  <body>
    <html:button property="mybutton" value="文小飞"/>
    <html:cancel property="mycancel" value="取消"/>
  	 <html:image src="images/937514292.png"/>
	<html:img src="images/937514292.png" />
	<html:link href="http://www.sohu.com">连接到搜狐</html:link>
	<html:form action="/login.do" method="post">
	<html:text property="name"></html:text>
	<html:checkbox property="fruit" value="apple">123</html:checkbox>
	</html:form>
  </body>
</html>
