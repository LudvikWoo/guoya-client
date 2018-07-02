package com.guoyasoft.bean.db.interview;

import java.util.Date;

public class VCourseSchedule {
    private Integer scheduleId;

    private Integer scheduleStatus;

    private String scheduleStatusDesc;

    private Date scheduleCreateTime;

    private Date scheduleDeactiveTime;

    private Integer courseId;

    private Integer courseInstanceId;

    private String courseInstanceName;

    private Date courseStartTime;

    private Date courseEndTime;

    private Integer courseStatus;

    private String courseStatusDesc;

    private Integer classId;

    private String className;

    private String classAbbreviation;

    private Integer teacherId;

    private String teacherName;

    private Integer userId;

    private Integer studentId;

    private Integer customerId;

    private String customerName;

    private Date startDate;

    private Date graduateDate;

    private Integer classStatus;

    private String classStatusDesc;

    public Integer getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Integer scheduleId) {
        this.scheduleId = scheduleId;
    }

    public Integer getScheduleStatus() {
        return scheduleStatus;
    }

    public void setScheduleStatus(Integer scheduleStatus) {
        this.scheduleStatus = scheduleStatus;
    }

    public String getScheduleStatusDesc() {
        return scheduleStatusDesc;
    }

    public void setScheduleStatusDesc(String scheduleStatusDesc) {
        this.scheduleStatusDesc = scheduleStatusDesc == null ? null : scheduleStatusDesc.trim();
    }

    public Date getScheduleCreateTime() {
        return scheduleCreateTime;
    }

    public void setScheduleCreateTime(Date scheduleCreateTime) {
        this.scheduleCreateTime = scheduleCreateTime;
    }

    public Date getScheduleDeactiveTime() {
        return scheduleDeactiveTime;
    }

    public void setScheduleDeactiveTime(Date scheduleDeactiveTime) {
        this.scheduleDeactiveTime = scheduleDeactiveTime;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getCourseInstanceId() {
        return courseInstanceId;
    }

    public void setCourseInstanceId(Integer courseInstanceId) {
        this.courseInstanceId = courseInstanceId;
    }

    public String getCourseInstanceName() {
        return courseInstanceName;
    }

    public void setCourseInstanceName(String courseInstanceName) {
        this.courseInstanceName = courseInstanceName == null ? null : courseInstanceName.trim();
    }

    public Date getCourseStartTime() {
        return courseStartTime;
    }

    public void setCourseStartTime(Date courseStartTime) {
        this.courseStartTime = courseStartTime;
    }

    public Date getCourseEndTime() {
        return courseEndTime;
    }

    public void setCourseEndTime(Date courseEndTime) {
        this.courseEndTime = courseEndTime;
    }

    public Integer getCourseStatus() {
        return courseStatus;
    }

    public void setCourseStatus(Integer courseStatus) {
        this.courseStatus = courseStatus;
    }

    public String getCourseStatusDesc() {
        return courseStatusDesc;
    }

    public void setCourseStatusDesc(String courseStatusDesc) {
        this.courseStatusDesc = courseStatusDesc == null ? null : courseStatusDesc.trim();
    }

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

    public String getClassAbbreviation() {
        return classAbbreviation;
    }

    public void setClassAbbreviation(String classAbbreviation) {
        this.classAbbreviation = classAbbreviation == null ? null : classAbbreviation.trim();
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName == null ? null : teacherName.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
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

    public Integer getClassStatus() {
        return classStatus;
    }

    public void setClassStatus(Integer classStatus) {
        this.classStatus = classStatus;
    }

    public String getClassStatusDesc() {
        return classStatusDesc;
    }

    public void setClassStatusDesc(String classStatusDesc) {
        this.classStatusDesc = classStatusDesc == null ? null : classStatusDesc.trim();
    }
}