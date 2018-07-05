package com.guoyasoft.bean.api.interview.summary;

import java.util.Date;

public class Exam {
	private Integer examId;

    private Date examCreateTime;

    private Integer examStatus;

    private Date examUpdateTime;

	public Integer getExamId() {
		return examId;
	}

	public void setExamId(Integer examId) {
		this.examId = examId;
	}

	public Date getExamCreateTime() {
		return examCreateTime;
	}

	public void setExamCreateTime(Date examCreateTime) {
		this.examCreateTime = examCreateTime;
	}

	public Integer getExamStatus() {
		return examStatus;
	}

	public void setExamStatus(Integer examStatus) {
		this.examStatus = examStatus;
	}

	public Date getExamUpdateTime() {
		return examUpdateTime;
	}

	public void setExamUpdateTime(Date examUpdateTime) {
		this.examUpdateTime = examUpdateTime;
	}

	@Override
	public String toString() {
		return "Exam [examId=" + examId + ", examCreateTime=" + examCreateTime
				+ ", examStatus=" + examStatus + ", examUpdateTime="
				+ examUpdateTime + "]";
	}
    
    
}
