package com.guoyasoft.bean.db.user;

import java.util.Date;

public class TUserUser {
    private Integer userId;

    private Integer customerId;

    private String userName;

    private String pwd;

    private Integer status;

    private Date createTime;

    private Date updateTime;

    private String operateUno;

    private Date activeTime;

    private Date deactiveTime;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
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

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getOperateUno() {
        return operateUno;
    }

    public void setOperateUno(String operateUno) {
        this.operateUno = operateUno == null ? null : operateUno.trim();
    }

    public Date getActiveTime() {
        return activeTime;
    }

    public void setActiveTime(Date activeTime) {
        this.activeTime = activeTime;
    }

    public Date getDeactiveTime() {
        return deactiveTime;
    }

    public void setDeactiveTime(Date deactiveTime) {
        this.deactiveTime = deactiveTime;
    }
}