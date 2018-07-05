package com.guoyasoft.bean.api.interview.summary;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student {
	private User user;
	private List<Class> classes=new ArrayList<Class>();
	private Integer studentId;

	private Date studentCreateTime;

	private Date studentUpdateTime;

	private Integer studentStatus;

	private String studentOperator;

	private Date studentActiveTime;

	private Date studentDeactiveTime;

	private String studentEducation;

	private String studentInsurance;

	private String studentComputor;

	private String studentBoard;

	private Integer studentBuyEdu;

	private Integer studentAdultEdu;

	private String studentIntroducer;

	private Date studentEnrollDate;

	private Integer studentStudentType;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Class> getClasses() {
		return classes;
	}

	public void setClasses(List<Class> classes) {
		this.classes = classes;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public Date getStudentCreateTime() {
		return studentCreateTime;
	}

	public void setStudentCreateTime(Date studentCreateTime) {
		this.studentCreateTime = studentCreateTime;
	}

	public Date getStudentUpdateTime() {
		return studentUpdateTime;
	}

	public void setStudentUpdateTime(Date studentUpdateTime) {
		this.studentUpdateTime = studentUpdateTime;
	}

	public Integer getStudentStatus() {
		return studentStatus;
	}

	public void setStudentStatus(Integer studentStatus) {
		this.studentStatus = studentStatus;
	}

	public String getStudentOperator() {
		return studentOperator;
	}

	public void setStudentOperator(String studentOperator) {
		this.studentOperator = studentOperator;
	}

	public Date getStudentActiveTime() {
		return studentActiveTime;
	}

	public void setStudentActiveTime(Date studentActiveTime) {
		this.studentActiveTime = studentActiveTime;
	}

	public Date getStudentDeactiveTime() {
		return studentDeactiveTime;
	}

	public void setStudentDeactiveTime(Date studentDeactiveTime) {
		this.studentDeactiveTime = studentDeactiveTime;
	}

	public String getStudentEducation() {
		return studentEducation;
	}

	public void setStudentEducation(String studentEducation) {
		this.studentEducation = studentEducation;
	}

	public String getStudentInsurance() {
		return studentInsurance;
	}

	public void setStudentInsurance(String studentInsurance) {
		this.studentInsurance = studentInsurance;
	}

	public String getStudentComputor() {
		return studentComputor;
	}

	public void setStudentComputor(String studentComputor) {
		this.studentComputor = studentComputor;
	}

	public String getStudentBoard() {
		return studentBoard;
	}

	public void setStudentBoard(String studentBoard) {
		this.studentBoard = studentBoard;
	}

	public Integer getStudentBuyEdu() {
		return studentBuyEdu;
	}

	public void setStudentBuyEdu(Integer studentBuyEdu) {
		this.studentBuyEdu = studentBuyEdu;
	}

	public Integer getStudentAdultEdu() {
		return studentAdultEdu;
	}

	public void setStudentAdultEdu(Integer studentAdultEdu) {
		this.studentAdultEdu = studentAdultEdu;
	}

	public String getStudentIntroducer() {
		return studentIntroducer;
	}

	public void setStudentIntroducer(String studentIntroducer) {
		this.studentIntroducer = studentIntroducer;
	}

	public Date getStudentEnrollDate() {
		return studentEnrollDate;
	}

	public void setStudentEnrollDate(Date studentEnrollDate) {
		this.studentEnrollDate = studentEnrollDate;
	}

	public Integer getStudentStudentType() {
		return studentStudentType;
	}

	public void setStudentStudentType(Integer studentStudentType) {
		this.studentStudentType = studentStudentType;
	}

	@Override
	public String toString() {
		return "Student [user=" + user + ", classes=" + classes
				+ ", studentId=" + studentId + ", studentCreateTime="
				+ studentCreateTime + ", studentUpdateTime="
				+ studentUpdateTime + ", studentStatus=" + studentStatus
				+ ", studentOperator=" + studentOperator
				+ ", studentActiveTime=" + studentActiveTime
				+ ", studentDeactiveTime=" + studentDeactiveTime
				+ ", studentEducation=" + studentEducation
				+ ", studentInsurance=" + studentInsurance
				+ ", studentComputor=" + studentComputor + ", studentBoard="
				+ studentBoard + ", studentBuyEdu=" + studentBuyEdu
				+ ", studentAdultEdu=" + studentAdultEdu
				+ ", studentIntroducer=" + studentIntroducer
				+ ", studentEnrollDate=" + studentEnrollDate
				+ ", studentStudentType=" + studentStudentType + "]";
	}

}
