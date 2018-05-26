package com.guoyasoft.bean.api.student;

public class Student {
	private String sno       ;
	private String psno      ;
	private String cno       ;
	private String uno       ;
	private String createTime;
	private String updateTime;
	private String status    ;
	private String operator  ;
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getPsno() {
		return psno;
	}
	public void setPsno(String psno) {
		this.psno = psno;
	}
	public String getCno() {
		return cno;
	}
	public void setCno(String cno) {
		this.cno = cno;
	}
	public String getUno() {
		return uno;
	}
	public void setUno(String uno) {
		this.uno = uno;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", psno=" + psno + ", cno=" + cno
				+ ", uno=" + uno + ", createTime=" + createTime
				+ ", updateTime=" + updateTime + ", status=" + status
				+ ", operator=" + operator + "]";
	}
	
}
