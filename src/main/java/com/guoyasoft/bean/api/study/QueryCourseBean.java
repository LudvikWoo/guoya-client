package com.guoyasoft.bean.api.study;

import java.util.Date;

public class QueryCourseBean {
	private int classId;
	private String className;
	private int courseInstanceId;
	private String courseInstanceName;
	private Date courseStartTime;
	private Date courseEndTime;
	private int teacherId;
	private String teacherName;
	private int lecturePkgId;
	private String lecturePkgName;
	
	public String getLecturePkgName() {
		return lecturePkgName;
	}
	public void setLecturePkgName(String lecturePkgName) {
		this.lecturePkgName = lecturePkgName;
	}
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public int getCourseInstanceId() {
		return courseInstanceId;
	}
	public void setCourseInstanceId(int courseInstanceId) {
		this.courseInstanceId = courseInstanceId;
	}
	public String getCourseInstanceName() {
		return courseInstanceName;
	}
	public void setCourseInstanceName(String courseInstanceName) {
		this.courseInstanceName = courseInstanceName;
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
	public int getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public int getLecturePkgId() {
		return lecturePkgId;
	}
	public void setLecturePkgId(int lecturePkgId) {
		this.lecturePkgId = lecturePkgId;
	}
	

	
	
}
