package com.guoyasoft.bean.api.study;

import com.guoyasoft.bean.api.SelectOption;
import java.util.List;

public class SummaryInitBean {
  private List<SelectOption> groups;
  private List<SelectOption> students;
  private String classCode;
  private String currentDate;

  public List<SelectOption> getGroups() {
    return groups;
  }

  public String getCurrentDate() {
    return currentDate;
  }

  public void setCurrentDate(String currentDate) {
    this.currentDate = currentDate;
  }

  public void setGroups(List<SelectOption> groups) {
    this.groups = groups;
  }

  public List<SelectOption> getStudents() {
    return students;
  }

  public void setStudents(List<SelectOption> students) {
    this.students = students;
  }

  public String getClassCode() {
    return classCode;
  }

  public void setClassCode(String classCode) {
    this.classCode = classCode;
  }

  @Override
  public String toString() {
    return "SummaryInitBean{" +
        "groups=" + groups +
        ", students=" + students +
        ", classCode='" + classCode + '\'' +
        ", currentDate='" + currentDate + '\'' +
        '}';
  }
}
