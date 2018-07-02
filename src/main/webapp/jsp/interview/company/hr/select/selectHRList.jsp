<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'selectCompany.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<script type="text/javascript" src="js/guoya-client.js"></script>
</head>

<body>
	<table border="1">
		<thead>
			<tr>
				<th>公司名称</th>
				<th>HR姓名</th>
				<th>手机</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="hr" items="${hrs}">
				<tr>
					<td>${hr.companyName}</td>
					<td>${hr.hrName}</td>
					<td>${hr.mobilePhone}</td>
					<td><input type=button value="选择"
						onclick="returnValue('${hr.hrId}','${hr.hrName}')"></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>
