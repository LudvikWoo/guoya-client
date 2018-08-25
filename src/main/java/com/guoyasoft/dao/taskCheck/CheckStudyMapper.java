package com.guoyasoft.dao.taskCheck;

import java.util.List;

import com.guoyasoft.bean.api.study.CheckTaskBean;
import com.guoyasoft.bean.api.study.QueryClassBean;
import com.guoyasoft.bean.api.study.QueryCourseBean;
import com.guoyasoft.bean.api.study.QueryLecturePkgBean;
import com.guoyasoft.bean.api.study.QueryLectureTaskBean;


public interface CheckStudyMapper {
    List<QueryClassBean> selectClass(QueryClassBean condition);

	List<QueryCourseBean> selectCourse(QueryCourseBean bean);

	List<QueryLecturePkgBean> selectLecturePkg(QueryLecturePkgBean bean);

	List<QueryLectureTaskBean> selectLectureTask(QueryLectureTaskBean bean);

	int insertLesson(QueryLectureTaskBean bean);

	int selectLessonCtn(QueryLectureTaskBean bean);

	int insertLessonStudent(QueryLectureTaskBean bean);

	int insertTaskCheck(CheckTaskBean bean);

	List<CheckTaskBean> selectTaskCheckes(CheckTaskBean bean);

	int selectTaskCheckCount(CheckTaskBean bean);

	int resetCheckStatus(CheckTaskBean bean);

	int updateCheckStatus(CheckTaskBean bean);

	List<CheckTaskBean> selectCheckStudents(CheckTaskBean bean);

	CheckTaskBean selectCheckPakageInfo(CheckTaskBean bean);

	int insertLessonPictures(CheckTaskBean bean);

	int insertLessonPictureDetail(CheckTaskBean bean);

	List<CheckTaskBean> queryCheckPictures(CheckTaskBean bean);

	int deleteCheckPicture(CheckTaskBean bean);

	int updateCheckPictureStatus(CheckTaskBean bean);

	int operateTaskCheckStatus(CheckTaskBean bean);

	CheckTaskBean selectTaskPkgInfo(CheckTaskBean bean);

}