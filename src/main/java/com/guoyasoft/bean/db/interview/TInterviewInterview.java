package com.guoyasoft.bean.db.interview;

import java.util.Date;

public class TInterviewInterview {
    private Integer interviewId;

    private Integer scheduleId;

    private Date callTime;

    private Date interviewTime;

    private Date workTime;

    private String progress;

    private String result;

    private Integer expectSalary;

    private Integer realSalary;

    private String mark;

    private Integer status;

    private Date createTime;

    private Integer companyId;

    private Integer hrId;

    private Integer hasExam;

    private Integer isOutsource;

    public Integer getInterviewId() {
        return interviewId;
    }

    public void setInterviewId(Integer interviewId) {
        this.interviewId = interviewId;
    }

    public Integer getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Integer scheduleId) {
        this.scheduleId = scheduleId;
    }

    public Date getCallTime() {
        return callTime;
    }

    public void setCallTime(Date callTime) {
        this.callTime = callTime;
    }

    public Date getInterviewTime() {
        return interviewTime;
    }

    public void setInterviewTime(Date interviewTime) {
        this.interviewTime = interviewTime;
    }

    public Date getWorkTime() {
        return workTime;
    }

    public void setWorkTime(Date workTime) {
        this.workTime = workTime;
    }

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress == null ? null : progress.trim();
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }

    public Integer getExpectSalary() {
        return expectSalary;
    }

    public void setExpectSalary(Integer expectSalary) {
        this.expectSalary = expectSalary;
    }

    public Integer getRealSalary() {
        return realSalary;
    }

    public void setRealSalary(Integer realSalary) {
        this.realSalary = realSalary;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark == null ? null : mark.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getHrId() {
        return hrId;
    }

    public void setHrId(Integer hrId) {
        this.hrId = hrId;
    }

    public Integer getHasExam() {
        return hasExam;
    }

    public void setHasExam(Integer hasExam) {
        this.hasExam = hasExam;
    }

    public Integer getIsOutsource() {
        return isOutsource;
    }

    public void setIsOutsource(Integer isOutsource) {
        this.isOutsource = isOutsource;
    }
}