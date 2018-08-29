package com.guoyasoft.bean.api.interview.askAswer;

import java.util.Date;

public class AudioAnswer {
	private Integer answer_id          ;
	private Integer data_id           ;
	private Integer author_user_id     ;
	private Integer status             ;
	private Date create_time        ;
	private Date update_time        ;
	private Integer praise_count       ;
	private Integer subject_index      ;
	private String subject_desc       ;
	private String answer             ;
	
	
	public Date getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}
	public Integer getAnswer_id() {
		return answer_id;
	}
	public void setAnswer_id(Integer answer_id) {
		this.answer_id = answer_id;
	}
	
	public Integer getData_id() {
		return data_id;
	}
	public void setData_id(Integer data_id) {
		this.data_id = data_id;
	}
	public Integer getAuthor_user_id() {
		return author_user_id;
	}
	public void setAuthor_user_id(Integer author_user_id) {
		this.author_user_id = author_user_id;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public Integer getPraise_count() {
		return praise_count;
	}
	public void setPraise_count(Integer praise_count) {
		this.praise_count = praise_count;
	}
	public Integer getSubject_index() {
		return subject_index;
	}
	public void setSubject_index(Integer subject_index) {
		this.subject_index = subject_index;
	}
	public String getSubject_desc() {
		return subject_desc;
	}
	public void setSubject_desc(String subject_desc) {
		this.subject_desc = subject_desc;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}

}
