<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../commons/jspInit.jsp"%>

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
<script type="text/javascript" src="js/guoya-client.js"></script>
<script type="text/javascript">
	function addOffer(interviewId){
		openWindow("offer/initAddOffer.action?interviewId="+interviewId);
		return false;
	}
	

	function updateOffer(interviewId){
		openWindow("offer/initAddOffer.action?interviewId="+interviewId);
		return false;
	}

	function deleteOffer(interviewId){
		openWindow("offer/initAddOffer.action?interviewId="+interviewId);
		return false;
	}
</script>
</head>

<body>
	<div>
		<div>
			<div>学生信息</div>
			<div>
				<table>
					<tr>
						<td>姓名：</td>
						<td>果芽</td>
						<td>年龄：</td>
						<td>23</td>
						<td>学历：</td>
						<td>本科</td>
					</tr>
					<tr>
						<td>班级：</td>
						<td>测试基础1805班</td>
						<td>面试数：</td>
						<td>108</td>
						<td>offer数：</td>
						<td>88</td>
					</tr>
					<tr>
						<td>入职企业：</td>
						<td>果芽软件</td>
						<td>当前月薪：</td>
						<td>12K</td>
						<td>当前年薪：</td>
						<td>18万</td>
					</tr>
				</table>
			</div>
		</div>
		<br>
		<div>
			<div>面试信息</div>
			<div>
				<table>
					<tr>
						<td>是否外包：</td>
						<td>xxxxxx</td>
						<td>电话时间：</td>
						<td>xxxxxx</td>
						<td>面试时间：</td>
						<td>xxxxxx</td>
						<td>面试进度：</td>
						<td>xxxxxx</td>
						<td>面试结果：</td>
						<td>xxxxxx</td>
					</tr>
				</table>
			</div>
		</div>
		<br>
		<div>
			<div>
				公司信息[<a href="#" >变更</a>]
			</div>
			<div>
				<table>
					<tr>
						<td>公司编号：</td>
						<td>xxxxxx</td>
						<td>公司名称：</td>
						<td>xxxxxx</td>
						<td>是否外包：</td>
						<td>xxxxxx</td>
					</tr>
					<tr>
						<td>面试结果：</td>
						<td>xxxxxx</td>
					</tr>
				</table>
			</div>
		</div>
		<br>
		<div>
			<div>HR信息</div>
			<div>
				<table>
					<tr>
						<td>HR编号：</td>
						<td>xxxxxx</td>
						<td>HR名称：</td>
						<td>xxxxxx</td>
						<td>外包公司：</td>
						<td>xxxxxx</td>
					</tr>
				</table>
			</div>
		</div>
		<div>
			<div>
				offer信息[<a href="#" onclick="return addOffer(${interviewId});">新增</a>]
			</div>
			<div>
				<table>
					<thead>
						<tr>
							<th>编号</th>
							<th>月薪</th>
							<th>税前税后</th>
							<th>薪数</th>
							<th>年薪</th>
							<th>试用期</th>
							<th>折扣</th>
							<th>试用期月薪</th>
							<th>offer时间</th>
							<th>入职时间</th>
							<th>操作</th>
						</tr>
					</thead>
					<tr>
						<td>1</td>
						<td>12K</td>
						<td>税前</td>
						<td>14</td>
						<td>16.8万</td>
						<td>3个月</td>
						<td>8折</td>
						<td>10.8万</td>
						<td>2018-07-03</td>
						<td>2018-07-05</td>
						<td><a href="#"  onclick="return updateOffer(${interviewId});">[变更]</a><a href="#"  onclick="return deleteOffer(${interviewId});">[删除]</a><a href="#"  onclick="return receptOffer(${interviewId});">[入职]</a></td>
					</tr>
				</table>
			</div>
		</div>
		<div>
			<div>
				入职进度[<a href="">设置</a>]
			</div>
			<div>
				<table>
					<thead>
						<tr>
							<th>编号</th>
							<th>入职项</th>
							<th>状态</th>
							<th>完成时间</th>
							<th>操作</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>1</td>
							<td>离职证明</td>
							<td>完成</td>
							<td>2018-07-03</td>
							<td><a href="">变更</a></td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
		<div>
			<div>
				笔试解答[<a href="interview/getPaperExam.action?interviewId=${interviewId}">详情</a>]
			</div>
			<div>
				<table>
				<thead>
						<tr>
							<th>照片数量</th>
							<th>答题数量</th>
							<th>答题人数</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>3</td>
							<td>20</td>
							<td>3</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>

		<div>
			<div>
				面试问答[<a href="#">详情</a>]
			</div>
			<div>
				<table>
					<thead>
						<tr>
							<th>录音数量</th>
							<th>问题数量</th>
							<th>答题人数</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>3</td>
							<td>20</td>
							<td>3</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
</html>
