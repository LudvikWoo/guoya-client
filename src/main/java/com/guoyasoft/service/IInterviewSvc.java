package com.guoyasoft.service;

import com.guoyasoft.bean.api.interview.InterviewAddBean;
import com.guoyasoft.bean.api.interview.examAnswer.Answer;
import com.guoyasoft.bean.api.interview.examAnswer.Exam;
import com.guoyasoft.bean.db.interview.TInterviewInterview;
import com.guoyasoft.bean.db.interview.VCourseSchedule;

public interface IInterviewSvc {
	public int insertExamPic(String interviewId,String picAddr);

	public Exam queryExamAnswers(String interviewId);

	public int insertExamPicAnswer(Answer answer);

	public int updateExampStatus(String examId, int i);

	public int deletePicture(String pictureId, String interviewId);

	public int updatePicAnswer(Answer answer, String method);

	public TInterviewInterview addInterview(InterviewAddBean interview);

	public int addInterviewExam(TInterviewInterview newInterview);
}
