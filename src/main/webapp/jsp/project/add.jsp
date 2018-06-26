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
.item_div {
	display: flex;
}

.item_name {
	width: 20%;
	height: 30px;
	border: 0px solid black;
}

.item_content {
	width: 78%;
	height: 30px;
}

.backgroud_div {
	width: 100%;
	border: 0px solid black;
}
</style>
</head>

<body>
	<div class="backgroud_div">
		<form action="exam/add.action" method="get">
			<div class="backgroud_div">
				<div>基本信息</div>
				<div class="backgroud_div">
					<div class="item_div">
						<div class="item_name">作者：</div>
						<div class="item_content">
							<input type="text" name="author_cst_id" id="author_cst_id"
								readonly="readonly"> <input type="text"
								name="author_cst_id_btn" id="author_cst_id_btn"
								readonly="readonly" hidden="hidden"> <input
								type="button" value="查询" onclick="queryCustomer()">
						</div>
					</div>
					<div class="item_div">
						<div class="item_name">公司名称：</div>
						<div class="item_content">
							<input type="text" name="company_name">
						</div>
					</div>
					<div class="item_div">
						<div class="item_name">项目名称：</div>
						<div class="item_content">
							<input type="text" name="project_name">
						</div>
					</div>
					<div class="item_div">
						<div class="item_name">项目时间：</div>
						<div class="item_content">
							<input type="date" name="prj_start_time">-<input
								type="date" name="prj_end_time">
						</div>
					</div>

					<div class="item_div">
						<div class="item_name">项目类型：</div>
						<div class="item_content">
							<select>
								<option>---请选择---</option>
								<option>证券类</option>
								<option>电商类</option>
								<option>银行类</option>
								<option>汽车类</option>
								<option>保险类</option>
								<option>其它</option>
							</select>
						</div>
					</div>

					<div class="item_div">
						<div class="item_name">一句话介绍：</div>
						<div class="item_content">
							<input type="text" name="project_introduce">是一款面向<input
								type="text" name="project_introduce">用户的<input
								type="text" name="project_introduce">类产品，提供<input
								type="text" name="project_introduce">等服务，解决<input
								type="text" name="project_introduce">问题
						</div>
					</div>

				</div>
			</div>





			<br>
			<div>
				<div>系统架构</div>
				<div>
					<div>
						<div>前端：</div>
						<div>
							<input type="checkbox">web <input type="checkbox">app
							<input type="checkbox">h5 <input type="checkbox">小程序
							<input type="checkbox">公众号 <input type="checkbox">其它
						</div>
					</div>

					<div>后端：</div>
					<div>
						<input type="checkbox">管理系统 <input type="checkbox">接口系统
						<input type="checkbox">其它
					</div>
				</div>


				<div>
					主机类型：<input type="checkbox">linux <input type="checkbox">unix
					<input type="checkbox">云服务 <input type="checkbox">其它
				</div>
				<div>
					web服务器：<input type="checkbox">tomcat <input type="checkbox">weblogic
					<input type="checkbox">appache <input type="checkbox">其它
				</div>
				<div>
					<div>
						数据库类型<input type="checkbox">oracle <input type="checkbox">mysql
						<input type="checkbox">redis <input type="checkbox">mongDB
						<input type="checkbox">sql server
					</div>
					<div>
						数据库工具<input type="checkbox">plsql <input type="checkbox">sqlyog
						<input type="checkbox">heidSQL <input type="checkbox">其它
					</div>
				</div>
				<div>
					测试管理工具：<input type="checkbox">禅道 <input type="checkbox">jra
					<input type="checkbox">内部系统 <input type="checkbox">其它
				</div>
				<div>
					代码管理工具：<input type="checkbox">git <input type="checkbox">svn
					<input type="checkbox">cvs <input type="checkbox">其它
				</div>
				<div>
					持续集成：<input type="checkbox">jekins <input type="checkbox">maven
					<input type="checkbox">shell脚本 <input type="checkbox">内部构建平台
					<input type="checkbox">其它
				</div>
				<div>
					<div>发布环境：</div>
					<div>
						<input type="checkbox">开发环境: <input type="text">套
					</div>
					<div>
						<input type="checkbox">测试环境： <input type="text">套
					</div>
					<div>
						<input type="checkbox">准生产环境 <input type="text">套
					</div>
					<div>
						<input type="checkbox">生产环境<input type="text">套
					</div>
				</div>
			</div>

			<br>

			<div>组织结构（单位：人）</div>
			<div>
				<div>
					公司人数：<input type="number" name="">
				</div>
				<div>
					项目人数：<input type="number" name="">
				</div>
				<div>
					项目经理：<input type="number" name="">
				</div>
				<div>
					产品：<input type="number" name="">
				</div>
				<div>
					需求：<input type="number" name="">
				</div>
				<div>
					开发：<input type="number" name="">
				</div>
				<div>
					android：<input type="number" name="">
				</div>
				<div>
					IOS：<input type="number" name="">
				</div>
				<div>
					UI：<input type="number" name="">
				</div>
				<div>
					测试：<input type="number" name="">
				</div>
				<div>
					运维：<input type="number" name="">
				</div>
			</div>

			<br>

			<div>界面测试工具：</div>
			<div>
				<div>
					<div>
						<div>
							web端：<input type="checkbox">浏览器 <input type="checkbox">selenium-java
							<input type="checkbox">testNG <input type="checkbox">selenium-python
						</div>
						<div>
							移动端：<input type="checkbox">android/ios真机 <input
								type="checkbox">云测 <input type="checkbox">appium-java
							<input type="checkbox">android adb
						</div>
					</div>
				</div>
			</div>

			<div>
				<div>接口测试工具：</div>
				<div>
					<div>
						界面方案：<input type="checkbox">模拟接口测试界面
					</div>
					<div>
						工具方案：<input type="checkbox">jmeter <input type="checkbox">postman
						<input type="checkbox">soapUI
					</div>
					<div>
						代码方案：<input type="checkbox">java <input type="checkbox">python
					</div>
				</div>
			</div>


			<div>
				<div>日志查看工具：</div>
				<div>
					<input type="checkbox">securityCRT <input type="checkbox">XShell
					<input type="checkbox">内部工具
				</div>
			</div>
			<div></div>


			<br>

			<div>
				<div>一个典型业务流程：</div>
				<div>
					<textarea rows="10" cols="60"></textarea>
				</div>
			</div>
		</form>
	</div>
</body>
</html>
