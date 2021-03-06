<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="commons/jspInit.jsp"%>

<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">
<title>作业检查</title>
<style>

table {
	margin: 0;
	border-collapse: collapse;
	border-spacing: 0;
}

td {
	border-spacing: 0;
	border-bottom: 1px solid black
}

.double {
	background-color: gray;
}

#nav /*悬浮框标签*/ {
	position: fixed; /*浮窗位置*/
	left: 4px;
	top: 4px ;/*靠右*/
	background-color: #D8D8D8;
}

#nav td /*悬浮框标签*/ {
	border-bottom: 0px solid black
}

</style>
<script type="text/javascript" src="basicClass/js/guoya.js"></script>

<script type="text/javascript">
	var classCode="<%=session.getAttribute("classCode")%>";

	//点名：学生信息列表
	var studentNames="";
	window.onload = function() {
		refresh();
	};

	function refresh() {
		var parameters = "/guoya-server/studyInfo?method=getUrls&classCode="+classCode;
		var xmlhttp = new XMLHttpRequest();
		xmlhttp.open("GET", publicUrl + parameters, true);
		xmlhttp.send();
		xmlhttp.onreadystatechange = function() {
			if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
				var result = xmlhttp.responseText;
				generateHtml(result);
			}
		};
	}

	function generateHtml(jsonStr) {
		//var jsonStr='{"study":{"student":[{"group":"1","sno":"s001","sname":"陈超","url":"http://127.0.0.1:8083/guoya-client/basicClass/首页.html","status":"pass"},{"group":"1","sno":"s001","sname":"陈超","url":"http://127.0.0.1:8083/guoya-client/basicClass/首页.html","status":"pass"},{"group":"1","sno":"s001","sname":"陈超","url":"http://127.0.0.1:8083/guoya-client/basicClass/首页.html","status":"pass"},{"group":"1","sno":"s001","sname":"陈超","url":"http://127.0.0.1:8083/guoya-client/basicClass/首页.html","status":"pass"}]}}';
		//JSON.parse(json字符串)
		var obj = JSON.parse(jsonStr);
		var student = obj.study.student;
		var innerHtml = "		<table style=\"width:100%;\">  ";
		var groupId = "";
		var groupIndex = 0;
		for ( var p in student) {//遍历json数组时，这么写p为索引，0,1
			var item = student[p];
			studentNames+="|"+item.sname;
			if (groupId != item.group) {
				innerHtml = innerHtml + "			<tr>                       "
						+ "				<td colspan=17>第" + item.group
						+ "组</td>         " + "			</tr>                      "
				groupId = item.group;
				groupIndex = 0;
			}

			if (groupIndex % 3 == 0) {
				innerHtml = innerHtml + "			<tr>                       ";
			}
			var imageName = "cross.jpg";
			if (item.status == 1) {
				imageName = "tick.jpg";
				pass = pass + 1;
			} else {
				unPass = unPass + 1;
			}
			innerHtml = innerHtml
					+ '			<td style="width:3%;text-align:center;display:none">'
					+ '<img src="basicClass/images/icon/delete.jpg" height="20px" onclick="deleteStudy(\''
					+ item.sno
					+ '\')">'
					+ '</td>                    '
					+ '                                                                                 '
					+ '			<td style="width:5%;text-align:center"><img src="basicClass/images/guoya_logo.jpg" width="45px"></td>            '
					+ '			<td style="width:5%">'
					+ item.sname
					+ '<br>&nbsp;&nbsp;<img class="statusImg" id="'
					+ item.sno
					+ '_img"src="basicClass/images/icon/'
					+ imageName
					+ '"           '
					+ '				height="20px" onclick="switchStatus(\''
					+ item.sno
					+ '\')">                     '
					+ '			</td>                                                                 '
					+ '			<td><textarea id="'+item.sno+'_url" rows="3" cols="22" >'
					+ item.url
					+ '</textarea></td>       '
					+ '			<td style="width:7%"><input type="button" value="保存" onclick="saveUrl(\''
					+ item.sno + '\')"><br>  '
					+ '				<input type="button" value="测试" onclick="openUrl(\''
					+ item.sno + '\')"></td> ';
			if (groupIndex % 3 == 2) {
				innerHtml = innerHtml + "			</tr>                      ";
			}
			groupIndex = groupIndex + 1;
		}
		studentNames=studentNames.substring(1);

		var table = document.getElementById('content');
		table.innerHTML = innerHtml + "</table>";
		statistic();
	}

	function saveUrl(sno) {
		var textarea = document.getElementById(sno + '_url');
		var url = textarea.value;
		var json={
				request:{
					method:"updateStudent",
					student:{
						sno:sno,
						url:url
					}
				}
		};
		var parameters = "/guoya-server/studyInfo";
		//提交到后台
		var xmlhttp = new XMLHttpRequest();
		xmlhttp.onreadystatechange = function() {
			if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
				//alert("服务端响应：" + xmlhttp.responseText);
			}
		};
		xmlhttp.open("POST", publicUrl + parameters, true);
		xmlhttp.send(JSON.stringify(json));
	}

	function openUrl(sno) {
		//var x1 = document.getElementById("pass").innerText;
		//alert("x1=" + x1);
		var textarea = document.getElementById(sno + '_url');
		var url = textarea.value;
		window.open(url);
	}

	function switchStatus(sno) {
		//var r = confirm("确认通过？");
		var r = true;
		if (r == true) {
			var img = document.getElementById(sno + '_img');
			var src = img.src;
			var status = 0;
			//查询JavaScript的string对象材料
			if (src.lastIndexOf("cross.jpg") != -1) {
				img.src = "basicClass/images/icon/tick.jpg";
				status = 1;
			} else {
				img.src = "basicClass/images/icon/cross.jpg";
				status = 0;
				//unPass.innerHTML=parseInt(unPass.innerHTML)+1;
			}
			var xmlhttp = new XMLHttpRequest();
			xmlhttp.onreadystatechange = function() {
				if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
					//alert("服务端响应：" + xmlhttp.responseText);
					statistic();
				}
			};
			var parameters = "/guoya-server/studyInfo";
			var json={
					request:{
						method:"updateStudent",
						student:{
							sno:sno,
							status:status
						}
					}
			};
			xmlhttp.open("POST", publicUrl + parameters, true);
			xmlhttp.send(JSON.stringify(json));
		}
	}

	function statistic() {
		var pass = 0;
		var unPass = 0;
		var statusImgs = document.getElementsByClassName("statusImg");
		for (var i = 0; i < statusImgs.length; i++) {
			if (statusImgs[i].src.indexOf("cross.jpg") != -1) {
				unPass = unPass + 1;
			} else {
				pass = pass + 1;
			}
		}
		var report = document.getElementById('report');
		report.innerHTML = '已完成<span style="color:red" id="pass">' + pass
				+ '</span>人，未完成<span style="color:red" id="unPass">' + unPass
				+ '</span>人';
	}

	function restart() {
		var r = confirm("确认更新？");
		if (r == true) {
			var xmlhttp = new XMLHttpRequest();
			xmlhttp.onreadystatechange = function() {
				if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
					refresh();
				}
			};
			var parameters = "/guoya-server/studyInfo?method=updateAllStatus&classCode="+classCode;
			xmlhttp.open("GET", publicUrl + parameters, true);
			xmlhttp.send();
		}
	}

	function randSelectStudent(){
		//alert(studentNames);
		var students=studentNames.split("|");
		var index=parseInt(Math.random()*(students.length+1),10);
		alert(students[index]);
	}

	/*
	function deleteStudy(sno) {
		var r = confirm("确认删除？");
		if (r == true) {
			var xmlhttp = new XMLHttpRequest();
			xmlhttp.onreadystatechange = function() {
				if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
					refresh();
				}
			};
			var parameters = "?method=deleteStudy&sno=" + sno;
			xmlhttp.open("GET", publicUrl + parameters, true);
			xmlhttp.send();
		}
	}
	*/
