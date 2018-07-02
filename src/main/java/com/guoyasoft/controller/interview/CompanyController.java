package com.guoyasoft.controller.interview;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guoyasoft.bean.db.interview.TInterviewCompany;
import com.guoyasoft.bean.db.interview.TInterviewCompanyExample;
import com.guoyasoft.dao.interview.TInterviewCompanyMapper;
import com.guoyasoft.tools.StringTools;

@Controller
@RequestMapping("company")
public class CompanyController {
	@Autowired
	TInterviewCompanyMapper companyMapper;
	
	@RequestMapping("selectCompany.action")
	public String selectCompany(String companyName,HttpSession session){
		TInterviewCompanyExample example=new TInterviewCompanyExample();
		TInterviewCompanyExample.Criteria criteria=example.createCriteria();
		if(StringTools.isNotBlank(companyName)){
			criteria.andCompanyNameLike("%"+companyName+"%");
		}
		List<TInterviewCompany> list=companyMapper.selectByExample(example);
		session.setAttribute("companies", list);
		return "interview/company/select/selectCompanyList";
	}
	
	@RequestMapping("addCompany.action")
	public String addCompany(TInterviewCompany company,HttpSession session){
		company.setCreateTime(new Date());
		company.setStatus(0);
		company.setUpdateTime(new Date());
		companyMapper.insert(company);
		return "interview/company/queryCompany";
	}
}
