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
	<table>
		<thead>
			<tr>
				<th>序号</th>
				<th>任务包ID</th>
				<th>任务包名称</th>
				<th>内容概述</th>
				<th>教学进度</th>
				<th>详情</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list }" var="var" varStatus="status">
				<tr>
					<td>${status.index+1 }</td>
					<td>${var.taskPkgId }</td>
					<td>${var.taskPkgName }</td>
					<td>${var.summary}</td>
					<td>3/5</td>
					<td><a href="lessonCheck/getPkgDetail.do?lessonId=${var.lessonId }&taskPkgId=${var.taskPkgId }"
						target="_blank">详情</a></td>
					<td><a href="lessonCheck/checkTask.do?lessonId=${var.lessonId }&taskPkgId=${var.taskPkgId }"
						target="_blank">检查作业</a></td>
				</tr>
			</c:forEach>

		</tbody>
	</table>
</body>
</html>
