package com.guoyasoft.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.databind.util.BeanUtil;
import com.guoyasoft.bean.api.customer.Customer;
import com.guoyasoft.bean.api.interview.summary.Ask;
import com.guoyasoft.bean.api.interview.summary.Exam;
import com.guoyasoft.bean.api.interview.summary.HR;
import com.guoyasoft.bean.api.interview.summary.HRCompany;
import com.guoyasoft.bean.api.interview.summary.Interview;
import com.guoyasoft.bean.api.interview.summary.InterviewCompany;
import com.guoyasoft.bean.api.interview.summary.Job;
import com.guoyasoft.bean.api.interview.summary.Offer;
import com.guoyasoft.bean.api.interview.summary.Resume;
import com.guoyasoft.bean.db.interview.VInterviewSummary;
import com.guoyasoft.bean.db.interview.VInterviewSummaryExample;
import com.guoyasoft.dao.interview.VInterviewSummaryMapper;

public class VInterviewSummarySvmImpl implements IVInterviewSummarySvc{
	@Autowired
	VInterviewSummaryMapper summaryMapper;
	
	public void queryInterviews(){
		VInterviewSummaryExample example=new VInterviewSummaryExample();
		List<VInterviewSummary> list=summaryMapper.selectByExample(example);
		List<Customer> customers=new ArrayList<Customer>();
		for(VInterviewSummary s:list){
			Exam exam=new Exam();
			BeanUtils.copyProperties(s, exam);
			Ask ask=new Ask();
			BeanUtils.copyProperties(s, ask);
			Job job=new Job();
			BeanUtils.copyProperties(s, job);
			Offer offer=new Offer();
			BeanUtils.copyProperties(s, offer);
			offer.setJob(job);
			InterviewCompany interviewCompany=new InterviewCompany();
			BeanUtils.copyProperties(s, interviewCompany);
			HRCompany hrCompany=new HRCompany();
			BeanUtils.copyProperties(s, hrCompany);
			HR hr=new HR();
			BeanUtils.copyProperties(s, hr);
			hr.setHrCompany(hrCompany);
			Resume resume=new Resume();
			BeanUtils.copyProperties(s, resume);
			 
			Interview interview=customers.get(1).getStudents().get(1).getClasses().get(1).getCourses().get(1).getInterviews().get(1);
		}
	}
}
