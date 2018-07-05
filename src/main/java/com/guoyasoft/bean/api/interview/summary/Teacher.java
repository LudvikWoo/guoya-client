package com.guoyasoft.bean.api.interview.summary;

import java.util.Date;

public class Teacher {
	 private Integer teacherId;

	    private String teacherStatus;

	    private Date teacherCreateTime;

	    private Date teacherUpdateTime;

	    private String teacherOperator;

	    private Integer teacherGrade;

	    private Integer teacherTeacherType;

		public Integer getTeacherId() {
			return teacherId;
		}

		public void setTeacherId(Integer teacherId) {
			this.teacherId = teacherId;
		}

		public String getTeacherStatus() {
			return teacherStatus;
		}

		public void setTeacherStatus(String teacherStatus) {
			this.teacherStatus = teacherStatus;
		}

		public Date getTeacherCreateTime() {
			return teacherCreateTime;
		}

		public void setTeacherCreateTime(Date teacherCreateTime) {
			this.teacherCreateTime = teacherCreateTime;
		}

		public Date getTeacherUpdateTime() {
			return teacherUpdateTime;
		}

		public void setTeacherUpdateTime(Date teacherUpdateTime) {
			this.teacherUpdateTime = teacherUpdateTime;
		}

		public String getTeacherOperator() {
			return teacherOperator;
		}

		public void setTeacherOperator(String teacherOperator) {
			this.teacherOperator = teacherOperator;
		}

		public Integer getTeacherGrade() {
			return teacherGrade;
		}

		public void setTeacherGrade(Integer teacherGrade) {
			this.teacherGrade = teacherGrade;
		}

		public Integer getTeacherTeacherType() {
			return teacherTeacherType;
		}

		public void setTeacherTeacherType(Integer teacherTeacherType) {
			this.teacherTeacherType = teacherTeacherType;
		}

		@Override
		public String toString() {
			return "Teacher [teacherId=" + teacherId + ", teacherStatus="
					+ teacherStatus + ", teacherCreateTime="
					+ teacherCreateTime + ", teacherUpdateTime="
					+ teacherUpdateTime + ", teacherOperator="
					+ teacherOperator + ", teacherGrade=" + teacherGrade
					+ ", teacherTeacherType=" + teacherTeacherType + "]";
		}
	    
	    
}
