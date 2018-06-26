package com.guoyasoft.controller.interview;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guoyasoft.bean.api.SelectOption;
import com.guoyasoft.bean.api.interview.InterviewQueryInitBean;
import com.guoyasoft.bean.api.interview.InterviewQueryParamBean;
import com.guoyasoft.bean.api.interview.InterviewQueryResultBean;
import com.guoyasoft.bean.db.interview.Vinterviewinterview;
import com.guoyasoft.bean.db.interview.VinterviewinterviewExample;
import com.guoyasoft.dao.interview.VinterviewinterviewMapper;

@Controller
@RequestMapping("interview")
public class InterviewController {
	
	@Autowired
	private VinterviewinterviewMapper mapper;
	
	@RequestMapping("initInterviewQuery.action")
	public String initInterviewQuery(HttpSession session){
		InterviewQueryInitBean init=new InterviewQueryInitBean();
		init.getClassSelect().add(new SelectOption("", "--请选择--",false));
		init.getClassSelect().add(new SelectOption("2", "测试基础班1805",true));
		init.getClassSelect().add(new SelectOption("9", "测试中级班1806",false));
		
		init.getProgressSelect().add(new SelectOption("", "--请选择--",false));
		init.getProgressSelect().add(new SelectOption("0", "未开始",false));
		init.getProgressSelect().add(new SelectOption("1", "面试中",false));
		init.getProgressSelect().add(new SelectOption("2", "等结果",false));
		init.getProgressSelect().add(new SelectOption("3", "结束",false));

		init.getResultSelect().add(new SelectOption("", "--请选择--",false));
		init.getResultSelect().add(new SelectOption("0", "待定",false));
		init.getResultSelect().add(new SelectOption("1", "未通过",false));
		init.getResultSelect().add(new SelectOption("2", "等offer",false));
		init.getResultSelect().add(new SelectOption("3", "拒绝offer",false));
		init.getResultSelect().add(new SelectOption("4", "入职",false));
		
		session.setAttribute("initObj", init);
		return "interview/queryInterview";
	}
	
	@RequestMapping(value="queryInterview.action")
	public String queryInterview(InterviewQueryParamBean params,HttpSession session){
		session.setAttribute("paramsObj", params);
		VinterviewinterviewExample example=new VinterviewinterviewExample();
		List<Vinterviewinterview> result=mapper.selectByExample(example);
		
		List<InterviewQueryResultBean> list=new ArrayList<InterviewQueryResultBean>(); 
		for(int i=0;i<result.size();i++){
			InterviewQueryResultBean bean=new InterviewQueryResultBean();
			Vinterviewinterview var=result.get(i);
			BeanUtils.copyProperties(var, bean);
		
			
//			bean.setCustomerId(var.getCustomerId());
//			bean.setCustomerName(var.getCustomerName());
//			bean.setClassId(var.getClassId());;
//			bean.setClassName(var.getClassName());
//			bean.setCompanyId(var.getCompanyId());
//			bean.setCompanyName(var.getCompanyName());
//			bean.setInterviewTime(var.getInterviewTime());
//			bean.setProgressDesc(var.getProgressDesc());
//			bean.setResultDesc(var.getResultDesc());
//			bean.setRealSalary(var.getRealSalary());
//			bean.setHasExamDesc(i%2==0?"有":"无");
			list.add(bean);
		}
		session.setAttribute("result", list);
		return "interview/interviewList";
	}
}
