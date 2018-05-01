package com.guoyasoft.bean.db;

import java.util.Date;

public class GyInterview {
    private Integer ino;

    private String sno;

    private String company;

    private String companyType;

    private Date callTime;

    private Date interviewDate;

    private String interviewTime;

    private Date workTime;

    private String progress;

    private String result;

    private Integer expectSalary;

    private Integer realSalary;

    private String hrName;

    private String hrCompany;

    private String hrContactType;

    private String hrContact;

    private String hardTech;

    private String mark;

    private String audioAddr1;

    private String audioAddr2;

    private String audioAddr3;

    private String tno;

    public Integer getIno() {
        return ino;
    }

    public void setIno(Integer ino) {
        this.ino = ino;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno == null ? null : sno.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType == null ? null : companyType.trim();
    }

    public Date getCallTime() {
        return callTime;
    }

    public void setCallTime(Date callTime) {
        this.callTime = callTime;
    }

    public Date getInterviewDate() {
        return interviewDate;
    }

    public void setInterviewDate(Date interviewDate) {
        this.interviewDate = interviewDate;
    }

    public String getInterviewTime() {
        return interviewTime;
    }

    public void setInterviewTime(String interviewTime) {
        this.interviewTime = interviewTime == null ? null : interviewTime.trim();
    }

    public Date getWorkTime() {
        return workTime;
    }

    public void setWorkTime(Date workTime) {
        this.workTime = workTime;
    }

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress == null ? null : progress.trim();
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }

    public Integer getExpectSalary() {
        return expectSalary;
    }

    public void setExpectSalary(Integer expectSalary) {
        this.expectSalary = expectSalary;
    }

    public Integer getRealSalary() {
        return realSalary;
    }

    public void setRealSalary(Integer realSalary) {
        this.realSalary = realSalary;
    }

    public String getHrName() {
        return hrName;
    }

    public void setHrName(String hrName) {
        this.hrName = hrName == null ? null : hrName.trim();
    }

    public String getHrCompany() {
        return hrCompany;
    }

    public void setHrCompany(String hrCompany) {
        this.hrCompany = hrCompany == null ? null : hrCompany.trim();
    }

    public String getHrContactType() {
        return hrContactType;
    }

    public void setHrContactType(String hrContactType) {
        this.hrContactType = hrContactType == null ? null : hrContactType.trim();
    }

    public String getHrContact() {
        return hrContact;
    }

    public void setHrContact(String hrContact) {
        this.hrContact = hrContact == null ? null : hrContact.trim();
    }

    public String getHardTech() {
        return hardTech;
    }

    public void setHardTech(String hardTech) {
        this.hardTech = hardTech == null ? null : hardTech.trim();
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark == null ? null : mark.trim();
    }

    public String getAudioAddr1() {
        return audioAddr1;
    }

    public void setAudioAddr1(String audioAddr1) {
        this.audioAddr1 = audioAddr1 == null ? null : audioAddr1.trim();
    }

    public String getAudioAddr2() {
        return audioAddr2;
    }

    public void setAudioAddr2(String audioAddr2) {
        this.audioAddr2 = audioAddr2 == null ? null : audioAddr2.trim();
    }

    public String getAudioAddr3() {
        return audioAddr3;
    }

    public void setAudioAddr3(String audioAddr3) {
        this.audioAddr3 = audioAddr3 == null ? null : audioAddr3.trim();
    }

    public String getTno() {
        return tno;
    }

    public void setTno(String tno) {
        this.tno = tno == null ? null : tno.trim();
    }

	@Override
	public String toString() {
		return "GyInterview [ino=" + ino + ", sno=" + sno + ", company="
				+ company + ", companyType=" + companyType + ", callTime="
				+ callTime + ", interviewDate=" + interviewDate
				+ ", interviewTime=" + interviewTime + ", workTime=" + workTime
				+ ", progress=" + progress + ", result=" + result
				+ ", expectSalary=" + expectSalary + ", realSalary="
				+ realSalary + ", hrName=" + hrName + ", hrCompany="
				+ hrCompany + ", hrContactType=" + hrContactType
				+ ", hrContact=" + hrContact + ", hardTech=" + hardTech
				+ ", mark=" + mark + ", audioAddr1=" + audioAddr1
				+ ", audioAddr2=" + audioAddr2 + ", audioAddr3=" + audioAddr3
				+ ", tno=" + tno + "]";
	}
}