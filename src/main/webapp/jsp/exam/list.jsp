<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'queryInterview.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <table border="1">
    	<thead>
    		<tr>
    			<th>学生</th>
    			<th>导师</th>
    			<th>笔试时间</th>
    			<th>公司</th>
    			<th>状态</th>
    			<th>操作</th>
    		</tr>
    	</thead>
    	<tbody>
    		<tr>
    			<td>刘樊</td>
    			<td>戈维维</td>
    			<td>2018-04-24</td>
    			<td>中国平安</td>
    			<td><span style="color: green">完成</span></td>
    			<td><input type=button value="答题" onclick="window.open('exam/answer.action','_blank')">
    			<input type=button value="修改" onclick="window.open('exam/update.action','_blank')"></td>
    		</tr>
    		<tr>
    			<td>王静</td>
    			<td>戈维维</td>
    			<td>2018-04-24</td>
    			<td>好卖基金</td>
    			<td><span style="color: red">待做</span></td>
    			<td><input type=button value="答题" onclick="window.open('exam/answer.action','_blank')">
    			<input type=button value="修改" onclick="window.open('exam/update.action','_blank')">
    			</td>
    		</tr>
    		<tr>
    			<td>刘樊</td>
    			<td>戈维维</td>
    			<td>2018-04-24</td>
    			<td>中国平安</td>
    			<td><span style="color: blue">答题中</span></td>
    			<td><input type=button value="答题" onclick="window.open('exam/answer.action','_blank')">
    			<input type=button value="修改" onclick="window.open('exam/update.action','_blank')"></td>
    		</tr>
    	</tbody>
    </table>
  </body>
</html>
