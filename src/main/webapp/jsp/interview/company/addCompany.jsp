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

<title>My JSP 'add.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<script type="text/javascript" src="js/guoya-client.js"></script>

</head>

<body>
	<form action="company/addCompany.action">
		<table>
			<tr>
				<td>公司全称</td>
				<td><input type="text" name="companyName"><input type="button" value="校验"
					onclick="openWindow('jsp/interview/company/select/selectCompany.jsp?name=company')"></td>
			</tr>
			<tr>
				<td>公司简称</td>
				<td><input type="text" name="companyNameAbbreviation"></td>
			</tr>
			<tr>
				<td>公司类型</td>
				<td><select name="companyType">
						<option value="">--请选择--</option>
						<option value="1">金融</option>
						<option value="2">电商</option>
						<option value="3">教育</option>
						<option value="0">其它</option>
				</select></td>
			</tr>
			<tr>
				<td>公司属性</td>
				<td><select name="isOutsource" >
						<option value="">--请选择--</option>
						<option value="0">外包</option>
						<option value="1">甲方</option>
				</select></td>
			</tr>
			<tr>
				<td>公司地址</td>
				<td><textarea rows="3" cols="40" name="addr"></textarea></td>
			</tr>
			<tr>
				<td>描述评价</td>
				<td><textarea rows="3" cols="40" name="companyDesc"></textarea></td>
			</tr>
			<tr>
				<td colspan="2"><input type="reset" value="重置"> <input
					type="submit" value="提交"></td>
			</tr>
		</table>
	</form>
</body>
</html>
