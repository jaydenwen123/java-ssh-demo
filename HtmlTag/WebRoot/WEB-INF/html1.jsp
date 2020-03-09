<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
    <title> this is the first html page </title>
  </head>
  
  <body> 
		用户名：<input type="text"  name="username"/> <br/>
		密　码：<input type="password" name="password"/> <br/>
		***********************性别***********************<br />
		<input  type="radio" name="sex" />男<br/>
		<input  type="radio" name="sex" />女<br />
		***********************爱好**********************<br/>
		<input type="checkbox" name="like"/>苹果<br/>
		<input type="checkbox" name="like"/>香蕉<br/>
		<input type="checkbox" name="like"/>橘子<br/>
		<input type="checkbox" name="like" checked="checked"/>橙子<br/>
		***********************所在城市选择***********************<br/>
		<select name="city">
			<option selected="selected">-----请进行选择-------</option>
			<option>北京</option>
			<option>上海</option>
			<option>广州</option>
			<option>湖南</option>
			<option>甘肃</option>
			<option>山西</option>
		</select><br/>
		个人免冠照<input type="image" width="140px" src="./images/wuqilong.jpg"/><br/>
		<input type="file" name="myfile"/>选择你的文件<br/>
		<input type="hidden" value="nihao"/>
		<input  type="submit" value="提交"/>
		　　　<input  type="reset" value="重置"/><br/>
		
  </body>
</html>
