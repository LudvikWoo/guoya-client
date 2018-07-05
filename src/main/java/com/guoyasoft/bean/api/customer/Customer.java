package com.guoyasoft.bean.api.customer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.guoyasoft.bean.api.interview.summary.Student;

public class Customer {
	private List<Student> students = new ArrayList<Student>();

	private Integer customerId;

	private String customerName;

	private Integer customerAge;

	private Date customerBirthday;

	private String customerSex;

	private String customerProvince;

	private String customerCity;

	private String customerCert;

	private String customerCstType;

	private String customerCstTypeDesc;

	private String customerPhone;

	private String customerWeichat;

	private Integer customerStatus;

	private String customerStatusDesc;

	private Date customerCreateTime;

	private Date customerUpdateTime;

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

	public Integer getCustomerAge() {
		return customerAge;
	}

	public void setCustomerAge(Integer customerAge) {
		this.customerAge = customerAge;
	}

	public Date getCustomerBirthday() {
		return customerBirthday;
	}

	public void setCustomerBirthday(Date customerBirthday) {
		this.customerBirthday = customerBirthday;
	}

	public String getCustomerSex() {
		return customerSex;
	}

	public void setCustomerSex(String customerSex) {
		this.customerSex = customerSex;
	}

	public String getCustomerProvince() {
		return customerProvince;
	}

	public void setCustomerProvince(String customerProvince) {
		this.customerProvince = customerProvince;
	}

	public String getCustomerCity() {
		return customerCity;
	}

	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}

	public String getCustomerCert() {
		return customerCert;
	}

	public void setCustomerCert(String customerCert) {
		this.customerCert = customerCert;
	}

	public String getCustomerCstType() {
		return customerCstType;
	}

	public void setCustomerCstType(String customerCstType) {
		this.customerCstType = customerCstType;
	}

	public String getCustomerCstTypeDesc() {
		return customerCstTypeDesc;
	}

	public void setCustomerCstTypeDesc(String customerCstTypeDesc) {
		this.customerCstTypeDesc = customerCstTypeDesc;
	}

	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	public String getCustomerWeichat() {
		return customerWeichat;
	}

	public void setCustomerWeichat(String customerWeichat) {
		this.customerWeichat = customerWeichat;
	}

	public Integer getCustomerStatus() {
		return customerStatus;
	}

	public void setCustomerStatus(Integer customerStatus) {
		this.customerStatus = customerStatus;
	}

	public String getCustomerStatusDesc() {
		return customerStatusDesc;
	}

	public void setCustomerStatusDesc(String customerStatusDesc) {
		this.customerStatusDesc = customerStatusDesc;
	}

	public Date getCustomerCreateTime() {
		return customerCreateTime;
	}

	public void setCustomerCreateTime(Date customerCreateTime) {
		this.customerCreateTime = customerCreateTime;
	}

	public Date getCustomerUpdateTime() {
		return customerUpdateTime;
	}

	public void setCustomerUpdateTime(Date customerUpdateTime) {
		this.customerUpdateTime = customerUpdateTime;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName="
				+ customerName + ", customerAge=" + customerAge
				+ ", customerBirthday=" + customerBirthday + ", customerSex="
				+ customerSex + ", customerProvince=" + customerProvince
				+ ", customerCity=" + customerCity + ", customerCert="
				+ customerCert + ", customerCstType=" + customerCstType
				+ ", customerCstTypeDesc=" + customerCstTypeDesc
				+ ", customerPhone=" + customerPhone + ", customerWeichat="
				+ customerWeichat + ", customerStatus=" + customerStatus
				+ ", customerStatusDesc=" + customerStatusDesc
				+ ", customerCreateTime=" + customerCreateTime
				+ ", customerUpdateTime=" + customerUpdateTime + "]";
	}

}
