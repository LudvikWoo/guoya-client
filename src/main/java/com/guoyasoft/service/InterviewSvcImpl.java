package com.guoyasoft.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

import org.openqa.selenium.remote.BeanToJsonConverter;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guoyasoft.bean.api.interview.InterviewAddBean;
import com.guoyasoft.bean.api.interview.askAswer.AskBean;
import com.guoyasoft.bean.api.interview.askAswer.AskPubBean;
import com.guoyasoft.bean.api.interview.askAswer.AudioAnswer;
import com.guoyasoft.bean.api.interview.askAswer.AudioBean;
import com.guoyasoft.bean.api.interview.examAnswer.Answer;
import com.guoyasoft.bean.api.interview.examAnswer.Exam;
import com.guoyasoft.bean.api.interview.examAnswer.Picture;
import com.guoyasoft.bean.db.interview.TInterviewExam;
import com.guoyasoft.bean.db.interview.TInterviewExamAnswer;
import com.guoyasoft.bean.db.interview.TInterviewExamAnswerExample;
import com.guoyasoft.bean.db.interview.TInterviewExamExample;
import com.guoyasoft.bean.db.interview.TInterviewExamPicture;
import com.guoyasoft.bean.db.interview.TInterviewInterview;
import com.guoyasoft.bean.db.interview.TInterviewInterviewExample;
import com.guoyasoft.bean.db.interview.VCourseSchedule;
import com.guoyasoft.bean.db.interview.VInterviewExamAnswer;
import com.guoyasoft.bean.db.interview.VInterviewExamAnswerExample;
import com.guoyasoft.bean.db.user.TUserUser;
import com.guoyasoft.dao.interview.InterviewCommonMapper;
import com.guoyasoft.dao.interview.TInterviewExamAnswerMapper;
import com.guoyasoft.dao.interview.TInterviewExamMapper;
import com.guoyasoft.dao.interview.TInterviewExamPictureMapper;
import com.guoyasoft.dao.interview.TInterviewInterviewMapper;
import com.guoyasoft.dao.interview.VInterviewExamAnswerMapper;
import com.guoyasoft.tools.StringTools;

@Service("interviceSvc")
public class InterviewSvcImpl implements IInterviewSvc {
	@Autowired
	TInterviewInterviewMapper interviewMapper;

	@Autowired
	TInterviewExamMapper examMapper;

	@Autowired
	TInterviewExamPictureMapper pictureMapper;

	@Autowired
	VInterviewExamAnswerMapper answerMapper;

	@Autowired
	TInterviewExamAnswerMapper answerTableMapper;
	
	@Autowired
	InterviewCommonMapper commonMapper;

	@Override
	public int insertExamPic(String interviewId, String picAddr) {
		/*
		 * 如果没有笔试记录： 1. 更新面试表，hasExam字段设置为1（即有笔试） 2. 新增一条笔试记录
		 */

		TInterviewInterview interview = interviewMapper
				.selectByPrimaryKey(Integer.parseInt(interviewId));

		TInterviewExamExample example = new TInterviewExamExample();
		com.guoyasoft.bean.db.interview.TInterviewExamExample.Criteria criteria = example
				.createCriteria();
		criteria.andInterviewIdEqualTo(Integer.parseInt(interviewId));
		List<TInterviewExam> exams = examMapper.selectByExample(example);
		TInterviewExam exam = exams.get(0);
		if (interview.getHasExam() == 0) {
			interview.setHasExam(1);
			interviewMapper.updateByPrimaryKey(interview);
			// 更新笔试时间
			exam.setCreateTime(new Date());
			exam.setStatus(1);
			examMapper.updateByPrimaryKey(exam);
		}

		/*
		 * 新增照片记录
		 */
		TInterviewExamPicture picture = new TInterviewExamPicture();
		picture.setExamId(exam.getExamId());
		picture.setPicAddr(picAddr);
		picture.setStatus(0);
		picture.setCreateTime(new Date());
		int count = pictureMapper.insert(picture);
		return count;
	}

