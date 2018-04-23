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
    			<th>公司</th>
    			<th>性质</th>
    			<th>电话时间</th>
    			<th>面试时间</th>
    			<th>到岗时间</th>
    			<th>状态</th>
    			<th>薪资</th>
    			<th>没过原因</th>
    			<th>难点问题</th>
    			<th>备注</th>
    			<th>录音下载</th>
    		</tr>
    	</thead>
    	<tbody>
    		<tr>
    			<td>S0001</td>
    			<td>果芽</td>
    			<td>中国平安</td>
    			<td>保险</td>
    			<td>2018-04-23</td>
    			<td>2018-04-24</td>
    			<td>2018-04-26</td>
    			<td>面试通过</td>
    			<td>12K</td>
    			<td>面试简历可以写得简单一些，面试项目只需要能从粗到细说溜一致两个模块就行，技术方面的专业名词需要强化</td>
    			<td>adb命令不清楚</td>
    			<td></td>
    			<td><input type=button value="下载" onclick="window.open('http://www.baidu.com')"></td>
    			<td><input type=button value="更改" onclick="window.open('interview/update.action','_self')"></td>
    		</tr>
    	</tbody>
    </table>
  </body>
</html>
