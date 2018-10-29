package com.guoyasoft.controller.interview;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guoyasoft.bean.api.SelectOption;
import com.guoyasoft.bean.api.interview.InterviewAddBean;
import com.guoyasoft.bean.api.interview.InterviewQueryInitBean;
import com.guoyasoft.bean.api.interview.InterviewQueryParamBean;
import com.guoyasoft.bean.api.interview.InterviewQueryResultBean;
import com.guoyasoft.bean.api.interview.InterviewStatisticsBean;
import com.guoyasoft.bean.api.interview.askAswer.AskBean;
import com.guoyasoft.bean.api.interview.askAswer.AskPubBean;
import com.guoyasoft.bean.api.interview.askAswer.AudioAnswer;
import com.guoyasoft.bean.api.interview.examAnswer.Answer;
import com.guoyasoft.bean.api.interview.examAnswer.Exam;
import com.guoyasoft.bean.db.interview.TInterviewInterview;
import com.guoyasoft.bean.db.interview.VCourseSchedule;
import com.guoyasoft.bean.db.interview.VInterviewInterview;
import com.guoyasoft.bean.db.interview.VInterviewInterviewExample;
import com.guoyasoft.bean.db.interview.VInterviewInterviewExample.Criteria;
import com.guoyasoft.bean.db.user.TUserUser;
import com.guoyasoft.dao.interview.VInterviewInterviewMapper;
import com.guoyasoft.service.IInterviewSvc;
import com.guoyasoft.tools.FileUpload;
import com.guoyasoft.tools.StringTools;

@Controller
@RequestMapping("interview")
public class InterviewController {

	@Autowired
	private VInterviewInterviewMapper vInterViewMapper;

	@Autowired
	private IInterviewSvc interviewSvc;

	@RequestMapping("initInterviewQuery.action")
	public String initInterviewQuery(String studentName, String classId,
			HttpSession session) {
		InterviewQueryInitBean init = new InterviewQueryInitBean();
		init.getClassSelect().add(new SelectOption("", "--请选择--", false));
		init.getClassSelect().add(new SelectOption("2", "1805基础班", false));
		init.getClassSelect().add(new SelectOption("11", "1807基础班", false));
		init.getClassSelect().add(new SelectOption("12", "1808基础班", false));
		init.getClassSelect().add(new SelectOption("13", "1809基础班", false));
		init.getClassSelect().add(new SelectOption("15", "1810基础班", false));
		init.getClassSelect().add(new SelectOption("9", "1806提高班", false));

		for (int i = 0; i < init.getClassSelect().size(); i++) {
			SelectOption s = init.getClassSelect().get(i);
			if (s.getValue().equals(classId)) {
				init.getClassSelect().get(i).setSelected(true);
				;
			}
		}

		init.getProgressSelect().add(new SelectOption("", "--请选择--", false));
		init.getProgressSelect().add(new SelectOption("0", "未开始", false));
		init.getProgressSelect().add(new SelectOption("1", "面试结束", false));
		init.getProgressSelect().add(new SelectOption("2", "放弃面试", false));

		init.getResultSelect().add(new SelectOption("", "--请选择--", false));
		init.getResultSelect().add(new SelectOption("0", "待定", false));
		init.getResultSelect().add(new SelectOption("1", "通过", false));
		init.getResultSelect().add(new SelectOption("2", "未通过", false));
		/*
		 * init.getResultSelect().add(new SelectOption("3", "拒绝offer", false));
		 * init.getResultSelect().add(new SelectOption("4", "入职", false));
		 */
		if (StringTools.isNotBlank(studentName)
				|| StringTools.isNotBlank(classId)) {
			session.setAttribute("initQuery", true);
		}
		session.setAttribute("studentName", studentName);
		session.setAttribute("initObj", init);
		return "interview/queryInterview";
	}

