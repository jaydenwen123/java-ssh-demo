<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
    <title>用户留言详细信息</title>
  </head>
  
  <body>
    <table>
    	<caption align="top">留言详细信息</caption>
    	<tr><td>发布者：</td><td align="center">${msg.user.username }</td></tr>
    	<tr><td>发表时间：</td><td align="center">${msg.pubDate }</td></tr>
    	<tr><td>标题：</td><td align="center">${msg.title }</td></tr>
    	<tr>
    		<td>内容：</td>
    		<td>
    		<textarea cols="40" rows="8" readonly="readonly" >${msg.content }</textarea>
    		</td>
    	</tr>
    	<tr>
    	<td colspan="2" align="center">
    	<a href="${pageContext.request.contextPath }/dealMessage.do?flag=ShowMessageList1">返回</a>
    	</td>
    	</tr>
    </table>
  </body>
</html>
