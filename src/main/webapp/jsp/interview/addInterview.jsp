<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../commons/jspInit.jsp"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="../commons/headPub.jsp"%>
<title>新增面试</title>
<script src="js/guoya-client.js"></script>
<style type="text/css">
.row {
	display: flex;
}
</style>
</head>
<body>
	<div>

		<form action="interview/addInterview.action" method="post" onsubmit="javascript:return confirm('确认提交面试记录吗？');">
			<!-- 选择学生 -->
			<div class="row">
				<div>姓名</div>
				<div>
					<input type="text" name="studentName" id="scheduleName" disabled="disabled">
				</div>
				<div>
					<input type="text" name="scheduleId" hidden="hidden" id="scheduleId">
				</div>
				<div>
					<input type="button" value="查询" onclick="openWindow('jsp/student/select/selectStudent.jsp?name=schedule')">
				</div>
			</div>
			<div class="row">
				<div>面试日期</div>
				<div>
					<input type="date" name="interviewDate" id="interviewDate">
					<input type="time" name="interviewTime" id="interviewTime">
				</div>
			</div>
			<div class="row">
				<div>公司</div>

				<div class="row">
					<div>
						<input type="text" name="companyId" id="companyId" hidden="hidden">
					</div>
					<div>
						<input type="text" name="companyName" id="companyName" disabled="disabled">
					</div>
					<div>
						<input type="button" value="查询"  onclick="openWindow('jsp/interview/company/select/selectCompany.jsp?name=company')">
					</div>
					<div>
						<input type="button" value="新增公司" onclick="window.open('jsp/interview/company/addCompany.jsp')">
					</div>
				</div>
			</div>
			
			<div class="row">
				<div>是否外包</div>
				<div>
					<input type="radio" name="isOutsource" value="0">甲方
					<input type="radio" name="isOutsource" checked="checked" value="1">外包
				</div>
			</div>
			<div class="row">
				<div>HR姓名</div>
				<div>
					<input type="text" name="hrId" id="hrId" hidden="hidden">
				</div>
				<div>
					<input type="text" name="hrName" id="hrName" disabled="disabled">
				</div>
				<div>
					<input type="button" value="查询"  onclick="openWindow('jsp/interview/company/hr/select/selectHR.jsp?name=hr')">
				</div>
				<div>
					<input type="button" value="新增HR" onclick="window.open('jsp/interview/company/hr/addHr.jsp')">
				</div>
			</div>

			<div class="row">
				<div>
					<input type="submit" value="提交">
				</div>
				<div>
					<input type="reset" value="重置">
				</div>
			</div>
		</form>
		
	</div>
	<jsp:include page="../commons/footPub.jsp" flush="true"></jsp:include>
</body>

</html>
