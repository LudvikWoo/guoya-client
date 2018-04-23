<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'updateInterview.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style>
h1 {
	text-align: center;
}

table {
	width: 40%;
	margin: 5% auto;
	padding: 1%;
	border: 1px solid gray;
}

td {
	border: 1px solid gray;
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
    <form action="interview/add.action" method="get" target="right">
			<table>
				<tr>
					<td>姓名:</td>
					<td><select name="sno" id="sno">
							<option>S001 李静</option>
							<option selected="selected">S002 胡小芬</option>
					</select></td>
				</tr>
				<tr>
					<td>公司名称:</td>
					<td><input type="text" name="company" id="company" value="蚂蚁金服"></td>
				</tr>
				<tr>
					<td>公司性质:</td>
					<td><select>
							<option>金融</option>
							<option selected="selected">电商</option>
					</select></td>
				</tr>
				<tr>
					<td>电话时间:</td>
					<td><input type="date" name="callTime" id="callTime" value="2018-04-24">
					</td>
				</tr>
				<tr>
					<td>面试时间:</td>
					<td><input type="date" name="interviewTime" id="interviewTime" value="2018-04-25">
					</td>
				</tr>
				<tr>
					<td>到岗时间:</td>
					<td><input type="date" name="workTime" id="workTime" value="2018-04-26">
					</td>
				</tr>
				<tr>
					<td>面试进度:</td>
					<td><select name="status" id="status">
							<option>等待安排</option>
							<option>等待面试</option>
							<option>电话未过</option>
							<option selected="selected">面试通过</option>
					</select></td>
				</tr>
				<tr>
					<td>薪资:</td>
					<td><input type="text" name="salary" id="salary" value=12000></td>
				</tr>
				<tr>
					<td>HR联系方式:</td>
					<td><input type="text" name="hrContact" id="hrContact" value="微信：8754343">
					</td>
				</tr>
				<tr>
					<td>没过原因:</td>
					<td><textarea rows="3" cols="30" name="unpassReason"
							id="unpassReason">已通过</textarea></td>
				</tr>
				<tr>
					<td>难点技术:</td>
					<td><textarea rows="3" cols="30" name="hardTech" id="hardTech" value="基础功能测试经验不足"></textarea>
					</td>
				</tr>
				<tr>
					<td>其它总结:</td>
					<td><textarea rows="3" cols="30" name="mark" id="mark" value="面试过程太过于紧张，对角色关系把握不到位"></textarea>
					</td>
				</tr>
				<tr>
					<td>上传录音:</td>
					<td><input type="file" name="interviewAudio"
						id="interviewAudio"></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="提交"> <input
						type="reset" value="重置"></td>
				</tr>
			</table>
		</form>
  </body>
</html>
