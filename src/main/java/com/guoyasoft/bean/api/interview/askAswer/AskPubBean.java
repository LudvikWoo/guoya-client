package com.guoyasoft.bean.api.interview.askAswer;

import java.util.Date;

public class AskPubBean {
	private Integer ask_id;
	private Integer interview_id;
	private Date create_time;
	private Integer status;
	private Date update_time;
	private Integer operate_user_id;
	
	private String companyNameAbbreviation;
	private String customerName;
	
	public String getCompanyNameAbbreviation() {
		return companyNameAbbreviation;
	}
	public void setCompanyNameAbbreviation(String companyNameAbbreviation) {
		this.companyNameAbbreviation = companyNameAbbreviation;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Integer getInterview_id() {
		return interview_id;
	}
	public void setInterview_id(Integer interview_id) {
		this.interview_id = interview_id;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Date getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}
	public Integer getOperate_user_id() {
		return operate_user_id;
	}
	public void setOperate_user_id(Integer operate_user_id) {
		this.operate_user_id = operate_user_id;
	}
	public Integer getAsk_id() {
		return ask_id;
	}
	public void setAsk_id(Integer ask_id) {
		this.ask_id = ask_id;
	}
	
	
}
