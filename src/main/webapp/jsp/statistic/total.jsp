<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'statisticInterview.jsp' starting page</title>

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
	<h1>全体学生</h1>
	<table>
		<thead>
			<tr>
				<th>学生数</th>
				<th>面试次数</th>
				<th>通过次数</th>
				<th>最低薪资</th>
				<th>最高薪资</th>
				<th>中位薪资</th>
				<th>平均薪资</th>
				<th>总薪资</th>
				<th>公司家数</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>83</td>
				<td>527</td>
				<td>272</td>
				<td>9000</td>
				<td>17000</td>
				<td>15000</td>
				<td>13000</td>
				<td>8,000,000</td>
				<td>63</td>
				<td><input type=button value="详情" onclick="window.open('statistic/class.action','_blank')"></td>
			</tr>
		</tbody>
	</table>
	
	<br><br>
	
	<h1>初级班</h1>
	<table>
		<thead>
			<tr>
				<th>学生数</th>
				<th>面试次数</th>
				<th>通过次数</th>
				<th>最低薪资</th>
				<th>最高薪资</th>
				<th>中位薪资</th>
				<th>平均薪资</th>
				<th>总薪资</th>
				<th>公司家数</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>43</td>
				<td>527</td>
				<td>272</td>
				<td>9000</td>
				<td>17000</td>
				<td>15000</td>
				<td>13000</td>
				<td>8,000,000</td>
				<td>63</td>
				<td><input type=button value="详情" onclick="window.open('statistic/class.action','_blank')"></td>
			</tr>
		</tbody>
	</table>
	
	<br><br>	
	<h1>中级班</h1>
	<table>
		<thead>
			<tr>
				<th>学生数</th>
				<th>面试次数</th>
				<th>通过次数</th>
				<th>最低薪资</th>
				<th>最高薪资</th>
				<th>中位薪资</th>
				<th>平均薪资</th>
				<th>总薪资</th>
				<th>公司家数</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>35</td>
				<td>527</td>
				<td>272</td>
				<td>9000</td>
				<td>17000</td>
				<td>15000</td>
				<td>13000</td>
				<td>8,000,000</td>
				<td>63</td>
				<td><input type=button value="详情" onclick="window.open('statistic/class.action','_blank')"></td>
			</tr>
		</tbody>
	</table>
	
</body>
</html>
