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
h1 {
	text-align: center;
}

table {
	width: 40%;
	margin: 5% auto;
	padding: 1%;
	border: 1px solid gray;
}

td {
	border: 1px solid gray;
}

input[type="text"],[type="number"],[type="date"],[type="file"] {
	width: 90%;
}

select {
	width: 90%;
}

.submit_tr {
	height: 50px;
	text-align: center;
}

.submit_tr td {
	padding-top: 2%;
}
</style>
</head>

<body>
	<div>
		<form action="exam/add.action" method="get">
			<table>
				<tr>
					<td>学生:</td>
					<td><select name="sno" id="sno">
							<option>S001 李静</option>
							<option>S002 胡小芬</option>
					</select></td>
				</tr>
				<tr>
					<td>导师:</td>
					<td><select name="tno" id="tno">
							<option>T001 戈维维</option>
							<option>T002 刘程旭</option>
					</select></td>
				</tr>
				<tr>
					<td>笔试时间:</td>
					<td><input type="date" name="examDate" id="examDate"></td>
				</tr>
				<tr>
					<td>公司:</td>
					<td><input type="text" name="company" id="company"></td>
				</tr>

				<tr>
					<td>上传照片1:</td>
					<td><input type="file" name="examPic1"></td>
				</tr>
				<tr>
					<td>上传照片2:</td>
					<td><input type="file" name="examPic2"></td>
				</tr>
				<tr>
					<td>上传照片3:</td>
					<td><input type="file" name="examPic3"></td>
				</tr>
				<tr>
					<td>上传照片4:</td>
					<td><input type="file" name="examPic4"></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="提交"> <input
						type="reset" value="重置"></td>
				</tr>
			</table>
		</form>
		<table>
			<tr>
				<td><input type="button" value="删除照片"></td>
			</tr>
			<tr>
				<td><img alt="" src="/exam/p1.jpg" width="400px"></td>
			</tr>
			<tr>
				<td><input type="button" value="删除照片"></td>
			</tr>
			<tr>
				<td><img alt="" src="/exam/p2.png" width="400px">
			<tr>

		</table>
	</div>
</body>
</html>
