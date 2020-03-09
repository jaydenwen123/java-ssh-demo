<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
    <title>My JSP 'addQuestion.jsp' starting page</title>
 <!--<link rel="stylesheet" type="text/css" href="./styles.css">-->
  </head>
  
  <body>
    <h1>试题修改界面</h1>
    <form action="${pageContext.request.contextPath }/dealQuestion.do?flag=updateQuestion"  method="post">
    	<table>
    		<caption>请在下方录入您要录入的题目</caption>
    		<tr><td>试题类型</td><td> 
    			<select name="qutype">
    				<option value="computer" >计算机</option>
    				<option value="chinese">语文</option>
    				<option value="math">数学</option>
    			</select>
    			</td>
    		</tr>
    		<tr><td>试题题号</td><td> <input type="text" name="id" value=${question.id }/></td></tr>
    		<tr><td>考试通知</td><td> <input type="text" name="examtype" /></td></tr>
    		<tr><td>试题题目</td><td> <input type="text" name="qutitle" value="${question.qutitle }"/></td></tr>
    		<tr><td>试题难度</td><td> <input type="text" name="quhard"  value="${question.quhard }"/></td></tr>
    		<tr><td>试题分数</td><td> <input type="text" name="quscore" value="${question.quscore }"/></td></tr>
    		<tr><td>试题选项</td><td> <input type="text" name="selectOption"  value="${question.selectOption }"/></td></tr>
    		<tr><td>试题答案</td><td> <input type="text" name="quAnswer"  value="${question.quAnswer }"/></td></tr>
    		<tr><td>试题解析</td><td> <textarea cols="30" rows="10"></textarea>   </td> </tr>
    		<tr><td><input type="submit" value="提交"/></td><td><input type="reset" value="取消"/><a href="${pageContext.request.contextPath }/show.do?flag=showQuestion">返回</a></td></tr>
    	</table>
    	<span style="color: red;font-size: 14px;">${addQueMsg }</span>
    </form>
  </body>
</html>
