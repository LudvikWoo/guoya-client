<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">
<meta charset="utf-8" />

</head>

<body>
	<form action="lessonCheck/queryClass.do" target="result">
		<table>
			<tr>
				<td>班级：</td>
				<td><input type="text" name="className"></td>
				<td>老师：</td>
				<td><input type="text" name="teacherName"></td>
				<td></td>
				<td></td>
				<td><input type="reset"></td>
				<td><input type="submit"></td>
			</tr>
		</table>
	</form>
	<br>
</body>
<iframe id="iframepage" name="result" width="100%" noResize
	scrolling="no" frameborder="0"
	onload="this.height=this.contentWindow.document.body.scrollHeight+10">
</html>
