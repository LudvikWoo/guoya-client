<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'query.jsp' starting page</title>

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
	<form action="customer/query.action" target="result" method="post">
		<table class="queryTable">
			<tr>
				<td>姓名：</td>
				<td><input type="text" name="cname"></td>
				<td>日期：</td>
				<td><input type="date" name="enrollDate" id="enrollDate"></td>
				<td>年龄：</td>
				<td><input type="number" name="ageMin" id="ageMin">-<input type="number" name="ageMax" id="ageMax"></td>
			</tr>
			<tr>
				<td>性别：</td>
				<td><input type="radio" name="sex" value="0">男 <input
					type="radio" name="sex" value="1">女</td>
				<td>学历：</td>
				<td><select name="education" id="education">
						<option value="">--请选择--</option>
						<option value="1">初中</option>
						<option value="2">高中</option>
						<option value="3">大专</option>
						<option value="4">本科</option>
						<option value="5">研究生</option>
				</select></td>
				<td>已缴学费：</td>
				<td><input type="text" name="payedTuitionMin"
					id="payedTuitionMin">-<input type="text"
					name="payedTuitionMax" id="payedTuitionMax"></td>
			</tr>
			<tr>
				<td>缴费方式：</td>
				<td><select name="payStyle" id="payStyle">
						<option value="">--请选择--</option>
						<option value="0">现金</option>
						<option value="1">支付宝</option>
						<option value="2">微信</option>
						<option value="3">信用卡</option>
				</select></td>

				<td>五险一金：</td>
				<td><select name="insurance" id="insurance">
						<option value="">--请选择--</option>
						<option value="0">不需要</option>
						<option value="1">需要</option>
				</select></td>

				<td>电脑：</td>
				<td><select name="computor" id="computor">
						<option value="">--请选择--</option>
						<option value="0">不需要</option>
						<option value="1">需要</option>
				</select></td>

			</tr>
			<tr>
				<td>寄宿：</td>
				<td><select name="board" id="board">
						<option value="">--请选择--</option>
						<option value="0">不需要</option>
						<option value="1">需要</option>
				</select></td>

				<td>介绍人：</td>
				<td><input type="text" name="introducerDesc" id="introducerDesc"></td>
				<td>已付口碑费：</td>
				<td><input type="text" name="serviceChargePayedMin"
					id="serviceChargePayedMin">-<input type="text"
					name="serviceChargePayedMax" id="serviceChargePayedMax"></td>
			</tr>
			<tr>
				<td>客户类型：</td>
				<td><select name="cstType" id="cstType">
						<option value="">--请选择--</option>
						<option value="0" >内部人员</option>
						<option value="1">外部人员</option>
				</select></td>
				<td colspan="4" align="right"><input type="submit" value="查询"><input
					type="reset" value="重置"></td>
			</tr>
		</table>
	</form>
	<hr>
</body>
<iframe id="iframepage" name="result" width="100%" noResize
	scrolling="no" frameborder="0"
	onload="this.height=this.contentWindow.document.body.scrollHeight+10">
</html>
