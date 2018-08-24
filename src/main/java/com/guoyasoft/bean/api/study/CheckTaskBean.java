package com.guoyasoft.bean.api.study;

public class CheckTaskBean {
	/*
	 * 请求数据
	 */
	private int lessonId;
	private int taskPkgId;
	
	private int picturesId;
	private String pictureUrl;
	
	private String uploadPicDate;
//	private int groupId;
	private int tutorId;
//	private int checkId;
	
	private int optType;
	
	/*
	 * 响应数据
	 */
	private int customerId;
	private String customerName;
	private int studentId;
	private int pictureId;
	private String pictureAddr;
//	private int lessonId;
	private int attendId;
	private int checkId;
	private int checkStatus;
	private String netUrl;
	private int groupId;
	private int seatId;
	private int taskCheckStatus;
	
	
	public int getTaskCheckStatus() {
		return taskCheckStatus;
	}
	public void setTaskCheckStatus(int taskCheckStatus) {
		this.taskCheckStatus = taskCheckStatus;
	}
	public int getOptType() {
		return optType;
	}
	public void setOptType(int optType) {
		this.optType = optType;
	}
	public int getPictureId() {
		return pictureId;
	}
	public void setPictureId(int pictureId) {
		this.pictureId = pictureId;
	}
	public String getUploadPicDate() {
		return uploadPicDate;
	}
	public void setUploadPicDate(String uploadPicDate) {
		this.uploadPicDate = uploadPicDate;
	}
	public int getTutorId() {
		return tutorId;
	}
	public void setTutorId(int tutorId) {
		this.tutorId = tutorId;
	}
	public int getLessonId() {
		return lessonId;
	}
	public void setLessonId(int lessonId) {
		this.lessonId = lessonId;
	}
	public int getTaskPkgId() {
		return taskPkgId;
	}
	public void setTaskPkgId(int taskPkgId) {
		this.taskPkgId = taskPkgId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getPictureAddr() {
		return pictureAddr;
	}
	public void setPictureAddr(String pictureAddr) {
		this.pictureAddr = pictureAddr;
	}
	public int getAttendId() {
		return attendId;
	}
	public void setAttendId(int attendId) {
		this.attendId = attendId;
	}
	public int getCheckId() {
		return checkId;
	}
	public void setCheckId(int checkId) {
		this.checkId = checkId;
	}
	public int getCheckStatus() {
		return checkStatus;
	}
	public void setCheckStatus(int checkStatus) {
		this.checkStatus = checkStatus;
	}
	public String getNetUrl() {
		return netUrl;
	}
	public void setNetUrl(String netUrl) {
		this.netUrl = netUrl;
	}
	public int getGroupId() {
		return groupId;
	}
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
	public int getSeatId() {
		return seatId;
	}
	public void setSeatId(int seatId) {
		this.seatId = seatId;
	}
	public int getPicturesId() {
		return picturesId;
	}
	public void setPicturesId(int picturesId) {
		this.picturesId = picturesId;
	}
	public String getPictureUrl() {
		return pictureUrl;
	}
	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}
	
}
