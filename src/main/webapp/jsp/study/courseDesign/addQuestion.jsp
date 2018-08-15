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

<title>My JSP 'addQuestion.jsp' starting page</title>

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
		<form>
		<div style="display: flex">
			<div>问题来源：</div>
			<div>
				<select>
					<option>--请选择--</option>
					<option>面试录音</option>
					<option>工作经验</option>
					<option>会议讨论</option>
					<option>学生反馈</option>
					<option>其它</option>
				</select>
			</div>
		</div>
		<!-- <div>
			<div>归属模块：</div>
			<div>
				<ol>
					<li><input type="checkbox" name="category" value="1">java
						<ul>
							<li><input type="checkbox" name="category" value="1">字符串解析</li>
							<li><input type="checkbox" name="category" value="1">for循环</li>
						</ul></li>
					<li><input type="checkbox" name="category" value="1">linux
						<ul>
							<li><input type="checkbox" name="category" value="1">查看日志</li>
							<li><input type="checkbox" name="category" value="1">查看进程</li>
						</ul></li>
					<li><input type="checkbox" name="category" value="1">db</li>
				</ol>
			</div>
		</div> -->
		<div>
			<div>
				场景描述[<a href="#">新增问题</a> | <a href="#">删除</a>]：
			</div>
			<!-- 问题内容 start -->
			<div>
				<div style="display: flex">
					<div>归类：</div>
					<div>
						<textarea rows="1" cols="140"></textarea>
						<textarea rows="1" cols="140" style="display: none"></textarea>
					</div>
					<div>
						<input type="button" value="选择">
					</div>
				</div>
				<div style="display: flex">
					<div>名称：</div>
					<div>
						<textarea rows="1" cols="150"></textarea>
					</div>
				</div>
				<div style="display: flex">
					<div>描述：</div>
					<div>
						<textarea rows="3" cols="150"></textarea>
					</div>
				</div>
			</div>
			<!-- 问题内容 end -->
		</div>
		<!--  -->
		<div></div>
		<div>
			<div>
				问题1[<a href="#">新增细项</a> | <a href="#">删除</a>]：
			</div>
			<!-- 问题内容 start -->
			<div>
				<div style="display: flex">
					<div>归类：</div>
					<div>
						<textarea rows="1" cols="140"></textarea>
						<textarea rows="1" cols="140" style="display: none"></textarea>
					</div>
					<div>
						<input type="button" value="选择">
					</div>
				</div>
				<div style="display: flex">
					<div>名称：</div>
					<div>
						<textarea rows="1" cols="150"></textarea>
					</div>
				</div>
				<div style="display: flex">
					<div>描述：</div>
					<div>
						<textarea rows="3" cols="150"></textarea>
					</div>
				</div>
			</div>
			<!-- 问题内容 end -->
		</div>
		<div>
			<div>
				<!-- 问题小项 start -->
				<div>
					<div>
						问题1.1[<a href="#">新增细项</a> | <a href="#">删除</a>]：
					</div>
					<!-- 问题内容 start -->
					<div>
						<div style="display: flex">
							<div>归类：</div>
							<div>
								<textarea rows="1" cols="140"></textarea>
								<textarea rows="1" cols="140" style="display: none"></textarea>
							</div>
							<div>
								<input type="button" value="选择">
							</div>
						</div>
						<div style="display: flex">
							<div>名称：</div>
							<div>
								<textarea rows="1" cols="150"></textarea>
							</div>
						</div>
						<div style="display: flex">
							<div>描述：</div>
							<div>
								<textarea rows="3" cols="150"></textarea>
							</div>
						</div>
					</div>
					<!-- 问题内容 end -->
				</div>
				<!-- 问题小项 end -->
			</div>
		</div>
		<!-- <div>
			<div>需求描述</div>
			<div>
				<textarea rows="5" cols="150">
				数据库以问题为导向，大问题会关联一个场景，一个场景下面也会有很多个问题。<br>
				小问题挂在大问题下面，当查询小问题时，会回溯大问题和场景<br>
				当查询大问题时，会列出大问题和所有下属小问题，以及对应的场景<br>
				场景是否需要复用？需要复用，一个场景，可以不断下挂问题，应该是问题层级树比较好，而不是固定层级
			</textarea>
			</div>
		</div> -->
		<div style="display: flex">
			<div>
				<input type="reset" value="重置">
			</div>
			<div>
				<input type="button" value="提交" onclick="location='jsp/study/courseDesign/queryQuestion.jsp'">
			</div>
		</div>
		</form>
	</div>
</body>
</html>
