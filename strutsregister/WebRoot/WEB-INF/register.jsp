<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
    <title>My JSP 'register.jsp' starting page</title>
  </head>
  
  <body>
  <html:errors />
	<html:form action="/register.do" method="post">
		用户ID:<html:text property="userid" ></html:text><br/>
		用户名:<html:text property="username"></html:text><br/>
		 邮箱： <html:text property="email"></html:text><br/>
		<html:submit >提交</html:submit>
		<html:cancel >取消</html:cancel>
	</html:form>
  </body>
</html>
