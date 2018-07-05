<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../../commons/jspInit.jsp"%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'addInterview.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style>
.guoya_table {
	width: 60%;
	margin: 5% auto;
	padding: 1%;
	border: 1px solid gray;
}

.guoya_table tr {
	height: 25px;
}

.guoya_table tr td:nth-child(1) {
	width: 40%;
}

td {
	border-bottom: 0px solid gray;
}

input[type="text"],[type="number"],[type="date"],[type="file"] {
	width: 90%;
}

select {
	width: 90%;
}

.submit_tr {
	height: 35px;
	text-align: center;
}

.submit_tr td {
	padding-top: 2%;
}
</style>
</head>

<body>
	<div>
		<form action="offer/addOffer.action" method="post" >
			<table class="guoya_table">
				<tr hidden="hidden">
					<td>面试ID:</td>
					<td><input type="text" name="interviewId" value="${interviewId }"></td>
				</tr>
				<tr>
					<td>月薪(K):</td>
					<td><input type="number" name="salary" id="salary"></td>
				</tr>
				<tr>
					<td>薪数:</td>
					<td><input type="number" name="salaryCount" id="salaryCount"></td>
				</tr>
				<tr>
					<td>税前税后:</td>
					<td><select name="isGrossPay" id="isGrossPay">
							<option value="">--请选择--</option>
							<option value="0">税前</option>
							<option value="1">税后</option>
					</select></td>
				</tr>
				<tr>
					<td>试用期(月):</td>
					<td><input type="number" name="probationaryPeriod" id="probationaryPeriod"></td>
				</tr>
				<tr>
					<td>折扣(%):</td>
					<td><input type="number" name="probationaryPeriodDiscount" id="probationaryPeriodDiscount"></td>
				</tr>
				<tr>
					<td>offer时间:</td>
					<td><input type="date" name="offerTime" id="offerTime"></td>
				</tr>
				<tr>
					<td>入职时间:</td>
					<td><input type="date" name="workTime" id="workTime"></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="提交"> <input
						type="reset" value="重置"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>
