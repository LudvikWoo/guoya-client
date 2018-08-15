<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%@ include file="../../commons/jspInit.jsp"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>学生预报名</title>
    
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
    <form>
    	<table>
    		<tr>
    			<td>班级</td>
    			<td>
    				<select>
    					<option value="">--请选择--</option>
    					<option value="">测试基础班1808</option>
    					<option value="">测试基础班1809</option>
    					<option value="">测试基础班1810</option>
    					<option value="">测试提高班1809</option>
    					<option value="">测试提高班1811</option>
    				</select>
    			</td>
    		</tr>
    		<tr>
    			<td>姓名</td>
    			<td>
    				<input type="text" id="customerName" name="customerName">
    				<input type="button" id="" name="" value="查询">
    			</td>
    		</tr>
    		<tr>
    			<td>日期</td>
    			<td>
    				<input type="date" id="" name="">
    			</td>
    		</tr>
    		<tr>
    			<td>身份证</td>
    			<td>
    				<input type="text" id="" name="" maxlength="18">
    			</td>
    		</tr>
    		<tr>
    			<td>电话</td>
    			<td>
    				<input type="text" id="" name="" maxlength="11">
    			</td>
    		</tr>
    		<tr>
    			<td>学历</td>
    			<td>
    				<select>
    					<option value="">--请选择--</option>
    					<option value="">初中</option>
    					<option value="">高中</option>
    					<option value="">大专</option>
    					<option value="">大专在读</option>
    					<option value="">本科</option>
    					<option value="">本科在读</option>
    				</select>
    			</td>
    		</tr>
    		<tr>
    			<td>已缴学费</td>
    			<td>
    				<input type="number" id="" name="" >
    			</td>
    		</tr>
    		<tr>
    			<td>剩余学费</td>
    			<td>
    				<input type="number" id="" name="" >
    			</td>
    		</tr>
    		<tr>
    			<td>电脑</td>
    			<td>
    				<input type="radio" id="" name="computor">自带
    				<input type="radio" id="" name="computor">借用
    			</td>
    		</tr>
    		<tr>
    			<td>住宿</td>
    			<td>
    				<input type="radio" id="" name="computor">走读
    				<input type="radio" id="" name="computor">寄宿
    			</td>
    		</tr>
    		<tr>
    			<td>学历</td>
    			<td>
    				<input type="radio" id="" name="computor">自有
    				<input type="radio" id="" name="computor">补办
    			</td>
    		</tr>
    		<tr>
    			<td>介绍人</td>
    			<td>
    				<input type="text" id="" name="" >
    				<input type="button" id="" name="" value="查询">
    				<input type="button" id="" name="" value="新增">
    			</td>
    		</tr>
    		<tr>
    			<td>口碑费</td>
    			<td>
    				<input type="number" id="" name="" >
    			</td>
    		</tr>
    		<tr>
    			<td><input type="reset" value="重置"></td>
    			<td>
    				<input type="submit" value="提交" id="" name="" >
    			</td>
    		</tr>
    	</table>
    </form>
  </body>
</html>