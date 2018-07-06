package com.guoyasoft.bean.db.interview;

import java.util.Date;

public class VInterviewSummary {
    private Integer customerId;

    private String customerName;

    private Integer customerAge;

    private Date customerBirthday;

    private String customerSex;

    private String customerSexDesc;

    private String customerProvince;

    private String customerCity;

    private String customerCert;

    private String customerCstType;

    private String customerCstTypeDesc;

    private String customerPhone;

    private String customerWeichat;

    private Integer customerStatus;

    private String customerStatusDesc;

    private Date customerCreateTime;

    private Date customerUpdateTime;

    private Integer studentId;

    private Date studentCreateTime;

    private Date studentUpdateTime;

    private Integer studentStatus;

    private String studentStatusDesc;

    private String studentOperator;

    private Date studentActiveTime;

    private Date studentDeactiveTime;

    private String studentEducation;

    private String studentEducationDesc;

    private String studentInsurance;

    private String studentInsuranceDesc;

    private String studentComputor;

    private String studentComputorDesc;

    private String studentBoard;

    private String studentBoardDesc;

    private Integer studentBuyEdu;

    private String studentBuyEduDesc;

    private Integer studentAdultEdu;

    private String studentAdultEduDesc;

    private String studentIntroducer;

    private String studentIntroducerName;

    private Date studentEnrollDate;

    private Integer studentStudentType;

    private String studentStudentTypeDesc;

    private Integer userId;

    private String userUserName;

    private String userPwd;

    private Integer userStatus;

    private String userStatusDesc;

    private Date userCreateTime;

    private Date userUpdateTime;

    private String userOperateUno;

    private Date userActiveTime;

    private Date userDeactiveTime;

    private Integer stu2ClassId;

    private Date stu2CreateTime;

    private Date stu2UpdateTime;

    private Integer stu2Status;

    private String stu2StatusDesc;

    private Integer classId;

    private String className;

    private Date classStartDate;

    private Date classGraduateDate;

    private Integer classTeacherId;

    private String classClassAbbreviation;

    private Integer teacherId;

    private String teacherStatus;

    private String teacherStatusDesc;

    private Date teacherCreateTime;

    private Date teacherUpdateTime;

    private String teacherOperator;

    private Integer teacherGrade;

    private String teacherGradeDesc;

    private Integer teacherType;

    private String teacherTypeDesc;

    private Integer scheduleId;

    private Date scheduleCreateTime;

    private Integer scheduleStatus;

    private String scheduleStatusDesc;

    private Date scheduleActiveTime;

    private Date scheduleDeactiveTime;

    private Integer courseInstanceId;

    private String courseInstanceName;

    private Integer courseTeacherMainId;

    private String courseTeacherMainName;

    private Integer courseStatus;

    private String courseStatusDesc;

    private Integer courseTeacherAsisId;

    private Date courseStartTime;

    private Date courseEndTime;

    private Integer courseLecturePkgId;

    private Integer courseTeacherId;

    private String courseTeacherName;

    private String courseTeacherStatus;

    private String courseTeacherStatusDesc;

    private Date courseTeacherCreateTime;

    private Date courseTeacherUpdateTime;

    private String courseTeacherOperator;

    private Integer courseTeacherGrade;

    private Integer courseTeacherType;

    private Integer courseTeacherTypeDesc;

    private Integer interviewId;

    private Date interviewCallTime;

    private Date interviewInterviewTime;

    private Date interviewWorkTime;

    private Integer interviewProgress;

    private Integer interviewResult;

    private String interviewResultDesc;

    private String interviewMark;

    private Integer interviewStatus;

    private String interviewStatusDesc;

    private Date interviewCreateTime;

    private Integer interviewIsOutsource;

    private Integer interviewCompanyId;

    private String interviewCompanyName;

    private String interviewCompanyAddr;

    private Integer interviewCompanyType;

    private String interviewCompanyDesc;

    private Date interviewCompanyCreateTime;

    private Integer interviewCompanyStatus;

    private String interviewCompanyStatusDesc;

    private String interviewCompanyAbbreviation;

    private Date interviewCompanyUpdateTime;

    private Integer interviewCompanyIsOutsource;

    private Integer hrId;

    private String hrName;

    private String hrWeichat;

    private String hrQq;

    private String hrMobilePhone;

    private String hrTelPhone;

    private String hrEmail;

    private Integer hrHrCompanyId;

    private Integer hrStatus;

    private String hrStatusDesc;

    private Date hrCreateTime;

    private Date hrUpdateTime;

