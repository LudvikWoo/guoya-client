package com.guoyasoft.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guoyasoft.bean.api.interview.add.AddInterview;
import com.guoyasoft.bean.db.GyInterview;
import com.guoyasoft.dao.GyInterviewMapper;
import com.guoyasoft.tools.StringTools;

@Controller
@RequestMapping(value="interview")
public class InterviewController {
	
	@Autowired
	GyInterviewMapper mapper;
	
	@RequestMapping(value="add.action")
	public String add() throws ParseException{
//	public String add(AddInterview interview) throws ParseException{
		
//		System.out.println(interview.toString());
//		boolean isValide=interview.isValid();	
//		System.out.println("数据校验结果："+isValide);
//		
//		GyInterview record=new GyInterview();
//		BeanUtils.copyProperties(interview, record);  
//		
//		SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd");
//		if(StringTools.isBlank(interview.getCallTime())){
//			record.setCallTime(sf.parse(interview.getCallTime()));
//		}
//		if(StringTools.isBlank(interview.getInterviewDate())){
//			record.setInterviewDate(sf.parse(interview.getInterviewDate()));
//		}
//		if(StringTools.isBlank(interview.getWorkTime())){
//			record.setWorkTime(sf.parse(interview.getWorkTime()));
//		}
//		if(StringTools.isBlank(interview.getExpectSalary())){
//			record.setExpectSalary(Integer.parseInt(interview.getExpectSalary()));
//		}
//		if(StringTools.isBlank(interview.getRealSalary())){
//			record.setRealSalary(Integer.parseInt(interview.getRealSalary()));
//		}
//		
//		System.out.println(record.toString());
//		
//		mapper.insert(record);
		
		return "interview/query";
	}
	
	@RequestMapping(value="query.action")
	public String query(com.guoyasoft.bean.api.interview.query.request.AddInterview bean){
		System.out.println(bean.toString());
		boolean check=bean.isValid();
		
		//业务代码
		
		
		return "interview/list";
	}
	
	@RequestMapping(value="update.action")
	public String update(){
		return "interview/update";
	}
}
