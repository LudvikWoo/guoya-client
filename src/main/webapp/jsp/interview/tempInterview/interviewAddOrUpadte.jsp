<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="com.guoyasoft.bean.db.interview.TempInterviewInfo" %>
<%@ include file="../../commons/jspInit.jsp"%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'progressList.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
table {
	margin: 0;
	border-collapse: collapse;
	border-spacing: 0;
}

td,th {
	border-spacing: 0;
	border-bottom: 1px solid black;
	border-right: 1px solid black;
}
</style>
</head>

<body>
	<form action="">
		<table>
			<tr>
				<td>序号</td>
				<td><input type="text" name="interviewId"
					value="${var.interviewId}" disabled="disabled"></td>
				<td>进度ID</td>
				<td><input type="text" name="progressId"
					value="${var.progressId}"></td>
			</tr>
			<tr>
				<td>学生姓名</td>
				<td><input type="text" name="studentName"
					value="${var.studentName}"></td>
				<td>老师姓名</td>
				<td><input type="text" name="teacherName"
					value="${var.teacherName}"></td>
			</tr>
			<tr>
				<td>导师姓名</td>
				<td><input type="text" name="tutorName"
					value="${var.tutorName}"></td>
				<td>班级名称</td>
				<td><input type="text" name="className"
					value="${var.className}"></td>
			</tr>
			<tr>
				<td>公司名称</td>
				<td><input type="text" name="companyName"
					value="${var.companyName}"></td>
				<td>公司简称</td>
				<td><input type="text" name="companyJian"
					value="${var.companyJian}"></td>
			</tr>
			<tr>
				<td>公司地址</td>
				<td><input type="text" name="companyAddr"
					value="${var.companyAddr}"></td>
				<td>外包公司名称</td>
				<td><input type="text" name="outCompanyName"
					value="${var.outCompanyName}"></td>
			</tr>
			<tr>
				<td>外包公司简称</td>
				<td><input type="text" name="outCompanyJian"
					value="${var.outCompanyJian}"></td>
				<td>外包公司地址</td>
				<td><input type="text" name="outCompanyAddr"
					value="${var.outCompanyAddr}"></td>
			</tr>
			<tr>
				<td>HR姓名</td>
				<td><input type="text" name="hrName" value="${var.hrName}"></td>
				<td>HR微信</td>
				<td><input type="text" name="hrWeichat"
					value="${var.hrWeichat}"></td>
			</tr>
			<tr>
				<td>HR手机</td>
				<td><input type="text" name="hrPhone" value="${var.hrPhone}"></td>
				<td>HR座机</td>
				<td><input type="text" name="hrTell" value="${var.hrTell}"></td>
			</tr>
			<tr>
				<td>面试日期</td>
				<td><input type="date" name="interviewDate"
					value="${interviewDate}" ></td>
				<td>面试时间</td>
				<td><input type="time" name="interviewTime"
					value="${interviewTime}"></td>
			</tr>
			<tr>
				<td>是否有笔试</td>
				<td><input type="text" name="hasExam" value="${var.hasExam}"></td>
				<td>试题收集</td>
				<td><input type="text" name="hasExamFile"
					value="${var.hasExamFile}"></td>
			</tr>
			<tr>
				<td>是否有录音</td>
				<td><input type="text" name="hasAudio" value="${var.hasAudio}"></td>
				<td>录音收集</td>
				<td><input type="text" name="hasAudioFile"
					value="${var.hasAudioFile}"></td>
			</tr>
			<tr>
				<td>是否通过</td>
				<td><input type="text" name="hasPass" value="${var.hasPass}"></td>
				<td>是否拿到offer</td>
				<td><input type="text" name="hasOffer" value="${var.hasOffer}"></td>
			</tr>
			<tr>
				<td>是否入职</td>
				<td><input type="text" name="hasJob" value="${var.hasJob}"></td>
				<td>月薪</td>
				<td><input type="text" name="salary" value="${var.salary}"></td>
			</tr>
			<tr>
				<td>薪数</td>
				<td><input type="text" name="salaryCount"
					value="${var.salaryCount}"></td>
				<td>试用期月数</td>
				<td><input type="text" name="probCount"
					value="${var.probCount}"></td>
			</tr>
			<tr>
				<td>试用期折扣</td>
				<td><input type="text" name="probDiscount"
					value="${var.probDiscount}"></td>
				<td>税前税后</td>
				<td><input type="text" name="hasPreTax"
					value="${var.hasPreTax}"></td>
			</tr>
			<tr>
				<td>是否内推</td>
				<td><input type="text" name="isIntroduce"
					value="${var.isIntroduce}"></td>
				<td>内推学生ID</td>
				<td><input type="text" name="introduceStuId"
					value="${var.introduceStuId}"></td>
			</tr>
			<tr>
				<td>内推学生姓名</td>
				<td><input type="text" name="introduceStuName"
					value="${var.introduceStuName}"></td>
			</tr>
			<tr>
			<tr>
				<td><input type="reset" name="重置"></td>
				<td><input type="submit" name="提交"></td>
			</tr>
		</table>
	</form>
</body>
</html>
