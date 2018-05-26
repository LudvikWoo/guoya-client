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
<script>
	window.onload = function() {
		document.getElementById("enrollDate").value = getNowFormatDate();
	};
	
</script>
</head>

<body>
	<form action="customer/add.action">
		<table>
			<tr>
				<td>姓名：</td>
				<td><input type="text" name="cname" id="cname" value="果芽"></td>
			</tr>
			<tr>
				<td>客户类型：</td>
				<td><select name="cstType" id="cstType">
						<option value="">--请选择--</option>
						<option value="0" selected="selected">内部人员</option>
						<option value="1">外部人员</option>
				</select></td>
			</tr>
			<tr>
				<td>日期：</td>
				<td><input type="date" name="enrollDate" id="enrollDate"></td>
			</tr>

			<tr>
				<td>身份证：</td>
				<td><input type="text" name="cert" id="cert"
					value="330224196702265835"></td>
			</tr>

			<tr>
				<td>学历：</td>
				<td><select name="education" id="education">
						<option value="">--请选择--</option>
						<option value="1">初中</option>
						<option value="2">高中</option>
						<option value="3">大专</option>
						<option value="4">本科</option>
						<option value="5">研究生</option>
				</select></td>
			</tr>
			<tr>
				<td>学费(元)：</td>
				<td><input type="number" name="tuition" id="tuition"
					value="20000"></td>
			</tr>
			<tr>
				<td>已缴学费(元)：</td>
				<td><input type="number" name="payedTuition" id="payedTuition"
					value="0"></td>
			</tr>
			<tr>
				<td>缴费方式：</td>
				<td><select name="payStyle" id="payStyle">
						<option value="">--请选择--</option>
						<option value="1" selected="selected">现金</option>
						<option value="2">支付宝</option>
						<option value="3">微信</option>
						<option value="4">信用卡</option>
				</select></td>
			</tr>
			<tr>
				<td>五险一金：</td>
				<td><input type="radio" name="insurance" value="1">代缴
					<input type="radio" name="insurance" value="0"
					checked="checked">不代缴</td>
			</tr>
			<tr>
				<td>电脑：</td>
				<td><input type="radio" name="computor" value="1">需要
					<input type="radio" name="computor" value="0" checked="checked">不需要</td>
			</tr>
			<tr>
				<td>寄宿：</td>
				<td><input type="radio" name="board" value="1">需要 <input
					type="radio" name="board" value="0" checked="checked">不需要</td>
			</tr>
			<tr>
				<td>代办学历：</td>
				<td><input type="radio" name="buyEdu" value="1">需要 <input
					type="radio" name="buyEdu" value="0" checked="checked">不需要</td>
			</tr>
			<tr>
				<td>成人本科：</td>
				<td><input type="radio" name="adultEdu" value="1">需要 <input
					type="radio" name="adultEdu" value="0" checked="checked">不需要</td>
			</tr>
			<tr>
				<td>电话：</td>
				<td><input type="text" name="phone" id="phone"
					value="15900692460"></td>
			</tr>

			<tr>
				<td>微信：</td>
				<td><input type="text" name="weichat" id="weichat"
					value="15900692460"></td>
			</tr>
			<tr>
				<td>介绍人：</td>
				<td><input type="text" name="introducerDesc" id="introducerDesc"  readonly="readonly" >
					<input type="text" name="introducer" id="introducer" readonly="readonly" hidden="hidden">  <input type="button" value="查询"
					onclick="queryCustomer('introducer')"> <input type="button" value="新增"
					onclick="addCustomer"></td>
			</tr>
			<tr>
				<td>口碑费(元)：</td>
				<td><input type="number" name="referralFee" id="referralFee"
					value="1000"></td>
			</tr>
			<tr>
				<td>已付口碑(元)：</td>
				<td><input type="number" name="serviceChargePayed"
					id="serviceChargePayed" value="0"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="提交"> <input
					type="reset" value="重置"></td>
			</tr>
		</table>
	</form>
</body>
</html>
