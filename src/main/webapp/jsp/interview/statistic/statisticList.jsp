<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../../commons/jspInit.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'statisticList.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
	<table>
		<thead>
			<tr>
				<th>学号</th>
				<th>姓名</th>
				<th>班级</th>
				<th>年龄</th>
				<th>学历</th>
				<th>面试总数</th>
				<th>结束数</th>
				<th>通过数</th>
				<th>是否入职</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${statistic }" var="var">
				<tr>
					<td>${var.student_id }</td>
					<td>${var.customer_name }</td>
					<td>${var.class_name }</td>
					<td>${var.customer_age }</td>
					<td>${var.student_education }</td>
					<td>${var.interview_count }</td>
					<td>${var.finish_count }</td>
					<td>${var.pass_count }</td>
					<td>
						<c:if test="${var.job_count ==0}">
							否
						</c:if>
						<c:if test="${var.job_count !=0}">
							是
						</c:if>
					</td>
					<td><a href="interview/initInterviewQuery.action?studentName=${var.customer_name }&classId=${var.class_id}" target="_blank">详情</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>
