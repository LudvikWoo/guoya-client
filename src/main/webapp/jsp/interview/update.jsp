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
<!-- import CSS -->
<link rel="stylesheet"
	href="https://unpkg.com/element-ui/lib/theme-chalk/index.css">
</head>
<body>
	<div id="app">
		<el-button @click="reverseMessage">Button</el-button>
		<el-dialog :visible.sync="visible" title="Hello world">
		<p>Try Element</p>
		</el-dialog>

		<el-input v-model="input" placeholder="请输入内容"></el-input>
		<el-select v-model="value" placeholder="请选择"> <el-option
			v-for="item in options" :key="item.value" :label="item.label"
			:value="item.value"> </el-option> </el-select>

		<div>
			<el-table :data="tableData" style="width: 100%"> <el-table-column
				prop="date" label="日期" width="180"> </el-table-column> <el-table-column
				prop="name" label="姓名" width="180"> </el-table-column> <el-table-column
				prop="address" label="地址"> </el-table-column> </el-table>
		</div>
		<div>
			<el-table :data=students style="width: 100%"> <el-table-column
				prop="group" label="小组" width="180"> </el-table-column> <el-table-column
				prop="sno" label="学号" width="180"> </el-table-column> <el-table-column
				prop="sname" label="姓名"> </el-table-column> </el-table>
		</div>
	</div>
</body>
<!-- import Vue before Element -->
<script src="https://unpkg.com/vue/dist/vue.js"></script>
<!-- import JavaScript -->
<script src="https://unpkg.com/element-ui/lib/index.js"></script>

<script src="https://unpkg.com/axios/dist/axios.min.js"></script>
<script>
	var vm=new Vue({
		el : '#app',
		//----------- data 开始 ----------
		data : {
			visible : false,
			input : '果芽',
			options : [ {
				value : '选项1',
				label : '黄金糕'
			}, {
				value : '选项2',
				label : '双皮奶'
			}, {
				value : '选项3',
				label : '蚵仔煎'
			}, {
				value : '选项4',
				label : '龙须面'
			}, {
				value : '选项5',
				label : '北京烤鸭'
			} ],
			value : '',
			tableData : [ {
				date : '2016-05-02',
				name : '王小虎',
				address : '上海市普陀区金沙江路 1518 弄'
			}, {
				date : '2016-05-04',
				name : '王小虎',
				address : '上海市普陀区金沙江路 1517 弄'
			}, {
				date : '2016-05-01',
				name : '王小虎',
				address : '上海市普陀区金沙江路 1519 弄'
			}, {
				date : '2016-05-03',
				name : '王小虎',
				address : '上海市普陀区金沙江路 1516 弄'
			} ],
			students:[]
		},
		//----------- data 结束----------
		//----------- methods 开始----------

		methods : {
			reverseMessage : function() {
				axios.get('http://www.guoyasoft.com:8080/guoya-server/studyInfo?method=getUrls')
				  .then(function (response) {
					  	//var obj = JSON.parse(response);
					  	alert(response.data.study.student[0].group);
						var result = response.data.study.student;
						vm.students=result;
				  });
			}
		}
	//----------- methods 结束----------
	})
</script>
</html>