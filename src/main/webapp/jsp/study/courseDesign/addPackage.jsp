<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'addPackage.jsp' starting page</title>
    
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
  	<div>
  		<!-- 场景 start -->
  		<div>
  			<div>场景描述：</div>
  			<div>
  				<textarea rows="5" cols="150"></textarea>
  			</div>
  		</div>
  		<!-- 场景 end -->
  		
  		<!-- 场景 start -->
  		<div>
  			<div>场景描述：</div>
  			<div>
  				<textarea rows="5" cols="150"></textarea>
  			</div>
  		</div>
  		<!-- 场景 end -->
  		
  		
  	</div>
  
    <table>
    	<tr>
    		<td><h1>场景：</h1></td>
    	</tr>
    	<tr>
    		<td><textarea rows="5" cols="150"></textarea></td>
    	</tr>
    	<tr>
    		<td><h1>问题：</h1></td>
    	</tr>
    	<tr>
    		<td><textarea rows="3" cols="150"></textarea></td>
    	</tr>
    	<tr>
    		<td><h2>问题1：</h2></td>
    	</tr>
    	<tr>
    		<td><textarea rows="3" cols="150"></textarea></td>
    	</tr>
    	<tr>
    		<td><h2>问题2：</h2></td>
    	</tr>
    	<tr>
    		<td><textarea rows="3" cols="150"></textarea></td>
    	</tr>
    	<tr>
    		<td><h2>问题3：</h2></td>
    	</tr>
    	<tr>
    		<td><textarea rows="3" cols="150"></textarea></td>
    	</tr>
    	<tr>
    		<td><h1>解决思路：</h1></td>
    	</tr>
    	<tr>
    		<td><textarea rows="5" cols="150"></textarea></td>
    	</tr>
    	<tr>
    		<td><h1>技术点：</h1></td>
    	</tr>
    	<tr>
    		<td><textarea rows="5" cols="150"></textarea></td>
    	</tr>
    	    	<tr>
    		<td><h1>测试环境：</h1></td>
    	</tr>
    	<tr>
    		<td>界面：<textarea rows="2" cols="150"></textarea></td>
    	</tr>
    	<tr>
    		<td>接口：<textarea rows="2" cols="150"></textarea></td>
    	</tr>
    	<tr>
    		<td>数据库：<textarea rows="2" cols="150"></textarea></td>
    	</tr>
    	<tr>
    		<td>linux：<textarea rows="2" cols="150"></textarea></td>
    	</tr>
    	<tr>
    		<td><h1>方案实施：</h1></td>
    	</tr>
    	<tr>
    		<td><textarea rows="5" cols="150"></textarea></td>
    	</tr>
    	<tr>
    		<td><h1>动口：</h1></td>
    	</tr>
    	<tr>
    		<td><textarea rows="3" cols="150"></textarea></td>
    	</tr>
    	<tr>
    		<td><h1>动手：</h1></td>
    	</tr>
    	<tr>
    		<td><textarea rows="3" cols="150"></textarea></td>
    	</tr>
    </table>
  </body>
</html>
