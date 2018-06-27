package com.guoyasoft.bean.api.interview.examAnswer;

import java.util.ArrayList;

public class Picture {

	private Integer pictureId;

	private String picAddr;
	
	private ArrayList<Answer> answers=new ArrayList<Answer>();

	public Integer getPictureId() {
		return pictureId;
	}

	public void setPictureId(Integer pictureId) {
		this.pictureId = pictureId;
	}

	public String getPicAddr() {
		return picAddr;
	}

	public void setPicAddr(String picAddr) {
		this.picAddr = picAddr;
	}

	public ArrayList<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(ArrayList<Answer> answers) {
		this.answers = answers;
	}

	@Override
	public String toString() {
		return "Picture [pictureId=" + pictureId + ", picAddr=" + picAddr
				+ ", answers=" + answers + "]";
	}
	
	
}
