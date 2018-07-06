package com.guoyasoft.controller.interview;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guoyasoft.bean.api.interview.SInterviewStatistic;
import com.guoyasoft.bean.api.interview.StatisticQueryBean;
import com.guoyasoft.dao.interview.SInterviewStatisticMapper;
@Controller
@RequestMapping("interview/statistic")
public class StatisticController {
	@Autowired
	SInterviewStatisticMapper mapper;
	
	public String initStatistic(){
		return "";
	}
	
	@RequestMapping("statisticQuery.action")
	public String queryStatistic(StatisticQueryBean queryBean,HttpSession session){
		System.out.println(queryBean.toString());
		List<SInterviewStatistic> statistic=mapper.selectInterviewStatistic(queryBean);
		session.setAttribute("statistic", statistic);
		return "interview/statistic/statisticList";
	}
}