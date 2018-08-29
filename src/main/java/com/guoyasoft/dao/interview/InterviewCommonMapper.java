package com.guoyasoft.dao.interview;

import java.util.List;

import com.guoyasoft.bean.api.interview.askAswer.AskBean;
import com.guoyasoft.bean.api.interview.askAswer.AskPubBean;
import com.guoyasoft.bean.api.interview.askAswer.AudioAnswer;
import com.guoyasoft.bean.api.interview.askAswer.AudioBean;
import com.guoyasoft.bean.db.interview.TInterviewInterview;

public interface InterviewCommonMapper {

	Integer selectInterviewAsk(Integer interviewId);

	int insertInterviewAsk(AskBean bean);

	void insertInterviewAudio(AudioBean audio);

	AskBean selectAskInfo(AskBean bean);

	List<AudioBean> selectAudioInfos(AskBean ask);

	List<AudioAnswer> selectAudioAswers(AudioBean b);

	int insertAudioAnswer(AudioAnswer answer);

	int deleteAudioAnswer(AudioAnswer answer);

	void addAsk(AskBean bean);

}
