package com.guoyasoft.bean.db;

import java.util.Date;

public class GyUser {
    private Integer uid;

    private Integer cno;

    private String userName;

    private String pwd;

    private Integer status;

    private Date createTime;

    private Date updateTime;

    private String operateUno;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getCno() {
        return cno;
    }

    public void setCno(Integer cno) {
        this.cno = cno;
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
}