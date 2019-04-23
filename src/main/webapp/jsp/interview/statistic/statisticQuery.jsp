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

<title>面试统计</title>
<script type="text/javascript">
	function doSubmit(){
		document.getElementById("form").submit();
	}
</script>
</head>

<body>
	<form id="form" action="interview/statistic/statisticQuery.action" method="post" target="result">
		<table>
			<tr>
				<td>姓名：</td>
				<td><input type="text" name="studentName" id="studentName"></td>
				<td>班级：</td>
				<td><select name="classId" id="classId">
						<option value="">---请选择---</option>
						<option value="">--请选择--</option>
						<option value="2">1805基础班</option>
						<option value="11">1807基础班</option>
						<option value="12">1808基础班</option>
						<option value="13">1809基础班</option>
						<option value="15">1810基础班</option>
						<option value="16">1811基础班</option>
						<option value="17">1903基础班</option>
				</select></td>
				<td>学历：</td>
				<td><select name="education" id="education">
						<option value="">---请选择---</option>
						<option value="1">初中</option>
						<option value="2">高中</option>
						<option value="3">大专</option>
						<option value="4">本科</option>
						<option value="5">研究生</option>
				</select></td>
			</tr>

			<tr>
				<td>面试数：</td>
				<td><input type="number" name="interviewCtnMin" id="interviewCtnMin">-<input type="number" name="interviewCtnMax" id="interviewCtnMax"></td>
				<td>结束数：</td>
				<td><input type="number" name="finishCtnMin" id="finishCtnMin">-<input type="number" id="finishCtnMax" name="finishCtnMax"></td>
				<td>通过数：</td>
				<td><input type="number" name="passCtnMin" id="passCtnMin">-<input type="number" name="passCtnMax" id="passCtnMax"></td>
			</tr>

			<tr>
				<td>是否入职：</td>
				<td><select name="hasJob" id="hasJob">
						<option value="">---请选择---</option>
						<option value="1">是</option>
						<option value="0">否</option>
				</select></td>
				<td>年龄：</td>
				<td><input type="text" name="ageMin" id="ageMin">-<input type="text" name="ageMax" id="ageMax"></td>
				<td><input type="reset" value="重置" ></td>
				<td><input type="button" value="查询" onclick="doSubmit()"></td>
			</tr>
		</table>
	</form>
</body>
<iframe id="iframepage" name="result" width="100%" noResize
	scrolling="no" frameborder="0"
	onload="this.height=this.contentWindow.document.body.scrollHeight+10">
</html>
