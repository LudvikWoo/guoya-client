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
<script type="text/javascript" src="js/guoya-client.js"></script>
</head>

<body>
	<form action="hr/addHR.action" method="post">
		<table>
			<tr>
				<td>归属公司</td>
				<td>
				<input type="text" name="hrCompanyId" id="hrCompanyId" hidden="hidden">
				<input type="text" name="hrCompanyName" id="hrCompanyName" disabled="disabled">
				
				 <input type="button" value="选择"
					onclick="openWindow('jsp/interview/company/select/selectCompany.jsp?name=hrCompany')">
					<input type="button" value="新增公司" onclick="window.open('jsp/interview/company/addCompany.jsp')"></td>
			</tr>
			
			<tr>
				<td>HR姓名</td>
				<td><input type="text" name="hrName"><input type="button" value="校验"
					onclick="openWindow('jsp/interview/company/hr/select/selectHR.jsp?name=hr')"></td>
			</tr>
			<tr>
				<td>微信</td>
				<td><input type="text" name="weichat"></td>
			</tr>
			<tr>
				<td>QQ</td>
				<td><input type="text" name="qq"></td>
			</tr>
			<tr>
				<td>座机</td>
				<td><input type="text" name="telPhone"></td>
			</tr>
			<tr>
				<td>电话</td>
				<td><input type="text" name="mobilePhone"></td>
			</tr>
			<tr>
				<td>邮箱</td>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="reset" value="重置"> <input
					type="submit" value="提交"></td>
			</tr>
		</table>
	</form>
</body>
</html>
