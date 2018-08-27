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
				<th>备课ID</th>
				<th>备课名称</th>
				<th>内容概述</th>
				<th>开始时间</th>
				<th>结束时间</th>
				<th>教学进度</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list }" var="var" varStatus="status">
				<tr>
					<td>${status.index+1 }</td>
					<td>${var.lectureId }</td>
					<td>${var.lectureName }</td>
					<td>${var.lectureSummary }</td>
					<td><fmt:formatDate value="${var.lessonStartTime }" pattern="yyyy年MM月dd日"/></td>
					<td><fmt:formatDate value="${var.lessonEndTime }" pattern="yyyy年MM月dd日"/></td>
					<td>0/30</td>
					<td><a href="lessonCheck/initLesson.do?lectureId=${var.lectureId }&classId=${var.classId}";
						target="_self">上课</a></td>
				</tr>
			</c:forEach>


		</tbody>
	</table>
</body>
</html>
