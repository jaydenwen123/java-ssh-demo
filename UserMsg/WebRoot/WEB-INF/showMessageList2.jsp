<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
    <title>显示留言</title>
  </head>
  <body>
   	<table>
   		<tr>
   			<th width="120">作者</th>
   			<th width="480">留言标题</th>
   		</tr>
   		<logic:present  name="messages" scope="request">
   			<logic:iterate id="message" name="messages" scope="request" type="com.wxf.domain.Message">
   			<tr>
   				<td align="center" width="167"> ${message.user.username }</td>
   				<td align="center"> 
   					<a href="${pageContext.request.contextPath  }/dealMessage.do?flag=ShowMessage&m_id=${message.id}">
   						<bean:write name="message" property="title"/>
   					</a>
   				</td>
   			</tr>
   			</logic:iterate>
   		</logic:present>
   		
   		<logic:notPresent  name="messages" scope="request">
   			<tr>
   				<td align="center" colspan="2">暂时没有任何留言 </td>
   			</tr>
   		</logic:notPresent>
   		
   		<tr>
   			<td align="right" colspan="2">
   				第${pageNow }页 
   				共${pageCounts }页
   			
   				<a href="${pageContext.request.contextPath }/dealMessage.do?flag=ShowMessageList2&pageNow=1">首页</a>
   				
   				<!--  
   				<logic:greaterThan  name="pageNow" value="1" scope="request">
   					<a href="${pageContext.request.contextPath }/dealMessage.do?flag=ShowMessageList2&pageNow=${pageNow-1}">
   				</logic:greaterThan>
   				上一页
   				<logic:greaterThan name="pageNow" value="1" scope="request">
   					</a>
   				</logic:greaterThan>
   				
   				
   				<logic:lessThan  name="pageNow" value="${pageCounts }" scope="request">
   					<a href="${pageContext.request.contextPath }/dealMessage.do?flag=ShowMessageList2&pageNow=${pageNow+1}">
   				</logic:lessThan>
   				下一页
   				<logic:lessThan name="pageNow" value='${pageCounts }' scope="request">
   					</a>
   				</logic:lessThan>
   				-->
   				
	   				<c:if test="${pageNow >1}" >
	   					<a href="${pageContext.request.contextPath }/dealMessage.do?flag=ShowMessageList2&pageNow=${pageNow-1}">
	   						</c:if>
	   						上一页
	   				<c:if test="${pageNow >1}" >	
	   					</a>
	   				</c:if>
	   				<c:if test="${pageNow<pageCounts}">
	   					<a href="${pageContext.request.contextPath }/dealMessage.do?flag=ShowMessageList2&pageNow=${pageNow+1}">
	   					</c:if>
	   					下一页
	   				<c:if test="${pageNow<pageCounts}">
	   					</a>
	   				</c:if>
   				 
   				<!-- 
   				<logic:greaterThan value="1" name="${pageNow }">
   				<a href="${pageContext.request.contextPath }/dealMessage.do?flag=ShowMessageList2&pageNow=${pageNow-1}">
   					上一页
   					</a>
   					</logic:greaterThan>
   					
   					<logic:lessThan value="${pageCounts }" name="${pageNow }">
   					<a href="${pageContext.request.contextPath }/dealMessage.do?flag=ShowMessageList2&pageNow=${pageNow+1}">
   					下一页
   					</a>
   				</logic:lessThan>
   				 -->
   				 
   				<a href="${pageContext.request.contextPath }/dealMessage.do?flag=ShowMessageList2&pageNow=${pageCounts}">尾页</a>
   			</td>
   		</tr>
   	</table>
   <a href="${pageContext.request.contextPath }/loginOrReg.do?flag=ToMainFrame">返回主界面</a>
  </body>
</html>
