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
    			<th>学号</th>
    			<th>姓名</th>
    			<th>导师</th>
    			<th>公司</th>
    			<th>面试日期</th>
    			<th>面试时间</th>
    			<th>笔试进度</th>
    			<th>到岗时间</th>
    			<th>进度</th>
    			<th>结果</th>
    			<th>实际薪资</th>
    			<th>录音下载</th>
    			<th>操作</th>
    		</tr>
    	</thead>
    	<tbody>
    		<tr>
    			<td>S0001</td>
    			<td>果芽</td>
    			<td>导师</td>
    			<td>中国平安</td>
    			<td>2018-04-24</td>
    			<td>14:30</td>
    			<td>答题中</td>
    			<td>2018-04-26</td>
    			<td>面试结束</td>
    			<td>通过</td>
    			<td>12K</td>
    			<td><input type=button value="下载" onclick="window.open('http://www.baidu.com')"></td>
    			<td><input type=button value="详情" onclick="window.open('interview/detail.action','_self')">
    			<input type=button value="更改" onclick="window.open('interview/update.action','_self')">
    			<input type=button value="添加笔试" onclick="window.open('exam/init.action','right')"></td>
    		</tr>
    		
    		<tr>
    			<td>S0001</td>
    			<td>果芽</td>
    			<td>导师</td>
    			<td>中国平安</td>
    			<td>2018-04-24</td>
    			<td>10:30</td>
    			<td>2018-04-26</td>
    			<td>面试结束</td>
    			<td>通过</td>
    			<td>12K</td>
    			<td><input type=button value="下载" onclick="window.open('http://www.baidu.com')"></td>
    			<td><input type=button value="详情" onclick="window.open('interview/detail.action','_self')">
    			<input type=button value="更改" onclick="window.open('interview/add.action','_self')"></td>
    		</tr>
    	</tbody>
    </table>
  </body>
</html>