	@Override
	public Exam queryExamAnswers(String interviewId) {
		Exam exam = new Exam();
		VInterviewExamAnswerExample example = new VInterviewExamAnswerExample();
		com.guoyasoft.bean.db.interview.VInterviewExamAnswerExample.Criteria criteria = example
				.createCriteria();
		criteria.andInterviewIdEqualTo(Integer.parseInt(interviewId));
		List<VInterviewExamAnswer> list = answerMapper.selectByExample(example);
		/*
		 * 第一步：生成Exam信息
		 */
		if (list.size() > 0) {
			VInterviewExamAnswer item = list.get(0);
			BeanUtils.copyProperties(item, exam);

			/*
			 * 第二步：生成picture信息
			 */
			HashMap<String, Picture> pictures = new HashMap<String, Picture>();

			for (VInterviewExamAnswer a : list) {

				/*
				 * 第三步：生成answer信息
				 */
				if (a.getPictureId() != null
						&& !"".equals(a.getPictureId())
								&& !"null".equalsIgnoreCase(a.getPictureId()+"")) {
					Picture picture = pictures.get(a.getPictureId() + "");
					if (picture == null) {
						picture = new Picture();
						picture.setPictureId(a.getPictureId());
						picture.setPicAddr(a.getPicAddr());
						pictures.put(a.getPictureId() + "", picture);
					}
					if (a.getAnswerId() != null && !"".equals(a.getAnswerId())
							&& !"null".equalsIgnoreCase(a.getAnswerId() + "")) {
						Answer answer = new Answer();
						BeanUtils.copyProperties(a, answer);
						picture.getAnswers().add(answer);
					}
				}
			}
			if(pictures.size()==0){
				TInterviewInterview record=interviewMapper.selectByPrimaryKey(Integer.parseInt(interviewId));
				record.setHasExam(0);
				interviewMapper.updateByPrimaryKey(record);
			}
			Iterator<Entry<String, Picture>> iterator = pictures.entrySet()
					.iterator();
			while (iterator.hasNext()) {
				Picture p = iterator.next().getValue();
				exam.getPictures().add(p);
			}

		}

		return exam;
	}

	@Override
	public int insertExamPicAnswer(Answer answer) {
		TInterviewExamAnswer record = new TInterviewExamAnswer();
		BeanUtils.copyProperties(answer, record);
		record.setCreateTime(new Date());
		record.setStatus(0);
		record.setPraiseCount(0);
		int count = answerTableMapper.insert(record);
		return count;
	}

	@Override
	public int updateExampStatus(String examId, int i) {
		TInterviewExam record = examMapper.selectByPrimaryKey(Integer
				.parseInt(examId));
		record.setUpdateTime(new Date());
		record.setStatus(i);
		int count = examMapper.updateByPrimaryKey(record);
		return count;
	}

	@Override
	public int deletePicture(String pictureId, String interviewId) {
		TInterviewExamAnswerExample example = new TInterviewExamAnswerExample();
		example.createCriteria().andPictureIdEqualTo(
				Integer.parseInt(pictureId));
		int count = answerTableMapper.deleteByExample(example);
		count += pictureMapper.deleteByPrimaryKey(Integer.parseInt(pictureId));
		return count;
	}

	@Override
	public int updatePicAnswer(Answer answer, String method) {
		if("delete".equals(method)){
			answerTableMapper.deleteByPrimaryKey(answer.getAnswerId());
		}
		return 0;
	}

