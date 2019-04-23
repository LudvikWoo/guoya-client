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

<title>My JSP 'selectStudent.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

</head>

<body>
	<form action="student/selectStudent.action" target="result"
		method="post">
		<table border="1">
			<tr>
				<td>姓名：</td>
				<td><input type="text" name="customerName"></td>
				<td>班级：</td>
				<td><select name="classId" id="classId">
						<option value="">--请选择--</option>
						<option value="2">1805基础班</option>
						<option value="11">1807基础班</option>
						<option value="12">1808基础班</option>
						<option value="13">1809基础班</option>
						<option value="15">1810基础班</option>
						<option value="16">1811基础班</option>
						<option value="17">1902基础班</option>
						<option value="20">1903基础班</option>
						<option value="21">1904基础班</option>
						<option></option>
				</select></td>
				<td colspan="4" align="right"><input type="submit" value="查询"></td>
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
