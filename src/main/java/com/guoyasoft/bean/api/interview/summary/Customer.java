package com.guoyasoft.bean.api.interview.summary;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Customer {
	
	private Integer customerId;

    private String customerName;

    private Integer customerAge;

    private Date customerBirthday;

    private String customerSex;

    private String customerProvince;

    private String customerCity;

    private String customerCert;

    private String customerCstType;

    private String customerPhone;

    private String customerWeichat;

    private Integer customerStatus;

    private Date customerCreateTime;

    private Date customerUpdateTime;
	
	private List<Student> students =new ArrayList<Student>();

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
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
	
}
