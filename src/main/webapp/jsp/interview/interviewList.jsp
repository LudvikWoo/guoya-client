<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">
<title>面试查询</title>
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
						<h3 class="panel-title">
							面试学生数：<span style="color: red">${statistics.studentCtn}</span>（
							拿offer：<span style="color: red">${statistics.passStu}</span>），
							面试总数：<span style="color: red">${statistics.interviewCtn}</span>（
							未开始：<span style="color: red">${statistics.unCompleteCtn}</span>，
							已结束：<span style="color: red">${statistics.completeCtn}</span>[ 通过<span
								style="color: red">${statistics.passInterviewCtn}</span>]）
						</h3>
					</div>
					<div class="panel-body">

						<table class="table table-striped table-hover">
							<thead>
								<tr>
									<th class="per6">面试号</th>
									<th class="per6">姓名</th>
									<th class="per15">班级</th>
									<th class="per10">公司</th>
									<th class="per8">面试日期</th>
									<th class="per6">时间</th>
									<th class="per10">是否外包</th>
									<th class="per10">进度</th>
									<th class="per6">结果</th>
									<th class="per6">薪资</th>
									<th class="per6">笔试</th>
									<th class="per12">操作</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${result }" var="var">
									<tr>
										<td>${var.interviewId}</td>
										<td>${var.customerName}</td>
										<td>${var.className }</td>
										<td>${var.companyNameAbbreviation }</td>
										<td><fmt:formatDate value="${var.interviewTime }"
												pattern="yyyy-MM-dd" /></td>
										<td><fmt:formatDate value="${var.interviewTime }"
												pattern="HH:mm" /></td>
										<td>${var.isOutsourceDesc }</td>
										<td>${var.progressDesc }</td>
										<td>${var.resultDesc }</td>
										<td>${var.realSalary }</td>
										<td>${var.hasExamDesc }</td>
										<td><input type="button" value="详情"> <input
											type="button" value="笔试"
											onclick="window.open('interview/getPaperExam.action?interviewId=${var.interviewId}');"></td>
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
