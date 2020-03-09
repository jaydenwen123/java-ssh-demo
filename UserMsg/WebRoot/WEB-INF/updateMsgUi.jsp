<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
    <title>My JSP 'pubMsgUi.jsp' starting page</title>
  </head>
  
  <body>
  	<form action="${pageContext.request.contextPath }/dealMessage.do?flag=UpdateMessage"  method="post">
  		<table>
  			<caption align="top">更新留言</caption>
  			<tr><td>标题：</td> <td><input type="text" name="title" value="${msg.title }" /></td></tr>
  			<tr><td>内容：</td> <td> <textarea  name="content" rows="8" cols="50" >${msg.content }</textarea> </td></tr>
  			<tr><td align="right"><input type="submit" value="修改"/></td><td align="center"><input type="reset" value="取消"/></td></tr>
  			<tr>
  			<td align="center" colspan="2">
  			<a href="${pageContext.request.contextPath }/dealMessage.do?flag=ShowMessageList1">返回</a>
  			</td>
  			</tr>
  		</table>
  	</form>
  </body>
</html>
