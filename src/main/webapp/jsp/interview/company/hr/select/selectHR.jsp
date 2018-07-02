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

<title>My JSP 'selectCompany.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<script type="text/javascript" src="js/guoya-client.js"></script>
</head>

<body>
	<form action="hr/selectHR.action" target="result"
		method="post">
		<table border="1">
			<tr>
				<td>公司：</td>
				<td><input type="text" name="companyName"></td>
				<td>姓名：</td>
				<td><input type="text" name="hrName"></td>
			</tr>
			<tr>
				<td>手机：</td>
				<td><input type="text" name="mobilePhone"></td>
				<td>微信：</td>
				<td><input type="text" name="weichat"></td>
			</tr>
			<tr>
				<td>电话：</td>
				<td><input type="text" name="telPhone"></td>
				<td>QQ：</td>
				<td><input type="text" name="qq"></td>
			</tr>
			<tr>
				<td>邮箱：</td>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<td colspan="2" align="right"><input type="reset" value="重置"></td>
				<td colspan="2" align="right"><input type="submit" value="查询"></td>
			</tr>
		</table>
	</form>
	<hr>
	<script type="text/javascript" src="js/guoya-client.js"></script>
</body>
<iframe id="iframepage" name="result" width="100%" noResize
	scrolling="no" frameborder="0"
	onload="this.height=this.contentWindow.document.body.scrollHeight+10">
</iframe>
</html>
