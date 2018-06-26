<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'queryInterview.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<!-- Css files -->
<!-- Icons -->
<link href="/guoya-client/templates/assets/css/icons.css"
	rel="stylesheet" />
<!-- jQueryUI -->
<link
	href="/guoya-client/templates/assets/css/sprflat-theme/jquery.ui.all.css"
	rel="stylesheet" />
<!-- Bootstrap stylesheets (included template modifications) -->
<link href="/guoya-client/templates/assets/css/bootstrap.css"
	rel="stylesheet" />
<!-- Plugins stylesheets (all plugin custom css) -->
<link href="/guoya-client/templates/assets/css/plugins.css"
	rel="stylesheet" />
<!-- Main stylesheets (template main css file) -->
<link href="/guoya-client/templates/assets/css/main.css"
	rel="stylesheet" />
<!-- Custom stylesheets ( Put your own changes here ) -->
<link href="/guoya-client/templates/assets/css/custom.css"
	rel="stylesheet" />
<!-- Fav and touch icons -->
<link rel="apple-touch-icon-precomposed" sizes="144x144"
	href="/guoya-client/templates/assets/img/ico/apple-touch-icon-144-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="114x114"
	href="/guoya-client/templates/assets/img/ico/apple-touch-icon-114-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="72x72"
	href="/guoya-client/templates/assets/img/ico/apple-touch-icon-72-precomposed.png">
<link rel="apple-touch-icon-precomposed"
	href="/guoya-client/templates/assets/img/ico/apple-touch-icon-57-precomposed.png">
<link rel="icon"
	href="/guoya-client/templates/assets/img/ico/favicon.ico"
	type="image/png">
<!-- Windows8 touch icon ( http://www.buildmypinnedsite.com/ )-->
<meta name="msapplication-TileColor" content="#3399cc" />
</head>

<body>
	<div>
		<div class="row">
			<!-- Start .row -->
			<div class="col-lg-12 col-md-12">
				<!-- col-lg-6 start here -->
				<div
					class="panel panel-default plain toggle panelClose panelRefresh">
					<!-- Start .panel -->
					<div class="panel-heading white-bg">
						<h4 class="panel-title">总面试数：30，学生数：10；面试中：5；面试通过：20</h4>
					</div>
					<div class="panel-body">
						<table class="table table-striped">
							<thead>
								<tr>
									<th class="per6">姓名</th>
									<th class="per15">班级</th>
									<th class="per10">公司</th>
									<th class="per10">面试日期</th>
									<th class="per10">面试时间</th>
									<th class="per10">进度</th>
									<th class="per6">结果</th>
									<th class="per6">薪资</th>
									<th class="per6">笔试</th>
									<th class="per20">操作</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td>朱英英</td>
									<td>测试-基础-1806-01</td>
									<td>中国平安</td>
									<td>2018-06-26</td>
									<td>10:30</td>
									<td>未开始</td>
									<td>待定</td>
									<td>待定</td>
									<td>无</td>
									<td><input type="button" value="详情"> <input
										type="button" value="笔试"></td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>
				<!-- End .panel -->
			</div>
		</div>
</body>
</html>