    private Integer hrCompanyId;

    private String hrCompanyName;

    private String hrCompanyAddr;

    private Integer hrCompanyType;

    private String hrCompanyDesc;

    private Date hrCompanyCreateTime;

    private Integer hrCompanyStatus;

    private String hrCompanyStatusDesc;

    private String hrCompanyAbbreviation;

    private Date hrCompanyUpdateTime;

    private Integer hrCompanyIsOutsource;

    private Integer examId;

    private Date examCreateTime;

    private Integer examStatus;

    private String examStatusDesc;

    private Date examUpdateTime;

    private Integer askId;

    private Integer offerId;

    private Integer offerSalary;

    private Integer offerSalaryCount;

    private Integer offerIsGrossPay;

    private String offerIsGrossPayDesc;

    private Integer offerProbationaryPeriod;

    private Integer offerProbationaryDiscount;

    private Date offerTime;

    private Date offerWorkTime;

    private Date offerCreateTime;

    private Date offerUpdateTime;

    private Integer offerOperatorUserId;

    private Integer offerIsAccept;

    private String offerIsAcceptDesc;

    private Integer offerStatus;

    private String offerStatusDesc;

    private Integer jobId;

    private Integer resumeId;

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public Integer getCustomerAge() {
        return customerAge;
    }

    public void setCustomerAge(Integer customerAge) {
        this.customerAge = customerAge;
    }

    public Date getCustomerBirthday() {
        return customerBirthday;
    }

    public void setCustomerBirthday(Date customerBirthday) {
        this.customerBirthday = customerBirthday;
    }

    public String getCustomerSex() {
        return customerSex;
    }

    public void setCustomerSex(String customerSex) {
        this.customerSex = customerSex == null ? null : customerSex.trim();
    }

    public String getCustomerSexDesc() {
        return customerSexDesc;
    }

    public void setCustomerSexDesc(String customerSexDesc) {
        this.customerSexDesc = customerSexDesc == null ? null : customerSexDesc.trim();
    }

    public String getCustomerProvince() {
        return customerProvince;
    }

    public void setCustomerProvince(String customerProvince) {
        this.customerProvince = customerProvince == null ? null : customerProvince.trim();
    }

    public String getCustomerCity() {
        return customerCity;
    }

    public void setCustomerCity(String customerCity) {
        this.customerCity = customerCity == null ? null : customerCity.trim();
    }

    public String getCustomerCert() {
        return customerCert;
    }

    public void setCustomerCert(String customerCert) {
        this.customerCert = customerCert == null ? null : customerCert.trim();
    }

    public String getCustomerCstType() {
        return customerCstType;
    }

    public void setCustomerCstType(String customerCstType) {
        this.customerCstType = customerCstType == null ? null : customerCstType.trim();
    }

    public String getCustomerCstTypeDesc() {
        return customerCstTypeDesc;
    }

    public void setCustomerCstTypeDesc(String customerCstTypeDesc) {
        this.customerCstTypeDesc = customerCstTypeDesc == null ? null : customerCstTypeDesc.trim();
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone == null ? null : customerPhone.trim();
    }

    public String getCustomerWeichat() {
        return customerWeichat;
    }

    public void setCustomerWeichat(String customerWeichat) {
        this.customerWeichat = customerWeichat == null ? null : customerWeichat.trim();
    }

    public Integer getCustomerStatus() {
        return customerStatus;
    }

    public void setCustomerStatus(Integer customerStatus) {
        this.customerStatus = customerStatus;
    }

    public String getCustomerStatusDesc() {
        return customerStatusDesc;
    }

    public void setCustomerStatusDesc(String customerStatusDesc) {
        this.customerStatusDesc = customerStatusDesc == null ? null : customerStatusDesc.trim();
    }

    public Date getCustomerCreateTime() {
        return customerCreateTime;
    }

    public void setCustomerCreateTime(Date customerCreateTime) {
        this.customerCreateTime = customerCreateTime;
    }

    public Date getCustomerUpdateTime() {
        return customerUpdateTime;
    }

