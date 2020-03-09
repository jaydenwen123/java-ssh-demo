<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
    <title>My JSP 'updateStu.jsp' starting page</title>
  </head>
  
  <body>
       <form action="${pageContext.request.contextPath }/dealStu.do?flag=updateStu" method="post">
   	<table >
   		<caption align="top">更改学生界面</caption>
   		<tr><td>姓名：</td> <td><input type="text" name="stuName" value="${student.stuName }"/></td></tr>
   		<tr><td>学号：</td> <td><input type="text" name="stuNo" value="${student.stuNo }"/></td></tr>
   		<tr><td>身份证：</td> <td><input type="text" name="humanid" value="${student.humanid }"/></td></tr>
   		<tr><td>班级：</td> <td><input type="text" name="className" value="${student.className }"/></td></tr>
   		<tr><td>邮箱：</td> <td><input type="text" name="stuMail" value="${student.stuMail }"/></td></tr>
   		<tr><td>地址：</td> <td><input type="text" name="address" value="${student.address }"/></td></tr>
   		<tr><td>电话：</td> <td><input type="text" name="stuPhone" value="${student.stuPhone }"/></td></tr>
   		<tr>
   			<td><input type="submit" value="修改" /></td>
   			 <td align="left"><input type="reset" value="取消"/></td>
   			 <td><a href="${pageContext.request.contextPath }/show.do?flag=showStu">返回</a></td>
   		</tr>
   	</table>
   </form>
  </body>
</html>
