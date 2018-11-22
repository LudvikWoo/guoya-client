//var publicUrl = "http://47.98.226.232:8080";
var publicUrl = "http://www.guoyasoft.com:8080";
//var publicUrl="http://127.0.0.1:8083";
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
function queryCustomer(elementId){
	open('jsp/customer/queryCustomer.jsp?name='+elementId,'','resizable=1,scrollbars=1,status=no,toolbar=no,menu=no,width=500,height=400,left=150,top=50');
}

function queryStudent(elementId){
	open('jsp/student/queryStudent.jsp?name='+elementId,'','resizable=1,scrollbars=1,status=no,toolbar=no,menu=no,width=500,height=400,left=150,top=50');

}
