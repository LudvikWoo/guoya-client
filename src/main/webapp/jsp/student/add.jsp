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

<title>My JSP 'student.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<script src="js/jquery-3.3.1.min.js"></script>
<script src="basicClass/js/guoya.js"></script>
</head>

<body>
	<form action="student/add.action">
		<table>
			<tr>
				<td>客户：</td>
				<td><input type="text" name="cnoDesc" id="cnoDesc"  readonly="readonly" >
					<input type="text" name="cno" id="cno" readonly="readonly" hidden="hidden">  <input type="button" value="查询"
					onclick="queryCustomer('cno')"></td>
			</tr>
			<tr>
				<td>导师：</td>
				<td><input type="text" name="psnoDesc" id="psnoDesc"  readonly="readonly" >
					<input type="text" name="psno" id="psno" readonly="readonly" hidden="hidden">  <input type="button" value="查询"
					onclick="queryStudent('psno')"></td>
			</tr>
			<tr>
				<td>班级：</td>
				<td><input type="text" name="classNoDesc" id="classNoDesc"  readonly="readonly" >
					<input type="text" name="classNo" id="classNo" readonly="readonly" hidden="hidden">  <input type="button" value="查询"
					onclick="queryClass('classNo')"></td>
			</tr>
			<tr>
				<td>用户：</td>
				<td><input type="text" name="uNoDesc" id="uNoDesc"  readonly="readonly" >
					<input type="text" name="uNo" id="uNo" readonly="readonly" hidden="hidden">  <input type="button" value="查询"
					onclick="queryUser('uNo')"><input type="button" value="新增"
					onclick="addUser()"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="提交"> <input
					type="reset" value="重置"></td>
			</tr>
		</table>
	</form>
</body>
</html>
