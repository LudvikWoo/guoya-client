package com.guoyasoft.service;

import java.util.List;

import com.guoyasoft.bean.api.interview.InterviewAddBean;
import com.guoyasoft.bean.api.interview.askAswer.AskBean;
import com.guoyasoft.bean.api.interview.askAswer.AskPubBean;
import com.guoyasoft.bean.api.interview.askAswer.AudioAnswer;
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

	public void insertExamAudio(AskBean ask, String s);

	public AskBean selectAskInfo(AskBean bean);

	public void insertAudioAnswer(AudioAnswer answer);

	public int deleteAudioAnswer(AudioAnswer answer);

	public int addInterviewAsk(TInterviewInterview newInterview,AskBean ask);
}
