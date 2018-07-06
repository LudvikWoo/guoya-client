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

</head>

<body>
	<form>
		<table>
			<tr>
				<td>姓名：</td>
				<td><input type="text"></td>
				<td>班级：</td>
				<td><select>
						<option>---请选择---</option>
						<option>测试基础班1805</option>
						<option>测试基础班1807</option>
						<option>测试中级班1806</option>
				</select></td>
				<td>学历：</td>
				<td><select>
						<option>---请选择---</option>
						<option>初中</option>
						<option>高中</option>
						<option>大专</option>
						<option>本科</option>
						<option>研究生</option>
				</select></td>
			</tr>

			<tr>
				<td>面试数：</td>
				<td><input type="number">-<input type="number"></td>
				<td>结束数：</td>
				<td><input type="number">-<input type="number"></td>
				<td>通过数：</td>
				<td><input type="number">-<input type="number"></td>
			</tr>

			<tr>
				<td>是否入职：</td>
				<td><select>
						<option>---请选择---</option>
						<option>是</option>
						<option>否</option>
				</select></td>
				<td></td><td></td>
				<td><input type="reset" value="重置" ></td>
				<td><input type="button" value="提交" ></td>
			</tr>
		</table>
	</form>
</body>
</html>
