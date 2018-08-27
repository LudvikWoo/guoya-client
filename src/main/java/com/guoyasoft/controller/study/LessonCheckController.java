package com.guoyasoft.controller.study;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.guoyasoft.bean.api.study.CheckTaskBean;
import com.guoyasoft.bean.api.study.QueryClassBean;
import com.guoyasoft.bean.api.study.QueryCourseBean;
import com.guoyasoft.bean.api.study.QueryLecturePkgBean;
import com.guoyasoft.bean.api.study.QueryLectureTaskBean;
import com.guoyasoft.bean.db.taskCheck.TUserCustomerPictures;
import com.guoyasoft.bean.db.taskCheck.TUserCustomerPicturesExample;
import com.guoyasoft.dao.taskCheck.CheckStudyMapper;
import com.guoyasoft.dao.taskCheck.TUserCustomerPicturesMapper;
import com.guoyasoft.dao.taskCheck.VClassLessonCheckMapper;
import com.guoyasoft.tools.DateTools;
import com.guoyasoft.tools.FileUpload;

@Controller
@RequestMapping("lessonCheck")
public class LessonCheckController {
	@Autowired
	VClassLessonCheckMapper checkMapper;

	@Autowired
	CheckStudyMapper checkStudyMapper;
	
	@Autowired
	TUserCustomerPicturesMapper cstPicMapper;

	@RequestMapping("queryClass.do")
	public String queryClass(QueryClassBean bean, HttpServletRequest request) {
		List<QueryClassBean> result = checkStudyMapper.selectClass(bean);
		request.setAttribute("list", result);
		return "study/class/queryClassList";
	}

	@RequestMapping("queryCourse.do")
	public String queryCourse(QueryCourseBean bean, HttpServletRequest request) {
		List<QueryCourseBean> result = checkStudyMapper.selectCourse(bean);
		request.setAttribute("list", result);
		return "study/course/queryCourseList";
	}

	@RequestMapping("queryLecturePkg.do")
	public String queryLecturePkg(QueryLecturePkgBean bean,
			HttpServletRequest request) {
		List<QueryLecturePkgBean> result = checkStudyMapper
				.selectLecturePkg(bean);
		request.setAttribute("list", result);
		return "study/course/queryLecturePkg";
	}

	@RequestMapping("initLesson.do")
	public String queryTask(QueryLectureTaskBean bean,
			HttpServletRequest request) {
		/*
		 * 1. 先验证lesson是否已初始化
		 */
		int lessonCtn = checkStudyMapper.selectLessonCtn(bean);
		if (lessonCtn == 0) {
			/*
			 * 2. 若没有初始化，先初始化
			 */
			// 2.1 生成“课堂表”的表数据
			checkStudyMapper.insertLesson(bean);
			System.out.println("lessonId=" + bean.getLessonId());
			// 2.2 生成“课堂学生表”的数据
			int attendCtn = checkStudyMapper.insertLessonStudent(bean);
		}
		// 3. 查询展现任务列表
		List<QueryLectureTaskBean> result = checkStudyMapper
				.selectLectureTask(bean);
		request.setAttribute("list", result);
		return "study/course/queryTaskList";
	}

	@RequestMapping("checkTask.do")
	public String checkTask(CheckTaskBean bean, HttpServletRequest request) {
		// 先判断一个任务是否已经生成作业检查信息
		int count = checkStudyMapper.selectTaskCheckCount(bean);
		if (count == 0) {
			count = checkStudyMapper.insertTaskCheck(bean);
			System.out.println("新增作业检查条数：" + count);
		}
		List<CheckTaskBean> result = checkStudyMapper.selectTaskCheckes(bean);
		request.setAttribute("list", result);
		request.setAttribute("lessonId", bean.getLessonId());
		request.setAttribute("taskPkgId", bean.getTaskPkgId());
		CheckTaskBean taskPkgInfo=checkStudyMapper.selectTaskPkgInfo(bean);
		request.setAttribute("taskPkgInfo", taskPkgInfo);
		
		int passCtn=0;
		int unpassCtn=0;
		int uncheckCtn=0;
		int totalCtn=result.size();
		for(CheckTaskBean item:result){
			if(item.getCheckStatus()==0){
				uncheckCtn++;
			}else if(item.getCheckStatus()==1){
				passCtn++;
			}else if(item.getCheckStatus()==2){
				unpassCtn++;
			}
		}
		request.setAttribute("passCtn", passCtn);
		request.setAttribute("unpassCtn", unpassCtn);
		request.setAttribute("uncheckCtn", uncheckCtn);
		request.setAttribute("totalCtn", totalCtn);
		return "study/lesson/checkTask";
	}

	@RequestMapping("resetCheckStatus.do")
	@ResponseBody
	public int resetCheckStatus(CheckTaskBean bean) {
		// 先判断一个任务是否已经生成作业检查信息
		int count = checkStudyMapper.resetCheckStatus(bean);
		return count;
	}

	@RequestMapping("updateCheckStatus.do")
	@ResponseBody
	public int updateCheckStatus(CheckTaskBean bean) {
		// 先判断一个任务是否已经生成作业检查信息
		int count = checkStudyMapper.updateCheckStatus(bean);
		return count;
	}

