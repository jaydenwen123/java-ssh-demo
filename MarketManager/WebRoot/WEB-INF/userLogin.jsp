<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
 
<html> 
	<head>
		<title>JSP for UserLoginForm form</title>
	</head>
	<body>
		<html:form action="/loginAndOut?flag=login" method="post">
			用户名:<html:text property="username" /><html:errors property="username"/><br/>
			密　码:<html:password property="password"/><html:errors property="password"/><br/>
			<html:submit value="提交"/><html:cancel  value="取消"/>
		</html:form>
	</body>
</html>

