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

<title>My JSP 'updateInterview.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
	<div>
		<img alt="" src="/exam/p1.jpg">
	</div>
	<div>
		<div>
			<form action="" id="form1">
				<table>
					<tr>
						<td>答案：</td>
						<td><input type="button" value="添加答案"></td>
						<td><input type="button" value="删除图片"></td>
						<td><input type="button" value="删除答案"></td>
						<td><input type="button" value="刷新"></td>
					</tr>
				</table>
			</form>
		</div>
		<div>
			<form action="" id="form2">
				<table>
					<tr>
						<td><input type="button" value="X"></td>
						<td><input type="text"></td>
						<td><textarea rows="3" cols="50"></textarea></td>
						<td><select>
								<option>确定</option>
								<option>不确定</option>
								<option>猜测</option>
						</select></td>
						<td><input type="button" value="保存"></td>
					</tr>
				</table>
			</form>
			<table>
				<tr>
					<td><input type="button" value="X"></td>
					<td>1.1</td>
					<td>A</td>
					<td>不确定</td>
				</tr>
				<tr>
					<td><input type="button" value="X"></td>
					<td>1.2</td>
					<td>这道题太过于复杂，不会用写</td>
					<td>确定</td>
				</tr>
			</table>
		</div>
	</div>
	<br>
	<br>
	<div>
		<img alt="" src="/exam/p2.png">
	</div>
<div>
		<div>
			<form action="" id="form1">
				<table>
					<tr>
						<td>答案：</td>
						<td><input type="button" value="添加答案"></td>
						<td><input type="button" value="删除图片"></td>
						<td><input type="button" value="删除答案"></td>
						<td><input type="button" value="刷新"></td>
					</tr>
				</table>
			</form>
		</div>
		<div>
			<form action="" id="form2">
				<table>
					<tr>
						<td><input type="button" value="X"></td>
						<td><input type="text"></td>
						<td><textarea rows="3" cols="50"></textarea></td>
						<td><select>
								<option>确定</option>
								<option>不确定</option>
								<option>猜测</option>
						</select></td>
						<td><input type="button" value="保存"></td>
					</tr>
				</table>
			</form>
			<table>
				<tr>
					<td><input type="button" value="X"></td>
					<td>1.1</td>
					<td>A</td>
					<td>不确定</td>
				</tr>
				<tr>
					<td><input type="button" value="X"></td>
					<td>1.2</td>
					<td>这道题太过于复杂，不会用写</td>
					<td>确定</td>
				</tr>
			</table>
		</div>
	</div>
	<br>
	<br>
	<div>
		<img alt="" src="/exam/p3.jpg">
	</div>
<div>
		<div>
			<form action="" id="form1">
				<table>
					<tr>
						<td>答案：</td>
						<td><input type="button" value="添加答案"></td>
						<td><input type="button" value="删除图片"></td>
						<td><input type="button" value="删除答案"></td>
						<td><input type="button" value="刷新"></td>
					</tr>
				</table>
			</form>
		</div>
		<div>
			<form action="" id="form2">
				<table>
					<tr>
						<td><input type="button" value="X"></td>
						<td><input type="text"></td>
						<td><textarea rows="3" cols="50"></textarea></td>
						<td><select>
								<option>确定</option>
								<option>不确定</option>
								<option>猜测</option>
						</select></td>
						<td><input type="button" value="保存"></td>
					</tr>
				</table>
			</form>
			<table>
				<tr>
					<td><input type="button" value="X"></td>
					<td>1.1</td>
					<td>A</td>
					<td>不确定</td>
				</tr>
				<tr>
					<td><input type="button" value="X"></td>
					<td>1.2</td>
					<td>这道题太过于复杂，不会用写</td>
					<td>确定</td>
				</tr>
			</table>
		</div>
	</div>
</body>
</html>
