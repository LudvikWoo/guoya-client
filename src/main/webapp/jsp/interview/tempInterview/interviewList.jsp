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

td,th {
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
				<th>面试ID</th>
				<th>进度ID</th>
				<th>公司简称</th>
				<th>外包公司简称</th>
				<th>HR姓名</th>
				<th>面试日期</th>
				<th>面试时间</th>
				<th>是否有笔试</th>
				<th>是否有录音</th>
				<th>是否通过</th>
				<th>是否拿到offer</th>
				<th>是否入职</th>
				<th>月薪</th>
				<th>学生姓名</th>
				<th>老师姓名</th>
				<th>导师姓名</th>
				<th>班级名称</th>
				<th>操作</th>
			</tr>
		</thead>
		<c:forEach items="${list}" var="var" varStatus="status">
			<tr>
				<td>${var.interviewId}</td>
				<td>${var.progressId}</td>
				<td>${var.companyJian}</td>
				<td>${var.outCompanyJian}</td>
				<td>${var.hrName}</td>
				<td><fmt:formatDate value="${var.interviewDate }" pattern="yyyy年MM月dd日"/></td>
				<td><fmt:formatDate value="${var.interviewTime }" pattern="HH:mm:ss"/></td>
				<td>${var.hasExam}</td>
				<td>${var.hasAudio}</td>
				<td>${var.hasPass}</td>
				<td>${var.hasOffer}</td>
				<td>${var.hasJob}</td>
				<td>${var.salary}</td>
				<td>${var.studentName}</td>
				<td>${var.teacherName}</td>
				<td>${var.tutorName}</td>
				<td>${var.className}</td>
				<td><a href="javaScript:window.open('tempInterview/initInterviewAddOrUpadte.do?interviewId=${var.interviewId}');">更新</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
