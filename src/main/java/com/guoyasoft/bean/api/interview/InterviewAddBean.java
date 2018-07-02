package com.guoyasoft.bean.api.interview;

import java.util.Date;

public class InterviewAddBean {
	private String studentName;
	private String scheduleId;
	private String companyId;
	private String isOutsource;
	private String hrCompanyId;
	private String interviewDate;
	private String interviewTime;
	private String hrId;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(String scheduleId) {
		this.scheduleId = scheduleId;
	}
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	public String getIsOutsource() {
		return isOutsource;
	}
	public void setIsOutsource(String isOutsource) {
		this.isOutsource = isOutsource;
	}
	public String getHrCompanyId() {
		return hrCompanyId;
	}
	public void setHrCompanyId(String hrCompanyId) {
		this.hrCompanyId = hrCompanyId;
	}
	public String getInterviewDate() {
		return interviewDate;
	}
	public void setInterviewDate(String interviewDate) {
		this.interviewDate = interviewDate;
	}
	public String getInterviewTime() {
		return interviewTime;
	}
	public void setInterviewTime(String interviewTime) {
		this.interviewTime = interviewTime;
	}
	public String getHrId() {
		return hrId;
	}
	public void setHrId(String hrId) {
		this.hrId = hrId;
	}
	@Override
	public String toString() {
		return "InterviewAddBean [studentName=" + studentName + ", scheduleId="
				+ scheduleId + ", companyId=" + companyId + ", isOutsource="
				+ isOutsource + ", hrCompanyId=" + hrCompanyId
				+ ", interviewDate=" + interviewDate + ", interviewTime="
				+ interviewTime + ", hrId=" + hrId + "]";
	}

	
	
}
