package com.guoyasoft.bean.api.customer;



public class Customer {
	
	private String cno         ;
	
	private String cname       ;
	private String cstType;
	
	private String age         ;
	
	private String birthday    ;
	private String enrollDate  ;
	private String cert        ;
	
	private String sex         ;
	private String education   ;
	private String buyEdu;
	private String adultEdu;
	private String insurance   ;
	private String computor     ;
	private String board       ;
	private String phone       ;
	private String weichat     ;
	private String introducer  ;
	private String status      ;
	
	private String province    ;
	private String city        ;
	
	public String getCstType() {
		return cstType;
	}
	public void setCstType(String cstType) {
		this.cstType = cstType;
	}
	public String getCno() {
		return cno;
	}
	public void setCno(String cno) {
		this.cno = cno;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getEnrollDate() {
		return enrollDate;
	}
	public void setEnrollDate(String enrollDate) {
		this.enrollDate = enrollDate;
	}
	public String getCert() {
		return cert;
	}
	public void setCert(String cert) {
		this.cert = cert;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getWeichat() {
		return weichat;
	}
	public void setWeichat(String weichat) {
		this.weichat = weichat;
	}
	public String getIntroducer() {
		return introducer;
	}
	public void setIntroducer(String introducer) {
		this.introducer = introducer;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getBuyEdu() {
		return buyEdu;
	}
	public void setBuyEdu(String buyEdu) {
		this.buyEdu = buyEdu;
	}
	public String getAdultEdu() {
		return adultEdu;
	}
	public void setAdultEdu(String adultEdu) {
		this.adultEdu = adultEdu;
	}
	@Override
	public String toString() {
		return "Customer [cno=" + cno + ", cname=" + cname + ", age=" + age
				+ ", birthday=" + birthday + ", enrollDate=" + enrollDate
				+ ", cert=" + cert + ", sex=" + sex + ", education="
				+ education + ", insurance=" + insurance + ", computor="
				+ computor + ", board=" + board + ", phone=" + phone
				+ ", weichat=" + weichat + ", introducer=" + introducer
				+ ", status=" + status + ", province=" + province + ", city="
				+ city + "]";
	}
	
	
}
