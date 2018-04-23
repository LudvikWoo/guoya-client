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

<title>My JSP 'query.jsp' starting page</title>

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
	<form action="interview/query.action" target="result" method="post">
		<table border="1">
			<tr>
				<td>学号：</td>
				<td><input type="text" name="realName"></td>
				<td>姓名：</td>
				<td><input type="text" name="userName"></td>
				<td>公司：</td>
				<td><input type="text" name="userName"></td>
				<td>面试时间：</td>
				<td><input type="date" name="startTime">-<input
					type="date" name="endTime"></td>
			</tr>
			<tr>
				<td>上班时间：</td>
				<td><input type="date" name="startTime">-<input
					type="date" name="endTime"></td>
				<td>薪资：</td>
				<td><input type="number" min="18" max="32" name="minAge">K-<input
					type="number" min="18" max="32" name="maxAge">K</td>
				<td></td>
				<td></td>
				<td>查询：</td>
				<td><input type="submit" value="查询"></td>
			</tr>
		</table>
	</form>
</body>
<iframe id="iframepage" name="result" width="100%"
			noResize scrolling="no" frameborder="0"
			onload="this.height=this.contentWindow.document.body.scrollHeight+10">
</html>
