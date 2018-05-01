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
		<table border="0">
			<tr>
				<td>学号：</td>
				<td><input type="text" name="realName"></td>
				<td>姓名：</td>
				<td><input type="text" name="userName"></td>
				<td>导师：</td>
				<td><select name="tutor" id="tutor">
						<option>--请选择--</option>
						<option>戈维维</option>
						<option>李晓阳</option>
				</select></td>

			</tr>
			<tr>
				<td>公司：</td>
				<td><input type="text" name="userName"></td>
				<td>面试时间：</td>
				<td><input type="date" name="startTime">-<input
					type="date" name="endTime"></td>
				<td>上班时间：</td>
				<td><input type="date" name="startTime">-<input
					type="date" name="endTime"></td>
			</tr>
			<tr>
				<td>面试进度:</td>
				<td><select name="status" id="status">
						<option>--请选择--</option>
						<option>等待面试</option>
						<option>正在面试</option>
						<option>面试结束</option>
				</select><span style="color: red"> *</span></td>
				<td>面试结果:</td>
				<td><select name="isPass" id="isPass">
						<option>--请选择--</option>
						<option>待定</option>
						<option>通过</option>
						<option>未通过</option>
				</select></td>
				<td>实际薪资：</td>
				<td><input type="number" min="18" max="32" name="minAge">K-<input
					type="number" min="18" max="32" name="maxAge">K</td>
			</tr>
			<tr>
				<td colspan="6" align="right"><input type="submit" value="查询"><input
					type="reset" value="重置"></td>
			</tr>
		</table>
	</form>
	<hr>
</body>
<iframe id="iframepage" name="result" width="100%" noResize
	scrolling="no" frameborder="0"
	onload="this.height=this.contentWindow.document.body.scrollHeight+10">
</html>
