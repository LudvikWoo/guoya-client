<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'query.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

<script type="text/javascript">
	function returnCno(cno,cname){
		/* alert("cno="+cno+",cname="+cname); */
		window.opener.document.all.introducer.value = cno;
		window.opener.document.all.introducerDesc.value = cname;
		window.close();
	}
</script>
</head>

<body>
	<form action="customer/queryCstNo.action" target="result" method="post">
		<table border="1">
			<tr>
				<td>姓名：</td>
				<td><input type="text" name="cname"></td>
				<td colspan="4" align="right"><input type="submit" value="查询"></td>
			</tr>
		</table>
	</form>
	<hr>
</body>
<iframe id="iframepage" name="result" width="100%" noResize
	scrolling="no" frameborder="0"
	onload="this.height=this.contentWindow.document.body.scrollHeight+10">
</html>
