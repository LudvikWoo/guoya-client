<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../../commons/jspInit.jsp"%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">
<meta charset="utf-8" />
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
	top: 4px; /*靠右*/
	background-color: #D8D8D8;
}

#nav td /*悬浮框标签*/ {
	border-bottom: 0px solid black
}

#header {
	position: fixed; /*浮窗位置*/
	left: 40%;
	top: 4px; /*靠右*/
	background-color: white;
}
</style>
<style type="text/css">
/*a  upload */
.a-upload {
	padding: 4px 10px;
	height: 20px;
	line-height: 20px;
	position: relative;
	cursor: pointer;
	color: #888;
	background: #fafafa;
	border: 1px solid #ddd;
	border-radius: 4px;
	overflow: hidden;
	display: inline-block;
	*display: inline;
	*zoom: 1
}

.a-upload  input {
	position: absolute;
	font-size: 100px;
	right: 0;
	top: 0;
	opacity: 0;
	filter: alpha(opacity = 0);
	cursor: pointer
}

.a-upload:hover {
	color: #444;
	background: #eee;
	border-color: #ccc;
	text-decoration: none
}

.file {
	position: relative;
	display: inline-block;
	/* background: #D0EEFF; */
	/* border: 1px solid #99D3F5; */
	border-radius: 4px;
	padding: 4px 12px;
	overflow: hidden;
	/* color: #1E88C7; */
	text-decoration: none;
	text-indent: 0;
	line-height: 20px;
}

.file input {
	position: absolute;
	font-size: 100px;
	right: 0;
	top: 0;
	opacity: 0;
}

.file:hover {
	background: #AADFFD;
	border-color: #78C3F3;
	color: #004974;
	text-decoration: none;
}
</style>

<style type="text/css">
img {
	cursor: pointer;
	transition: all 0.6s;
}

img:hover {
	transform: scale(1.4);
}
</style>

<script type="text/javascript" src="js/guoya-client.js"></script>

<script type="text/javascript"
	src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>

<script type="text/javascript">
$(".a-upload").on("change","input[type='file']",function(){
    var filePath=$(this).val();
    if(filePath.indexOf("jpg")!=-1 || filePath.indexOf("png")!=-1){
        $(".fileerrorTip").html("").hide();
        var arr=filePath.split('\\');
        var fileName=arr[arr.length-1];
        $(".showFileName").html(fileName);
    }else{
        $(".showFileName").html("");
        $(".fileerrorTip").html("您未上传文件，或者您上传文件类型有误！").show();
        return false 
    }
})
	function refresh() {
		location.reload();
	}
	
	function restart(lessonId,taskPkgId){
		var result=confirm("确认重新开始");
		if(result==true){
			var parameters = "lessonCheck/resetCheckStatus.do?lessonId="+lessonId+"&taskPkgId="+taskPkgId;
			var xmlhttp = new XMLHttpRequest();
			xmlhttp.open("GET", "<%=basePath%>" + parameters, true);
			xmlhttp.send();
			xmlhttp.onreadystatechange = function() {
				if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
					var response=xmlhttp.responseText;
					if(response==0){
						alert("更新失败，请核查原因！");
					}else{
						location.reload();
					}
				}
			};
		}
	}

	function switchStatus(checkId,status){
		var parameters = "lessonCheck/updateCheckStatus.do?checkId="+checkId+"&checkStatus="+status;
		var xmlhttp = new XMLHttpRequest();
		xmlhttp.open("GET", "<%=basePath%>" + parameters, true);
		xmlhttp.send();
		xmlhttp.onreadystatechange = function() {
			if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
				var response=xmlhttp.responseText;
				if(response==0){
					alert("更新失败，请核查原因！");
				}else{
					location.reload();
				}
			}
		};	
	}

	function uploadProfilePicture(customerId){
		var r = confirm("确认提交？");
		if(r==true){
			var userfile = document.getElementById("pic"+customerId);
			var fd = new FormData();
			fd.append("userfile", userfile.files[0]);//文件追到到FormData
			//fd.append("customerId", customerId);
			var xhr = new XMLHttpRequest();
			xhr.open("POST", "<%=basePath%>lessonCheck/uploadProfilePicture.do?customerId="
							+ customerId);
			xhr.send(fd);
			xhr.onreadystatechange = function() {
				if (xhr.readyState == 4 && xhr.status == 200) {
					var result = xhr.responseText;
					if (result != "0000") {
						alert("上传失败");
					}
					location.reload();
				}
			};
		}
	}
