package com.guoyasoft.bean.db.user;

import java.util.Date;

public class TUCustomer {
    private Integer cno;

    private String cname;

    private String cstType;

    private Integer age;

    private Date birthday;

    private Date enrollDate;

    private String cert;

    private String sex;

    private String education;

    private String insurance;

    private String computor;

    private String board;

    private String phone;

    private String weichat;

    private String introducer;

    private Integer status;

    private String province;

    private String city;

    public Integer getCno() {
        return cno;
    }

    public void setCno(Integer cno) {
        this.cno = cno;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public String getCstType() {
        return cstType;
    }

    public void setCstType(String cstType) {
        this.cstType = cstType == null ? null : cstType.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getEnrollDate() {
        return enrollDate;
    }

    public void setEnrollDate(Date enrollDate) {
        this.enrollDate = enrollDate;
    }

    public String getCert() {
        return cert;
    }

    public void setCert(String cert) {
        this.cert = cert == null ? null : cert.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public String getInsurance() {
        return insurance;
    }

    public void setInsurance(String insurance) {
        this.insurance = insurance == null ? null : insurance.trim();
    }

    public String getComputor() {
        return computor;
    }

    public void setComputor(String computor) {
        this.computor = computor == null ? null : computor.trim();
    }

    public String getBoard() {
        return board;
    }

    public void setBoard(String board) {
        this.board = board == null ? null : board.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getWeichat() {
        return weichat;
    }

    public void setWeichat(String weichat) {
        this.weichat = weichat == null ? null : weichat.trim();
    }

    public String getIntroducer() {
        return introducer;
    }

    public void setIntroducer(String introducer) {
        this.introducer = introducer == null ? null : introducer.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

	@Override
	public String toString() {
		return "TUCustomer [cno=" + cno + ", cname=" + cname + ", cstType="
				+ cstType + ", age=" + age + ", birthday=" + birthday
				+ ", enrollDate=" + enrollDate + ", cert=" + cert + ", sex="
				+ sex + ", education=" + education + ", insurance=" + insurance
				+ ", computor=" + computor + ", board=" + board + ", phone="
				+ phone + ", weichat=" + weichat + ", introducer=" + introducer
				+ ", status=" + status + ", province=" + province + ", city="
				+ city + "]";
	}
}