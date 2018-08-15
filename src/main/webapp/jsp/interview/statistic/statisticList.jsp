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
<!-- jQueryUI -->
<link href="/guoya-client/assets/css/sprflat-theme/jquery.ui.all.css"
	rel="stylesheet" />
<!-- Bootstrap stylesheets (included template modifications) -->
<link href="/guoya-client/assets/css/bootstrap.css" rel="stylesheet" />
</head>

<body>
	<div class="outlet">
		<!-- Start .outlet -->
		<!-- Page start here ( usual with .row ) -->
		<div class="row">
			<!-- Start .row -->
			<div class="col-lg-12">
				<!-- Start col-lg-12 -->
				<div class="panel panel-default toggle">
					<!-- Start .panel -->
					<div class="panel-heading white-bg">
						<h1 class="panel-title">
							统计结果
						</h1>
					</div>
					<div class="panel-body">
						<table class="table table-striped table-hover">
							<thead>
								<tr>
									<th class="per6">学号</th>
									<th class="per6">姓名</th>
									<th class="per6">班级</th>
									<th class="per6">年龄</th>
									<th class="per6">学历</th>
									<th class="per6">面试总数</th>
									<th class="per6">结束数</th>
									<th class="per6">通过数</th>
									<th class="per6">是否入职</th>
									<th class="per6">操作</th>
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
										<td><c:if test="${var.job_count ==0}">
							否
						</c:if> <c:if test="${var.job_count !=0}">
							是
						</c:if></td>
										<td><a
											href="interview/initInterviewQuery.action?studentName=${var.customer_name }&classId=${var.class_id}"
											target="_blank">详情</a></td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
				<!-- End .panel -->
			</div>
		</div>
	</div>
</body>
</html>
