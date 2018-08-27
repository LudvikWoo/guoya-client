<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
				<th>班级ID</th>
				<th>班级名称</th>
				<th>班主任</th>
				<th>开学时间</th>
				<th>毕业时间</th>
				<th>班级人数</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${ list}" var="var" varStatus="status">
				<tr>
					<td>${status.index+1}</td>
					<td>${var.classId }</td>
					<td>${var.className }</td>
					<td>${var.teacherName }</td>
					<td><fmt:formatDate value="${var.classStartDate }" pattern="yyyy年MM月dd日"/></td>
					<td><fmt:formatDate value="${var.graduateDate }" pattern="yyyy年MM月dd日"/></td>
					<td>${var.classStuCtn }</td>
					<td><a href="lessonCheck/queryCourse.do?classId=${var.classId }"
						target="_parent">课程列表</a></td>
				</tr>
			</c:forEach>


		</tbody>
	</table>
	<br>
</body>
</html>
