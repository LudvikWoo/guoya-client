<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML>
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'add.jsp' starting page</title>

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
	<table>
		<tr>
			<td>公司总数：</td>
			<td>匹配总数：</td>
			<td><input type="button" value="新增公司" onclick="window.open('jsp/interview/company/addCompany.jsp', '_blank')"></td>
		</tr>
	</table>
	<table>
		<thead>
			<th>编号</th>
			<th>公司简称</th>
			<th>公司类型</th>
			<th>项目组数量</th>
			<th>HR数量</th>
			<th>维护操作</th>
			<th>其它操作</th>
		</thead>
		<tbody>
			<tr>
				<td>1</td>
				<td>平安</td>
				<td>金融</td>
				<td>5</td>
				<td>3</td>
				<td><a href="#">详情</a> <a href="#">更改</a> <a href="#">删除</a></td>
				<td><a href="#">加项目组</a> <a href="#">添加HR</a></td>
			</tr>
		</tbody>
	</table>
</body>
</html>
