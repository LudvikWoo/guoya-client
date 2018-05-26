package com.guoyasoft.bean.db.user;

import java.util.Date;

public class TUStudent {
    private Integer sno;

    private Integer psno;

    private Integer cno;

    private Integer uno;

    private Date createTime;

    private Date updateTime;

    private Integer status;

    private String operator;

    private Date activeTime;

    private Date deactiveTime;

    public Integer getSno() {
        return sno;
    }

    public void setSno(Integer sno) {
        this.sno = sno;
    }

    public Integer getPsno() {
        return psno;
    }

    public void setPsno(Integer psno) {
        this.psno = psno;
    }

    public Integer getCno() {
        return cno;
    }

    public void setCno(Integer cno) {
        this.cno = cno;
    }

    public Integer getUno() {
        return uno;
    }

    public void setUno(Integer uno) {
        this.uno = uno;
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

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
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