</script>
</head>
<body>
	<div id="nav">
		<table>
			<tr>
				<td>统计：</td>
				<td id="report">总数：<span style="color:red">${totalCtn }</span>人，待检查：<span
					style="color:red">${uncheckCtn }</span>，通过<span style="color:red">${passCtn }</span>，未通过：<span
					style="color:red">${unpassCtn }</span>
				</td>
				<td><input type="button" value="刷新" onclick="refresh()"></td>
				<%-- <td><input type="button" value="重新开始" onclick="restart(${lessonId},${taskPkgId })"></td> --%>
			</tr>
		</table>
	</div>
	<div id="header">
		<h3>${taskPkgInfo.taskPkgName }</h3>
	</div>
	<br>
	<br>
	<div>
		<%!int groupId = 0;%>
		<c:forEach var="var" items="${list}" varStatus="status">
			<c:if test="${var.groupId != groupId && groupId !=0}">
	</div>
	</c:if>
	<c:if test="${var.groupId != groupId }">
		<div style=" width: 99%; ">
			第${var.groupId}组
			<hr>
		</div>
		<c:set var="groupId" value="${var.groupId}" />
		<div style="display: flex;">
	</c:if>
	<div style="display: flex; width: 33%; height: 60px">
		<div style="width: 15%;text-align: right">
			<c:if test="${var.pictureAddr == null || var.pictureAddr =='' }">
				<a href="javascript:;" class="file"> <img
					src="/guoya-client/img/company/guoya_logo.jpg" height="40px"><input
					type="file" name="pic${var.customerId }" id="pic${var.customerId }"
					onchange="uploadProfilePicture(${var.customerId })">
				</a>
				<%-- <img src="/guoya-client/img/company/guoya_logo.jpg" height="40px">
				<input type="file" name="profilePicture" id="profilePicture" onchange="uploadProfilePicture(${var.customerId })"> --%>
			</c:if>
			<c:if test="${var.pictureAddr != null && var.pictureAddr !='' }">
				<a href="javascript:;" class="file"> <img
					src="${var.pictureAddr}" height="40px"><input type="file"
					name="pic${var.customerId }" id="pic${var.customerId }"
					onchange="uploadProfilePicture(${var.customerId })">
				</a>
			</c:if>
		</div>
		<div style="width: 12%">
			<div>${var.customerName }</div>
			<div>
				<c:if test="${var.checkStatus == 0 }">
					<img src="/guoya-client/img/icon/lock.png" height="20px"
						onclick="switchStatus(${var.checkId},1)">
				</c:if>
				<c:if test="${var.checkStatus == 2 }">
					<img src="/guoya-client/img/icon/cross.jpg" height="20px"
						onclick="switchStatus(${var.checkId},1)">
				</c:if>
				<c:if test="${var.checkStatus == 1 }">
					<img src="/guoya-client/img/icon/tick.jpg" height="20px"
						onclick="switchStatus(${var.checkId},2)">
				</c:if>
			</div>
		</div>
		<div style="width: 45%">
			<textarea rows="3" cols="25">${var.netUrl }</textarea>
		</div>
		<div style="width: 23%">
			<div style="display: flex">
				<div>
					<input type="button" value="保存" style="width:4em">
				</div>
				<div>
					<input type="button" value="测试" style="width:4em">
				</div>
			</div>
			<div>
				<input type="button" value="上传截图" style="width:8em"
					onclick="window.open('lessonCheck/uploadExercise.do?checkId=${var.checkId}&lessonId=${var.lessonId }&customerName=${var.customerName }&taskPkgId=${taskPkgId }');">
			</div>
		</div>
	</div>
	</c:forEach>
	</div>
</body>
</html>