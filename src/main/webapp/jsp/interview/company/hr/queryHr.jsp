<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML>
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'addProject.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<script type="text/javascript">
	function queryCustomer(elementId) {
		open(
				'jsp/interview/company/queryCompany.jsp?name=' + elementId,
				'',
				'resizable=1,scrollbars=1,status=no,toolbar=no,menu=no,width=500,height=400,left=150,top=50');
	}
	function queryProject(elementId) {
		open(
				'jsp/interview/company/project/queryProject.jsp?name=' + elementId,
				'',
				'resizable=1,scrollbars=1,status=no,toolbar=no,menu=no,width=500,height=400,left=150,top=50');
	}
</script>

</head>

<body>
	<form action="">
		<table>
			<tr>
				<td>归属公司</td>
				<td><input type="text"> <input type="button" value="选择"
					onclick="queryCustomer('introducer')"></td>
			</tr>
			<tr>
				<td>项目组名称</td>
				<td><input type="text"><input type="button" value="校验"
					onclick="queryProject('introducer')"></td>
			</tr>
			<tr>
				<td>项目组人数</td>
				<td><input type="number"></td>
			</tr>
			<tr>
				<td>项目组描述</td>
				<td><textarea rows="3" cols="40"></textarea></td>
			</tr>
			<tr>
				<td colspan="2"><input type="reset" value="重置"> <input
					type="submit" value="提交"></td>
			</tr>
		</table>
	</form>
</body>
</html>
