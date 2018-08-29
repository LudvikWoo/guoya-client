package com.guoyasoft.controller.interview;

import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guoyasoft.bean.db.interview.TempInterviewInfo;
import com.guoyasoft.bean.db.interview.TempInterviewInfoExample;
import com.guoyasoft.bean.db.interview.TempInterviewProgress;
import com.guoyasoft.bean.db.interview.TempInterviewProgressExample;
import com.guoyasoft.bean.db.interview.TempInterviewInfo;
import com.guoyasoft.bean.db.interview.TempInterviewInfoExample;
import com.guoyasoft.dao.interview.TempInterviewProgressMapper;
import com.guoyasoft.dao.interview.TempInterviewInfoMapper;

@Controller
@RequestMapping("tempInterview")
public class TempInterviewController {
	@Autowired
	TempInterviewProgressMapper progressMapper;
	
	@Autowired
	TempInterviewInfoMapper infoMapper;
	
	@RequestMapping("queryProgress")
	public String queryProgress(HttpServletRequest request){
		TempInterviewProgressExample example=new TempInterviewProgressExample();
		List<TempInterviewProgress> list=progressMapper.selectByExample(example);
		System.out.println(list.size());
		request.setAttribute("list", list);
		return "interview/tempInterview/progressList";
	}
	
	@RequestMapping("initProgress.do")
	public String updateProgress(TempInterviewProgress bean,HttpServletRequest request){
		if(bean.getpNo() !=null && bean.getpNo()!=0){
			TempInterviewProgress var=progressMapper.selectByPrimaryKey(bean.getpNo());
			request.setAttribute("var", var);
		}
		return "interview/tempInterview/updateTempInterview";
	}
	
	@RequestMapping("addOrUpdateProgress.do")
	public String addOrUpdateProgress(TempInterviewProgress bean,HttpServletRequest request){
		TempInterviewProgress var=progressMapper.selectByPrimaryKey(bean.getpNo());
		if(var!=null && var.getpNo()!=0){
			int count=progressMapper.updateByPrimaryKey(bean);
			System.out.println("更新数量："+count);
		}else{
			int count=progressMapper.insert(bean);
			System.out.println("新增数量："+count);
		}
		
		String url=queryProgress(request);
		return url;
	}
	
	@RequestMapping("queryInterview.do")
	public String queryInterview(TempInterviewInfo bean,HttpServletRequest request){
		TempInterviewInfoExample example=new TempInterviewInfoExample();
		List<TempInterviewInfo> list=infoMapper.selectByExample(example);
		request.setAttribute("list", list);
		return "interview/tempInterview/interviewList";
	}
	
	@RequestMapping("initInterviewAddOrUpadte.do")
	public String interviewAddOrUpadte(TempInterviewInfo bean,HttpServletRequest request){
		if(bean.getInterviewId()!=null && bean.getInterviewId() !=0){
			TempInterviewInfo var=infoMapper.selectByPrimaryKey(bean.getInterviewId());
			SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd");
			request.setAttribute("interviewDate", sf.format(var.getInterviewDate()));
			sf=new SimpleDateFormat("HH:mm");
			request.setAttribute("interviewTime", sf.format(var.getInterviewTime()));
			request.setAttribute("var", var);
		}
		return "interview/tempInterview/interviewAddOrUpadte";
	}
}
