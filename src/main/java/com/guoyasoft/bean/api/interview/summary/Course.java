package com.guoyasoft.bean.api.interview.summary;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Course {
	private CourseTeacher teacher;
	private List<Interview> interviews =new ArrayList<Interview>();
	
	private Integer scheduleId;

    private Date scheduleCreateTime;

    private Integer scheduleStatus;

    private Date scheduleActiveTime;

    private Date scheduleDeactiveTime;
    
    private Integer courseInstanceId;

    private String courseInstanceName;

    private Integer courseTeacherMainId;

    private Integer courseStatus;

    private Integer courseTeacherAsisId;

    private Date courseStartTime;

    private Date courseEndTime;

    private Integer courseLecturePkgId;

	public Integer getScheduleId() {
		return scheduleId;
	}

	public void setScheduleId(Integer scheduleId) {
		this.scheduleId = scheduleId;
	}

	public Date getScheduleCreateTime() {
		return scheduleCreateTime;
	}

	public void setScheduleCreateTime(Date scheduleCreateTime) {
		this.scheduleCreateTime = scheduleCreateTime;
	}

	public Integer getScheduleStatus() {
		return scheduleStatus;
	}

	public void setScheduleStatus(Integer scheduleStatus) {
		this.scheduleStatus = scheduleStatus;
	}

	public Date getScheduleActiveTime() {
		return scheduleActiveTime;
	}

	public void setScheduleActiveTime(Date scheduleActiveTime) {
		this.scheduleActiveTime = scheduleActiveTime;
	}

	public Date getScheduleDeactiveTime() {
		return scheduleDeactiveTime;
	}

	public void setScheduleDeactiveTime(Date scheduleDeactiveTime) {
		this.scheduleDeactiveTime = scheduleDeactiveTime;
	}
	
	public CourseTeacher getTeacher() {
		return teacher;
	}
	public void setTeacher(CourseTeacher teacher) {
		this.teacher = teacher;
	}
	public List<Interview> getInterviews() {
		return interviews;
	}
	public void setInterviews(List<Interview> interviews) {
		this.interviews = interviews;
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
		this.courseInstanceName = courseInstanceName;
	}

	public Integer getCourseTeacherMainId() {
		return courseTeacherMainId;
	}

	public void setCourseTeacherMainId(Integer courseTeacherMainId) {
		this.courseTeacherMainId = courseTeacherMainId;
	}

	public Integer getCourseStatus() {
		return courseStatus;
	}

	public void setCourseStatus(Integer courseStatus) {
		this.courseStatus = courseStatus;
	}

	public Integer getCourseTeacherAsisId() {
		return courseTeacherAsisId;
	}

	public void setCourseTeacherAsisId(Integer courseTeacherAsisId) {
		this.courseTeacherAsisId = courseTeacherAsisId;
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

	public Integer getCourseLecturePkgId() {
		return courseLecturePkgId;
	}

	public void setCourseLecturePkgId(Integer courseLecturePkgId) {
		this.courseLecturePkgId = courseLecturePkgId;
	}

	@Override
	public String toString() {
		return "Course [teacher=" + teacher + ", interviews=" + interviews
				+ ", scheduleId=" + scheduleId + ", scheduleCreateTime="
				+ scheduleCreateTime + ", scheduleStatus=" + scheduleStatus
				+ ", scheduleActiveTime=" + scheduleActiveTime
				+ ", scheduleDeactiveTime=" + scheduleDeactiveTime
				+ ", courseInstanceId=" + courseInstanceId
				+ ", courseInstanceName=" + courseInstanceName
				+ ", courseTeacherMainId=" + courseTeacherMainId
				+ ", courseStatus=" + courseStatus + ", courseTeacherAsisId="
				+ courseTeacherAsisId + ", courseStartTime=" + courseStartTime
				+ ", courseEndTime=" + courseEndTime + ", courseLecturePkgId="
				+ courseLecturePkgId + "]";
	}
	
}
