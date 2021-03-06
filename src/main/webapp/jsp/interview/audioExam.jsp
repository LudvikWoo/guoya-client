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

<title>My JSP 'query.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<link href="assets/css/icons.css" rel="stylesheet" />
<!-- jQueryUI -->
<link href="assets/css/sprflat-theme/jquery.ui.all.css" rel="stylesheet" />
<!-- Bootstrap stylesheets (included template modifications) -->
<link href="assets/css/bootstrap.css" rel="stylesheet" />
<!-- Plugins stylesheets (all plugin custom css) -->
<link href="assets/css/plugins.css" rel="stylesheet" />
<!-- Main stylesheets (template main css file) -->
<link href="assets/css/main.css" rel="stylesheet" />
<!-- Custom stylesheets ( Put your own changes here ) -->
<link href="assets/css/custom.css" rel="stylesheet" />
<script type="text/javascript">

	function addAnswer(audioId) {
		var div = document.getElementById("answerDiv" + audioId);
		div.style.display = "block";
	}
	function cancelAnswer(audioId) {
		var div = document.getElementById("answerDiv" + audioId);
		div.style.display = "none";
	}
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
				<div class="panel panel-default ">
					<!-- Start .panel -->
					<div class="panel-heading navbar-fixed-top">
						<h3 class="panel-title  col-lg-1 col-md-1">姓名：
							${ask.customerName }</h3>
						<h3 class="panel-title  col-lg-2 col-md-2">公司：
							${ask.companyName }</h3>
						<span class="panel-title text-left col-lg-1 col-md-1"> <a
							href="interview/getPaperExam.action?interview_id=${ask.interview_id}"
							onclick="javascript:return confirm('确认刷新界面吗？');">
								<button class="btn btn-primary  btn-xs" type="submit">刷新界面</button>
						</a>
						</span>
					</div>
					<br> <br> <br>
					<div class="panel-body">
						<div class="row">
							<form class="form-horizontal group-border hover-stripped"
								role="form"
								action="interview/uploadExamAudio.action?interview_id=${ask.interview_id }"
								method="post" enctype="multipart/form-data">

								<!-- End .form-group  -->
								<div class="form-group">
									<label class="col-lg-1 col-md-1 col-sm-2 control-label">上传录音：</label>
									<div class="col-lg-3 col-md-3">
										<input type="file" id="audio_upload" name="audio_upload"
											multiple="true" accept='audio/*'>
									</div>
									<div class="col-lg-1 col-md-1  col-sm-4">
										<button class="btn btn-primary" type="submit">上传</button>
									</div>
								</div>
							</form>
						</div>
						<br>

						<!-- 照片临时显示区 -->
						<hr>
						<br>
						<!-- 答题区 -->
						<div>
							<c:if test="${not empty ask.audios }">
								<c:forEach items="${ask.audios }" var="audio">
									<!-- 图片展现区 -->
									<div class="row">
										<div class="col-lg-3 col-md-4">
											<c:if test="${audio.file_type == 0 }">
												<audio src="${audio.audio_addr }" controls="controls" controlsList="nodownload">
											</c:if>
											<c:if test="${audio.file_type == 1 }">
												<img style="width:100px;height:100px;" src="'${audio.audio_addr}"/>
											</c:if>
										</div>
										<div>
											<h4>${audio.audio_name} </h4>
										</div>
									</div>
									<br>
									<!-- 图片操作区 -->
									<div class="row">
										<div class="col-lg-1 col-md-1">
											<a
												href="interview/deleteAudio.action?audio_id=${audio.audio_id}&interview_id=${ask.interview_id}"
												onclick="javascript:return confirm('确认删除录音和录音的答案吗？');">
												<button type="button" class="btn btn-default">删除录音</button>
											</a>
										</div>
										<div class="col-lg-1 col-md-1">
											<button type="button" class="btn btn-primary"
												onclick="addAnswer(${audio.audio_id})">新增答案</button>
										</div>
									</div>

									<!-- 新增答案区 -->
									<div class="row" id="answerDiv${audio.audio_id}"
										style="display: none">
										<form class="form-horizontal group-border" role="form"
											action="interview/addAudioAnswer.action" method="post"
											onreset="cancelAnswer(${audio.audio_id})">
											<!-- onsubmit="javascript:return confirm('确认提交答案吗？');" -->
											<div hidden="hidden">
												<div>隐藏数据：</div>
												<div><input type="text"
														name="data_id" value="${audio.audio_id }">
														<input type="text"
														name="ask_id" value="${ask.ask_id }">
														<input type="text"
														name="interview_id" value="${ask.interview_id }">
												</div>
											</div>
											<br>
											<div class="form-group">
												<label class="col-lg-1 col-md-1 col-sm-2 control-label">题号：</label>
												<div class="col-lg-7 col-md-7">
													<input type="text" name="subject_index" class="form-control"
														placeholder="请输题号，例如：1、1.1 、 1.1.1 ...">
												</div>
											</div>

											<div class="form-group">
												<label class="col-lg-1 col-md-1 col-sm-2 control-label">题号：</label>
												<div class="col-lg-7 col-md-7">
													<input type="text" name="subject_desc" class="form-control"
														placeholder="请输问题描述，例如：假如遇到xxxx怎么处理？">
												</div>
											</div>
											<div class="form-group">
												<label class="col-lg-1 col-md-1 col-sm-2 control-label">答案：</label>
												<div class="col-lg-7 col-md-7">
													<textarea rows="10" name="answer" class="form-control "
														placeholder="请输答案..."></textarea>
												</div>
											</div>
											<div class="form-group ">
												<div class="col-lg-6 col-md-6 text-right">
													<button type="reset" class="btn">取消</button>
												</div>
												<div class="col-lg-2 col-md-2 text-left">
													<button type="submit" class="btn btn-primary">提交</button>
												</div>
											</div>
										</form>
									</div>
									<br>
									<c:if test="${not empty  audio.answers}">
										<div class="row">
											<!-- Start .row -->
											<div class="col-lg-8 col-md-8">
												<!-- col-lg-6 start here -->
												<div class="panel panel-default plain toggle">
													<!-- Start .panel -->
													<div class="panel-heading white-bg"></div>
													<div class="panel-body">
														<table class="table table-striped table-hover">
															<thead>
																<tr>
																	<th class="per10">题号</th>
																	<th class="per30">问题</th>
																	<th class="per50">答案</th>
																	<th class="per10">答题者</th>
																	<th class="per10">操作</th>
																</tr>
															</thead>
															<tbody>
																<c:forEach items="${audio.answers }" var="answer">
																	<tr>
																		<td>${answer.subject_index }</td>
																		<td>${answer.subject_desc }</td>
																		<td><xmp>${answer.answer }</xmp></td>
																		<td>${answer.author_user_id }</td>
																		<td><a
																			href="interview/updateAudioAnswer.action?answer_id=${answer.answer_id }&ask_id=${ask.ask_id}&interview_id=${ask.interview_id}"
																			onclick="javascript:return confirm('确认删除答案吗？');">删除</a></td>
																	</tr>
																</c:forEach>
															</tbody>
														</table>
													</div>
												</div>
											</div>
										</div>
									</c:if>
									<br>
								</c:forEach>
							</c:if>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- End #content -->
	<!-- Javascripts -->
	<!-- Load pace first -->
	<script src="assets/plugins/core/pace/pace.min.js"></script>
	<!-- Important javascript libs(put in all pages) -->
	<script src="assets/js/jquery-1.8.3.min.js"></script>
	<script>
		window.jQuery
				|| document
						.write('<script src="assets/js/libs/jquery-2.1.1.min.js">\x3C/script>')
	</script>
	<script src="http://code.jquery.com/ui/1.10.4/jquery-ui.js"></script>
	<script>
		window.jQuery
				|| document
						.write('<script src="assets/js/libs/jquery-ui-1.10.4.min.js">\x3C/script>')
	</script>
	<!--[if lt IE 9]>
  <script type="text/javascript" src="assets/js/libs/excanvas.min.js"></script>
  <script type="text/javascript" src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
  <script type="text/javascript" src="assets/js/libs/respond.min.js"></script>
