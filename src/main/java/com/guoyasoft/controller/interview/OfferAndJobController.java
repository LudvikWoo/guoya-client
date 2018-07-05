package com.guoyasoft.controller.interview;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.guoyasoft.bean.api.interview.OfferAddBean;
import com.guoyasoft.bean.db.interview.TInterviewOffer;
import com.guoyasoft.dao.interview.TInterviewOfferMapper;
import com.guoyasoft.tools.DateTools;

@Controller
@RequestMapping("offer")
public class OfferAndJobController {
	@Autowired
	TInterviewOfferMapper offerMapper;
	
	@RequestMapping(value="initAddOffer.action")
	public String initAddOffer(String interviewId,HttpSession session){
		return "interview/offer/addOffer";
	}
	
	@RequestMapping(value="addOffer.action", produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String addOffer(OfferAddBean offer,HttpSession session){
		TInterviewOffer record=new TInterviewOffer();
		record.setInterviewId(Integer.parseInt(offer.getInterviewId()));
		record.setSalary(Integer.parseInt(offer.getSalary()));
		record.setSalaryCount(Integer.parseInt(offer.getSalaryCount()));
		record.setIsGrossPay(Integer.parseInt(offer.getIsGrossPay()));
		record.setProbationaryPeriod(Integer.parseInt(offer.getProbationaryPeriod()));
		record.setProbationaryPeriodDiscount(Integer.parseInt(offer.getProbationaryPeriodDiscount()));
		record.setOfferTime(DateTools.parse(offer.getOfferTime(), "yyyyy-MM-dd"));
		record.setWorkTime(DateTools.parse(offer.getWorkTime(), "yyyy-MM-dd"));
		record.setCreateTime(new Date());
		record.setUpdateTime(new Date());
		record.setIsAccept(0);
		record.setStatus(0);
		int count=offerMapper.insert(record);
		if(count==1){
			return "新增成功！";
		}else{
			return "新增成功！";
		}
		
		
	}
}
