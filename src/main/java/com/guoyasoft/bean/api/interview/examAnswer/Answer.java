package com.guoyasoft.bean.api.interview.examAnswer;

import java.util.Date;

public class Answer {

    private Integer examId;

    private Integer interviewId;

	private Integer pictureId;
	
	private Integer answerId;

    private String subjectIndex;

    private String subjectDesc;

    private String answer;

    private Integer praiseCount;

    private Integer authorCstId;

    private String authorCstName;

    private Date createTime;

    private Integer status;

	public Integer getAnswerId() {
		return answerId;
	}

	public void setAnswerId(Integer answerId) {
		this.answerId = answerId;
	}

	public String getSubjectIndex() {
		return subjectIndex;
	}

	public void setSubjectIndex(String subjectIndex) {
		this.subjectIndex = subjectIndex;
	}

	public String getSubjectDesc() {
		return subjectDesc;
	}

	public void setSubjectDesc(String subjectDesc) {
		this.subjectDesc = subjectDesc;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Integer getPraiseCount() {
		return praiseCount;
	}

	public void setPraiseCount(Integer praiseCount) {
		this.praiseCount = praiseCount;
	}

	public Integer getAuthorCstId() {
		return authorCstId;
	}

	public void setAuthorCstId(Integer authorCstId) {
		this.authorCstId = authorCstId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getAuthorCstName() {
		return authorCstName;
	}

	public void setAuthorCstName(String authorCstName) {
		this.authorCstName = authorCstName;
	}

	public Integer getExamId() {
		return examId;
	}

	public void setExamId(Integer examId) {
		this.examId = examId;
	}

	public Integer getInterviewId() {
		return interviewId;
	}

	public void setInterviewId(Integer interviewId) {
		this.interviewId = interviewId;
	}

	public Integer getPictureId() {
		return pictureId;
	}

	public void setPictureId(Integer pictureId) {
		this.pictureId = pictureId;
	}

	@Override
	public String toString() {
		return "Answer [examId=" + examId + ", interviewId=" + interviewId
				+ ", pictureId=" + pictureId + ", answerId=" + answerId
				+ ", subjectIndex=" + subjectIndex + ", subjectDesc="
				+ subjectDesc + ", answer=" + answer + ", praiseCount="
				+ praiseCount + ", authorCstId=" + authorCstId
				+ ", authorCstName=" + authorCstName + ", createTime="
				+ createTime + ", status=" + status + "]";
	}

    
    
}
