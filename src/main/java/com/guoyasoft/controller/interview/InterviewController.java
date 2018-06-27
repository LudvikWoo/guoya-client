package com.guoyasoft.controller.interview;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.RandomUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guoyasoft.bean.api.SelectOption;
import com.guoyasoft.bean.api.interview.InterviewQueryInitBean;
import com.guoyasoft.bean.api.interview.InterviewQueryParamBean;
import com.guoyasoft.bean.api.interview.InterviewQueryResultBean;
import com.guoyasoft.bean.api.interview.examAnswer.Answer;
import com.guoyasoft.bean.api.interview.examAnswer.Exam;
import com.guoyasoft.bean.db.interview.Vinterviewinterview;
import com.guoyasoft.bean.db.interview.VinterviewinterviewExample;
import com.guoyasoft.bean.db.interview.VinterviewinterviewExample.Criteria;
import com.guoyasoft.dao.interview.VinterviewinterviewMapper;
import com.guoyasoft.service.IInterviewSvc;
import com.guoyasoft.tools.FileUpload;
import com.guoyasoft.tools.StringTools;

@Controller
@RequestMapping("interview")
public class InterviewController {

	@Autowired
	private VinterviewinterviewMapper vInterViewMapper;
	
	@Autowired
	private IInterviewSvc interviewSvc;

	@RequestMapping("initInterviewQuery.action")
	public String initInterviewQuery(HttpSession session) {
		InterviewQueryInitBean init = new InterviewQueryInitBean();
		init.getClassSelect().add(new SelectOption("", "--请选择--", false));
		init.getClassSelect().add(new SelectOption("2", "测试基础班1805", false));
		init.getClassSelect().add(new SelectOption("9", "测试中级班1806", false));

		init.getProgressSelect().add(new SelectOption("", "--请选择--", false));
		init.getProgressSelect().add(new SelectOption("0", "未开始", false));
		init.getProgressSelect().add(new SelectOption("1", "面试中", false));
		init.getProgressSelect().add(new SelectOption("2", "等结果", false));
		init.getProgressSelect().add(new SelectOption("3", "结束", false));

		init.getResultSelect().add(new SelectOption("", "--请选择--", false));
		init.getResultSelect().add(new SelectOption("0", "未开始", false));
		init.getResultSelect().add(new SelectOption("1", "未通过", false));
		init.getResultSelect().add(new SelectOption("2", "等offer", false));
		init.getResultSelect().add(new SelectOption("3", "拒绝offer", false));
		init.getResultSelect().add(new SelectOption("4", "入职", false));

		session.setAttribute("initObj", init);
		return "interview/queryInterview";
	}

