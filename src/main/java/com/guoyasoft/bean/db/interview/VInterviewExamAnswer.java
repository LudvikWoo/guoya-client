package com.guoyasoft.bean.db.interview;

import java.util.Date;

public class VInterviewExamAnswer {
    private Integer answerId;

    private String subjectIndex;

    private String subjectDesc;

    private String answer;

    private Integer praiseCount;

    private Integer authorCstId;

    private String authorCstName;

    private Date createTime;

    private Integer status;

    private Integer pictureId;

    private String picAddr;

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
        this.subjectIndex = subjectIndex == null ? null : subjectIndex.trim();
    }

    public String getSubjectDesc() {
        return subjectDesc;
    }

    public void setSubjectDesc(String subjectDesc) {
        this.subjectDesc = subjectDesc == null ? null : subjectDesc.trim();
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
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

    public String getAuthorCstName() {
        return authorCstName;
    }

    public void setAuthorCstName(String authorCstName) {
        this.authorCstName = authorCstName == null ? null : authorCstName.trim();
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
        this.picAddr = picAddr == null ? null : picAddr.trim();
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
        this.customerName = customerName == null ? null : customerName.trim();
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
        this.className = className == null ? null : className.trim();
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
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getCompanyNameAbbreviation() {
        return companyNameAbbreviation;
    }

    public void setCompanyNameAbbreviation(String companyNameAbbreviation) {
        this.companyNameAbbreviation = companyNameAbbreviation == null ? null : companyNameAbbreviation.trim();
    }
}