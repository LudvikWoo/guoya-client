<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../commons/jspInit.jsp"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="../commons/headPub.jsp"%>
<title>新增面试</title>
<style type="text/css">
.row {
	display: flex;
}
</style>
</head>
<body>
	<div>

		<form action="">
			<!-- 选择学生 -->
			<div class="row">
				<div>姓名</div>
				<div>
					<input type="text" name="customerName">
				</div>
				<div>
					<input type="text" name="customerId" hidden="hidden">
				</div>
				<div>
					<input type="button" value="查询">
				</div>
			</div>
			<div class="row">
				<div>公司</div>

				<div class="row">
					<div>
						<input type="text" name="companyId"  hidden="hidden">
					</div>
					<div>
						<input type="text" name="companyName">
					</div>
					<div>
						<input type="button" value="查询">
					</div>
					<div>
						<input type="button" value="新增公司">
					</div>
				</div>
			</div>
			<div class="row">
				<div>是否外包</div>
				<div>
					<input type="text" name="isOutsource">
				</div>
			</div>
			<div class="row">
				<div>外包公司</div>
				<div>
					<input type="text" name="hrCompanyId"  hidden="hidden">
				</div>
				<div>
					<input type="text" name="hrCompanyName">
				</div>
				<div>
					<input type="button" value="查询">
				</div>
				<div>
					<input type="button" value="新增公司">
				</div>
			</div>
			<div class="row">
				<div>面试日期</div>
				<div>
					<input type="text" name="interviewTime">
				</div>
			</div>
			<div class="row">
				<div>HR姓名</div>
				<div>
					<input type="text" name="hrId"  hidden="hidden">
				</div>
				<div>
					<input type="text" name="hrName">
				</div>
				<div>
					<input type="button" value="查询">
				</div>
				<div>
					<input type="button" value="新增HR">
				</div>
			</div>
			<div class="row">
				<div>HR电话</div>
				<div>
					<input type="text" name="telPhone">
				</div>
			</div>
			<div class="row">
				<div>HR座机</div>
				<div>
					<input type="text" name="mobilePhone">
				</div>
			</div>
			<div class="row">
				<div>HR微信</div>
				<div>
					<input type="text" name="weichat">
				</div>
			</div>
			<div class="row">
				<div>HR QQ</div>
				<div>
					<input type="text" name="qq">
				</div>
			</div>
			<div class="row">
				<div>HR 邮箱</div>
				<div>
					<input type="text" name="email">
				</div>
			</div>

			<div class="row">
				<div>
					<input type="submit" value="提交">
				</div>
				<div>
					<input type="submit" value="重置">
				</div>
			</div>
		</form>
	</div>
	<jsp:include page="../commons/footPub.jsp" flush="true"></jsp:include>
</body>

</html>
