package com.guoyasoft.bean.db.interview;

import java.util.Date;

public class TInterviewOffer {
    private Integer offerId;

    private Integer interviewId;

    private Integer salary;

    private Integer salaryCount;

    private Integer isGrossPay;

    private Integer probationaryPeriod;

    private Integer probationaryPeriodDiscount;

    private Date offerTime;

    private Date workTime;

    private Date createTime;

    private Date updateTime;

    private Integer operatorUserId;

    private Integer isAccept;

    private Integer status;

    public Integer getOfferId() {
        return offerId;
    }

    public void setOfferId(Integer offerId) {
        this.offerId = offerId;
    }

    public Integer getInterviewId() {
        return interviewId;
    }

    public void setInterviewId(Integer interviewId) {
        this.interviewId = interviewId;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getSalaryCount() {
        return salaryCount;
    }

    public void setSalaryCount(Integer salaryCount) {
        this.salaryCount = salaryCount;
    }

    public Integer getIsGrossPay() {
        return isGrossPay;
    }

    public void setIsGrossPay(Integer isGrossPay) {
        this.isGrossPay = isGrossPay;
    }

    public Integer getProbationaryPeriod() {
        return probationaryPeriod;
    }

    public void setProbationaryPeriod(Integer probationaryPeriod) {
        this.probationaryPeriod = probationaryPeriod;
    }

    public Integer getProbationaryPeriodDiscount() {
        return probationaryPeriodDiscount;
    }

    public void setProbationaryPeriodDiscount(Integer probationaryPeriodDiscount) {
        this.probationaryPeriodDiscount = probationaryPeriodDiscount;
    }

    public Date getOfferTime() {
        return offerTime;
    }

    public void setOfferTime(Date offerTime) {
        this.offerTime = offerTime;
    }

    public Date getWorkTime() {
        return workTime;
    }

    public void setWorkTime(Date workTime) {
        this.workTime = workTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getOperatorUserId() {
        return operatorUserId;
    }

    public void setOperatorUserId(Integer operatorUserId) {
        this.operatorUserId = operatorUserId;
    }

    public Integer getIsAccept() {
        return isAccept;
    }

    public void setIsAccept(Integer isAccept) {
        this.isAccept = isAccept;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}