<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../../commons/jspInit.jsp"%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'progressList.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
table {
	margin: 0;
	border-collapse: collapse;
	border-spacing: 0;
}

td,th{
	border-spacing: 0;
	border-bottom: 1px solid black;
	border-right: 1px solid black;
}
</style>
</head>

<body>
	<table>
		<thead>
			<tr>
				<th>序号</th>
				<th>班级名称</th>
				<th>学生名称</th>
				<th>导师名称</th>
				<th>教师名称</th>
				<th>项目1</th>
				<th>作者1姓名</th>
				<th>项目2</th>
				<th>作者2姓名</th>
				<th>批次</th>
				<th>简历</th>
				<th>投递</th>
				<th>面试数</th>
				<th>offer</th>
				<th>就业</th>
				<th>操作</th>
			</tr>
		</thead>
		<c:forEach items="${ list}" var="var" varStatus="status">
			<tr>
				<td>${status.index+1 }</td>
				<td>${var.className }</td>
				<td>${var.studentName }</td>
				<td>${var.tutorName }</td>
				<td>${var.teacherName }</td>
				<td>${var.project1 }</td>
				<td>${var.author1StuName }</td>
				<td>${var.project2 }</td>
				<td>${var.author2StuName }</td>
				<td>${var.batchNo }</td>
				<td>${var.resume }</td>
				<td>${var.post }</td>
				<td>${var.interview }</td>
				<td>${var.offer }</td>
				<td>${var.job }</td>
				<td><a href="JavaScript:window.open('tempInterview/initProgress.do?pNo=${var.pNo}');">更新</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