<![endif]-->
	<!-- Bootstrap plugins -->
	<script src="assets/js/bootstrap/bootstrap.js"></script>
	<!-- Core plugins ( not remove ever) -->
	<!-- Handle responsive view functions -->
	<script src="assets/js/jRespond.min.js"></script>
	<!-- Custom scroll for sidebars,tables and etc. -->
	<script src="assets/plugins/core/slimscroll/jquery.slimscroll.min.js"></script>
	<script
		src="assets/plugins/core/slimscroll/jquery.slimscroll.horizontal.min.js"></script>
	<!-- Resize text area in most pages -->
	<script src="assets/plugins/forms/autosize/jquery.autosize.js"></script>
	<!-- Proivde quick search for many widgets -->
	<script src="assets/plugins/core/quicksearch/jquery.quicksearch.js"></script>
	<!-- Bootbox confirm dialog for reset postion on panels -->
	<script src="assets/plugins/ui/bootbox/bootbox.js"></script>
	<!-- Other plugins ( load only nessesary plugins for every page) -->
	<script src="assets/plugins/core/moment/moment.min.js"></script>
	<script src="assets/plugins/charts/sparklines/jquery.sparkline.js"></script>
	<script src="assets/plugins/charts/pie-chart/jquery.easy-pie-chart.js"></script>
	<script src="assets/plugins/forms/icheck/jquery.icheck.js"></script>
	<script src="assets/plugins/forms/tags/jquery.tagsinput.min.js"></script>
	<script src="assets/plugins/forms/tinymce/tinymce.min.js"></script>
	<script src="assets/plugins/forms/switch/jquery.onoff.min.js"></script>
	<script src="assets/plugins/forms/maxlength/bootstrap-maxlength.js"></script>
	<script
		src="assets/plugins/forms/bootstrap-filestyle/bootstrap-filestyle.js"></script>
	<script src="assets/plugins/forms/color-picker/spectrum.js"></script>
	<script src="assets/plugins/forms/daterangepicker/daterangepicker.js"></script>
	<script
		src="assets/plugins/forms/datetimepicker/bootstrap-datetimepicker.min.js"></script>
	<script src="assets/plugins/forms/globalize/globalize.js"></script>
	<script src="assets/plugins/forms/maskedinput/jquery.maskedinput.js"></script>
	<script src="assets/plugins/forms/select2/select2.js"></script>
	<script
		src="assets/plugins/forms/dual-list-box/jquery.bootstrap-duallistbox.js"></script>
	<script src="assets/plugins/forms/password/jquery-passy.js"></script>
	<script src="assets/plugins/forms/checkall/jquery.checkAll.js"></script>
	<script src="assets/plugins/misc/highlight/highlight.pack.js"></script>
	<script src="assets/plugins/misc/countTo/jquery.countTo.js"></script>
	<script src="assets/js/jquery.sprFlat.js"></script>
	<script src="assets/js/app.js"></script>
	<script src="assets/js/pages/forms.js"></script>
</body>
</html>