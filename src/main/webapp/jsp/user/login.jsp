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

<title>My JSP 'signUp.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
<link rel="stylesheet" href="css/bootstrap.min.css">
	-->


<style type="text/css">
table {
	width: 40%;
	border: 1px solid black;
	margin: 3% auto;
	padding: 2%;
}

td {
	border: 1px solid black;
}
</style>

<script src="js/md5.js" type="text/javascript"></script>
<script type="text/javascript">
	var key = "guoyasoft";
	function checkForm() {
		var password = document.getElementById("password").value;
		document.getElementById("password").value = hex_md5(password + "&key="
				+ key);
		return true;
	}
</script>

</head>

<body>
	<center><h1>用户登录</h1></center>
	<form action="user/login.action" method="post" id="form" onsubmit='return checkForm()'>
		<table>
			<tr>
				<td>用户名：</td>
				<td><input type="text" id="userName" name="userName" /></td>
			</tr>
			<tr>
				<td>密码：</td>
				<td><input type="password" id="password" name="password"
					maxlength="8" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" id="loginBtn"
					name="submit" value="登录"  /></td>
			</tr>
		</table>
	</form>
</body>
</html>
