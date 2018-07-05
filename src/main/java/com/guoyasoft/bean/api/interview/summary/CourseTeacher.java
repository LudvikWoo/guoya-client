package com.guoyasoft.bean.api.interview.summary;

import java.util.Date;

public class CourseTeacher {
	private Integer courseTeacherId;

    private String courseTeacherStatus;

    private Date courseTeacherCreateTime;

    private Date courseTeacherUpdateTime;

    private String courseTeacherOperator;

    private Integer courseTeacherGrade;

    private Integer courseTeacherTeacherType;

	public Integer getCourseTeacherId() {
		return courseTeacherId;
	}

	public void setCourseTeacherId(Integer courseTeacherId) {
		this.courseTeacherId = courseTeacherId;
	}

	public String getCourseTeacherStatus() {
		return courseTeacherStatus;
	}

	public void setCourseTeacherStatus(String courseTeacherStatus) {
		this.courseTeacherStatus = courseTeacherStatus;
	}

	public Date getCourseTeacherCreateTime() {
		return courseTeacherCreateTime;
	}

	public void setCourseTeacherCreateTime(Date courseTeacherCreateTime) {
		this.courseTeacherCreateTime = courseTeacherCreateTime;
	}

	public Date getCourseTeacherUpdateTime() {
		return courseTeacherUpdateTime;
	}

	public void setCourseTeacherUpdateTime(Date courseTeacherUpdateTime) {
		this.courseTeacherUpdateTime = courseTeacherUpdateTime;
	}

	public String getCourseTeacherOperator() {
		return courseTeacherOperator;
	}

	public void setCourseTeacherOperator(String courseTeacherOperator) {
		this.courseTeacherOperator = courseTeacherOperator;
	}

	public Integer getCourseTeacherGrade() {
		return courseTeacherGrade;
	}

	public void setCourseTeacherGrade(Integer courseTeacherGrade) {
		this.courseTeacherGrade = courseTeacherGrade;
	}

	public Integer getCourseTeacherTeacherType() {
		return courseTeacherTeacherType;
	}

	public void setCourseTeacherTeacherType(Integer courseTeacherTeacherType) {
		this.courseTeacherTeacherType = courseTeacherTeacherType;
	}

	@Override
	public String toString() {
		return "CourseTeacher [courseTeacherId=" + courseTeacherId
				+ ", courseTeacherStatus=" + courseTeacherStatus
				+ ", courseTeacherCreateTime=" + courseTeacherCreateTime
				+ ", courseTeacherUpdateTime=" + courseTeacherUpdateTime
				+ ", courseTeacherOperator=" + courseTeacherOperator
				+ ", courseTeacherGrade=" + courseTeacherGrade
				+ ", courseTeacherTeacherType=" + courseTeacherTeacherType
				+ "]";
	}
    
}
