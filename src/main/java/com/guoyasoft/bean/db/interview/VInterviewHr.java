package com.guoyasoft.bean.db.interview;

import java.util.Date;

public class VInterviewHr {
    private Integer hrId;

    private String hrName;

    private String mobilePhone;

    private String telPhone;

    private String weichat;

    private String qq;

    private String email;

    private Date createTime;

    private Date updateTime;

    private Integer hrStatus;

    private String hrStatusDesc;

    private Integer companyId;

    private String companyName;

    private String companyNameAbbreviation;

    private String companyDesc;

    private String addr;

    private Integer companyStatus;

    private String companyStatusDesc;

    private Integer isOutsource;

    private String isOutsourceDesc;

    public Integer getHrId() {
        return hrId;
    }

    public void setHrId(Integer hrId) {
        this.hrId = hrId;
    }

    public String getHrName() {
        return hrName;
    }

    public void setHrName(String hrName) {
        this.hrName = hrName == null ? null : hrName.trim();
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone == null ? null : mobilePhone.trim();
    }

    public String getTelPhone() {
        return telPhone;
    }

    public void setTelPhone(String telPhone) {
        this.telPhone = telPhone == null ? null : telPhone.trim();
    }

    public String getWeichat() {
        return weichat;
    }

    public void setWeichat(String weichat) {
        this.weichat = weichat == null ? null : weichat.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
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

    public Integer getHrStatus() {
        return hrStatus;
    }

    public void setHrStatus(Integer hrStatus) {
        this.hrStatus = hrStatus;
    }

    public String getHrStatusDesc() {
        return hrStatusDesc;
    }

    public void setHrStatusDesc(String hrStatusDesc) {
        this.hrStatusDesc = hrStatusDesc == null ? null : hrStatusDesc.trim();
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

    public String getCompanyDesc() {
        return companyDesc;
    }

    public void setCompanyDesc(String companyDesc) {
        this.companyDesc = companyDesc == null ? null : companyDesc.trim();
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
    }

    public Integer getCompanyStatus() {
        return companyStatus;
    }

    public void setCompanyStatus(Integer companyStatus) {
        this.companyStatus = companyStatus;
    }

    public String getCompanyStatusDesc() {
        return companyStatusDesc;
    }

    public void setCompanyStatusDesc(String companyStatusDesc) {
        this.companyStatusDesc = companyStatusDesc == null ? null : companyStatusDesc.trim();
    }

    public Integer getIsOutsource() {
        return isOutsource;
    }

    public void setIsOutsource(Integer isOutsource) {
        this.isOutsource = isOutsource;
    }

    public String getIsOutsourceDesc() {
        return isOutsourceDesc;
    }

    public void setIsOutsourceDesc(String isOutsourceDesc) {
        this.isOutsourceDesc = isOutsourceDesc == null ? null : isOutsourceDesc.trim();
    }
}