//var publicUrl = "http://47.98.226.232:8080";
var publicUrl = "http://www.guoyasoft.com:8080";
// var publicUrl="http://127.0.0.1:8083";
function getNowFormatDate() {
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
	return currentdate;
}
// 选择学生姓名
function openWindow(url) {
	open(
			url,
			'',
			'resizable=1,scrollbars=1,status=no,toolbar=no,menu=no,width=500,height=400,left=150,top=50');
}
function returnValue(key,value)
{
	//alert("key="+key+",value="+value);
	window.parent.returnSelect(key,value);
}

// 返回结果
function returnSelect(key, value) {
	/* alert("cno="+cno+",cname="+cname); */
	//alert(GetRequestParam('name'));
	window.opener.document.getElementById(GetRequestParam('name')+"Id").value = key;
	/* window.opener.document.all.introducerDesc.value = cname; */
	window.opener.document.getElementById(GetRequestParam('name')+"Name").value = value;
	window.close();
}

function GetRequestParam(key) {
	var url = location.search; // 获取url中"?"符后的字串
	var theRequest = new Object();
	if (url.indexOf("?") != -1) {
		var str = url.substr(1);
		strs = str.split("&");
		for (var i = 0; i < strs.length; i++) {
			if (key == strs[i].split("=")[0]) {
				return strs[i].split("=")[1];
			}
			theRequest[strs[i].split("=")[0]] = unescape(strs[i].split("=")[1]);
		}
	}
	return "";
}

function GetRequest() {
	var url = location.search; // 获取url中"?"符后的字串
	var theRequest = new Object();
	if (url.indexOf("?") != -1) {
		var str = url.substr(1);
		strs = str.split("&");
		for (var i = 0; i < strs.length; i++) {
			theRequest[strs[i].split("=")[0]] = unescape(strs[i].split("=")[1]);
		}
	}
	return theRequest;
}
