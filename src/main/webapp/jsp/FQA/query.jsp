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
	<form action="exam/query.action" target="result" method="post">
		<table border="1">
			<tr>
				<td>作者：</td>
					<td><select name="sno" id="sno">
							<option>--请选择--</option>
							<option>S001 李静</option>
							<option>S002 胡小芬</option>
					</select></td>
				<td>时间：</td>
				<td><input type="date" name="examDate" id="examDate">-<input type="date" name="examDate" id="examDate"></td>

				<td>关键字：</td>
					<td>
						<input type="text">
					</td>
				
				<td>技术模块：</td>
					<td><select name="status" id="status">
							<option>--请选择--</option>
							<option>linux</option>
							<option>数据库</option>
							<option>java</option>
							<option>jmeter</option>
							<option>电商业务</option>
					</select></td>
				<td colspan="4" align="right"><input type="submit" value="查询"><input
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
