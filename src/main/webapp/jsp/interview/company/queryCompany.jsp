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
	<form action="">
		<table>
			<tr>
				<td>公司名称</td>
				<td><input type="text"></td>
			</tr>
			<tr>
				<td>公司类型</td>
				<td><select class="form-control">
						<option value="AK">--请选择--</option>
						<option value="AK">金融</option>
						<option value="HI">电商</option>
						<option value="HI">其它</option>
				</select></td>
			</tr>
			<tr>
				<td>是否外包</td>
				<td><select class="form-control">
						<option value="AK">--请选择--</option>
						<option value="AK">甲方</option>
						<option value="HI">外包</option>
				</select></td>
			</tr>
			<tr>
				<td colspan="2"><input type="reset" value="重置"> <input
					type="submit" value="提交"></td>
			</tr>
		</table>
	</form>
</body>
<iframe id="iframepage" name="result" width="100%" noResize
	scrolling="no" frameborder="0"
	onload="this.height=this.contentWindow.document.body.scrollHeight+10">
</html>
