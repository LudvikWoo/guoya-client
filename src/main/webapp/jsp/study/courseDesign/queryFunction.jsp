<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'queryQuestion.jsp' starting page</title>

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
	<div style="display: flex">
		<div>
			<ol>
				<li><a href="">接口</a>
					<ul>
						<li>字符串解析</li>
						<li>for循环</li>
					</ul></li>
				<li>界面
					<ul>
						<li>查看日志</li>
						<li>查看进程</li>
					</ul></li>
				<li>db<ul>
						<li>查看日志</li>
						<li>查看进程</li>
					</ul>
				</li>
				<li>linux<ul>
						<li>查看日志</li>
						<li>查看进程</li>
					</ul>
				</li>
			</ol>
		</div>
		<div>
			<table>
				<tr>
					<th>编号</th>
					<th>问题名称</th>
					<th>上级ID</th>
					<th>操作</th>
				</tr>
				<tr>
					<td>1</td>
					<td>ls</td>
					<td><a href="">231</a></td>
					<td><a href="">详情</a> | <a href="">更新</a></td>
				</tr>
				<tr>
					<td>2</td>
					<td>cd</td>
					<td><a href="">231</a></td>
					<td><a href="">详情</a> | <a href="">更新</a></td>
				</tr>
				<tr>
					<td>3</td>
					<td>pwd</td>
					<td><a href="">231</a></td>
					<td><a href="">详情</a> | <a href="">更新</a></td>
				</tr>
			</table>
		</div>
	</div>
</body>
</html>