</script>
</head>
<body>
	<div id="nav">
		<table>
			<tr>
				<td>统计：</td>
				<td id="report">完成<span style="color:red" id="pass">x</span>人，未完成<span
					style="color:red" id="unPass">x</span>人
				</td>
				<td><input type="button" value="刷新" onclick="refresh()"></td>
				<td><input type="button" value="重新开始" onclick="restart()"></td>
				<td>
					<!-- 用按钮实现超链接 --> <!-- <input type="button" value="新增学生"
					onclick="window.open('addStudyInfo.html','right')" /> -->
				</td>
				<td>
					<input type="button" value="抽奖" onclick="randSelectStudent()" />
				</td>
			</tr>
		</table>
	</div>

	<br><br>
	<div id="content">
		<tr>
			<td style="width:10%;text-align:center">第1组</td>

			<td>陈超<br> <img id="s001_img" src="basicClass/images/icon/cross.jpg"
				height="20px" onclick="switchStatus('s001')">
			</td>
			<td><img src="basicClass/images/guoya_logo.jpg" width="50"></td>
			<td><textarea id="s001_url" rows="3" cols="20"></textarea></td>
			<td><input type="button" value="保存" onclick="saveUrl('s001')"><br>
				<input type="button" value="测试" onclick="openUrl('s001')"></td>

			<td width="5%"></td>
		</tr>
	</div>
</body>
</html>
