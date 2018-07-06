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
<title>面试查询</title>
<!-- 小图标 -->
<link href="assets/css/icons.css" rel="stylesheet" />
<!-- jQueryUI -->
<link href="/guoya-client/assets/css/sprflat-theme/jquery.ui.all.css"
	rel="stylesheet" />
<!-- Bootstrap 样式 -->
<link href="/guoya-client/assets/css/bootstrap.css" rel="stylesheet" />
<!-- 时间控件-->
<link href="/guoya-client/assets/css/plugins.css" rel="stylesheet" />

<script type="text/javascript">
	window.onload=function(){
		if(<%=session.getAttribute("initQuery") %> == true){
			document.getElementById("form").submit();
		}
	};
</script>
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
					<div class="panel-heading  white-bg" >
						<h3 class="panel-title">查询条件</h3>
					</div>
					<div class="panel-body">
						<form id="form" action="interview/queryInterview.action" target="result"
							method="post" class="form-horizontal group-border hover-stripped"
							role="form">
							<div class="form-group">

								<label class="col-lg-1 col-md-1 col-sm-2 control-label">学生姓名</label>
								<div class="col-lg-2 col-md-2 col-sm-4">
									<input type="text" name="custmerName" class="form-control" value="${studentName }">
								</div>

								<label class="col-lg-1 col-md-1 col-sm-2 control-label">所属班级</label>
								<div class="col-lg-1 col-md-2  col-sm-4">
									<div class="row">
										<div class="col-lg-12 col-md-12">
											<select name="classId" id="classId"
												class="form-control select2">
												<c:forEach items="${initObj.classSelect}" var="var"
													varStatus="vs">
													<option value="${var.value}"
														<c:if test="${var.selected==true}">selected</c:if>>
														${var.text}</option>
												</c:forEach>
											</select>
										</div>
									</div>
								</div>


								<label class="col-lg-1 col-md-1 col-sm-2 control-label">公司名称</label>
								<div class="col-lg-2 col-md-2 col-sm-4">
									<input type="text" name="companyName" id="companyName"
										class="form-control">
								</div>


								<label class="col-lg-1 col-md-1 col-sm-2 control-label">面试日期</label>
								<div class="col-lg-2 col-md-2 col-sm-4">
									<div class="row">
										<div class="col-lg-12 col-md-12">
											<div class="input-group">
												<input class="form-control" name="interviewDate"
													id="daterangepicker"> <span
													class="input-group-addon"><i class="fa-calendar"></i></span>
											</div>
										</div>
									</div>
								</div>

							</div>
							<div class="form-group">


								<label class="col-lg-1 col-md-1 col-sm-2 control-label">面试时间</label>
								<div class="col-lg-2 col-md-2 col-sm-4">
									<div class="row">
										<div class="col-lg-12 col-md-12">
											<select name="interviewTime" id="interviewTime"
												class="form-control select2">
												<option value="">--请选择--</option>
												<option value="am">上午</option>
												<option value="pm">下午</option>
											</select>
										</div>
									</div>
								</div>

								<label class="col-lg-1 col-md-1 col-sm-2 control-label">面试进度</label>
								<div class="col-lg-1 col-md-2 col-sm-4">
									<div class="row">
										<div class="col-lg-12 col-md-12">
											<select name="progress" id="progress"
												class="form-control select2">
												<c:forEach items="${initObj.progressSelect}" var="var"
													varStatus="vs">
													<option value="${var.value}"
														<c:if test="${var.selected==true}">selected</c:if>>
														${var.text}</option>
												</c:forEach>
											</select>
										</div>

									</div>
								</div>

								<label class="col-lg-1 col-md-1 col-sm-2 control-label">面试结果</label>
								<div class="col-lg-1 col-md-2 col-sm-4">
									<div class="row">
										<div class="col-lg-12 col-md-12">
											<select name="result" id="result"
												class="form-control select2">
												<c:forEach items="${initObj.resultSelect}" var="var"
													varStatus="vs">
													<option value="${var.value}"
														<c:if test="${var.selected==true}">selected</c:if>>
														${var.text}</option>
												</c:forEach>
											</select>
										</div>

									</div>
								</div>


								<div class="col-lg-1 col-md-1  col-sm-4">
									<button class="btn btn-primary pull-right" type="submit">查询</button>
								</div>
								<div class="col-lg-1 col-md-1  col-sm-4">
									<button class="btn btn-warning pull-right" type="reset">重置</button>

								</div>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- End #content -->
	<!-- Javascripts -->
	<!-- Load pace first -->
	<script src="/guoya-client/assets/plugins/core/pace/pace.min.js"></script>
	<!-- Important javascript libs(put in all pages) -->
	<script src="/guoya-client/assets/js/jquery-1.8.3.min.js"></script>
	<script>
		window.jQuery
				|| document
						.write('<script src="/guoya-client/assets/js/libs/jquery-2.1.1.min.js">\x3C/script>')
	</script>
	<script src="http://code.jquery.com/ui/1.10.4/jquery-ui.js"></script>
	<script>
		window.jQuery
				|| document
						.write(
								'<script src="/guoya-client/assets/js/libs/jquery-ui-1.10.4.min.js">\x3C/script>')
	</script>
	<!--[if lt IE 9]>
  <script type="text/javascript" src="/guoya-client/assets/js/libs/excanvas.min.js"></script>
  <script type="text/javascript" src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
  <script type="text/javascript" src="/guoya-client/assets/js/libs/respond.min.js"></script>
