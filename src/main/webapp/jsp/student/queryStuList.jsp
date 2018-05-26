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
<script type="text/javascript">
	function returnValue(sno,sname)
	{
		window.parent.returnCno(sno,sname);
	}
</script>

</head>

<body>
	<table border="1">
		<thead>
			<tr>
				<th>客户号</th>
				<th>姓名</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="stu" items="${students}">
				<tr>
					<td>${stu.sno}</td>
					<td>${stu.cnoDesc }</td>
					<td>
						<input type=button value="选择"
						onclick="returnValue('${stu.sno }','${stu.cnoDesc }')"></td>
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
