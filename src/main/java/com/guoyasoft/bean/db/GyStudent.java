package com.guoyasoft.bean.db;

import java.util.Date;

public class GyStudent {
    private Integer sno;

    private String psno;

    private String uno;

    private Integer cno;

    private Integer uid;

    private Date createTime;

    private Date updateTime;

    private Integer status;

    public Integer getSno() {
        return sno;
    }

    public void setSno(Integer sno) {
        this.sno = sno;
    }

    public String getPsno() {
        return psno;
    }

    public void setPsno(String psno) {
        this.psno = psno == null ? null : psno.trim();
    }

    public String getUno() {
        return uno;
    }

    public void setUno(String uno) {
        this.uno = uno == null ? null : uno.trim();
    }

    public Integer getCno() {
        return cno;
    }

    public void setCno(Integer cno) {
        this.cno = cno;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}