	@RequestMapping("uploadExercise.do")
	public String uploadExercise(CheckTaskBean bean, HttpServletRequest request) {
		List<CheckTaskBean> students = checkStudyMapper
				.selectCheckStudents(bean);
		CheckTaskBean submitInfo = checkStudyMapper.selectCheckPakageInfo(bean);
		request.setAttribute("lessonStudent", students);
		request.setAttribute("submitInfo", submitInfo);
		request.setAttribute("customerName", bean.getCustomerName());
		return "study/lesson/summarizeInfo";
	}

	@RequestMapping("uploadExercisePic.do")
	@ResponseBody
	public int uploadExercisePic(CheckTaskBean bean, HttpServletRequest request) throws ServletException, IOException {
		int count = 0;
		String os = System.getProperty("os.name");  
		if(os.toLowerCase().startsWith("win")){  
		  System.out.println(os + " can't gunzip");  
		}  
		String date=DateTools.format(new Date(), "yyyyMMdd");
		String time=DateTools.format(new Date(), "HH24mmss");
		Random  random=new Random(100);
		System.out.println("开始接收文件：");
		String contextPath=request.getServletContext().getRealPath("/").replace("guoya-client", "guoya-data");
		String savePath=contextPath+"checkStudy/date/"+bean.getCheckId();
		System.out.println("正式存放路径："+savePath);
		HashMap<String, Object> map = FileUpload.fileupload(request,savePath);
		List<String> filePathes = (List<String>)map.get("filePathes");
		for(String s:filePathes){
			System.out.println("图片保存路径：" + s);
			System.out.println("--------------图片地址插入数据库成功----------------------");
			bean.setPictureUrl(s);
			int picturesId=checkStudyMapper.insertLessonPictures(bean);
			int pictureId=checkStudyMapper.insertLessonPictureDetail(bean);
		}
		return filePathes.size();
	}
	
	@RequestMapping(value="queryCheckPictures.do",produces = {"text/html;charset=utf-8"})
	@ResponseBody
	public String queryCheckPictures(CheckTaskBean bean){
		List<CheckTaskBean> list=checkStudyMapper.queryCheckPictures(bean);
		Gson gson=new Gson();
		String json=gson.toJson(list);
		System.out.println(json);
		return json;
	}
	
	@RequestMapping("operatePicture.do")
	@ResponseBody
	public String operatePicture(CheckTaskBean bean){
		int optType=bean.getOptType();
		if(optType==1){
			//删除照片
			int count=checkStudyMapper.deleteCheckPicture(bean);
			return "0000";
		}else if(optType==2){
			//通过
			bean.setCheckStatus(1);
			int count=checkStudyMapper.updateCheckPictureStatus(bean);
			return "0000";
		}else if(optType==3){
			//不通过
			bean.setCheckStatus(2);
			int count=checkStudyMapper.updateCheckPictureStatus(bean);
			return "0000";
		}else{
			return "9999";
		}
		
	}
	
	@RequestMapping("operateTaskCheckStatus.do")
	@ResponseBody
	public String operateTaskCheckStatus(CheckTaskBean bean){
		int count=checkStudyMapper.operateTaskCheckStatus(bean);
		if(count==1){
			return "0000";
		}else{
			return "0000";
		}
	}
	
	@RequestMapping("uploadProfilePicture.do")
	@ResponseBody
	public String uploadProfilePicture(int customerId,HttpServletRequest request) {
		try{
			System.out.println("开始接收文件：");
			String contextPath=request.getServletContext().getRealPath("/").replace("guoya-client", "guoya-data");
			String savePath=contextPath+"profilePictures/"+customerId;
			System.out.println("正式存放路径："+savePath);
			HashMap<String, Object> map = FileUpload.fileupload(request,savePath);
			List<String> filePathes = (List<String>)map.get("filePathes");
			for(String s:filePathes){
				System.out.println("图片保存路径：" + s);
				System.out.println("--------------图片地址插入数据库成功----------------------");
				TUserCustomerPicturesExample example=new TUserCustomerPicturesExample();
				com.guoyasoft.bean.db.taskCheck.TUserCustomerPicturesExample.Criteria criteria = example.createCriteria();
				criteria.andCustomerIdEqualTo(customerId);
				List<TUserCustomerPictures> pictures=cstPicMapper.selectByExample(example);
				if(pictures.size()>0){
					pictures.get(0).setPictureAddr(s);
					cstPicMapper.updateByExample(pictures.get(0), example);
				}else {
					TUserCustomerPictures record=new TUserCustomerPictures();
					record.setCustomerId(customerId);
					record.setPictureAddr(s);
					record.setPictureType(1);
					record.setStatus(0);
					record.setUpdateTime(new Date());
					record.setCreateTime(new Date());
					cstPicMapper.insert(record);
				}
				return "0000";
			}
			return "9999,上传失败！";
		}catch(Exception e){
			e.printStackTrace();
			return "9999,上传失败！";
		}
	}
}