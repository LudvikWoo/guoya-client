package com.guoyasoft.bean.db.interview;

import java.util.Date;

public class TInterviewExamAnswer {
    private Integer answerId;

    private Integer pictureId;

    private Integer authorCstId;

    private Integer status;

    private Date createTime;

    private Integer praiseCount;

    private String subjectIndex;

    private String subjectDesc;

    private String answer;

    public Integer getAnswerId() {
        return answerId;
    }

    public void setAnswerId(Integer answerId) {
        this.answerId = answerId;
    }

    public Integer getPictureId() {
        return pictureId;
    }

    public void setPictureId(Integer pictureId) {
        this.pictureId = pictureId;
    }

    public Integer getAuthorCstId() {
        return authorCstId;
    }

    public void setAuthorCstId(Integer authorCstId) {
        this.authorCstId = authorCstId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getPraiseCount() {
        return praiseCount;
    }

    public void setPraiseCount(Integer praiseCount) {
        this.praiseCount = praiseCount;
    }

    public String getSubjectIndex() {
        return subjectIndex;
    }

    public void setSubjectIndex(String subjectIndex) {
        this.subjectIndex = subjectIndex == null ? null : subjectIndex.trim();
    }

    public String getSubjectDesc() {
        return subjectDesc;
    }

    public void setSubjectDesc(String subjectDesc) {
        this.subjectDesc = subjectDesc == null ? null : subjectDesc.trim();
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }
}