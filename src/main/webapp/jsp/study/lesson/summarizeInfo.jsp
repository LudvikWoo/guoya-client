<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../../commons/jspInit.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>summarizeInfo.html</title>

<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="this is my page">
<meta http-equiv="content-type" content="text/html; charset=UTF-8">

<script type="text/javascript"
	src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>

<script type="text/javascript" src="/guoya-client/basicClass/js/guoya.js"></script>

<style type="text/css">
div {
	border: 0px solid black;
}

table {
	margin-top: 10px;
}

table,th,td {
	border: 0px solid black;
	width: 100%;
}

.pictureImg {
	height: 400px;
}

.max {
	width: 95%;
	height: auto;
	margin-left: 10px;
	margin-top: 10px;
	margin-right: 10px;
}

.min {
	width: auto;
	height: 200px;
	margin-left: 10px;
	margin-top: 10px;
	margin-right: 10px;
}

.search_name_td {
	width: 8%;
	text-align: right;
}

#submit_summary_div /*悬浮框标签*/ {
	position: fixed; /*浮窗位置*/
	left: 4px;
	top: 0px; /*靠右*/
	background-color: white;
}

#submit_summary_div td /*悬浮框标签*/ {
	border-bottom: 0px solid black
}

#search_condition_div /*悬浮框标签*/ {
	width: 130px;
	position: fixed; /*浮窗位置*/
	right: 10px;
	top: 30%; /*靠右*/
	background-color: white;
	border: 0px solid black
}

#search_condition_div td /*悬浮框标签*/ {
	border-bottom: 0px solid black;
}

#search_condition_div input {
	height: 20px;
	width: 95%;
	border: 1px solid gray;
}
</style>
<script type="text/javascript">
$(document).ready(function() {
	/*$('#div_imgs_id img').click(function() {
		$(this).toggleClass('min');
		$(this).toggleClass('max');
	});*/
	$("#div_imgs_id").on("click", ".pctureImg", function() {
		$(this).toggleClass('min');
		$(this).toggleClass('max');
	});
});
function querySummaries() {
	//查询开始，先失效按钮
	var querySummariesBtn = document.getElementById("querySummariesBtn");
	querySummariesBtn.disabled = true;
	var groupId = document.getElementById("searchGroup").value;
	var searchCheckId = document.getElementById("searchCheckId").value;
	var uploadPicDate = document.getElementById("uploadPicDate").value;

	var xhr = new XMLHttpRequest();
	xhr.open("POST", "<%=basePath%>lessonCheck/queryCheckPictures.do?groupId="
			+ (groupId==""?-1:groupId) +  "&uploadPicDate=" + (uploadPicDate==""?"-1":uploadPicDate)
			+ "&checkId=" + (searchCheckId==""?-1:searchCheckId));
	xhr.send();
	xhr.onreadystatechange = function() {
		if (xhr.readyState == 4 && xhr.status == 200) {
			var result = xhr.responseText;
			displayImgs(result);
			//displayImgs(result);
		}
		querySummariesBtn.disabled = false;
	};
}

function operatePicture(optType,pictureId){
	if(optType==1){
		var r = confirm("确认删除？");
		if(r==false){
			return;
		}
	}
	var xhr = new XMLHttpRequest();
	xhr.open("POST", "<%=basePath%>lessonCheck/operatePicture.do?optType="
			+ optType+  "&pictureId=" + pictureId);
	xhr.send();
	xhr.onreadystatechange = function() {
		if (xhr.readyState == 4 && xhr.status == 200) {
			var result = xhr.responseText;
			//displayImgs(result);
			querySummaries()
		}
	};
	
}
function displayImgs(data) {
	//取完数据，重置表单
	document.getElementById("submit_summary_form").reset();
	var html = "";
	var pictures = JSON.parse(data);
	for ( var i in pictures) {
		//alert(urls[i]);
		var picture = pictures[i];
		html = html
				+ "		<div style=\"float: left;\">                                       "
				+ "			<div style=\"text-align:center\">                              "
				+ "				<img src=\""+picture.pictureUrl+"\" class=\"min pctureImg\">     "
				+ "			</div>                                                         "
				+ "			<div style=\"text-align:center\">";
		if(picture.checkStatus==2){
			html += "<img src='/guoya-client/img/icon/cross.jpg' height='15px' onclick='operatePicture(2,"+picture.pictureId+")'>";
		}
		if(picture.checkStatus==1){
			html+="<img src='/guoya-client/img/icon/tick.jpg' height='15px' onclick='operatePicture(3,"+picture.pictureId+")'>";
		}
		if(picture.checkStatus==0){
			html+="<img src='/guoya-client/img/icon/lock.png' height='15px' onclick='operatePicture(3,"+picture.pictureId+")'>";
		}
		html+= " "+picture.pictureId
				+ " "
				+ picture.customerName
				+ " "
				+ "<a href='javascript:operatePicture(1,"+picture.pictureId+")'>[删除]</a>"
				
				+ "</div>                    "
				+ "			</table>                                                       "
				+ "		</div>                                                             ";
	}
	var div = document.getElementById("div_imgs_id");
	//alert(html);
	div.innerHTML = html;
}
	function uploadFile() {
		var uploadFileBtn = document.getElementById("uploadFileBtn");
		uploadFileBtn.disabled = true;
		//获取学号
		var checkId = document.getElementById("checkId").value;
		if (checkId == "") {
			alert("姓名为空，请选择后再提交？");
			uploadFileBtn.disabled = false;
			return;
		}
		//var snoSelect = document.getElementById("sno");
		//var sno = snoSelect.options[snoSelect.selectedIndex].value;
		//alert(sno);
		var postFild = document.getElementById("postFild");
		//alert(postFild.value);
		if (postFild.value == "") {
			alert("照片为空，请选择后再提交？");
			uploadFileBtn.disabled = false;
			return;
		}
		//alert(summaryDate);
		var r = confirm("确认提交？");
		if (r == true) {
			var userfile = document.getElementById("postFild");
			var fd = new FormData();
			fd.append("userfile", userfile.files[0]);//文件追到到FormData
			fd.append("checkId", checkId);
			var xhr = new XMLHttpRequest();
			xhr.open("POST", "<%=basePath%>lessonCheck/uploadExercisePic.do?checkId="
							+ checkId);
			xhr.send(fd);
			xhr.onreadystatechange = function() {
				if (xhr.readyState == 4 && xhr.status == 200) {
					var result = xhr.responseText;
					querySummaries();
				}
				uploadFileBtn.disabled = false;
			};
		} else {
			uploadFileBtn.disabled = false;
		}
	}
	
	function checkPicturePass(checkId,status){
		var r = confirm("确认通过？");
		if (r == true) {
			var xhr = new XMLHttpRequest();
			xhr.open("POST", "<%=basePath%>lessonCheck/operateTaskCheckStatus.do?checkId="
							+ checkId+"&checkStatus="+status);
			xhr.send();
			xhr.onreadystatechange = function() {
				if (xhr.readyState == 4 && xhr.status == 200) {
					var result = xhr.responseText;
					location.reload();
				}
			};
		} 
	}
	window.onload=function(){
		querySummaries();
	}
