package com.guoyasoft.bean.api.interview.askAswer;

import java.util.Date;
import java.util.List;

public class AudioBean {
	private Integer Audio_id;
	private Integer ask_id;
	private String audio_addr;
	private String audio_name;
	private Date create_time;
	private Date update_time;
	private Integer operate_user_id;
	private Integer status;
	private Integer file_type;
	
	public String getAudio_name() {
		return audio_name;
	}
	public void setAudio_name(String audio_name) {
		this.audio_name = audio_name;
	}
	private List<AudioAnswer> answers;
	
	public List<AudioAnswer> getAnswers() {
		return answers;
	}
	public void setAnswers(List<AudioAnswer> answers) {
		this.answers = answers;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getAudio_id() {
		return Audio_id;
	}
	public void setAudio_id(Integer audio_id) {
		Audio_id = audio_id;
	}
	public Integer getAsk_id() {
		return ask_id;
	}
	public void setAsk_id(Integer ask_id) {
		this.ask_id = ask_id;
	}
	public String getAudio_addr() {
		return audio_addr;
	}
	public void setAudio_addr(String audio_addr) {
		this.audio_addr = audio_addr;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
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

	public Integer getFile_type() {
		return file_type;
	}
	public void setFile_type(Integer file_type) {
		this.file_type = file_type;
	}
	
	
}
