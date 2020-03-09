<%@page import="com.wxf.domain.Cat"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="logic"  uri="http://struts.apache.org/tags-logic"%>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean"%>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
    <title>My JSP 'logictag.jsp' starting page</title>
  </head>
  
  <body>
  <%
 	request.setAttribute("aaa", "111");
  	Cat cat1=new Cat();
  	cat1.setName("cat1");
  	cat1.setAge(12);
  	Cat cat2=new Cat();
  	cat2.setName("cat2");
  	cat2.setAge(13);
  	Cat cat3=new Cat();
  	cat3.setName("cat3");
  	cat3.setAge(14);
  	ArrayList list=new ArrayList();
  	list.add(cat1);
  	list.add(cat2);
  	list.add(cat3);  
  	request.setAttribute("cats", list);
   %>
   <h2>
   	<font color="red">
   		struts 迭代标签logic：iterator
   	</font>
   </h2>
	<logic:iterate id="mycat1" name="cats">
		<bean:write name="mycat1" property="name" />
		<bean:write name="mycat1" property="age" /><br/>
	</logic:iterate>
	 <h2>
   	<font color="red">
   		jstl 迭代标签c:foreach
   	</font>
   </h2>
   <c:forEach items="${cats }" var="cat">
   	${cat.name }|||${cat.age }<br/>
   </c:forEach>
   
   <h2>
   	<font color="blue">
   		struts:lgoic标签的logic：empty;logic：notempty
   	</font>
   </h2>
   <logic:empty name="aaa">
   	aaa属性为空
   </logic:empty>
   <logic:notEmpty name="aaa">
   	aaa属性不为空:属性为：<bean:write name="aaa"/><br/>
   </logic:notEmpty>
    <h2>
   	<font color="yellow">
   		struts:lgoic标签的logic:greatEqual;logic:greaterThan
   	</font>
   </h2>
   <logic:iterate id="mycat" name="cats">
   	<logic:greaterThan name="mycat" value="13" property="age">
   		<bean:write name="mycat" property="age" />大于13<br/>
   	</logic:greaterThan>
   	<logic:greaterEqual value="13" name="mycat" property="age">
   		${mycat.age }大于等于13<br/>
   	</logic:greaterEqual>
   </logic:iterate>
   
   <logic:greaterThan value="1" name="2">
   	大于
   </logic:greaterThan>
  </body>
</html>
