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

<title>My JSP 'student.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<script src="js/jquery-3.3.1.min.js">
	
</script>
</head>
<script>
	$(document).ready(function() {
		
		$("button").click(function() {
			$("p").hide();
			alert($("img").attr("src"));
			$("#name").Attr("value");
			add();
		});
		
		function add(){
			alert(1+2);
		}
	});

	function add(){
		alert(1+2);
	}
</script>
</head>

<body>
	<form action="student/update.action" target="right">
		<table>
			<tr>
				<td>姓名：</td>
				<td><input type="text" name="sname" id="sname"></td>
			</tr>
			<tr>
				<td>日期：</td>
				<td><input type="date" name="enrollDate" id="enrollDate"></td>
			</tr>
			<tr>
				<td>年龄：</td>
				<td><input type="number" name="age" id="age"></td>
			</tr>
			<tr>
				<td>身份证：</td>
				<td><input type="text" name="certNo" id="certNo"></td>
			</tr>
			<tr>
				<td>性别：</td>
				<td>
					<input type="radio" name="sex" value="male">男  <input type="radio" name="sex" value="female">女
 				</td>
			</tr>
			<tr>
				<td>学历：</td>
				<td>
					<select name="education" id="education">
						<option value="">--请选择--</option>
						<option value="">初中</option>
						<option value="">高中</option>
						<option value="">大专</option>
						<option value="">本科</option>
						<option value="">研究生</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>学费：</td>
				<td><input type="text" name="tuition" id="tuition"></td>
			</tr>
			<tr>
				<td>已缴学费：</td>
				<td><input type="text" name="payedTuition" id="payedTuition"></td>
			</tr>
			<tr>
				<td>缴费方式：</td>
				<td>
					<select name="payStyle" id="payStyle">
						<option value="">--请选择--</option>
						<option value="">现金</option>
						<option value="">支付宝</option>
						<option value="">微信</option>
						<option value="">信用卡</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>五险一金：</td>
				<td>
					<input type="radio" name="insurance" value="true">代缴 <input type="radio" name="insurance" value="false">不代缴 
				</td>
			</tr>
			<tr>
				<td>电脑：</td>
				<td>
					<input type="radio" name="computor" value="true">需要 <input type="radio" name="computor" value="false">不需要 
				</td>
			</tr>
			<tr>
				<td>寄宿：</td>
				<td>
					<input type="radio" name="board" value="true">需要 <input type="radio" name="board" value="false">不需要 
				</td>
			</tr>
			<tr>
				<td>电话：</td>
				<td><input type="text" name="phone" id="phone"></td>
			</tr>
			<tr>
				<td>介绍人：</td>
				<td><input type="text" name="introducer" id="introducer"></td>
			</tr>
			<tr>
				<td>口碑费：</td>
				<td><input type="text" name="serviceCharge" id="serviceCharge"></td>
			</tr>
			<tr>
				<td>已付口碑：</td>
				<td><input type="text" name="serviceChargePayed" id="serviceChargePayed"></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="提交">  <input type="reset" value="重置">
 				</td>
			</tr>
		</table>
	</form>
</body>
</html>
