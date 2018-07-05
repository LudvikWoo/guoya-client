package com.guoyasoft.bean.api.interview.summary;

import java.util.Date;

public class User {
	private Integer userId;

	private String userUserName;

	private String userPwd;

	private Integer userStatus;

	private Date userCreateTime;

	private Date userUpdateTime;

	private String userOperateUno;

	private Date userActiveTime;

	private Date userDeactiveTime;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserUserName() {
		return userUserName;
	}

	public void setUserUserName(String userUserName) {
		this.userUserName = userUserName;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public Integer getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(Integer userStatus) {
		this.userStatus = userStatus;
	}

	public Date getUserCreateTime() {
		return userCreateTime;
	}

	public void setUserCreateTime(Date userCreateTime) {
		this.userCreateTime = userCreateTime;
	}

	public Date getUserUpdateTime() {
		return userUpdateTime;
	}

	public void setUserUpdateTime(Date userUpdateTime) {
		this.userUpdateTime = userUpdateTime;
	}

	public String getUserOperateUno() {
		return userOperateUno;
	}

	public void setUserOperateUno(String userOperateUno) {
		this.userOperateUno = userOperateUno;
	}

	public Date getUserActiveTime() {
		return userActiveTime;
	}

	public void setUserActiveTime(Date userActiveTime) {
		this.userActiveTime = userActiveTime;
	}

	public Date getUserDeactiveTime() {
		return userDeactiveTime;
	}

	public void setUserDeactiveTime(Date userDeactiveTime) {
		this.userDeactiveTime = userDeactiveTime;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userUserName=" + userUserName
				+ ", userPwd=" + userPwd + ", userStatus=" + userStatus
				+ ", userCreateTime=" + userCreateTime + ", userUpdateTime="
				+ userUpdateTime + ", userOperateUno=" + userOperateUno
				+ ", userActiveTime=" + userActiveTime + ", userDeactiveTime="
				+ userDeactiveTime + "]";
	}
	
}
