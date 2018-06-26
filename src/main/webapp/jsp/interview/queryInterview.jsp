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
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
	<div>
		<form action="interview/queryInterview.action" target="result" method="post">
			<table border="0">
				<tr>
					<td>学号：</td>
					<td><input type="text" name="custmerName"></td>
					<td>姓名：</td>
					<td><input type="text" name="userName"></td>
					<td>班级：</td>
					<td><select name="classId" id="classId">
							<c:forEach items="${initObj.classSelect}" var="var"
								varStatus="vs">
								<option value="${var.value}"
									<c:if test="${var.selected==true}">selected</c:if>>
									${var.text}</option>
							</c:forEach>
					</select></td>
				</tr>
				<tr>
					<td>公司：</td>
					<td><input type="text" name="companyName" id="companyName"></td>
					<td>HR姓名：</td>
					<td><input type="text" name="hrName" id="hrName"></td>
					<td>笔试：</td>
					<td><select name="hasExam" id="hasExam">
							<option value="">--请选择--</option>
							<option value="0">无</option>
							<option value="1">有</option>
					</select></td>
				</tr>
				<tr>
					<td>面试日期：</td>
					<td><input type="date" name="interviewDateStart">-<input
						type="date" name="interviewDateEnd"></td>
					<td>面试时间：</td>
					<td><select name="interviewTime" id="interviewTime">
							<option value="">--请选择--</option>
							<option value="0">上午</option>
							<option value="0">上午</option>
					</select></td>
					<td>上班时间：</td>
					<td><input type="date" name="workTimeStart">-<input
						type="date" name="workTimeEnd"></td>
				</tr>
				<tr>
					<td>面试进度:</td>
					<td><select name="progress" id="progress">
							<c:forEach items="${initObj.progressSelect}" var="var"
								varStatus="vs">
								<option value="${var.value}"
									<c:if test="${var.selected==true}">selected</c:if>>
									${var.text}</option>
							</c:forEach>
					</select><span style="color: red"> *</span></td>
					<td>面试结果:</td>
					<td><select name="result" id="result">
							<c:forEach items="${initObj.resultSelect}" var="var"
								varStatus="vs">
								<option value="${var.value}"
									<c:if test="${var.selected==true}">selected</c:if>>
									${var.text}</option>
							</c:forEach>
					</select></td>
					<td>实际薪资：</td>
					<td><input type="number" min="18" max="32" name="salayMin">K-<input
						type="number" min="18" max="32" name="salayMax">K</td>
				</tr>
				<tr>
					<td>排序字段:</td>
					<td><select name="orderField" id="orderField">
							<option>--请选择--</option>
							<option>班级</option>
							<option>面试日期</option>
							<option>面试时间</option>
							<option>薪资高低</option>
					</select></td>
					<td>升/降序:</td>
					<td><select name="orderType" id="orderType">
							<option>--请选择--</option>
							<option>升序</option>
							<option>降序</option>
					</select></td>
					<td colspan="2"><input type="submit" value="查询"><input
						type="reset" value="重置"></td>
				</tr>
			</table>
		</form>
		<hr>
	</div>

</body>
<iframe id="iframepage" name="result" width="100%" noResize
	scrolling="no" frameborder="0"
	onload="this.height=this.contentWindow.document.body.scrollHeight+10">
</html>