	@Override
	public TInterviewInterview addInterview(InterviewAddBean addBean) {
		//新增面试表
		TInterviewInterview interview=new TInterviewInterview();
		interview.setScheduleId(Integer.parseInt(addBean.getScheduleId()));
		SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd HH:mm");
		Date interviewTime=new Date();
		try {
			interviewTime = sf.parse(addBean.getInterviewDate()+" "+addBean.getInterviewTime());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Date createTime=new Date();
		interview.setCreateTime(createTime);
		interview.setStatus(0);
		interview.setInterviewTime(interviewTime);
		interview.setCallTime(new Date());
		interview.setProgress(0);
		interview.setResult(0);
		interview.setExpectSalary(0);
		interview.setRealSalary(0);
		interview.setSalaryCount(0);
		interview.setCompanyId(Integer.parseInt(addBean.getCompanyId()));
		interview.setHrId(Integer.parseInt(addBean.getHrId()));
		interview.setHasExam(0);
		interview.setIsOutsource(Integer.parseInt(addBean.getIsOutsource()));
		int iterviewId=interviewMapper.insert(interview);
		
		
		return interview;
	}

	@Override
	public int addInterviewExam(TInterviewInterview newInterview) {
		TInterviewInterviewExample example=new TInterviewInterviewExample();
		TInterviewInterviewExample.Criteria criteria=example.createCriteria();
		criteria.andScheduleIdEqualTo(newInterview.getScheduleId());
		criteria.andStatusEqualTo(0);
		/*criteria.andCreateTimeEqualTo(newInterview.getCreateTime());
		criteria.andInterviewTimeEqualTo(newInterview.getInterviewTime());*/
		criteria.andHrIdEqualTo(newInterview.getHrId());
		criteria.andCompanyIdEqualTo(newInterview.getCompanyId());
		List<TInterviewInterview> newInterviews=interviewMapper.selectByExample(example);
		int interviewId=0;
		if(newInterviews.size()>0){
			interviewId=newInterviews.get(0).getInterviewId();
		}
		System.out.println("面试ID="+interviewId);
		
		TInterviewExam exam=new TInterviewExam();
		exam.setCreateTime(newInterview.getCreateTime());
		exam.setInterviewId(interviewId);
		exam.setStatus(0);
		exam.setUpdateTime(new Date());
		int count=examMapper.insert(exam);
		return count;
	}

	@Override
	public void insertExamAudio(AskBean bean,String s) {
		Integer askId=commonMapper.selectInterviewAsk(bean.getInterview_id());
		if(askId == null || askId ==0){
			commonMapper.insertInterviewAsk(bean);
			askId=bean.getAsk_id();
		}
		System.out.println("askId="+askId);
		AudioBean audio=new AudioBean();
		audio.setAsk_id(askId);
		audio.setAudio_addr(s);
		audio.setCreate_time(new Date());
		audio.setUpdate_time(new Date());
		audio.setStatus(0);
		audio.setFile_type(0);
		audio.setAudio_name(s.substring(s.lastIndexOf("/")+1));
		if(s.contains(".png") || s.contains(".jpg") || s.contains("gif") || s.contains("jpeg")){
			audio.setFile_type(1);
		}
		audio.setOperate_user_id(bean.getOperate_user_id());
		commonMapper.insertInterviewAudio(audio);
		int audioId=audio.getAudio_id();
		System.out.println("audioId="+audioId);
	}

	@Override
	public AskBean selectAskInfo(AskBean bean) {
		AskBean ask=commonMapper.selectAskInfo(bean);
		List<AudioBean> audios=commonMapper.selectAudioInfos(ask);
		ask.setAudios(audios);
		for(AudioBean b:audios){
			List<AudioAnswer> audioAswers=commonMapper.selectAudioAswers(b);
			b.setAnswers(audioAswers);
		}
		return ask;
	}

	@Override
	public void insertAudioAnswer(AudioAnswer answer) {
		commonMapper.insertAudioAnswer(answer);
	}

	@Override
	public int deleteAudioAnswer(AudioAnswer answer) {
		commonMapper.deleteAudioAnswer(answer);
		return 0;
	}

	@Override
	public int addInterviewAsk(TInterviewInterview newInterview,AskBean ask) {
		TInterviewInterviewExample example=new TInterviewInterviewExample();
		TInterviewInterviewExample.Criteria criteria=example.createCriteria();
		criteria.andScheduleIdEqualTo(newInterview.getScheduleId());
		criteria.andStatusEqualTo(0);
		/*criteria.andCreateTimeEqualTo(newInterview.getCreateTime());
		criteria.andInterviewTimeEqualTo(newInterview.getInterviewTime());*/
		criteria.andHrIdEqualTo(newInterview.getHrId());
		criteria.andCompanyIdEqualTo(newInterview.getCompanyId());
		List<TInterviewInterview> newInterviews=interviewMapper.selectByExample(example);
		int interviewId=0;
		if(newInterviews.size()>0){
			interviewId=newInterviews.get(0).getInterviewId();
		}
		System.out.println("面试ID="+interviewId);
		ask.setInterview_id(interviewId);
		commonMapper.addAsk(ask);
		return 0;
	}

}
