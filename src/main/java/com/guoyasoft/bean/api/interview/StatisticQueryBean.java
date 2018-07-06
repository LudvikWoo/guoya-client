package com.guoyasoft.bean.api.interview;

public class StatisticQueryBean {
	private String studentName;
	private String classId;
	private String education;
	private String ageMin;
	private String ageMax;
	private String interviewCtnMin;
	private String interviewCtnMax;
	private String finishCtnMin;
	private String finishCtnMax;
	private String passCtnMin;
	private String passCtnMax;
	private String hasJob;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getClassId() {
		return classId;
	}
	public void setClassId(String classId) {
		this.classId = classId;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getAgeMin() {
		return ageMin;
	}
	public void setAgeMin(String ageMin) {
		this.ageMin = ageMin;
	}
	public String getAgeMax() {
		return ageMax;
	}
	public void setAgeMax(String ageMax) {
		this.ageMax = ageMax;
	}
	public String getInterviewCtnMin() {
		return interviewCtnMin;
	}
	public void setInterviewCtnMin(String interviewCtnMin) {
		this.interviewCtnMin = interviewCtnMin;
	}
	public String getInterviewCtnMax() {
		return interviewCtnMax;
	}
	public void setInterviewCtnMax(String interviewCtnMax) {
		this.interviewCtnMax = interviewCtnMax;
	}
	public String getFinishCtnMin() {
		return finishCtnMin;
	}
	public void setFinishCtnMin(String finishCtnMin) {
		this.finishCtnMin = finishCtnMin;
	}
	public String getFinishCtnMax() {
		return finishCtnMax;
	}
	public void setFinishCtnMax(String finishCtnMax) {
		this.finishCtnMax = finishCtnMax;
	}
	public String getPassCtnMin() {
		return passCtnMin;
	}
	public void setPassCtnMin(String passCtnMin) {
		this.passCtnMin = passCtnMin;
	}
	public String getPassCtnMax() {
		return passCtnMax;
	}
	public void setPassCtnMax(String passCtnMax) {
		this.passCtnMax = passCtnMax;
	}
	
	public String getHasJob() {
		return hasJob;
	}
	public void setHasJob(String hasJob) {
		this.hasJob = hasJob;
	}
	@Override
	public String toString() {
		return "StatisticQueryBean [studentName=" + studentName + ", classId="
				+ classId + ", education=" + education + ", ageMin=" + ageMin
				+ ", ageMax=" + ageMax + ", interviewCtnMin=" + interviewCtnMin
				+ ", interviewCtnMax=" + interviewCtnMax + ", finishCtnMin="
				+ finishCtnMin + ", finishCtnMax=" + finishCtnMax
				+ ", passCtnMin=" + passCtnMin + ", passCtnMax=" + passCtnMax
				+ ", hasJob=" + hasJob + "]";
	}
	
	
}
