package com.guoyasoft.bean.api.study;

import java.util.Date;

public class QueryLecturePkgBean {
	private int lecturePkgId;
	private int lectureId;
	private String lectureName;
	private String lectureSummary;	
	private Date lessonStartTime;	
	private Date lessonEndTime;
	private int classId;
	
	
	public int getClassId() {
		return classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}

	public int getLecturePkgId() {
		return lecturePkgId;
	}

	public void setLecturePkgId(int lecturePkgId) {
		this.lecturePkgId = lecturePkgId;
	}

	public int getLectureId() {
		return lectureId;
	}

	public void setLectureId(int lectureId) {
		this.lectureId = lectureId;
	}

	public String getLectureName() {
		return lectureName;
	}

	public void setLectureName(String lectureName) {
		this.lectureName = lectureName;
	}

	public String getLectureSummary() {
		return lectureSummary;
	}

	public void setLectureSummary(String lectureSummary) {
		this.lectureSummary = lectureSummary;
	}

	public Date getLessonStartTime() {
		return lessonStartTime;
	}

	public void setLessonStartTime(Date lessonStartTime) {
		this.lessonStartTime = lessonStartTime;
	}

	public Date getLessonEndTime() {
		return lessonEndTime;
	}

	public void setLessonEndTime(Date lessonEndTime) {
		this.lessonEndTime = lessonEndTime;
	}

}
