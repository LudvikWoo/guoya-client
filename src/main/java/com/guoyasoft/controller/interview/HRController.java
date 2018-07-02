package com.guoyasoft.controller.interview;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guoyasoft.bean.db.interview.TInterviewHr;
import com.guoyasoft.bean.db.interview.VInterviewHr;
import com.guoyasoft.bean.db.interview.VInterviewHrExample;
import com.guoyasoft.dao.interview.TInterviewHrMapper;
import com.guoyasoft.dao.interview.VInterviewHrMapper;
import com.guoyasoft.tools.StringTools;

@Controller
@RequestMapping("hr")
public class HRController {
	
	@Autowired
	VInterviewHrMapper vHrMapper;
	
	@Autowired
	TInterviewHrMapper tHrMapper;

	@RequestMapping("selectHR.action")
	public String selectHR(VInterviewHr vInterviewHr,HttpSession session){
		VInterviewHrExample example=new VInterviewHrExample();
		VInterviewHrExample.Criteria criteria=example.createCriteria();
		if(StringTools.isNotBlank(vInterviewHr.getCompanyName())){
			criteria.andCompanyNameLike("%"+vInterviewHr.getCompanyName()+"%");
		}
		if(StringTools.isNotBlank(vInterviewHr.getHrName())){
			criteria.andHrNameLike("%"+vInterviewHr.getHrName()+"%");
		}
		if(StringTools.isNotBlank(vInterviewHr.getMobilePhone())){
			criteria.andMobilePhoneLike("%"+vInterviewHr.getMobilePhone()+"%");
		}
		if(StringTools.isNotBlank(vInterviewHr.getTelPhone())){
			criteria.andTelPhoneLike("%"+vInterviewHr.getTelPhone()+"%");
		}
		if(StringTools.isNotBlank(vInterviewHr.getWeichat())){
			criteria.andWeichatLike("%"+vInterviewHr.getWeichat()+"%");
		}
		if(StringTools.isNotBlank(vInterviewHr.getQq())){
			criteria.andQqLike("%"+vInterviewHr.getQq()+"%");
		}
		if(StringTools.isNotBlank(vInterviewHr.getEmail())){
			criteria.andEmailLike("%"+vInterviewHr.getEmail()+"%");
		}
		List<VInterviewHr> list=vHrMapper.selectByExample(example);
		session.setAttribute("hrs", list);
		return "interview/company/hr/select/selectHRList";
	}
	
	@RequestMapping("addHR.action")
	public String addHR(TInterviewHr record,HttpSession session){
		record.setCreateTime(new Date());
		record.setStatus(0);
		record.setUpdateTime(new Date());
		tHrMapper.insert(record);
		return "interview/company/hr/queryHr";
	}
}
