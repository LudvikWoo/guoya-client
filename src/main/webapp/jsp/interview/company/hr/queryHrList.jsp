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
	<table>
		<thead>
			<th>编号</th>
			<th>公司名称</th>
			<th>HR姓名</th>
			<th>微信</th>
			<th>QQ</th>
			<th>座机</th>
			<th>手机</th>
			<th>邮箱</th>
			<th>操作</th>
		</thead>
		<tbody>
			<tr>
				<td>1</td>
				<td>平安</td>
				<td>小莹</td>
				<td>23123232</td>
				<td>873433322</td>
				<td>021-34324543</td>
				<td>1382341445</td>
				<td>xiaoying@guoyasoft.com</td>
				<td><a href="#">更新</a> <a href="#">删除</a></td>
			</tr>
		</tbody>
	</table>
</body>
</html>
