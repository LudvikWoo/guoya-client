package com.guoyasoft.bean.api.interview;

public class SInterviewStatistic {
	private int customer_id;
	private String customer_name;
	private int student_education;
	private String student_education_desc;
	private int customer_age;
	private int student_id;
	private int user_id;
	private int class_id;
	private String class_name;
	private int course_instance_id;
	private String course_instance_name;
	private int course_teacher_main_id;
	private String course_teacher_main_name;
	private int interview_count;
	private int finish_count;
	private int pass_count;
	private int job_count;
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public int getStudent_education() {
		return student_education;
	}
	public void setStudent_education(int student_education) {
		this.student_education = student_education;
	}
	public String getStudent_education_desc() {
		return student_education_desc;
	}
	public void setStudent_education_desc(String student_education_desc) {
		this.student_education_desc = student_education_desc;
	}
	public int getCustomer_age() {
		return customer_age;
	}
	public void setCustomer_age(int customer_age) {
		this.customer_age = customer_age;
	}
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getClass_id() {
		return class_id;
	}
	public void setClass_id(int class_id) {
		this.class_id = class_id;
	}
	public String getClass_name() {
		return class_name;
	}
	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}
	public int getCourse_instance_id() {
		return course_instance_id;
	}
	public void setCourse_instance_id(int course_instance_id) {
		this.course_instance_id = course_instance_id;
	}
	public String getCourse_instance_name() {
		return course_instance_name;
	}
	public void setCourse_instance_name(String course_instance_name) {
		this.course_instance_name = course_instance_name;
	}
	public int getCourse_teacher_main_id() {
		return course_teacher_main_id;
	}
	public void setCourse_teacher_main_id(int course_teacher_main_id) {
		this.course_teacher_main_id = course_teacher_main_id;
	}
	public String getCourse_teacher_main_name() {
		return course_teacher_main_name;
	}
	public void setCourse_teacher_main_name(String course_teacher_main_name) {
		this.course_teacher_main_name = course_teacher_main_name;
	}
	public int getInterview_count() {
		return interview_count;
	}
	public void setInterview_count(int interview_count) {
		this.interview_count = interview_count;
	}
	public int getFinish_count() {
		return finish_count;
	}
	public void setFinish_count(int finish_count) {
		this.finish_count = finish_count;
	}
	public int getPass_count() {
		return pass_count;
	}
	public void setPass_count(int pass_count) {
		this.pass_count = pass_count;
	}
	public int getJob_count() {
		return job_count;
	}
	public void setJob_count(int job_count) {
		this.job_count = job_count;
	}
	@Override
	public String toString() {
		return "SInterviewStatistic [customer_id=" + customer_id
				+ ", customer_name=" + customer_name + ", student_education="
				+ student_education + ", student_education_desc="
				+ student_education_desc + ", customer_age=" + customer_age
				+ ", student_id=" + student_id + ", user_id=" + user_id
				+ ", class_id=" + class_id + ", class_name=" + class_name
				+ ", course_instance_id=" + course_instance_id
				+ ", course_instance_name=" + course_instance_name
				+ ", course_teacher_main_id=" + course_teacher_main_id
				+ ", course_teacher_main_name=" + course_teacher_main_name
				+ ", interview_count=" + interview_count + ", finish_count="
				+ finish_count + ", pass_count=" + pass_count + ", job_count="
				+ job_count + "]";
	}

}
