package com.guoyasoft.bean.api.study;

public class QueryLectureTaskBean {
	private int lectureId;
	private String lectureName;
	private String lectureSummary;	
	private int orderId;	
	private int taskPkgId;	
	private String taskPkgName;	
	private String summary;	
	private int itemId;	
	private String itemName;	
	private String itemDesc;
	private String itemMark;	
	private int classId;
	private int lessonId;
	
	
	
	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public int getLessonId() {
		return lessonId;
	}

	public void setLessonId(int lessonId) {
		this.lessonId = lessonId;
	}

	public int getClassId() {
		return classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
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

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getTaskPkgId() {
		return taskPkgId;
	}

	public void setTaskPkgId(int taskPkgId) {
		this.taskPkgId = taskPkgId;
	}

	public String getTaskPkgName() {
		return taskPkgName;
	}

	public void setTaskPkgName(String taskPkgName) {
		this.taskPkgName = taskPkgName;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemDesc() {
		return itemDesc;
	}

	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}

	public String getItemMark() {
		return itemMark;
	}

	public void setItemMark(String itemMark) {
		this.itemMark = itemMark;
	}

}
