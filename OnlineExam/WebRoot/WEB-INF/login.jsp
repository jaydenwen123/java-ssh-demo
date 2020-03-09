<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
 
<html> 
	<head>
		<title>JSP for LoginForm form</title>
	</head>
	<body>
		<html:form action="/login.do?flag=login" method="post">
			<table>
				<tr> 
					<td>用户名：</td> <td><html:text property="username" /></td></tr> 
				<tr><td>密　码：</td> <td><html:password property="password"/></td> </tr>
				<tr><td><html:submit value="提交"></html:submit></td> <td align="center"> <html:cancel value="取消"/></td></tr>
				<tr> 
				<td colspan="2">如果您还没有进行注册，请点击<a href="${pageContext.request.contextPath }/regTeacher.do?flag=toReg">这里</a>进行注册</td>
				
				</tr>
				<tr> <td colspan="2">
					<font color="red">
						${regMsg }
						${loginFailMsg }
					</font>
				</td></tr>
				<tr>
					<td rowspan="2" align="right">
						<select name="part">
							<option value="1">老师</option>
							<option value="2">学生</option>
						</select>
					</td>
				</tr>
			</table>
		</html:form>
	</body>
</html>

