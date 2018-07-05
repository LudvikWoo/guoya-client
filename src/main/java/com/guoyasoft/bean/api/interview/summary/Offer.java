package com.guoyasoft.bean.api.interview.summary;

import java.util.Date;

public class Offer {
	private Job job;
	private Integer offerId;

    private Integer offerSalary;

    private Integer offerSalaryCount;

    private Integer offerIsGrossPay;

    private Integer offerProbationaryPeriod;

    private Integer offerProbationaryDiscount;

    private Date offerTime;

    private Date offerWorkTime;

    private Date offerCreateTime;

    private Date offerUpdateTime;

    private Integer offerOperatorUserId;

    private Integer offerIsAccept;

    private Integer offerStatus;
	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public Integer getOfferId() {
		return offerId;
	}

	public void setOfferId(Integer offerId) {
		this.offerId = offerId;
	}

	public Integer getOfferSalary() {
		return offerSalary;
	}

	public void setOfferSalary(Integer offerSalary) {
		this.offerSalary = offerSalary;
	}

	public Integer getOfferSalaryCount() {
		return offerSalaryCount;
	}

	public void setOfferSalaryCount(Integer offerSalaryCount) {
		this.offerSalaryCount = offerSalaryCount;
	}

	public Integer getOfferIsGrossPay() {
		return offerIsGrossPay;
	}

	public void setOfferIsGrossPay(Integer offerIsGrossPay) {
		this.offerIsGrossPay = offerIsGrossPay;
	}

	public Integer getOfferProbationaryPeriod() {
		return offerProbationaryPeriod;
	}

	public void setOfferProbationaryPeriod(Integer offerProbationaryPeriod) {
		this.offerProbationaryPeriod = offerProbationaryPeriod;
	}

	public Integer getOfferProbationaryDiscount() {
		return offerProbationaryDiscount;
	}

	public void setOfferProbationaryDiscount(Integer offerProbationaryDiscount) {
		this.offerProbationaryDiscount = offerProbationaryDiscount;
	}

	public Date getOfferTime() {
		return offerTime;
	}

	public void setOfferTime(Date offerTime) {
		this.offerTime = offerTime;
	}

	public Date getOfferWorkTime() {
		return offerWorkTime;
	}

	public void setOfferWorkTime(Date offerWorkTime) {
		this.offerWorkTime = offerWorkTime;
	}

	public Date getOfferCreateTime() {
		return offerCreateTime;
	}

	public void setOfferCreateTime(Date offerCreateTime) {
		this.offerCreateTime = offerCreateTime;
	}

	public Date getOfferUpdateTime() {
		return offerUpdateTime;
	}

	public void setOfferUpdateTime(Date offerUpdateTime) {
		this.offerUpdateTime = offerUpdateTime;
	}

	public Integer getOfferOperatorUserId() {
		return offerOperatorUserId;
	}

	public void setOfferOperatorUserId(Integer offerOperatorUserId) {
		this.offerOperatorUserId = offerOperatorUserId;
	}

	public Integer getOfferIsAccept() {
		return offerIsAccept;
	}

	public void setOfferIsAccept(Integer offerIsAccept) {
		this.offerIsAccept = offerIsAccept;
	}

	public Integer getOfferStatus() {
		return offerStatus;
	}

	public void setOfferStatus(Integer offerStatus) {
		this.offerStatus = offerStatus;
	}

	@Override
	public String toString() {
		return "Offer [job=" + job + ", offerId=" + offerId + ", offerSalary="
				+ offerSalary + ", offerSalaryCount=" + offerSalaryCount
				+ ", offerIsGrossPay=" + offerIsGrossPay
				+ ", offerProbationaryPeriod=" + offerProbationaryPeriod
				+ ", offerProbationaryDiscount=" + offerProbationaryDiscount
				+ ", offerTime=" + offerTime + ", offerWorkTime="
				+ offerWorkTime + ", offerCreateTime=" + offerCreateTime
				+ ", offerUpdateTime=" + offerUpdateTime
				+ ", offerOperatorUserId=" + offerOperatorUserId
				+ ", offerIsAccept=" + offerIsAccept + ", offerStatus="
				+ offerStatus + "]";
	}

}
