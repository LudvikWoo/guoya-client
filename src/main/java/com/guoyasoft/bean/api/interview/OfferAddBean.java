package com.guoyasoft.bean.api.interview;

import java.util.Date;

public class OfferAddBean {
	 private Integer offerId;

	    private String interviewId;

	    private String salary;

	    private String salaryCount;

	    private String isGrossPay;

	    private String probationaryPeriod;

	    private String probationaryPeriodDiscount;

	    private String offerTime;

	    private String workTime;

	    private String createTime;

	    private String updateTime;

	    private String operatorUserId;

	    private String isAccept;

	    private String status;

		public Integer getOfferId() {
			return offerId;
		}

		public void setOfferId(Integer offerId) {
			this.offerId = offerId;
		}

		public String getInterviewId() {
			return interviewId;
		}

		public void setInterviewId(String interviewId) {
			this.interviewId = interviewId;
		}

		public String getSalary() {
			return salary;
		}

		public void setSalary(String salary) {
			this.salary = salary;
		}

		public String getSalaryCount() {
			return salaryCount;
		}

		public void setSalaryCount(String salaryCount) {
			this.salaryCount = salaryCount;
		}

		public String getIsGrossPay() {
			return isGrossPay;
		}

		public void setIsGrossPay(String isGrossPay) {
			this.isGrossPay = isGrossPay;
		}

		public String getProbationaryPeriod() {
			return probationaryPeriod;
		}

		public void setProbationaryPeriod(String probationaryPeriod) {
			this.probationaryPeriod = probationaryPeriod;
		}

		public String getProbationaryPeriodDiscount() {
			return probationaryPeriodDiscount;
		}

		public void setProbationaryPeriodDiscount(String probationaryPeriodDiscount) {
			this.probationaryPeriodDiscount = probationaryPeriodDiscount;
		}

		public String getOfferTime() {
			return offerTime;
		}

		public void setOfferTime(String offerTime) {
			this.offerTime = offerTime;
		}

		public String getWorkTime() {
			return workTime;
		}

		public void setWorkTime(String workTime) {
			this.workTime = workTime;
		}

		public String getCreateTime() {
			return createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getUpdateTime() {
			return updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public String getOperatorUserId() {
			return operatorUserId;
		}

		public void setOperatorUserId(String operatorUserId) {
			this.operatorUserId = operatorUserId;
		}

		public String getIsAccept() {
			return isAccept;
		}

		public void setIsAccept(String isAccept) {
			this.isAccept = isAccept;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		@Override
		public String toString() {
			return "OfferAddBean [offerId=" + offerId + ", interviewId="
					+ interviewId + ", salary=" + salary + ", salaryCount="
					+ salaryCount + ", isGrossPay=" + isGrossPay
					+ ", probationaryPeriod=" + probationaryPeriod
					+ ", probationaryPeriodDiscount="
					+ probationaryPeriodDiscount + ", offerTime=" + offerTime
					+ ", workTime=" + workTime + ", createTime=" + createTime
					+ ", updateTime=" + updateTime + ", operatorUserId="
					+ operatorUserId + ", isAccept=" + isAccept + ", status="
					+ status + "]";
		}
	    
	    
}
