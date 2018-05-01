package com.guoyasoft.bean.db;

import java.util.Date;

public class GyExam {
    private Integer eno;

    private String ino;

    private Date createTime;

    private String picNo;

    private String status;

    public Integer getEno() {
        return eno;
    }

    public void setEno(Integer eno) {
        this.eno = eno;
    }

    public String getIno() {
        return ino;
    }

    public void setIno(String ino) {
        this.ino = ino == null ? null : ino.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getPicNo() {
        return picNo;
    }

    public void setPicNo(String picNo) {
        this.picNo = picNo == null ? null : picNo.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}