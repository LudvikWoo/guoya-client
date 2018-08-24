package com.guoyasoft.bean.api.study;

import java.util.Date;

public class QueryClassBean {
	private String className;
	private String teacherName;
	private Integer classId;
	private String classAbbreviation;
	private Date classStartDate;
	private Date graduateDate;
	private Integer teacherId;
	private Integer classStuCtn;
	
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public Integer getClassId() {
		return classId;
	}
	public void setClassId(Integer classId) {
		this.classId = classId;
	}
	public String getClassAbbreviation() {
		return classAbbreviation;
	}
	public void setClassAbbreviation(String classAbbreviation) {
		this.classAbbreviation = classAbbreviation;
	}
	public Date getClassStartDate() {
		return classStartDate;
	}
	public void setClassStartDate(Date classStartDate) {
		this.classStartDate = classStartDate;
	}
	public Date getGraduateDate() {
		return graduateDate;
	}
	public void setGraduateDate(Date graduateDate) {
		this.graduateDate = graduateDate;
	}
	public int getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(Integer teacherId) {
		this.teacherId = teacherId;
	}
	public int getClassStuCtn() {
		return classStuCtn;
	}
	public void setClassStuCtn(Integer classStuCtn) {
		this.classStuCtn = classStuCtn;
	}
	
	
}
