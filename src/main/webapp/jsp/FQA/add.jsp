<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'FQA.jsp' starting page</title>
    
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
    			<td>
    				题目：
    			</td>
    			<td>
    				<textarea rows="4" cols="100"></textarea>
    			</td>
    		</tr>
    		<tr>
    			<td>
    				答案：
    			</td>
    			<td>
    				<textarea rows="5" cols="100"></textarea>
    			</td>
    		</tr>
    		<tr>
    			<td>
    				作者：
    			</td>
    			<td>
    				<input type="text" name="author">
    			</td>
    		</tr>
    		<tr>
    			<td>
    				<input type="button" value="保存">
    			</td>
    			<td>
    				<input type="button" value="添加答案">
    			</td>
    		</tr>
    	</table>
    </form>
  </body>
</html>