	@RequestMapping(value = "queryInterview.action")
	public String queryInterview(InterviewQueryParamBean params,
			HttpSession session) {
		try {
			VinterviewinterviewExample example = new VinterviewinterviewExample();
			Criteria criteria = example.createCriteria();
			if (StringTools.isNotBlank(params.getCustmerName())) {
				criteria.andCustomerNameLike("%"
						+ params.getCustmerName().trim() + "%");
			}
			if (StringTools.isNotBlank(params.getClassId())) {
				criteria.andClassIdEqualTo(Integer.parseInt(params.getClassId()));
			}
			if (StringTools.isNotBlank(params.getCompanyName())) {
				criteria.andCompanyNameLike("%"
						+ params.getCompanyName().trim() + "%");
			}
			if (StringTools.isNotBlank(params.getInterviewDate())) {
				String[] times = params.getInterviewDate().split("-");
				SimpleDateFormat sf = new SimpleDateFormat("MM/dd/yyyy");
				Date start = sf.parse(times[0].trim());
				Date end = sf.parse(times[1].trim());
				Calendar cal = Calendar.getInstance();
				cal.setTime(end);
				cal.add(Calendar.DATE, 1);
				end = cal.getTime();
				criteria.andInterviewTimeBetween(start, end);
			}
			if (StringTools.isNotBlank(params.getInterviewTime())) {
				if ("am".equals(params.getInterviewTime().trim())) {
					criteria.andInterviewTimeTimeBetween("00:00:00", "12:00:00");
				} else {
					criteria.andInterviewTimeTimeBetween("12:00:00", "24:00:00");
				}
			}
			if (StringTools.isNotBlank(params.getProgress())) {
				criteria.andProgressEqualTo(params.getProgress().trim());
			}
			if (StringTools.isNotBlank(params.getResult())) {
				criteria.andResultEqualTo(params.getResult().trim());
			}

			List<Vinterviewinterview> result = vInterViewMapper.selectByExample(example);

			List<InterviewQueryResultBean> list = new ArrayList<InterviewQueryResultBean>();
			Set<Integer> sets = new HashSet<Integer>();
			for (int i = 0; i < result.size(); i++) {
				InterviewQueryResultBean bean = new InterviewQueryResultBean();
				Vinterviewinterview var = result.get(i);
				BeanUtils.copyProperties(var, bean);
				sets.add(var.getCustomerId());
				// bean.setCustomerId(var.getCustomerId());
				// bean.setCustomerName(var.getCustomerName());
				// bean.setClassId(var.getClassId());;
				// bean.setClassName(var.getClassName());
				// bean.setCompanyId(var.getCompanyId());
				// bean.setCompanyName(var.getCompanyName());
				// bean.setInterviewTime(var.getInterviewTime());
				// bean.setProgressDesc(var.getProgressDesc());
				// bean.setResultDesc(var.getResultDesc());
				// bean.setRealSalary(var.getRealSalary());
				// bean.setHasExamDesc(i%2==0?"有":"无");
				list.add(bean);
			}
			session.setAttribute("result", list);
			session.setAttribute("studentCount", sets.size());
			session.setAttribute("interviewCount", list.size());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "interview/interviewList";
	}

	@RequestMapping(value = "getPaperExam.action")
	public String getPaperExam(String interviewId, HttpSession session) {
		Exam bean=interviewSvc.queryExamAnswers(interviewId);
		session.setAttribute("interviewId", interviewId);
		session.setAttribute("exam", bean);
		return "interview/paperExam";
	}

	@RequestMapping(value = "uploadExamPic.action")
	public String uploadExamPic(String interviewId,HttpServletRequest req, HttpSession session) {
		session.setAttribute("interviewId", interviewId);
		System.out.println("面试编号interviewId："+interviewId);
		System.out.println("开始接收文件.............");
		// 这句话的意思，是让浏览器用utf8来解析返回的数据
		try {
			System.out.println("开始接收文件：");
			String contextPath=req.getServletContext().getRealPath("/").replace("guoya-client", "guoya-data");
			String savePath=contextPath+"interview/exam/"+interviewId;
			System.out.println("正式存放路径："+savePath);
			HashMap<String, Object> map = FileUpload.fileupload(req,savePath);
			List<String> filePathes = (List<String>)map.get("filePathes");
			for(String s:filePathes){
				System.out.println("图片保存路径：" + s);
				System.out.println("--------------图片地址插入数据库成功----------------------");
				interviewSvc.insertExamPic(interviewId, s);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("文件接收完成.............");
		/*
		 * 刷新笔试界面
		 */
		String result=getPaperExam(interviewId, session);
		return result;
	}
	
	@RequestMapping(value="addPicAnswer.action")
	public String addPicAnswer(Answer answer,HttpSession session){
		/*
		 * 第一步：将答案插入数据库
		 */
		try{
			int count=interviewSvc.insertExamPicAnswer(answer);
		}catch(Exception e){
			e.printStackTrace();
		}
		/*
		 * 第二步：再次查询笔试信息
		 */
		String result=getPaperExam(answer.getInterviewId()+"", session);
		return result;
	}
}