    public void setCustomerUpdateTime(Date customerUpdateTime) {
        this.customerUpdateTime = customerUpdateTime;
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

    public String getStudentStatusDesc() {
        return studentStatusDesc;
    }

    public void setStudentStatusDesc(String studentStatusDesc) {
        this.studentStatusDesc = studentStatusDesc == null ? null : studentStatusDesc.trim();
    }

    public String getStudentOperator() {
        return studentOperator;
    }

    public void setStudentOperator(String studentOperator) {
        this.studentOperator = studentOperator == null ? null : studentOperator.trim();
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
        this.studentEducation = studentEducation == null ? null : studentEducation.trim();
    }

    public String getStudentEducationDesc() {
        return studentEducationDesc;
    }

    public void setStudentEducationDesc(String studentEducationDesc) {
        this.studentEducationDesc = studentEducationDesc == null ? null : studentEducationDesc.trim();
    }

    public String getStudentInsurance() {
        return studentInsurance;
    }

    public void setStudentInsurance(String studentInsurance) {
        this.studentInsurance = studentInsurance == null ? null : studentInsurance.trim();
    }

    public String getStudentInsuranceDesc() {
        return studentInsuranceDesc;
    }

    public void setStudentInsuranceDesc(String studentInsuranceDesc) {
        this.studentInsuranceDesc = studentInsuranceDesc == null ? null : studentInsuranceDesc.trim();
    }

    public String getStudentComputor() {
        return studentComputor;
    }

    public void setStudentComputor(String studentComputor) {
        this.studentComputor = studentComputor == null ? null : studentComputor.trim();
    }

    public String getStudentComputorDesc() {
        return studentComputorDesc;
    }

    public void setStudentComputorDesc(String studentComputorDesc) {
        this.studentComputorDesc = studentComputorDesc == null ? null : studentComputorDesc.trim();
    }

    public String getStudentBoard() {
        return studentBoard;
    }

    public void setStudentBoard(String studentBoard) {
        this.studentBoard = studentBoard == null ? null : studentBoard.trim();
    }

    public String getStudentBoardDesc() {
        return studentBoardDesc;
    }

    public void setStudentBoardDesc(String studentBoardDesc) {
        this.studentBoardDesc = studentBoardDesc == null ? null : studentBoardDesc.trim();
    }

    public Integer getStudentBuyEdu() {
        return studentBuyEdu;
    }

    public void setStudentBuyEdu(Integer studentBuyEdu) {
        this.studentBuyEdu = studentBuyEdu;
    }

    public String getStudentBuyEduDesc() {
        return studentBuyEduDesc;
    }

    public void setStudentBuyEduDesc(String studentBuyEduDesc) {
        this.studentBuyEduDesc = studentBuyEduDesc == null ? null : studentBuyEduDesc.trim();
    }

    public Integer getStudentAdultEdu() {
        return studentAdultEdu;
    }

    public void setStudentAdultEdu(Integer studentAdultEdu) {
        this.studentAdultEdu = studentAdultEdu;
    }

    public String getStudentAdultEduDesc() {
        return studentAdultEduDesc;
    }

    public void setStudentAdultEduDesc(String studentAdultEduDesc) {
        this.studentAdultEduDesc = studentAdultEduDesc == null ? null : studentAdultEduDesc.trim();
    }

    public String getStudentIntroducer() {
        return studentIntroducer;
    }

    public void setStudentIntroducer(String studentIntroducer) {
        this.studentIntroducer = studentIntroducer == null ? null : studentIntroducer.trim();
    }

    public String getStudentIntroducerName() {
        return studentIntroducerName;
    }

    public void setStudentIntroducerName(String studentIntroducerName) {
        this.studentIntroducerName = studentIntroducerName == null ? null : studentIntroducerName.trim();
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

    public String getStudentStudentTypeDesc() {
        return studentStudentTypeDesc;
    }

    public void setStudentStudentTypeDesc(String studentStudentTypeDesc) {
        this.studentStudentTypeDesc = studentStudentTypeDesc == null ? null : studentStudentTypeDesc.trim();
    }

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
        this.userUserName = userUserName == null ? null : userUserName.trim();
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    public String getUserStatusDesc() {
        return userStatusDesc;
    }

    public void setUserStatusDesc(String userStatusDesc) {
        this.userStatusDesc = userStatusDesc == null ? null : userStatusDesc.trim();
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
        this.userOperateUno = userOperateUno == null ? null : userOperateUno.trim();
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

    public String getStu2StatusDesc() {
        return stu2StatusDesc;
    }

    public void setStu2StatusDesc(String stu2StatusDesc) {
        this.stu2StatusDesc = stu2StatusDesc == null ? null : stu2StatusDesc.trim();
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
        this.className = className == null ? null : className.trim();
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
        this.classClassAbbreviation = classClassAbbreviation == null ? null : classClassAbbreviation.trim();
    }

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
        this.teacherStatus = teacherStatus == null ? null : teacherStatus.trim();
    }

    public String getTeacherStatusDesc() {
        return teacherStatusDesc;
    }

    public void setTeacherStatusDesc(String teacherStatusDesc) {
        this.teacherStatusDesc = teacherStatusDesc == null ? null : teacherStatusDesc.trim();
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
        this.teacherOperator = teacherOperator == null ? null : teacherOperator.trim();
    }

    public Integer getTeacherGrade() {
        return teacherGrade;
    }

    public void setTeacherGrade(Integer teacherGrade) {
        this.teacherGrade = teacherGrade;
    }

    public String getTeacherGradeDesc() {
        return teacherGradeDesc;
    }

    public void setTeacherGradeDesc(String teacherGradeDesc) {
        this.teacherGradeDesc = teacherGradeDesc == null ? null : teacherGradeDesc.trim();
    }

    public Integer getTeacherType() {
        return teacherType;
    }

    public void setTeacherType(Integer teacherType) {
        this.teacherType = teacherType;
    }

    public String getTeacherTypeDesc() {
        return teacherTypeDesc;
    }

    public void setTeacherTypeDesc(String teacherTypeDesc) {
        this.teacherTypeDesc = teacherTypeDesc == null ? null : teacherTypeDesc.trim();
    }

    public Integer getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Integer scheduleId) {
        this.scheduleId = scheduleId;
    }

    public Date getScheduleCreateTime() {
        return scheduleCreateTime;
    }

    public void setScheduleCreateTime(Date scheduleCreateTime) {
        this.scheduleCreateTime = scheduleCreateTime;
    }

    public Integer getScheduleStatus() {
        return scheduleStatus;
    }

    public void setScheduleStatus(Integer scheduleStatus) {
        this.scheduleStatus = scheduleStatus;
    }

    public String getScheduleStatusDesc() {
        return scheduleStatusDesc;
    }

    public void setScheduleStatusDesc(String scheduleStatusDesc) {
        this.scheduleStatusDesc = scheduleStatusDesc == null ? null : scheduleStatusDesc.trim();
    }

    public Date getScheduleActiveTime() {
        return scheduleActiveTime;
    }

    public void setScheduleActiveTime(Date scheduleActiveTime) {
        this.scheduleActiveTime = scheduleActiveTime;
    }

    public Date getScheduleDeactiveTime() {
        return scheduleDeactiveTime;
    }

    public void setScheduleDeactiveTime(Date scheduleDeactiveTime) {
        this.scheduleDeactiveTime = scheduleDeactiveTime;
    }

    public Integer getCourseInstanceId() {
        return courseInstanceId;
    }

    public void setCourseInstanceId(Integer courseInstanceId) {
        this.courseInstanceId = courseInstanceId;
    }

    public String getCourseInstanceName() {
        return courseInstanceName;
    }

    public void setCourseInstanceName(String courseInstanceName) {
        this.courseInstanceName = courseInstanceName == null ? null : courseInstanceName.trim();
    }

    public Integer getCourseTeacherMainId() {
        return courseTeacherMainId;
    }

    public void setCourseTeacherMainId(Integer courseTeacherMainId) {
        this.courseTeacherMainId = courseTeacherMainId;
    }

    public String getCourseTeacherMainName() {
        return courseTeacherMainName;
    }

    public void setCourseTeacherMainName(String courseTeacherMainName) {
        this.courseTeacherMainName = courseTeacherMainName == null ? null : courseTeacherMainName.trim();
    }

    public Integer getCourseStatus() {
        return courseStatus;
    }

    public void setCourseStatus(Integer courseStatus) {
        this.courseStatus = courseStatus;
    }

    public String getCourseStatusDesc() {
        return courseStatusDesc;
    }

    public void setCourseStatusDesc(String courseStatusDesc) {
        this.courseStatusDesc = courseStatusDesc == null ? null : courseStatusDesc.trim();
    }

    public Integer getCourseTeacherAsisId() {
        return courseTeacherAsisId;
    }

    public void setCourseTeacherAsisId(Integer courseTeacherAsisId) {
        this.courseTeacherAsisId = courseTeacherAsisId;
    }

    public Date getCourseStartTime() {
        return courseStartTime;
    }

    public void setCourseStartTime(Date courseStartTime) {
        this.courseStartTime = courseStartTime;
    }

    public Date getCourseEndTime() {
        return courseEndTime;
    }

    public void setCourseEndTime(Date courseEndTime) {
        this.courseEndTime = courseEndTime;
    }

    public Integer getCourseLecturePkgId() {
        return courseLecturePkgId;
    }

    public void setCourseLecturePkgId(Integer courseLecturePkgId) {
        this.courseLecturePkgId = courseLecturePkgId;
    }

    public Integer getCourseTeacherId() {
        return courseTeacherId;
    }

    public void setCourseTeacherId(Integer courseTeacherId) {
        this.courseTeacherId = courseTeacherId;
    }

    public String getCourseTeacherName() {
        return courseTeacherName;
    }

    public void setCourseTeacherName(String courseTeacherName) {
        this.courseTeacherName = courseTeacherName == null ? null : courseTeacherName.trim();
    }

    public String getCourseTeacherStatus() {
        return courseTeacherStatus;
    }

    public void setCourseTeacherStatus(String courseTeacherStatus) {
        this.courseTeacherStatus = courseTeacherStatus == null ? null : courseTeacherStatus.trim();
    }

    public String getCourseTeacherStatusDesc() {
        return courseTeacherStatusDesc;
    }

    public void setCourseTeacherStatusDesc(String courseTeacherStatusDesc) {
        this.courseTeacherStatusDesc = courseTeacherStatusDesc == null ? null : courseTeacherStatusDesc.trim();
    }

    public Date getCourseTeacherCreateTime() {
        return courseTeacherCreateTime;
    }

    public void setCourseTeacherCreateTime(Date courseTeacherCreateTime) {
        this.courseTeacherCreateTime = courseTeacherCreateTime;
    }

    public Date getCourseTeacherUpdateTime() {
        return courseTeacherUpdateTime;
    }

    public void setCourseTeacherUpdateTime(Date courseTeacherUpdateTime) {
        this.courseTeacherUpdateTime = courseTeacherUpdateTime;
    }

    public String getCourseTeacherOperator() {
        return courseTeacherOperator;
    }

    public void setCourseTeacherOperator(String courseTeacherOperator) {
        this.courseTeacherOperator = courseTeacherOperator == null ? null : courseTeacherOperator.trim();
    }

    public Integer getCourseTeacherGrade() {
        return courseTeacherGrade;
    }

    public void setCourseTeacherGrade(Integer courseTeacherGrade) {
        this.courseTeacherGrade = courseTeacherGrade;
    }

    public Integer getCourseTeacherType() {
        return courseTeacherType;
    }

    public void setCourseTeacherType(Integer courseTeacherType) {
        this.courseTeacherType = courseTeacherType;
    }

    public Integer getCourseTeacherTypeDesc() {
        return courseTeacherTypeDesc;
    }

    public void setCourseTeacherTypeDesc(Integer courseTeacherTypeDesc) {
        this.courseTeacherTypeDesc = courseTeacherTypeDesc;
    }

    public Integer getInterviewId() {
        return interviewId;
    }

    public void setInterviewId(Integer interviewId) {
        this.interviewId = interviewId;
    }

    public Date getInterviewCallTime() {
        return interviewCallTime;
    }

    public void setInterviewCallTime(Date interviewCallTime) {
        this.interviewCallTime = interviewCallTime;
    }

    public Date getInterviewInterviewTime() {
        return interviewInterviewTime;
    }

    public void setInterviewInterviewTime(Date interviewInterviewTime) {
        this.interviewInterviewTime = interviewInterviewTime;
    }

    public Date getInterviewWorkTime() {
        return interviewWorkTime;
    }

    public void setInterviewWorkTime(Date interviewWorkTime) {
        this.interviewWorkTime = interviewWorkTime;
    }

    public Integer getInterviewProgress() {
        return interviewProgress;
    }

    public void setInterviewProgress(Integer interviewProgress) {
        this.interviewProgress = interviewProgress;
    }

    public Integer getInterviewResult() {
        return interviewResult;
    }

    public void setInterviewResult(Integer interviewResult) {
        this.interviewResult = interviewResult;
    }

    public String getInterviewResultDesc() {
        return interviewResultDesc;
    }

    public void setInterviewResultDesc(String interviewResultDesc) {
        this.interviewResultDesc = interviewResultDesc == null ? null : interviewResultDesc.trim();
    }

    public String getInterviewMark() {
        return interviewMark;
    }

    public void setInterviewMark(String interviewMark) {
        this.interviewMark = interviewMark == null ? null : interviewMark.trim();
    }

    public Integer getInterviewStatus() {
        return interviewStatus;
    }

    public void setInterviewStatus(Integer interviewStatus) {
        this.interviewStatus = interviewStatus;
    }

    public String getInterviewStatusDesc() {
        return interviewStatusDesc;
    }

    public void setInterviewStatusDesc(String interviewStatusDesc) {
        this.interviewStatusDesc = interviewStatusDesc == null ? null : interviewStatusDesc.trim();
    }

    public Date getInterviewCreateTime() {
        return interviewCreateTime;
    }

    public void setInterviewCreateTime(Date interviewCreateTime) {
        this.interviewCreateTime = interviewCreateTime;
    }

    public Integer getInterviewIsOutsource() {
        return interviewIsOutsource;
    }

    public void setInterviewIsOutsource(Integer interviewIsOutsource) {
        this.interviewIsOutsource = interviewIsOutsource;
    }

    public Integer getInterviewCompanyId() {
        return interviewCompanyId;
    }

    public void setInterviewCompanyId(Integer interviewCompanyId) {
        this.interviewCompanyId = interviewCompanyId;
    }

    public String getInterviewCompanyName() {
        return interviewCompanyName;
    }

    public void setInterviewCompanyName(String interviewCompanyName) {
        this.interviewCompanyName = interviewCompanyName == null ? null : interviewCompanyName.trim();
    }

    public String getInterviewCompanyAddr() {
        return interviewCompanyAddr;
    }

    public void setInterviewCompanyAddr(String interviewCompanyAddr) {
        this.interviewCompanyAddr = interviewCompanyAddr == null ? null : interviewCompanyAddr.trim();
    }

    public Integer getInterviewCompanyType() {
        return interviewCompanyType;
    }

    public void setInterviewCompanyType(Integer interviewCompanyType) {
        this.interviewCompanyType = interviewCompanyType;
    }

    public String getInterviewCompanyDesc() {
        return interviewCompanyDesc;
    }

    public void setInterviewCompanyDesc(String interviewCompanyDesc) {
        this.interviewCompanyDesc = interviewCompanyDesc == null ? null : interviewCompanyDesc.trim();
    }

    public Date getInterviewCompanyCreateTime() {
        return interviewCompanyCreateTime;
    }

    public void setInterviewCompanyCreateTime(Date interviewCompanyCreateTime) {
        this.interviewCompanyCreateTime = interviewCompanyCreateTime;
    }

    public Integer getInterviewCompanyStatus() {
        return interviewCompanyStatus;
    }

    public void setInterviewCompanyStatus(Integer interviewCompanyStatus) {
        this.interviewCompanyStatus = interviewCompanyStatus;
    }

    public String getInterviewCompanyStatusDesc() {
        return interviewCompanyStatusDesc;
    }

    public void setInterviewCompanyStatusDesc(String interviewCompanyStatusDesc) {
        this.interviewCompanyStatusDesc = interviewCompanyStatusDesc == null ? null : interviewCompanyStatusDesc.trim();
    }

    public String getInterviewCompanyAbbreviation() {
        return interviewCompanyAbbreviation;
    }

    public void setInterviewCompanyAbbreviation(String interviewCompanyAbbreviation) {
        this.interviewCompanyAbbreviation = interviewCompanyAbbreviation == null ? null : interviewCompanyAbbreviation.trim();
    }

    public Date getInterviewCompanyUpdateTime() {
        return interviewCompanyUpdateTime;
    }

    public void setInterviewCompanyUpdateTime(Date interviewCompanyUpdateTime) {
        this.interviewCompanyUpdateTime = interviewCompanyUpdateTime;
    }

    public Integer getInterviewCompanyIsOutsource() {
        return interviewCompanyIsOutsource;
    }

    public void setInterviewCompanyIsOutsource(Integer interviewCompanyIsOutsource) {
        this.interviewCompanyIsOutsource = interviewCompanyIsOutsource;
    }

    public Integer getHrId() {
        return hrId;
    }

    public void setHrId(Integer hrId) {
        this.hrId = hrId;
    }

    public String getHrName() {
        return hrName;
    }

    public void setHrName(String hrName) {
        this.hrName = hrName == null ? null : hrName.trim();
    }

    public String getHrWeichat() {
        return hrWeichat;
    }

    public void setHrWeichat(String hrWeichat) {
        this.hrWeichat = hrWeichat == null ? null : hrWeichat.trim();
    }

    public String getHrQq() {
        return hrQq;
    }

    public void setHrQq(String hrQq) {
        this.hrQq = hrQq == null ? null : hrQq.trim();
    }

    public String getHrMobilePhone() {
        return hrMobilePhone;
    }

    public void setHrMobilePhone(String hrMobilePhone) {
        this.hrMobilePhone = hrMobilePhone == null ? null : hrMobilePhone.trim();
    }

    public String getHrTelPhone() {
        return hrTelPhone;
    }

    public void setHrTelPhone(String hrTelPhone) {
        this.hrTelPhone = hrTelPhone == null ? null : hrTelPhone.trim();
    }

    public String getHrEmail() {
        return hrEmail;
    }

    public void setHrEmail(String hrEmail) {
        this.hrEmail = hrEmail == null ? null : hrEmail.trim();
    }

    public Integer getHrHrCompanyId() {
        return hrHrCompanyId;
    }

    public void setHrHrCompanyId(Integer hrHrCompanyId) {
        this.hrHrCompanyId = hrHrCompanyId;
    }

    public Integer getHrStatus() {
        return hrStatus;
    }

    public void setHrStatus(Integer hrStatus) {
        this.hrStatus = hrStatus;
    }

    public String getHrStatusDesc() {
        return hrStatusDesc;
    }

    public void setHrStatusDesc(String hrStatusDesc) {
        this.hrStatusDesc = hrStatusDesc == null ? null : hrStatusDesc.trim();
    }

    public Date getHrCreateTime() {
        return hrCreateTime;
    }

    public void setHrCreateTime(Date hrCreateTime) {
        this.hrCreateTime = hrCreateTime;
    }

    public Date getHrUpdateTime() {
        return hrUpdateTime;
    }

    public void setHrUpdateTime(Date hrUpdateTime) {
        this.hrUpdateTime = hrUpdateTime;
    }

    public Integer getHrCompanyId() {
        return hrCompanyId;
    }

    public void setHrCompanyId(Integer hrCompanyId) {
        this.hrCompanyId = hrCompanyId;
    }

    public String getHrCompanyName() {
        return hrCompanyName;
    }

    public void setHrCompanyName(String hrCompanyName) {
        this.hrCompanyName = hrCompanyName == null ? null : hrCompanyName.trim();
    }

    public String getHrCompanyAddr() {
        return hrCompanyAddr;
    }

    public void setHrCompanyAddr(String hrCompanyAddr) {
        this.hrCompanyAddr = hrCompanyAddr == null ? null : hrCompanyAddr.trim();
    }

    public Integer getHrCompanyType() {
        return hrCompanyType;
    }

    public void setHrCompanyType(Integer hrCompanyType) {
        this.hrCompanyType = hrCompanyType;
    }

    public String getHrCompanyDesc() {
        return hrCompanyDesc;
    }

    public void setHrCompanyDesc(String hrCompanyDesc) {
        this.hrCompanyDesc = hrCompanyDesc == null ? null : hrCompanyDesc.trim();
    }

    public Date getHrCompanyCreateTime() {
        return hrCompanyCreateTime;
    }

    public void setHrCompanyCreateTime(Date hrCompanyCreateTime) {
        this.hrCompanyCreateTime = hrCompanyCreateTime;
    }

    public Integer getHrCompanyStatus() {
        return hrCompanyStatus;
    }

    public void setHrCompanyStatus(Integer hrCompanyStatus) {
        this.hrCompanyStatus = hrCompanyStatus;
    }

    public String getHrCompanyStatusDesc() {
        return hrCompanyStatusDesc;
    }

    public void setHrCompanyStatusDesc(String hrCompanyStatusDesc) {
        this.hrCompanyStatusDesc = hrCompanyStatusDesc == null ? null : hrCompanyStatusDesc.trim();
    }

    public String getHrCompanyAbbreviation() {
        return hrCompanyAbbreviation;
    }

    public void setHrCompanyAbbreviation(String hrCompanyAbbreviation) {
        this.hrCompanyAbbreviation = hrCompanyAbbreviation == null ? null : hrCompanyAbbreviation.trim();
    }

    public Date getHrCompanyUpdateTime() {
        return hrCompanyUpdateTime;
    }

    public void setHrCompanyUpdateTime(Date hrCompanyUpdateTime) {
        this.hrCompanyUpdateTime = hrCompanyUpdateTime;
    }

    public Integer getHrCompanyIsOutsource() {
        return hrCompanyIsOutsource;
    }

    public void setHrCompanyIsOutsource(Integer hrCompanyIsOutsource) {
        this.hrCompanyIsOutsource = hrCompanyIsOutsource;
    }

    public Integer getExamId() {
        return examId;
    }

    public void setExamId(Integer examId) {
        this.examId = examId;
    }

    public Date getExamCreateTime() {
        return examCreateTime;
    }

    public void setExamCreateTime(Date examCreateTime) {
        this.examCreateTime = examCreateTime;
    }

    public Integer getExamStatus() {
        return examStatus;
    }

    public void setExamStatus(Integer examStatus) {
        this.examStatus = examStatus;
    }

    public String getExamStatusDesc() {
        return examStatusDesc;
    }

    public void setExamStatusDesc(String examStatusDesc) {
        this.examStatusDesc = examStatusDesc == null ? null : examStatusDesc.trim();
    }

    public Date getExamUpdateTime() {
        return examUpdateTime;
    }

    public void setExamUpdateTime(Date examUpdateTime) {
        this.examUpdateTime = examUpdateTime;
    }

    public Integer getAskId() {
        return askId;
    }

    public void setAskId(Integer askId) {
        this.askId = askId;
    }

    public Integer getOfferId() {
        return offerId;
    }

    public void setOfferId(Integer offerId) {
        this.offerId = offerId;
    }

    public Integer getOfferSalary() {
        return offerSalary;
    }

    public void setOfferSalary(Integer offerSalary) {
        this.offerSalary = offerSalary;
    }

    public Integer getOfferSalaryCount() {
        return offerSalaryCount;
    }

    public void setOfferSalaryCount(Integer offerSalaryCount) {
        this.offerSalaryCount = offerSalaryCount;
    }

    public Integer getOfferIsGrossPay() {
        return offerIsGrossPay;
    }

    public void setOfferIsGrossPay(Integer offerIsGrossPay) {
        this.offerIsGrossPay = offerIsGrossPay;
    }

    public String getOfferIsGrossPayDesc() {
        return offerIsGrossPayDesc;
    }

    public void setOfferIsGrossPayDesc(String offerIsGrossPayDesc) {
        this.offerIsGrossPayDesc = offerIsGrossPayDesc == null ? null : offerIsGrossPayDesc.trim();
    }

    public Integer getOfferProbationaryPeriod() {
        return offerProbationaryPeriod;
    }

    public void setOfferProbationaryPeriod(Integer offerProbationaryPeriod) {
        this.offerProbationaryPeriod = offerProbationaryPeriod;
    }

    public Integer getOfferProbationaryDiscount() {
        return offerProbationaryDiscount;
    }

    public void setOfferProbationaryDiscount(Integer offerProbationaryDiscount) {
        this.offerProbationaryDiscount = offerProbationaryDiscount;
    }

    public Date getOfferTime() {
        return offerTime;
    }

    public void setOfferTime(Date offerTime) {
        this.offerTime = offerTime;
    }

    public Date getOfferWorkTime() {
        return offerWorkTime;
    }

    public void setOfferWorkTime(Date offerWorkTime) {
        this.offerWorkTime = offerWorkTime;
    }

    public Date getOfferCreateTime() {
        return offerCreateTime;
    }

    public void setOfferCreateTime(Date offerCreateTime) {
        this.offerCreateTime = offerCreateTime;
    }

    public Date getOfferUpdateTime() {
        return offerUpdateTime;
    }

    public void setOfferUpdateTime(Date offerUpdateTime) {
        this.offerUpdateTime = offerUpdateTime;
    }

    public Integer getOfferOperatorUserId() {
        return offerOperatorUserId;
    }

    public void setOfferOperatorUserId(Integer offerOperatorUserId) {
        this.offerOperatorUserId = offerOperatorUserId;
    }

    public Integer getOfferIsAccept() {
        return offerIsAccept;
    }

    public void setOfferIsAccept(Integer offerIsAccept) {
        this.offerIsAccept = offerIsAccept;
    }

    public String getOfferIsAcceptDesc() {
        return offerIsAcceptDesc;
    }

    public void setOfferIsAcceptDesc(String offerIsAcceptDesc) {
        this.offerIsAcceptDesc = offerIsAcceptDesc == null ? null : offerIsAcceptDesc.trim();
    }

    public Integer getOfferStatus() {
        return offerStatus;
    }

    public void setOfferStatus(Integer offerStatus) {
        this.offerStatus = offerStatus;
    }

    public String getOfferStatusDesc() {
        return offerStatusDesc;
    }

    public void setOfferStatusDesc(String offerStatusDesc) {
        this.offerStatusDesc = offerStatusDesc == null ? null : offerStatusDesc.trim();
    }

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public Integer getResumeId() {
        return resumeId;
    }

    public void setResumeId(Integer resumeId) {
        this.resumeId = resumeId;
    }
}