package com.guoyasoft.bean.db.classes;

import java.util.Date;

public class TClassClass {
    private Integer classId;

    private String className;

    private Date startDate;

    private Date graduateDate;

    private Integer teacherId;

    private String classAbbreviation;

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getGraduateDate() {
        return graduateDate;
    }

    public void setGraduateDate(Date graduateDate) {
        this.graduateDate = graduateDate;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getClassAbbreviation() {
        return classAbbreviation;
    }

    public void setClassAbbreviation(String classAbbreviation) {
        this.classAbbreviation = classAbbreviation == null ? null : classAbbreviation.trim();
    }
}