package com.guoyasoft.bean.api.interview.summary;

import java.util.Date;

public class Interview {
	private Exam exam;
	private Ask ask;
	private InterviewCompany company;
	private HR hr;
	private Resume resume;
	private Offer offer;

	private Integer interviewId;

	private Date interviewCallTime;

	private Date interviewInterviewTime;

	private Date interviewWorkTime;

	private Integer interviewProgress;

	private Integer interviewResult;

	private String interviewMark;

	private Integer interviewStatus;

	private Date interviewCreateTime;

	private Integer interviewIsOutsource;

	private Integer interviewCompanyId;

	private String interviewCompanyName;

	private String interviewCompanyAddr;

	private Integer interviewCompanyType;

	private String interviewCompanyDesc;

	private Date interviewCompanyCreateTime;

	private Integer interviewCompanyStatus;

	private String interviewCompanyAbbreviation;

	private Date interviewCompanyUpdateTime;

	private Integer interviewCompanyIsOutsource;

	public Offer getOffer() {
		return offer;
	}

	public void setOffer(Offer offer) {
		this.offer = offer;
	}

	public Exam getExam() {
		return exam;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}

	public Ask getAsk() {
		return ask;
	}

	public void setAsk(Ask ask) {
		this.ask = ask;
	}

	public InterviewCompany getCompany() {
		return company;
	}

	public void setCompany(InterviewCompany company) {
		this.company = company;
	}

	public HR getHr() {
		return hr;
	}

	public void setHr(HR hr) {
		this.hr = hr;
	}

	public Resume getResume() {
		return resume;
	}

	public void setResume(Resume resume) {
		this.resume = resume;
	}

	public Integer getInterviewId() {
		return interviewId;
	}

	public void setInterviewId(Integer interviewId) {
		this.interviewId = interviewId;
	}

	public Date getInterviewCallTime() {
		return interviewCallTime;
	}

	public void setInterviewCallTime(Date interviewCallTime) {
		this.interviewCallTime = interviewCallTime;
	}

	public Date getInterviewInterviewTime() {
		return interviewInterviewTime;
	}

	public void setInterviewInterviewTime(Date interviewInterviewTime) {
		this.interviewInterviewTime = interviewInterviewTime;
	}

	public Date getInterviewWorkTime() {
		return interviewWorkTime;
	}

	public void setInterviewWorkTime(Date interviewWorkTime) {
		this.interviewWorkTime = interviewWorkTime;
	}

	public Integer getInterviewProgress() {
		return interviewProgress;
	}

	public void setInterviewProgress(Integer interviewProgress) {
		this.interviewProgress = interviewProgress;
	}

	public Integer getInterviewResult() {
		return interviewResult;
	}

	public void setInterviewResult(Integer interviewResult) {
		this.interviewResult = interviewResult;
	}

	public String getInterviewMark() {
		return interviewMark;
	}

	public void setInterviewMark(String interviewMark) {
		this.interviewMark = interviewMark;
	}

	public Integer getInterviewStatus() {
		return interviewStatus;
	}

	public void setInterviewStatus(Integer interviewStatus) {
		this.interviewStatus = interviewStatus;
	}

	public Date getInterviewCreateTime() {
		return interviewCreateTime;
	}

	public void setInterviewCreateTime(Date interviewCreateTime) {
		this.interviewCreateTime = interviewCreateTime;
	}

	public Integer getInterviewIsOutsource() {
		return interviewIsOutsource;
	}

	public void setInterviewIsOutsource(Integer interviewIsOutsource) {
		this.interviewIsOutsource = interviewIsOutsource;
	}

	public Integer getInterviewCompanyId() {
		return interviewCompanyId;
	}

	public void setInterviewCompanyId(Integer interviewCompanyId) {
		this.interviewCompanyId = interviewCompanyId;
	}

	public String getInterviewCompanyName() {
		return interviewCompanyName;
	}

	public void setInterviewCompanyName(String interviewCompanyName) {
		this.interviewCompanyName = interviewCompanyName;
	}

	public String getInterviewCompanyAddr() {
		return interviewCompanyAddr;
	}

	public void setInterviewCompanyAddr(String interviewCompanyAddr) {
		this.interviewCompanyAddr = interviewCompanyAddr;
	}

	public Integer getInterviewCompanyType() {
		return interviewCompanyType;
	}

	public void setInterviewCompanyType(Integer interviewCompanyType) {
		this.interviewCompanyType = interviewCompanyType;
	}

	public String getInterviewCompanyDesc() {
		return interviewCompanyDesc;
	}

	public void setInterviewCompanyDesc(String interviewCompanyDesc) {
		this.interviewCompanyDesc = interviewCompanyDesc;
	}

	public Date getInterviewCompanyCreateTime() {
		return interviewCompanyCreateTime;
	}

	public void setInterviewCompanyCreateTime(Date interviewCompanyCreateTime) {
		this.interviewCompanyCreateTime = interviewCompanyCreateTime;
	}

	public Integer getInterviewCompanyStatus() {
		return interviewCompanyStatus;
	}

	public void setInterviewCompanyStatus(Integer interviewCompanyStatus) {
		this.interviewCompanyStatus = interviewCompanyStatus;
	}

	public String getInterviewCompanyAbbreviation() {
		return interviewCompanyAbbreviation;
	}

	public void setInterviewCompanyAbbreviation(
			String interviewCompanyAbbreviation) {
		this.interviewCompanyAbbreviation = interviewCompanyAbbreviation;
	}

	public Date getInterviewCompanyUpdateTime() {
		return interviewCompanyUpdateTime;
	}

	public void setInterviewCompanyUpdateTime(Date interviewCompanyUpdateTime) {
		this.interviewCompanyUpdateTime = interviewCompanyUpdateTime;
	}

	public Integer getInterviewCompanyIsOutsource() {
		return interviewCompanyIsOutsource;
	}

	public void setInterviewCompanyIsOutsource(
			Integer interviewCompanyIsOutsource) {
		this.interviewCompanyIsOutsource = interviewCompanyIsOutsource;
	}

	@Override
	public String toString() {
		return "Interview [exam=" + exam + ", ask=" + ask + ", company="
				+ company + ", hr=" + hr + ", resume=" + resume + ", offer="
				+ offer + ", interviewId=" + interviewId
				+ ", interviewCallTime=" + interviewCallTime
				+ ", interviewInterviewTime=" + interviewInterviewTime
				+ ", interviewWorkTime=" + interviewWorkTime
				+ ", interviewProgress=" + interviewProgress
				+ ", interviewResult=" + interviewResult + ", interviewMark="
				+ interviewMark + ", interviewStatus=" + interviewStatus
				+ ", interviewCreateTime=" + interviewCreateTime
				+ ", interviewIsOutsource=" + interviewIsOutsource
				+ ", interviewCompanyId=" + interviewCompanyId
				+ ", interviewCompanyName=" + interviewCompanyName
				+ ", interviewCompanyAddr=" + interviewCompanyAddr
				+ ", interviewCompanyType=" + interviewCompanyType
				+ ", interviewCompanyDesc=" + interviewCompanyDesc
				+ ", interviewCompanyCreateTime=" + interviewCompanyCreateTime
				+ ", interviewCompanyStatus=" + interviewCompanyStatus
				+ ", interviewCompanyAbbreviation="
				+ interviewCompanyAbbreviation
				+ ", interviewCompanyUpdateTime=" + interviewCompanyUpdateTime
				+ ", interviewCompanyIsOutsource="
				+ interviewCompanyIsOutsource + "]";
	}

}
