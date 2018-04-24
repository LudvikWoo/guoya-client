<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'index.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<script src="https://cdn.bootcss.com/jquery/2.2.4/jquery.min.js"></script>
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

<script type="text/javascript">
	/*
	 function changeFrameHeight() {
	 //alert(this.document.body.scrollHeight);
	 var ifm = document.getElementById("iframepage");
	 //alert(ifm.height);
	 ifm.height = document.documentElement.clientHeight;
	 //alert(document.documentElement.clientHeight);
	 ifm.addEventListener('load', function() {
	 alert("document.documentElement.clientHeight="+document.documentElement.clientHeight);
	 alert("当前："+ifm.height);
	 //ifm.height = getHeight(ifm.contentDocument);
	 ;
	 });

	 }

	 function getHeight(doc) {
	 var body = doc.body, html = doc.documentElement;
	 alert("body.scrollHeight="+body.scrollHeight);
	 alert("body.offsetHeight="+body.scrollHeight);
	 alert("html.clientHeight="+body.scrollHeight);
	 alert("html.scrollHeight="+html.scrollHeight);
	 alert("html.offsetHeight="+html.offsetHeight);
	 var height = Math.max(body.scrollHeight, body.offsetHeight,
	 html.clientHeight, html.scrollHeight, html.offsetHeight);
	 alert("最大："+height);
	 return height;
	 }

	
	 window.onresize = function() {
	 changeFrameHeight();

	 }
	 function reinitIframe() {
	 var iframe = document.getElementById("iframepage");
	 try {
	 var bHeight = iframe.contentWindow.document.body.scrollHeight;
	 var dHeight = iframe.contentWindow.document.documentElement.scrollHeight;
	 var height = Math.max(bHeight, dHeight);
	 alert(height);
	 iframe.height = height;
	 } catch (ex) {
	 }
	 }
	 window.setInterval("reinitIframe()", 200);
	 */

	/*$(document).ready(function(){
	 $("a").click(function(){
	 alert(this.href);
	 var xmlhttp = new XMLHttpRequest();
	 //菜单
	 xmlhttp.open("GET", this.href, true);
	 xmlhttp.send();
	 xmlhttp.onreadystatechange = function() {
	 alert(xmlhttp.status);
	 if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
	 alert("服务端响应：" + xmlhttp.responseText);
	 $("#content").html(xmlhttp.responseText);
	 //alert($("#content").html());
	 return false;
	 }
	 };
	 alert(false);
	 return false;
	 });
	 });
	 */
</script>
<style>
header {
	text-align: center;
	padding: 5px;
	height: 15%;
	margin: 1%;
	background-color: white;
}

nav {
	line-height: 30px;
	width: 20%;
	float: left;
	padding: 10px;
	margin: 0 1% 1% 1%;
	background-color: white;
}

section {
	width: 72%;
	float: left;
	padding: 10px;
	margin: 0 1% 1% 0;
	background-color: white;
}

footer {
	background-color: black;
	color: black;
	clear: both;
	text-align: center;
	padding: 5px;
	margin: 0 1% 1% 1%;
	background-color: white;
}

body {
	background-color: #eeeeee;
}

.main_div {
	padding-top: 15px;
	padding-bottom: 15px;
	padding-right: 15px;
}

ul {
	/*list-style-image: url(basicClass/images/icon/eg_arrow.gif);*/
	list-style-type: none;
	margin: 0;
	color: white;
}

ul li {
	padding-bottom: 7px;
}

li a {
	display: block;
	color: black;
	text-decoration: none;
	padding: 5px;
}

li a:hover {
	background-color: #2DA4FC;
	color: white;
}

span {
	color: #0099FF;
	font-size: 13px
}

table {
	width: 100%;
	text-align: center;
}
</style>
<script type="text/javascript">
function refresh(){
	window.open("/guoya-client");
}
function logout(){
	document.getElementById("logoutForm").submit();
}
</script>
</head>

<body>
	<div>
		<header>
		<div>
			<table border="0" width="100%" height="100%">
				<tr>
					<td style="text-align:center;width:20%"><img
						src="/guoya-client/basicClass/images/company/guoyasoft_logo.jpg"
						id="guo" height="75px" onclick="refresh()"></td>
					<td style="text-align:center;"><span
						style="color:#0099FF;font-size:30px">做一个真正<span
							style="font-size:45px"><b>会开发</b></span>的<span
							style="font-size:45px"><b>测试</b></span></span></td>
					<td style="text-align:right;width:20%">[<a
						href="/guoya-client/logout" target="_top">退出</a>]
						</form>
					</td>

				</tr>

			</table>
		</div>
		</header>

		<nav>
		<div class="main_div">
			<ul>
				<li><a href="jsp/interview/add.jsp" target="right">面试登记</a></li>
				<li><a href="jsp/interview/query.jsp" target="right">面试查询</a></li>
				<li><a href="jsp/student/add.jsp" target="right">报名登记</a></li>
				<li><a href="jsp/student/query.jsp" target="right">报名查询</a></li>
				<li><a href="jsp/exam/add.jsp" target="right">笔试上传</a></li>
				<li><a href="jsp/exam/query.jsp" target="right">笔试查询</a></li>
				<li><a href="basicClass/medias.html" target="right">高频问题</a></li>
				<li><a href="basicClass/slidebox-master/slidebox.html" target="right">内荐机会</a></li>
				<li><a href="basicClass/navigateInfo.html" target="_blank">资料汇总</a></li>
				<li><a href="basicClass/exerciseInfo.html" target="_blank">作业检查</a></li>
				<li><a href="basicClass/taskInfo.html" target="right">任务列表</a></li>
				<li><a href="basicClass/summarizeInfo.html" target="right">上传总结</a></li>
				<li><a href="basicClass/courses/courseAuto.html" target="right">课件讲解</a></li>
				<!-- <li><a href="http://www.runoob.com/" target="right">菜鸟教程</a></li>
				<li><a href="http://www.w3school.com.cn/" target="right">W3school</a></li>
				<li><a href="https://www.bejson.com/xml2json/" target="right">xml转json</a></li>
				<li><a href="basicClass/happyMoment.html" target="right">果芽乐园</a></li>
				<li><a href="basicClass/bigEvents.html" target="right">果芽大事件</a></li> -->
			</ul>
		</div>
		</nav>

		<section> <iframe id="iframepage" name="right" width="100%" height="96%"
			noResize scrolling="auto" frameborder="0"
			></iframe>
			<!-- onload="this.height=this.contentWindow.document.body.scrollHeight" -->
		</section>
		<footer>
		<div>
			<table>
				<tr>
					<td><span>关于果芽·联系我们·加入我们·帮助中心·合作伙伴<span></span></td>
				</tr>
				<tr>
					<td><span>上海果芽软件科技有限公司·上海市闵行区浦江镇浦星公路1696号43幢4楼415<span></td>
				</tr>
			</table>
		</div>
		</footer>
	</div>
</body>
</html>
