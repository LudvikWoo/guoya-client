package com.guoyasoft.bean.db.user;

import java.util.Date;

public class VUStudent {
    private Integer sno;

    private Integer psno;

    private String psnoDesc;

    private Integer cno;

    private String cnoDesc;

    private Integer uno;

    private Date createTime;

    private String createTimeDesc;

    private Date updateTime;

    private String updateTimeDesc;

    private Integer status;

    private String statusDesc;

    private String operator;

    private String operatorDesc;

    private Date activeTime;

    private String activeTimeDesc;

    private Date deactiveTime;

    private String deactiveTimeDesc;

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

    public String getPsnoDesc() {
        return psnoDesc;
    }

    public void setPsnoDesc(String psnoDesc) {
        this.psnoDesc = psnoDesc == null ? null : psnoDesc.trim();
    }

    public Integer getCno() {
        return cno;
    }

    public void setCno(Integer cno) {
        this.cno = cno;
    }

    public String getCnoDesc() {
        return cnoDesc;
    }

    public void setCnoDesc(String cnoDesc) {
        this.cnoDesc = cnoDesc == null ? null : cnoDesc.trim();
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

    public String getCreateTimeDesc() {
        return createTimeDesc;
    }

    public void setCreateTimeDesc(String createTimeDesc) {
        this.createTimeDesc = createTimeDesc == null ? null : createTimeDesc.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateTimeDesc() {
        return updateTimeDesc;
    }

    public void setUpdateTimeDesc(String updateTimeDesc) {
        this.updateTimeDesc = updateTimeDesc == null ? null : updateTimeDesc.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getStatusDesc() {
        return statusDesc;
    }

    public void setStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc == null ? null : statusDesc.trim();
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public String getOperatorDesc() {
        return operatorDesc;
    }

    public void setOperatorDesc(String operatorDesc) {
        this.operatorDesc = operatorDesc == null ? null : operatorDesc.trim();
    }

    public Date getActiveTime() {
        return activeTime;
    }

    public void setActiveTime(Date activeTime) {
        this.activeTime = activeTime;
    }

    public String getActiveTimeDesc() {
        return activeTimeDesc;
    }

    public void setActiveTimeDesc(String activeTimeDesc) {
        this.activeTimeDesc = activeTimeDesc == null ? null : activeTimeDesc.trim();
    }

    public Date getDeactiveTime() {
        return deactiveTime;
    }

    public void setDeactiveTime(Date deactiveTime) {
        this.deactiveTime = deactiveTime;
    }

    public String getDeactiveTimeDesc() {
        return deactiveTimeDesc;
    }

    public void setDeactiveTimeDesc(String deactiveTimeDesc) {
        this.deactiveTimeDesc = deactiveTimeDesc == null ? null : deactiveTimeDesc.trim();
    }
}