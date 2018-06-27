package com.guoyasoft.bean.api.interview.examAnswer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Exam {


    private Integer examId;

    private Integer interviewId;

    private Integer customerId;

    private String customerName;

    private Integer studentId;

    private Integer userId;

    private Integer classId;

    private String className;

    private Integer companyId;

    private String companyName;

    private String companyNameAbbreviation;
    
	private ArrayList<Picture> pictures=new ArrayList<Picture>();

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

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getClassId() {
		return classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyNameAbbreviation() {
		return companyNameAbbreviation;
	}

	public void setCompanyNameAbbreviation(String companyNameAbbreviation) {
		this.companyNameAbbreviation = companyNameAbbreviation;
	}

	public ArrayList<Picture> getPictures() {
		return pictures;
	}

	public void setPictures(ArrayList<Picture> pictures) {
		this.pictures = pictures;
	}

	@Override
	public String toString() {
		return "Exam [examId=" + examId + ", interviewId=" + interviewId
				+ ", customerId=" + customerId + ", customerName="
				+ customerName + ", studentId=" + studentId + ", userId="
				+ userId + ", classId=" + classId + ", className=" + className
				+ ", companyId=" + companyId + ", companyName=" + companyName
				+ ", companyNameAbbreviation=" + companyNameAbbreviation
				+ ", pictures=" + pictures + "]";
	}

}