	@RequestMapping(value = "queryInterview.action")
	public String queryInterview(InterviewQueryParamBean params,
			HttpSession session) {
		try {
			VInterviewInterviewExample example = new VInterviewInterviewExample();
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
				criteria.andProgressEqualTo(Integer.parseInt(params
						.getProgress().trim()));
			}
			if (StringTools.isNotBlank(params.getResult())) {
				criteria.andResultEqualTo(Integer.parseInt(params.getResult()
						.trim()));
			}
			example.setOrderByClause("interview_id");
			List<VInterviewInterview> result = vInterViewMapper
					.selectByExample(example);

			List<InterviewQueryResultBean> list = new ArrayList<InterviewQueryResultBean>();
			InterviewStatisticsBean statistics = new InterviewStatisticsBean();
			for (int i = 0; i < result.size(); i++) {
				InterviewQueryResultBean bean = new InterviewQueryResultBean();
				VInterviewInterview var = result.get(i);
				BeanUtils.copyProperties(var, bean);
				// 记录学生
				statistics.getStudentSet().add(var.getCustomerId() + "");
				if (var.getResult() == 1) {
					// 记录面试通过学生
					statistics.getPassStuSet().add(var.getStudentId() + "");
					statistics.setPassInterviewCtn(statistics
							.getPassInterviewCtn() + 1);
				} else {
					// 记录面试未学生
					statistics.getUnpassStuSet().add(var.getStudentId() + "");
					statistics.setUnpassInterviewCtn(statistics
							.getUnpassInterviewCtn() + 1);
				}
				if (var.getProgress() == 1) {
					// 记录面试结束数
					statistics.setCompleteCtn(statistics.getCompleteCtn() + 1);
				} else if (var.getProgress() == 0) {
					// 记录面试未结束数
					statistics
							.setUnCompleteCtn(statistics.getUnCompleteCtn() + 1);
				} else if (var.getProgress() == 2) {
					// 记录面试未结束数
					statistics.setGiveUpInterviewCtn(statistics
							.getGiveUpInterviewCtn() + 1);

				}
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
			statistics.setInterviewCtn(list.size());
			session.setAttribute("result", list);
			session.setAttribute("statistics", statistics);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "interview/interviewList";
	}

	@RequestMapping(value = "getPaperExam.action")
	public String getPaperExam(String interviewId, HttpSession session) {
		Exam bean = interviewSvc.queryExamAnswers(interviewId);
		session.setAttribute("interviewId", interviewId);
		session.setAttribute("exam", bean);
		return "interview/paperExam";
	}

	@RequestMapping(value = "uploadExamPic.action")
	public String uploadExamPic(String interviewId, HttpServletRequest req,
			HttpSession session) {
		session.setAttribute("interviewId", interviewId);
		System.out.println("面试编号interviewId：" + interviewId);
		System.out.println("开始接收文件.............");
		// 这句话的意思，是让浏览器用utf8来解析返回的数据
		try {
			System.out.println("开始接收文件：");
			String contextPath = req.getServletContext().getRealPath("/")
					.replace("guoya-client", "guoya-data");
			String savePath = contextPath + "interview/exam/" + interviewId;
			System.out.println("正式存放路径：" + savePath);
			HashMap<String, Object> map = FileUpload.fileupload(req, savePath);
			List<String> filePathes = (List<String>) map.get("filePathes");
			for (String s : filePathes) {
				System.out.println("图片保存路径：" + s);
				System.out
						.println("--------------图片地址插入数据库成功----------------------");
				interviewSvc.insertExamPic(interviewId, s);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("文件接收完成.............");
		/*
		 * 刷新笔试界面
		 */
		String result = getPaperExam(interviewId, session);
		return result;
	}

	@RequestMapping("deletePicture.action")
	public String deletePicture(String interviewId, String pictureId,
			HttpSession session) {
		int count = interviewSvc.deletePicture(pictureId, interviewId);
		/*
		 * 刷新笔试界面
		 */
		String result = getPaperExam(interviewId, session);
		return result;
	}

	@RequestMapping(value = "completeExam.action")
	public String completeExam(String examId, String interviewId,
			HttpSession session) {
		/*
		 * 第一步：将答案插入数据库
		 */
		try {
			int count = interviewSvc.updateExampStatus(examId, 2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		/*
		 * 第二步：再次查询笔试信息
		 */
		String result = getPaperExam(interviewId, session);
		return result;
	}

	@RequestMapping(value = "addPicAnswer.action")
	public String addPicAnswer(Answer answer, HttpSession session) {
		/*
		 * 第一步：将答案插入数据库
		 */
		try {
			int count = interviewSvc.insertExamPicAnswer(answer);
		} catch (Exception e) {
			e.printStackTrace();
		}
		/*
		 * 第二步：再次查询笔试信息
		 */
		String result = getPaperExam(answer.getInterviewId() + "", session);
		return result;
	}

	@RequestMapping("updatePicAnswer.action")
	public String updatePicAnswer(Answer answer, String method,
			String interviewId, HttpSession session) {
		int count = interviewSvc.updatePicAnswer(answer, method);
		/*
		 * 第二步：再次查询笔试信息
		 */
		String result = getPaperExam(interviewId, session);
		return result;
	}

	@RequestMapping(value = "addInterview.action")
	public String addInterview(InterviewAddBean interview, HttpSession session) {
		TInterviewInterview newInterview = interviewSvc.addInterview(interview);
		int count = interviewSvc.addInterviewExam(newInterview);
		AskBean ask=new AskBean();
		ask.setInterview_id(newInterview.getInterviewId());
		ask.setCreate_time(new Date());
		ask.setUpdate_time(new Date());
		ask.setStatus(0);
		ask.setOperate_user_id(((TUserUser) session
						.getAttribute("user")).getUserId());
		count = interviewSvc.addInterviewAsk(newInterview,ask);
		String result = initInterviewQuery(null, null, session);
		return result;
	}

	@RequestMapping(value = "initAddInterview.action")
	public String initAddInterview(HttpSession session) {

		return "interview/addInterview";
	}

	@RequestMapping(value = "queryInterviewDetail.action")
	public String queryInterviewDetail(String interviewId, HttpSession session) {
		session.setAttribute("interviewId", interviewId);
		return "interview/interviewDetail";
	}

	@RequestMapping("getAudioExam.action")
	public String getAudioExam(AskBean bean, HttpServletRequest request) {
		AskBean ask = interviewSvc.selectAskInfo(bean);
		if (ask != null) {
			ask.setCustomerName(bean.getCustomerName());
			ask.setCompanyName(bean.getCompanyName());
		}
		System.out.println("audios大小=" + ask.getAudios().size());
		request.setAttribute("ask", ask);
		return "interview/audioExam";
	}

	@RequestMapping(value = "uploadExamAudio.action")
	public String uploadExamAudio(AskBean bean, HttpServletRequest req,
			HttpSession session) {
		System.out.println("面试编号interviewId：" + bean.getInterview_id());
		System.out.println("开始接收文件.............");
		// 这句话的意思，是让浏览器用utf8来解析返回的数据
		AskBean ask = new AskBean();
		try {
			System.out.println("开始接收文件：");
			String contextPath = req.getServletContext().getRealPath("/")
					.replace("guoya-client", "guoya-data");
			String savePath = contextPath + "interview/audio";
			SimpleDateFormat sf = new SimpleDateFormat("yyyyMMdd");
			String time = sf.format(new Date());
			savePath += "/" + time +"/"+ask.getInterview_id();
			System.out.println("正式存放路径：" + savePath);
			HashMap<String, Object> map = FileUpload.fileupload(req, savePath);
			List<String> filePathes = (List<String>) map.get("filePathes");
			for (String s : filePathes) {
				System.out.println("音频保存路径：" + s);
				System.out
						.println("--------------音频地址插入数据库成功----------------------");
				ask.setInterview_id(bean.getInterview_id());
				ask.setStatus(0);
				ask.setCreate_time(new Date());
				ask.setUpdate_time(new Date());
				ask.setOperate_user_id(((TUserUser) session
						.getAttribute("user")).getUserId());
				interviewSvc.insertExamAudio(ask, s);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("文件接收完成.............");
		/*
		 * 刷新笔试界面
		 */
		String result = getAudioExam(bean, req);

		return result;
	}

	@RequestMapping("addAudioAnswer.action")
	public String addAudioAnswer(AudioAnswer answer,AskBean bean, HttpServletRequest req) {
		answer.setStatus(0);
		answer.setCreate_time(new Date());
		answer.setPraise_count(0);
		interviewSvc.insertAudioAnswer(answer);
		System.out.println("askId="+bean.getAsk_id());
		String result = getAudioExam(bean, req);
		return result;
	}

	@RequestMapping("updateAudioAnswer.action")
	public String updateAudioAnswer(AudioAnswer answer,AskBean bean,HttpServletRequest req){
		interviewSvc.deleteAudioAnswer(answer);
		String result = getAudioExam(bean, req);
		return result;
	}

	@RequestMapping("deleteAudio.action")
	public String deleteAudio(AskBean bean,HttpServletRequest req){
		String result = getAudioExam(bean, req);
		return result;
	}
}
