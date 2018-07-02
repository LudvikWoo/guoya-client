package com.guoyasoft.controller.student;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guoyasoft.bean.db.interview.VCourseSchedule;
import com.guoyasoft.bean.db.interview.VCourseScheduleExample;
import com.guoyasoft.bean.db.student.VCourseStu2Class;
import com.guoyasoft.bean.db.student.VCourseStu2ClassExample;
import com.guoyasoft.dao.interview.VCourseScheduleMapper;
import com.guoyasoft.dao.student.VCourseStu2ClassMapper;
import com.guoyasoft.service.IStudentSvc;
import com.guoyasoft.tools.StringTools;

@Controller
@RequestMapping(value = "student")
public class StudentController {
	@Autowired
	private IStudentSvc studentSvc;

	@Autowired
	private VCourseScheduleMapper scheduleMapper;

	@Autowired
	private VCourseStu2ClassMapper vMapper;

	@RequestMapping(value = "selectStudent.action")
	public String selectStudent(String customerName, String classId,
			HttpSession session) {
		VCourseScheduleExample example = new VCourseScheduleExample();
		VCourseScheduleExample.Criteria criteria = example.createCriteria();
		if (StringTools.isNotBlank(classId)) {
			criteria.andClassIdEqualTo(Integer.parseInt(classId));
		}
		if (StringTools.isNotBlank(customerName)) {
			criteria.andCustomerNameLike("%" + customerName + "%");
		}
		List<VCourseSchedule> list = scheduleMapper.selectByExample(example);
		session.setAttribute("students", list);
		return "student/select/selectStudentList";
	}

}
