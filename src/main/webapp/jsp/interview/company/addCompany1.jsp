<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>新增公司</title>

<!-- Icons -->
<link href="/guoya-client/assets/css/icons.css" rel="stylesheet" />
<!-- jQueryUI -->
<link href="/guoya-client/assets/css/sprflat-theme/jquery.ui.all.css"
	rel="stylesheet" />
<!-- Bootstrap stylesheets (included template modifications) -->
<link href="/guoya-client/assets/css/bootstrap.css" rel="stylesheet" />
</head>

<body>
	<div class="row">
		<!-- Start .row -->
		<div class="col-lg-12">
			<!-- Start col-lg-12 -->
			<div class="panel panel-default toggle">
				<!-- Start .panel -->
				<div class="panel-heading">
					<h3 class="panel-title">新增公司</h3>
				</div>
				<div class="panel-body">
					<form class="form-horizontal group-border hover-stripped"
						role="form" action="interview/add.action" method="get">
						<div class="form-group">
							<label class="col-lg-1 col-md-1 col-sm-2 control-label">公司全称</label>
							<div class="col-lg-3 col-md-3 col-sm-6">
								<input type="text" class="form-control" placeholder="尽量写全"
									autofocus="autofocus">
							</div>
						</div>
						<div class="form-group">
							<label class="col-lg-1 col-md-1  col-sm-2 control-label">公司简称</label>
							<div class="col-lg-3 col-md-3  col-sm-6">
								<input type="text" class="form-control" placeholder="2-4字简称"
									autofocus="autofocus">
							</div>
						</div>
						<div class="form-group">
							<label class="col-lg-1 col-md-1 col-sm-2 control-label">公司类型</label>
							<div class="col-lg-3 col-md-3">
								<div class="row">
									<div class="col-lg-12 col-md-12">
										<select class="form-control">
												<option value="AK">--请选择--</option>
												<option value="AK">Alaska</option>
												<option value="HI">Hawaii</option>
										</select>
									</div>
								</div>
							</div>
						</div>
						<div class="form-group">
							<label class="col-lg-1 col-md-1 col-sm-2 control-label">公司地址</label>
							<div class="col-lg-7 col-md-7  col-sm-6">
								<input type="text" class="form-control" placeholder="尽量写全"
									autofocus="autofocus">
							</div>
						</div>
						<div class="form-group">
							<label class="col-lg-1 col-md-1 col-sm-2 control-label">其它备注</label>
							<div class="col-lg-7 col-md-7  col-sm-6">
								<textarea class="form-control" rows="3"></textarea>
							</div>
						</div>
						<div class="form-group ">
							<div class="col-lg-1 col-md-1">
								<button type="button" class="btn btn-sm btn-warning">重置</button>
							</div>
							<div class="col-lg-1 col-md-1">
								<button type="button" class="btn btn-sm btn-primary">提交</button>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	<!-- Bootstrap plugins -->
	<script src="/guoya-client/assets/js/bootstrap/bootstrap.js"></script>
</body>
</html>
