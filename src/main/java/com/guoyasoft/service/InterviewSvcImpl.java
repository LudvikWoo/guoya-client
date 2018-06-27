package com.guoyasoft.service;

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

import com.guoyasoft.bean.api.interview.examAnswer.Answer;
import com.guoyasoft.bean.api.interview.examAnswer.Exam;
import com.guoyasoft.bean.api.interview.examAnswer.Picture;
import com.guoyasoft.bean.db.interview.TInterviewExam;
import com.guoyasoft.bean.db.interview.TInterviewExamAnswer;
import com.guoyasoft.bean.db.interview.TInterviewExamExample;
import com.guoyasoft.bean.db.interview.TInterviewExamPicture;
import com.guoyasoft.bean.db.interview.TInterviewInterview;
import com.guoyasoft.bean.db.interview.VInterviewExamAnswer;
import com.guoyasoft.bean.db.interview.VInterviewExamAnswerExample;
import com.guoyasoft.dao.interview.TInterviewExamAnswerMapper;
import com.guoyasoft.dao.interview.TInterviewExamMapper;
import com.guoyasoft.dao.interview.TInterviewExamPictureMapper;
import com.guoyasoft.dao.interview.TInterviewInterviewMapper;
import com.guoyasoft.dao.interview.VInterviewExamAnswerMapper;

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
		criteria.andInterviewIdEqualTo(interviewId);
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
				Answer answer = new Answer();
				BeanUtils.copyProperties(a, answer);
				Picture picture = pictures.get(a.getPictureId() + "");
				if (picture == null) {
					picture = new Picture();
					picture.setPictureId(a.getPictureId());
					picture.setPicAddr(a.getPicAddr());
					pictures.put(a.getPictureId() + "", picture);
				}
				picture.getAnswers().add(answer);
			}
			
			Iterator<Entry<String, Picture>>  iterator=pictures.entrySet().iterator();
			while(iterator.hasNext()){
				Picture p=iterator.next().getValue();
				exam.getPictures().add(p);
			}

		}

		return exam;
	}

	@Override
	public int insertExamPicAnswer(Answer answer) {
		TInterviewExamAnswer record=new TInterviewExamAnswer();
		BeanUtils.copyProperties(answer, record);
		record.setCreateTime(new Date());
		record.setStatus(0);
		record.setPraiseCount(0);
		int count=answerTableMapper.insert(record);
		return count;
	}

}
