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

<title>My JSP 'addInterview.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style>
.guoya_table {
	width: 60%;
	margin: 5% auto;
	padding: 1%;
	border: 1px solid gray;
}

.guoya_table tr {
	height: 35px;
}

.guoya_table tr td:nth-child(1) {
	width: 40%;
}

td {
	border-bottom: 0px solid gray;
}

input[type="text"],[type="number"],[type="date"],[type="file"] {
	width: 90%;
}

select {
	width: 90%;
}

.submit_tr {
	height: 50px;
	text-align: center;
}

.submit_tr td {
	padding-top: 2%;
}
</style>
</head>

<body>
	<div>
		<form action="interview/add.action" method="get">
			<table class="guoya_table">
				<tr>
					<td>姓名:</td>
					<td><select name="sno" id="sno">
							<option>--请选择--</option>
							<option>S001 李静</option>
							<option>S002 胡小芬</option>
					</select><span style="color: red"> *</span></td>
				</tr>
				<tr>
					<td>公司名称:</td>
					<td><input type="text" name="company" id="company"><span
						style="color: red"> *</span></td>
				</tr>
				<tr>
					<td>公司性质:</td>
					<td><select name="companyType">
							<option>--请选择--</option>
							<option>金融</option>
							<option>电商</option>
							<option>其它</option>
					</select></td>
				</tr>
				<tr>
					<td>电话时间:</td>
					<td><input type="date" name="callTime" id="callTime"><span
						style="color: red"> *</span></td>
				</tr>
				<tr>
					<td>面试时间:</td>
					<td><input type="date" name="interviewTime" id="interviewTime"><span
						style="color: red"> *</span></td>
				</tr>
				<tr>
					<td>到岗时间:</td>
					<td><input type="date" name="workTime" id="workTime">
					</td>
				</tr>
				<tr>
					<td>面试进度:</td>
					<td><select name="status" id="status">
							<option>--请选择--</option>
							<option>等待面试</option>
							<option>正在面试</option>
							<option>面试结束</option>
					</select><span style="color: red"> *</span></td>
				</tr>
				<tr>
					<td>面试结果:</td>
					<td><select name="isPass" id="isPass">
							<option>--请选择--</option>
							<option>待定</option>
							<option>通过</option>
							<option>未通过</option>
					</select></td>
				</tr>
				<tr>
					<td>期望薪资:</td>
					<td><input type="text" name="expectSalary" id="expectSalary"></td>
				</tr>
				<tr>
					<td>实际薪资:</td>
					<td><input type="text" name="realSalary" id="realSalary"></td>
				</tr>
				<tr>
					<td>HR姓名:</td>
					<td><input type="text" name="hrName" id="hrName"><span style="color: red"> *</span> </td>
				</tr>
				<tr>
					<td>HR公司:</td>
					<td><input type="text" name="hrCompany" id="hrCompany"><span style="color: red"> *</span> 
					</td>
				</tr>
				<tr>
					<td>HR联系方式:</td>
					<td><select name="hrContactType">
						<option>--请选择--</option>
						<option>微信</option>
						<option>QQ</option>
						<option>电话</option>
					</select> <span style="color: red"> *</span> 
					</td>
				</tr>
				<tr>
					<td>HR联系号码:</td>
					<td><input type="text" name="hrContact" id="hrContact"><span style="color: red"> *</span> 
					</td>
				</tr>
				<tr>
					<td>面试难点:</td>
					<td><textarea rows="3" cols="40" name="hardTech" id="hardTech"></textarea>
					</td>
				</tr>
				<tr>
					<td>其它总结:</td>
					<td><textarea rows="3" cols="40" name="mark" id="mark"></textarea>
					</td>
				</tr>
				<tr>
					<td>录音上传:</td>
					<td><input type="file" name="audio">
					</td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="提交"> <input
						type="reset" value="重置"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>
