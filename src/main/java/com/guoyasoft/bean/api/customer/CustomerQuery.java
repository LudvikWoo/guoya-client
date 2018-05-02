package com.guoyasoft.bean.api.customer;

public class CustomerQuery {
	private String cname           ;
    private String cstType;
	private String enrollDate      ;
	private String ageMin             ;
	private String ageMax             ;
	private String sex             ;
	private String education       ;
	private String payedTuitionMin ;
	private String payedTuitionMax ;
	private String payStyle        ;
	private String insurance       ;
	private String computor        ;
	private String board           ;
	private String introducerDesc  ;
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getEnrollDate() {
		return enrollDate;
	}
	public void setEnrollDate(String enrollDate) {
		this.enrollDate = enrollDate;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getPayedTuitionMin() {
		return payedTuitionMin;
	}
	public void setPayedTuitionMin(String payedTuitionMin) {
		this.payedTuitionMin = payedTuitionMin;
	}
	public String getPayedTuitionMax() {
		return payedTuitionMax;
	}
	public void setPayedTuitionMax(String payedTuitionMax) {
		this.payedTuitionMax = payedTuitionMax;
	}
	public String getPayStyle() {
		return payStyle;
	}
	public void setPayStyle(String payStyle) {
		this.payStyle = payStyle;
	}
	public String getInsurance() {
		return insurance;
	}
	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}
	public String getComputor() {
		return computor;
	}
	public void setComputor(String computor) {
		this.computor = computor;
	}
	public String getBoard() {
		return board;
	}
	public void setBoard(String board) {
		this.board = board;
	}
	public String getIntroducerDesc() {
		return introducerDesc;
	}
	public void setIntroducerDesc(String introducerDesc) {
		this.introducerDesc = introducerDesc;
	}
	
	public String getCstType() {
		return cstType;
	}
	public void setCstType(String cstType) {
		this.cstType = cstType;
	}
	@Override
	public String toString() {
		return "CustomerQuery [cname=" + cname + ", cstType=" + cstType
				+ ", enrollDate=" + enrollDate + ", ageMin=" + ageMin
				+ ", ageMax=" + ageMax + ", sex=" + sex + ", education="
				+ education + ", payedTuitionMin=" + payedTuitionMin
				+ ", payedTuitionMax=" + payedTuitionMax + ", payStyle="
				+ payStyle + ", insurance=" + insurance + ", computor="
				+ computor + ", board=" + board + ", introducerDesc="
				+ introducerDesc + "]";
	}
	
	

}
