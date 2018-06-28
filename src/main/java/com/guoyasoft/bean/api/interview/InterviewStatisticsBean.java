package com.guoyasoft.bean.api.interview;

import java.util.HashSet;
import java.util.Set;

public class InterviewStatisticsBean {
	private int interviewCtn;
	private int studentCtn;
	private int completeCtn;
	private int unCompleteCtn;
	private int passStu;
	private int unpassStu;
	private int passInterviewCtn;
	private int unpassInterviewCtn;
	private int giveUpInterviewCtn;
	
	private Set<String> studentSet=new HashSet<String>();

	private Set<String> passStuSet=new HashSet<String>();

	private Set<String> unpassStuSet=new HashSet<String>();

	public int getInterviewCtn() {
		return interviewCtn;
	}

	public void setInterviewCtn(int interviewCtn) {
		this.interviewCtn = interviewCtn;
	}

	public int getStudentCtn() {
		return studentSet.size();
	}

	public void setStudentCtn(int studentCtn) {
		this.studentCtn = studentCtn;
	}

	public int getCompleteCtn() {
		return completeCtn;
	}

	public void setCompleteCtn(int completeCtn) {
		this.completeCtn = completeCtn;
	}

	public int getUnCompleteCtn() {
		return unCompleteCtn;
	}

	public void setUnCompleteCtn(int unCompleteCtn) {
		this.unCompleteCtn = unCompleteCtn;
	}

	public int getPassStu() {
		return passStuSet.size();
	}

	public void setPassStu(int passStu) {
		this.passStu = passStu;
	}

	public int getUnpassStu() {
		return unpassStuSet.size();
	}

	public void setUnpassStu(int unpassStu) {
		this.unpassStu = unpassStu;
	}

	public int getPassInterviewCtn() {
		return passInterviewCtn;
	}

	public void setPassInterviewCtn(int passInterviewCtn) {
		this.passInterviewCtn = passInterviewCtn;
	}

	public int getUnpassInterviewCtn() {
		return unpassInterviewCtn;
	}

	public void setUnpassInterviewCtn(int unpassInterviewCtn) {
		this.unpassInterviewCtn = unpassInterviewCtn;
	}

	public Set<String> getStudentSet() {
		return studentSet;
	}

	public void setStudentSet(Set<String> studentSet) {
		this.studentSet = studentSet;
	}

	public Set<String> getPassStuSet() {
		return passStuSet;
	}

	public void setPassStuSet(Set<String> passStuSet) {
		this.passStuSet = passStuSet;
	}

	public Set<String> getUnpassStuSet() {
		return unpassStuSet;
	}

	public void setUnpassStuSet(Set<String> unpassStuSet) {
		this.unpassStuSet = unpassStuSet;
	}

	public int getGiveUpInterviewCtn() {
		return giveUpInterviewCtn;
	}

	public void setGiveUpInterviewCtn(int giveUpInterviewCtn) {
		this.giveUpInterviewCtn = giveUpInterviewCtn;
	}
	
	
	
}
