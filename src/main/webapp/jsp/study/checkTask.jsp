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
<meta charset="utf-8" />
<title>作业检查</title>
<style>
table {
	margin: 0;
	border-collapse: collapse;
	border-spacing: 0;
}

td {
	border-spacing: 0;
	border-bottom: 1px solid black
}

.double {
	background-color: gray;
}

#nav /*悬浮框标签*/ {
	position: fixed; /*浮窗位置*/
	left: 4px;
	top: 4px; /*靠右*/
	background-color: #D8D8D8;
}

#nav td /*悬浮框标签*/ {
	border-bottom: 0px solid black
}
</style>
<script type="text/javascript" src="../../js/guoya.js"></script>

<script type="text/javascript">
	
</script>
</head>
<body>
	<div id="nav">
		<table>
			<tr>
				<td>统计：</td>
				<td id="report">完成<span style="color:red" id="pass">x</span>人，未完成<span
					style="color:red" id="unPass">x</span>人
				</td>
				<td><input type="button" value="刷新" onclick="refresh()"></td>
				<td><input type="button" value="重新开始" onclick="restart()"></td>
				<td>
					<!-- 用按钮实现超链接 --> <input type="button" value="新增学生"
					onclick="window.open('addStudyInfo.html','right')" />
				</td>
			</tr>
		</table>
	</div>


	<br>
	<br>
	<div style="display: flex;">
		<c:forEach var="stu" items="${students}">
			<div style="display: flex; width: 33%; height: 60px">
				<div style="width: 15%">
					<img src="/guoya-client/img/company/guoya_logo.jpg" height="40px">
				</div>
				<div style="width: 12%">
					<div>果芽</div>
					<div>
						<img src="/guoya-client/img/icon/cross.jpg" height="20px">
					</div>
				</div>
				<div style="width: 55%">
					<textarea rows="3" cols="22"></textarea>
				</div>
				<div>
					<div>
						<input type="button" value="提交">
					</div>
					<div>
						<input type="button" value="测试">
					</div>
				</div>
			</div>
			<c:if test="${stu.rn % 3 == 2 && stu.rn>0}">
				</div>
				<div style="display: flex;">
			</c:if>
		</c:forEach>

	</div>
</body>
</html>