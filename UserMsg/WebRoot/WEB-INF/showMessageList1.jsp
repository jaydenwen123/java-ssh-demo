<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
    <title>显示留言</title>
  </head>
  <body>
   	<table>
   		<tr>
   		<th colspan="2" width="100" align="center">发布者</th>
   		<th colspan="2"  width="200" align="center">标题</th>
   		<th colspan="2"  width="200" align="center">邮箱</th>
   		<th colspan="2"  width="200" align="center">发表时间</th>
   		<th colspan="2"  width="50" align="center">修改留言</th>
   		<th colspan="2"  width="50" align="center">删除留言</th>
   		</tr>
   		<c:forEach items="${messages }"  var="msg">
   			<tr>
   			<td colspan="2" width="100" align="center">${msg.user.username }</td>
   			<td colspan="2" width="200" align="center">
   			<a href="${pageContext.request.contextPath }/dealMessage.do?flag=ShowMessage&m_id=${msg.id}">
   				${msg.title }
   			</a>
   			</td>
   			<td colspan="2" width="200" align="center">${msg.user.email }</td>
   			<td colspan="2" width="200" align="center">${msg.pubDate }</td>
   			<td colspan="2" width="50" align="center">
   			<a href="${pageContext.request.contextPath }/dealMessage.do?flag=ToUpdateMessage&m_id=${msg.id}">修改</a>
   			</td>
   			<td colspan="2" width="50" align="center">
   			<a href="${pageContext.request.contextPath }/dealMessage.do?flag=DeleteMessage&m_id=${msg.id}">删除</a>
   			</td>
   			</tr>
   		</c:forEach>
   		
   			<tr>
   			<td>
   			<c:forEach begin="1" end="${pageCounts }" var="i">
   				<a href="${pageContext.request.contextPath }/dealMessage.do?flag=ShowMessageList1&pageNow=${i}"><${i }></a>
   			</c:forEach>
   			</td>
   			</tr>
   		
   	</table>
   <a href="${pageContext.request.contextPath }/loginOrReg.do?flag=ToMainFrame">返回主界面</a>
  </body>
</html>
