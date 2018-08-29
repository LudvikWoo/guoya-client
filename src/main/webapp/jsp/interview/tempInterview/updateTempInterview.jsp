<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
</style>
<script type="text/javascript">
	function doSubmit() {
		document.form1.submit();
		/* window.close(); */
	}
</script>
</head>

<body>
	<form action="tempInterview/addOrUpdateProgress.do" method="get" name="form1">
		<table>
			<tr>
				<input type="text" name="pNo"
					value="${var.pNo }" hidden="hidden">
				<td>班级名称</td>
				<td><input type="text" name="className"
					value="${var.className }"></td>
			</tr>
			<tr>
				<td>学生名称</td>
				<td><input type="text" name="studentName"
					value="${var.studentName }"></td>
			</tr>
			<tr>
				<td>导师名称</td>
				<td><input type="text" name="tutorName"
					value="${var.tutorName }"></td>
			</tr>
			<tr>
				<td>教师名称</td>
				<td><input type="text" name="teacherName"
					value="${var.teacherName }"></td>
			</tr>
			<tr>
				<td>项目1</td>
				<td><input type="text" name="project1"
					value="${var.project1 }"></td>
			</tr>
			<tr>
				<td>作者1姓名</td>
				<td><input type="text" name="author1StuName"
					value="${var.author1StuName }"></td>
			</tr>
			<tr>
				<td>项目2</td>
				<td><input type="text" name="project2"
					value="${var.project2 }"></td>
			</tr>
			<tr>
				<td>作者2姓名</td>
				<td><input type="text" name="author2StuName"
					value="${var.author2StuName }"></td>
			</tr>
			<tr>
				<td>批次</td>
				<td><input type="text" name="batchNo" value="${var.batchNo }"></td>
			</tr>
			<tr>
				<td>简历</td>
				<td><input type="text" name="resume" value="${var.resume }"></td>
			</tr>
			<tr>
				<td>投递</td>
				<td><input type="text" name="post" value="${var.post }"></td>
			</tr>
			<tr>
				<td>面试数</td>
				<td><input type="text" name="interview"
					value="${var.interview }"></td>
			</tr>
			<tr>
				<td>offer</td>
				<td><input type="text" name="offer" value="${var.offer }"></td>
			</tr>
			<tr>
				<td>就业</td>
				<td><input type="text" name="job" value="${var.job }"></td>
			</tr>
			<tr>
				<td><input type="reset" value="重置"></td>
				<td><input type="button" value="提交" onclick="doSubmit()"></td>
			</tr>
		</table>
	</form>
</body>
</html>
