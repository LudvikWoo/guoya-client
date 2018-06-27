package com.guoyasoft.service;

import com.guoyasoft.bean.api.interview.examAnswer.Answer;
import com.guoyasoft.bean.api.interview.examAnswer.Exam;

public interface IInterviewSvc {
	public int insertExamPic(String interviewId,String picAddr);

	public Exam queryExamAnswers(String interviewId);

	public int insertExamPicAnswer(Answer answer);
}
