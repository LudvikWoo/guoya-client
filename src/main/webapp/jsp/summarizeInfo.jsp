<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="commons/jspInit.jsp"%>

<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">
<title>summarizeInfo.html</title>

<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="this is my page">
<meta http-equiv="content-type" content="text/html; charset=UTF-8">

<script type="text/javascript"
	src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>

<script type="text/javascript" src="basicClass/js/guoya.js"></script>

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

img {
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
		$("#div_imgs_id").on("click", "img", function() {
			$(this).toggleClass('min');
			$(this).toggleClass('max');
		});
	});
	function uploadFile() {
		var uploadFileBtn = document.getElementById("uploadFileBtn");
		uploadFileBtn.disabled = true;
		//获取学号
		var sno = document.getElementById("sno").value;
		if (sno == "") {
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
		var summaryDate = document.getElementById("summaryDate").value;
		if (summaryDate == "") {
			alert("日期为空，请选择后再提交？");
			uploadFileBtn.disabled = false;
			return;
		}
		//alert(summaryDate);
		var r = confirm("确认提交？");
		if (r == true) {
			var userfile = document.getElementById("postFild");
			var fd = new FormData();
			fd.append("userfile", userfile.files[0]);//文件追到到FormData
			fd.append("sno", sno);
			fd.append("summaryDate", summaryDate);
			var xhr = new XMLHttpRequest();
			xhr.open("POST", publicUrl
					+ "/guoya-server/summaryInfo?method=uploadSumarizePic&sno="
					+ sno + "&summaryDate=" + summaryDate);
			xhr.send(fd);
			xhr.onreadystatechange = function() {
				if (xhr.readyState == 4 && xhr.status == 200) {
					var result = xhr.responseText;
					//alert(result);
					displayImgs(result);
				}
				uploadFileBtn.disabled = false;
			};
		} else {
			uploadFileBtn.disabled = false;
		}
	}

	function displayImgs(data) {
		//取完数据，重置表单
		document.getElementById("submit_summary_form").reset();
		//document.getElementById("search_condition_form").reset();

		var html = "";
		var students = JSON.parse(data).summaries.summaryDate.student;
		for ( var i in students) {
			//alert(urls[i]);
			var student = students[i];
			html = html
					+ "		<div style=\"float: left;\">                                       "
					+ "			<div style=\"text-align:center\">                              "
					+ "				<img src=\""+student.imgPath+"\" class=\"min\">     "
					+ "			</div>                                                         "
					+ "			<div style=\"text-align:center\">"
					+ student.sno
					+ " "
					+ student.sname
					+ "</div>                    "
					+ "			</table>                                                       "
					+ "		</div>                                                             ";
		}
		var div = document.getElementById("div_imgs_id");
		//alert(html);
		div.innerHTML = html;
	}

	/*
	 */
	window.onload = function() {

		var sno = document.getElementById("sno").value;
		if("" != sno ){
		  initPage();
		}
	}
	function initPage() {
	  var sno = document.getElementById("sno").value;
		var date = new Date();
		var seperator1 = "-";
		var year = date.getFullYear();
		var month = date.getMonth() + 1;
		var strDate = date.getDate();
		if (month >= 1 && month <= 9) {
			month = "0" + month;
		}
		if (strDate >= 0 && strDate <= 9) {
			strDate = "0" + strDate;
		}
		var currentdate = year + seperator1 + month + seperator1 + strDate;
		var xhr = new XMLHttpRequest();
		xhr
				.open(
						"POST",
						publicUrl
								+ "/guoya-server/summaryInfo?method=querySumarise&sno="+sno);
		xhr.send();
		xhr.onreadystatechange = function() {
			if (xhr.readyState == 4 && xhr.status == 200) {
				var result = xhr.responseText;
				//alert(result);
				displayImgs(result);
			}
		};
	}

	function querySummaries() {
		querySummariesBtn
		//查询开始，先失效按钮
		var querySummariesBtn = document.getElementById("querySummariesBtn");
		querySummariesBtn.disabled = true;
		var groupId = document.getElementById("searchGroup").value;
		var tutor = document.getElementById("searchTutor").value;
		var summaryDate = document.getElementById("searchSummaryDate").value;
		var sno = document.getElementById("searchSno").value;

		var xhr = new XMLHttpRequest();
		xhr.open("POST", publicUrl
				+ "/guoya-server/summaryInfo?method=querySumarise&groupId="
				+ groupId + "&tutor=" + tutor + "&summaryDate=" + summaryDate
				+ "&sno=" + sno);
		xhr.send();
		xhr.onreadystatechange = function() {
			if (xhr.readyState == 4 && xhr.status == 200) {
				var result = xhr.responseText;
				//alert(result);
				displayImgs(result);
			}
			querySummariesBtn.disabled = false;
		};

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
					<td><select style="width:95%" id="searchSno">
							<option value="" >——请选择——</option>
					<c:forEach var="stu" items="${init.students}">

							              <c:if test="${stu.selected ==true }">
              							  <option value="${stu.value}" selected="selected">${stu.text}</option>
							              </c:if>
							              <c:if test="${stu.selected == false }">
              							  <option value="${stu.value}">${stu.text}</option>
							              </c:if>
					</c:forEach>
					</select></td>
				</tr>
				<tr>
					<td>日期：</td>
				</tr>
				<tr>
					<td><input type="date" name="searchSummaryDate"
						id="searchSummaryDate" value="${init.currentDate}"></td>
				</tr>
				<tr>
					<td>导师：</td>
				</tr>
				<tr>
					<td><select style="width:95%" size="1" name="searchTutor"
						id="searchTutor">
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
							<c:forEach var="group" items="${init.groups}">
              							<option value="${group.value}">${group.text}</option>
              </c:forEach>
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
					<td style="width:20%;"><select style="width:80%" id="sno">
							<option value="" selected="selected">——请选择——</option>
							<c:forEach var="stu" items="${init.students}">
							              <c:if test="${stu.selected ==true }">
              							  <option value="${stu.value}" selected="selected">${stu.text}</option>
							              </c:if>
							              <c:if test="${stu.selected == false }">
              							  <option value="${stu.value}">${stu.text}</option>
							              </c:if>
              					</c:forEach>
					</select></td>

					<td class="search_name_td">拍照：</td>
					<td style="width:20%;"><input style="width:80%" type="file"
						id="postFild" name="userfile" /></td>
					<td class="search_name_td">日期：</td>
					<td style="width:20%;"><input type="date" name="summaryDate"
						id="summaryDate" value="${init.currentDate}"></td>

					<td style="text-align:center;width:10%;"><input
						id="uploadFileBtn" type="button" value="上传总结"
						onclick="uploadFile();" /></td>
					<td style="text-align:left;"><input type="reset" value="重置" /></td>
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
