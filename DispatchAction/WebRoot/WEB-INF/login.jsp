<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
 
<html> 
	<head>
		<title>JSP for LoginForm form</title>
	</head>
	<body>
		<html:form action="/login.do?flag=ToLogin"  method="post">
			用户名：<html:text property="username" ></html:text><br/>
			  密码：  <html:text property="password" ></html:text><br/>
			 <html:submit property="submit" value="login"></html:submit>
		</html:form>
	</body>
</html>