<![endif]-->
	<!-- Bootstrap plugins -->
	<script src="/guoya-client/assets/js/bootstrap/bootstrap.js"></script>
	<!-- Core plugins ( not remove ever) -->
	<!-- Handle responsive view functions -->
	<script src="/guoya-client/assets/js/jRespond.min.js"></script>
	<!-- Custom scroll for sidebars,tables and etc. -->
	<script
		src="/guoya-client/assets/plugins/core/slimscroll/jquery.slimscroll.min.js"></script>
	<script
		src="/guoya-client/assets/plugins/core/slimscroll/jquery.slimscroll.horizontal.min.js"></script>
	<!-- Resize text area in most pages -->
	<script
		src="/guoya-client/assets/plugins/forms/autosize/jquery.autosize.js"></script>
	<!-- Proivde quick search for many widgets -->
	<script
		src="/guoya-client/assets/plugins/core/quicksearch/jquery.quicksearch.js"></script>
	<!-- Bootbox confirm dialog for reset postion on panels -->
	<script src="/guoya-client/assets/plugins/ui/bootbox/bootbox.js"></script>
	<!-- Other plugins ( load only nessesary plugins for every page) -->
	<script src="/guoya-client/assets/plugins/core/moment/moment.min.js"></script>
	<script
		src="/guoya-client/assets/plugins/charts/sparklines/jquery.sparkline.js"></script>
	<script
		src="/guoya-client/assets/plugins/charts/pie-chart/jquery.easy-pie-chart.js"></script>
	<script
		src="/guoya-client/assets/plugins/forms/icheck/jquery.icheck.js"></script>
	<script
		src="/guoya-client/assets/plugins/forms/tags/jquery.tagsinput.min.js"></script>
	<script src="/guoya-client/assets/plugins/forms/tinymce/tinymce.min.js"></script>
	<script
		src="/guoya-client/assets/plugins/forms/switch/jquery.onoff.min.js"></script>
	<script
		src="/guoya-client/assets/plugins/forms/maxlength/bootstrap-maxlength.js"></script>
	<script
		src="/guoya-client/assets/plugins/forms/bootstrap-filestyle/bootstrap-filestyle.js"></script>
	<script
		src="/guoya-client/assets/plugins/forms/color-picker/spectrum.js"></script>
	<script
		src="/guoya-client/assets/plugins/forms/daterangepicker/daterangepicker.js"></script>
	<script
		src="/guoya-client/assets/plugins/forms/datetimepicker/bootstrap-datetimepicker.min.js"></script>
	<script src="/guoya-client/assets/plugins/forms/globalize/globalize.js"></script>
	<script
		src="/guoya-client/assets/plugins/forms/maskedinput/jquery.maskedinput.js"></script>
	<script src="/guoya-client/assets/plugins/forms/select2/select2.js"></script>
	<script
		src="/guoya-client/assets/plugins/forms/dual-list-box/jquery.bootstrap-duallistbox.js"></script>
	<script
		src="/guoya-client/assets/plugins/forms/password/jquery-passy.js"></script>
	<script
		src="/guoya-client/assets/plugins/forms/checkall/jquery.checkAll.js"></script>
	<script
		src="/guoya-client/assets/plugins/misc/highlight/highlight.pack.js"></script>
	<script
		src="/guoya-client/assets/plugins/misc/countTo/jquery.countTo.js"></script>
	<script src="/guoya-client/assets/js/jquery.sprFlat.js"></script>
	<script src="/guoya-client/assets/js/app.js"></script>
	<script src="/guoya-client/assets/js/pages/forms.js"></script>
</body>
<iframe id="iframepage" name="result" width="100%" noResize
	scrolling="no" frameborder="0"
	onload="this.height=this.contentWindow.document.body.scrollHeight+10">
</html>
