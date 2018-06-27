<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'query.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<script type="text/javascript">
	/* function uploadPic(interviewId) {
		var obj = document.getElementById("pic_upload");
		//alert("开始上传.....");
		for (i = 0; i < obj.files.length; i++) {
			//alert("文件数："+obj.files.length);
			var fileObj = obj.files[i];
			var FileController = "interview/uploadExamPic.action?interviewId="
					+ interviewId; // 接收上传文件的后台地址
			// FormData 对象
			var form = new FormData();
			// 可以增加表单数据
			form.append("file", fileObj); // 文件对象
			// XMLHttpRequest 对象
			//alert("开始上传第："+i+"个文件....");
			var xhr = new XMLHttpRequest();
			xhr.open("post", FileController, true);
			xhr.onload = function() {
				//alert("上传完成!");
				location.reload();
			};
			xhr.onprgress = function(a, b, c) {
				console.log(a + "++" + b + "__" + "c")
			};
			xhr.load = function() {
				cnosole.log('');
			};
			xhr.send(form);
		}
	}
	 */
	function showPics(obj) {
		var oimgbox = document.getElementById("imgboxid");
		oimgbox.innerHTML = "";
		var fl = obj.files.length;
		var ndiv = document.createElement("div");
		ndiv.style.display = "flex";
		oimgbox.appendChild(ndiv);
		for (var i = 0; i < fl; i++) {
			var file = obj.files[i];
			var reader = new FileReader();

			//读取文件过程方法  

			reader.onloadstart = function(e) {
				console.log("开始读取....");
			}
			reader.onprogress = function(e) {
				console.log("正在读取中....");
			}
			reader.onabort = function(e) {
				console.log("中断读取....");
			}
			reader.onerror = function(e) {
				console.log("读取异常....");
			}
			reader.onload = function(e) {
				console.log("成功读取....");

				var imgstr = '<img style="width:100px;height:100px;" src="'+e.target.result+'"/>';
				var idiv = document.createElement("div");
				idiv.innerHTML = imgstr;
				idiv.className = "img-div";
				ndiv.appendChild(idiv);
			}
			reader.readAsDataURL(file);
			//alert(1);  
		}
	}
</script>
</head>

<body>
	<div>
		<!-- 个人信息区 -->
		<div style="display: flex">
			<div style="display: flex">
				<div>姓名：</div>
				<div>${exam.customerName }</div>
			</div>
			<div style="display: flex">
				<div>公司：</div>
				<div>${exam.companyName }</div>
			</div>
			<div style="display: flex">
				<div>
					<form action="interview/completeExam.action?examId=${exam.examId}" method="get" onsubmit="javascript:return confirm('确认笔试结束吗？');">
						<input type="submit" value="结束答题" >
					</form>
				</div>
				<div>
					<input type="button" value="刷新界面">
				</div>
			</div>
		</div>
		<hr>
		<br>
		<!-- 上传照片区 -->
		<div>
			<div>
				<form
					action="interview/uploadExamPic.action?interviewId=${interviewId }"
					method="post" enctype="multipart/form-data">
					<div>上传照片</div>
					<div>
						<input id="pic_upload" name="pic_upload" type="file"
							multiple="true" accept='image/*' onchange="showPics(this)">
					</div>
					<div>
						<input type="submit" value="上传">
					</div>
				</form>
			</div>
		</div>

		<!-- 照片临时显示区 -->
		<div class="img-box" id="imgboxid"></div>
		<hr>
		<br>
		<!-- 答题区 -->
		<div>
			<c:forEach items="${exam.pictures }" var="picture">
				<!-- 图片展现区 -->
				<div>
					<img src="${picture.picAddr }">
				</div>
				<hr>
				<br>
				<!-- 图片操作区 -->
				<div>
					<div>
						<input type="button" value="新增答案"
							onclick="addAnswer(${picture.pictureId})">
					</div>
					<div>
						<input type="button" value="删除照片"
							onclick="deletePicture(${picture.pictureId})">
					</div>
				</div>
				<hr>
				<br>

				<!-- 新增答案区 -->
				<div>
					<form action="interview/addPicAnswer.action" method="post">
						<div style="display: none">
							<div>隐藏数据：</div>
							<div>
								<input type="text" name="interviewId"
									value="${exam.interviewId }"> <input type="text"
									name="pictureId" value="${picture.pictureId }">
							</div>
						</div>
						<div>
							<div>题号：</div>
							<div>
								<input type="text" name="subjectIndex">
							</div>
						</div>
						<div>
							<div>答案：</div>
							<div>
								<input type="text" name="answer">
							</div>
						</div>
						<div>
							<div>作者：</div>
							<div>
								<input type="text" name="authorCstName"> <input
									type="text" name="authorCstId">
							</div>
							<div>
								<input type="button" value="查询">
							</div>
						</div>
						<div>
							<input type="submit" value="提交">
						</div>
					</form>
				</div>
				<hr>
				<br>


				<!-- 答案列表区 -->
				<div>
					<c:forEach items="${picture.answers }" var="answer">
						<div>
							<div>${answer.subjectIndex }</div>
							<div>${answer.answer }</div>
							<div>${answer.authorCstName }</div>
							<div>
								<input type="button" value="点赞">
							</div>
							<div>
								<input type="button" value="删除">
							</div>
						</div>
					</c:forEach>
				</div>
			</c:forEach>

		</div>
	</div>
</body>
</html>
