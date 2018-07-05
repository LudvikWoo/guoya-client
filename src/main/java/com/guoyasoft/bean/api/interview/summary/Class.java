package com.guoyasoft.bean.api.interview.summary;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Class {
	private Teacher teacher;
	private List<Course> courses=new ArrayList<Course>();

	private Integer stu2ClassId;

	private Date stu2CreateTime;

	private Date stu2UpdateTime;

	private Integer stu2Status;

	private Integer classId;

	private String className;

	private Date classStartDate;

	private Date classGraduateDate;

	private Integer classTeacherId;

	private String classClassAbbreviation;

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public Integer getStu2ClassId() {
		return stu2ClassId;
	}

	public void setStu2ClassId(Integer stu2ClassId) {
		this.stu2ClassId = stu2ClassId;
	}

	public Date getStu2CreateTime() {
		return stu2CreateTime;
	}

	public void setStu2CreateTime(Date stu2CreateTime) {
		this.stu2CreateTime = stu2CreateTime;
	}

	public Date getStu2UpdateTime() {
		return stu2UpdateTime;
	}

	public void setStu2UpdateTime(Date stu2UpdateTime) {
		this.stu2UpdateTime = stu2UpdateTime;
	}

	public Integer getStu2Status() {
		return stu2Status;
	}

	public void setStu2Status(Integer stu2Status) {
		this.stu2Status = stu2Status;
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
		this.className = className;
	}

	public Date getClassStartDate() {
		return classStartDate;
	}

	public void setClassStartDate(Date classStartDate) {
		this.classStartDate = classStartDate;
	}

	public Date getClassGraduateDate() {
		return classGraduateDate;
	}

	public void setClassGraduateDate(Date classGraduateDate) {
		this.classGraduateDate = classGraduateDate;
	}

	public Integer getClassTeacherId() {
		return classTeacherId;
	}

	public void setClassTeacherId(Integer classTeacherId) {
		this.classTeacherId = classTeacherId;
	}

	public String getClassClassAbbreviation() {
		return classClassAbbreviation;
	}

	public void setClassClassAbbreviation(String classClassAbbreviation) {
		this.classClassAbbreviation = classClassAbbreviation;
	}

	@Override
	public String toString() {
		return "Class [teacher=" + teacher + ", courses=" + courses
				+ ", stu2ClassId=" + stu2ClassId + ", stu2CreateTime="
				+ stu2CreateTime + ", stu2UpdateTime=" + stu2UpdateTime
				+ ", stu2Status=" + stu2Status + ", classId=" + classId
				+ ", className=" + className + ", classStartDate="
				+ classStartDate + ", classGraduateDate=" + classGraduateDate
				+ ", classTeacherId=" + classTeacherId
				+ ", classClassAbbreviation=" + classClassAbbreviation + "]";
	}
}