</script>
</head>

<body>

	<div id="search_condition_div">
		<form id="search_condition_form">
			<table>
				<tr>
					<td>姓名：</td>
				</tr>
				<tr>
					<td><select style="width:80%" id="searchCheckId">
							<option value="" >——请选择——</option>
							<c:forEach items="${lessonStudent }" var="var">
								
								<c:if test="${var.checkId ==  submitInfo.checkId }">
									<option selected="selected" value="${var.checkId }">${var.groupId}组-${var.seatId}号-${var.customerName }</option>
								</c:if>
								<c:if test="${var.checkId !=  submitInfo.checkId }">
									<option value="${var.checkId }">${var.groupId}组-${var.seatId}号-${var.customerName }</option>
								</c:if>
							</c:forEach>
					</select></td>
				</tr>
				<tr>
					<td>日期：</td>
				</tr>
				<tr>
					<td><input type="date" name="uploadPicDate" id="uploadPicDate"></td>
				</tr>
				<tr>
					<td>导师：</td>
				</tr>
				<tr>
					<td><select style="width:95%" size="1" name="searchTutorId"
						id="searchTutorId">
							<option value="">---请选择---</option>
					</select></td>
				</tr>
				<tr>
					<td>小组：</td>
				</tr>
				<tr>
					<td><select style="width:95%" size="1" name="searchGroup"
						id="searchGroup">
							<option value="">---请选择---</option>
					</select></td>
				</tr>
				<tr>
					<td><input type="button" value="查询" id="querySummariesBtn"
						onclick="querySummaries()"
						style="width:40%;margin-left:5px;margin-top:15px;margin-bottom:10px">
						<input type="reset" value="重置"
						style="width:40%;margin-left:10px;margin-top:15px;margin-bottom:10px">
					</td>
				</tr>
			</table>
		</form>
	</div>
	<div id="submit_summary_div">
		<form id="submit_summary_form">
			<table>
				<tr>
					<td class="search_name_td">姓名：</td>
					<td style="width:5%;">${customerName }</td>
					<input type="text" name="checkId" id="checkId" hidden="hidden"
						value="${submitInfo.checkId }">
						
					<td class="search_name_td">检查状态：</td>
					<td style="width:5%;">${submitInfo.checkStatusDesc }</td>
					
					<td class="search_name_td">任务包：</td>
					<td style="width:20%;">${submitInfo.taskPkgName }</td>

					<td class="search_name_td">拍照：</td>
					<td style="width:10%;"><input style="width:80%" type="file"
						id="postFild" name="userfile" /></td>

					<td style="text-align:center;width:5%;"><input
						id="uploadFileBtn" type="button" value="上传总结"
						onclick="uploadFile();" /></td>
					<td style="text-align:left;width:10%;">
						<c:if test="${submitInfo.checkStatus==0 || submitInfo.checkStatus ==2 }">
							<input type="button"
								value="通过" onclick="checkPicturePass(${submitInfo.checkId },1)"/>
						</c:if>
						<c:if test="${submitInfo.checkStatus==0 || submitInfo.checkStatus ==1 }">
							<input type="button"
								value="未通过" onclick="checkPicturePass(${submitInfo.checkId },2)"/>
						</c:if>
					</td>
				</tr>
			</table>
		</form>
		<hr>
	</div>
	<div id="div_imgs_id" style="width:100%;margin-top:55px;">
		<!-- <div style="float: left;">
			<div style="text-align:center">
				<img src="images/summarizes/test.jpg" class='min'>
			</div>
			<div style="text-align:center">姓名</div>
			</table>
		</div>
		<div style="float: left;">
			<div style="text-align:center">
				<img src="images/summarizes/test1.jpg" class='min'>
			</div>
			<div style="text-align:center">姓名</div>
			</table>
		</div>
		<div style="float: left;">
			<div style="text-align:center">
				<img src="images/summarizes/test2.jpg" class='min'>
			</div>
			<div style="text-align:center">姓名</div>
			</table>
		</div>
		 -->
	</div>
</body>
</html>
