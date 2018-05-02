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

<title>My JSP 'queryInterview.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link rel="stylesheet" type="text/css" href="css/guoya.css">
</head>

<body>
	<table class="myTable">
		<thead>
			<tr>
				<th>编号</th>
				<th>姓名</th>
				<th>客户类型</th>
				<th>日期</th>
				<th>年龄</th>
				<th>身份证</th>
				<th>性别</th>
				<th>学历</th>
				<th>学费</th>
				<th>已缴学费</th>
				<th>缴费方式</th>
				<th>五险一金</th>
				<th>电脑</th>
				<th>寄宿</th>
				<th>电话</th>
				<th>介绍人</th>
				<th>口碑费</th>
				<!-- <th>已付口碑</th> -->
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="cst" items="${customers}">
				<tr>
					<td >${cst.cno}</td>
					<td>${cst.cname }</td>
					<td>${cst.cstTypeDesc }</td>
					<td>${cst.enrollDateDesc }</td>
					<td>${cst.age }</td>
					<td>${cst.cert }</td>
					<td>${cst.sexDesc }</td>
					<td>${cst.educationDesc }</td>
					<td>0</td>
					<td>0</td>
					<td>现金</td>
					<td>${cst.insuranceDesc }</td>
					<td>${cst.computorDesc }</td>
					<td>${cst.boardDesc }</td>
					<td>${cst.phone }</td>
					<td>${cst.introducerDesc}</td>
					<td>0</td>
					<!-- <td>0</td> -->
					<td><input type=button value="更改"
						onclick="window.open('customer/updateInit.action?cno=${cst.cno }','_self')">
					</td>
				</tr>
				<!-- <tr>
    			<td>程聪</td>
    			<td>2018/4/15</td>
    			<td>20</td>
    			<td>500234199811102179</td>
    			<td>男</td>
    			<td>高中</td>
    			<td>20000</td>
    			<td>20000</td>
    			<td>现金</td>
    			<td>不需要</td>
    			<td>不需要</td>
    			<td>需要</td>
    			<td>17723811700</td>
    			<td>万洪明</td>
    			<td>0</td>
    			<td>0</td>
    			<td><input type=button value="更改" onclick="window.open('student/update.action','_self')"></td>
    		</tr> -->
			</c:forEach>

		</tbody>
	</table>
</body>
</html>
