<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../../commons/jspInit.jsp"%>
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
				<th>课程ID</th>
				<th>课程名称</th>
				<th>开课时间</th>
				<th>结束时间</th>
				<th>主讲老师</th>
				<th>课程大纲ID</th>
				<th>大纲名称</th>
				<th>教学进度</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list }" var="var" varStatus="status">
				<tr>
					<td>${status.index+1 }</td>
					<td>${var.courseInstanceId }</td>
					<td>${var.courseInstanceName }</td>
					<td><fmt:formatDate value="${var.courseStartTime }" pattern="yyyy年MM月dd日"/></td>
					<td><fmt:formatDate value="${var.courseEndTime }" pattern="yyyy年MM月dd日"/></td>
					<td>${var.teacherName }</td>
					<td>${var.lecturePkgId }</td>
					<td>${var.lecturePkgName }</td>
					<td>5/5</td>
					<td><a href="lessonCheck/queryLecturePkg.do?lecturePkgId=${var.lecturePkgId }&classId=${var.classId}"
						target="_self">课程大纲</a></td>
				</tr>
			</c:forEach>


		</tbody>
	</table>
</body>
</html>
