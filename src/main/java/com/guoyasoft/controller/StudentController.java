package com.guoyasoft.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.guoyasoft.bean.api.student.Student;
import com.guoyasoft.bean.api.student.StudentQuery;
import com.guoyasoft.bean.db.user.TUStudent;
import com.guoyasoft.bean.db.user.TUStudentExample;
import com.guoyasoft.bean.db.user.VUStudent;
import com.guoyasoft.bean.db.user.VUStudentExample;
import com.guoyasoft.dao.user.TUStudentMapper;
import com.guoyasoft.dao.user.VUStudentMapper;
import com.guoyasoft.tools.StringTools;

@Controller
@RequestMapping(value="student")
public class StudentController {
	@Autowired
	private VUStudentMapper vStuMapper;
	@Autowired
	private TUStudentMapper tStuMapper;

	
	@RequestMapping(value="init.action")
	public String init(){
		return "student/add";
	}
	
	@RequestMapping(value="add.action")
	public String add(Student stu) throws ParseException{
		System.out.println(stu.toString());
		TUStudent record=new TUStudent();
		record.setCno(Integer.parseInt(stu.getCno()));
		if(StringTools.isNotBlank(stu.getPsno())){
			record.setPsno(Integer.parseInt(stu.getPsno()));
		}
		if(StringTools.isNotBlank(stu.getUno())){
			record.setUno(Integer.parseInt(stu.getUno()));
		}
		String deactiveTime="2028-12-30";
		SimpleDateFormat sf=new SimpleDateFormat("yyyy-mm-dd");
		record.setDeactiveTime(sf.parse(deactiveTime));
		
		tStuMapper.insertSelective(record);
		
		return "student/query";
	}

	@RequestMapping(value="query.action")
	public String query(){
		return "student/list";
	}

	
	@RequestMapping(value="update.action")
	public String update(){
		return "student/update";
	}
	
	@RequestMapping(value="queryStuNo.action")
	public ModelAndView queryStuNo(StudentQuery stu){
		System.out.println(stu.toString());
		
		VUStudentExample example=new VUStudentExample();
		com.guoyasoft.bean.db.user.VUStudentExample.Criteria criteria =example.createCriteria();
		criteria.andCnoDescLike("%"+stu.getSname()+"%");
		List<VUStudent> list=vStuMapper.selectByExample(example);
		System.out.println("学生查询人数："+list.size());
		
		ModelAndView model=new ModelAndView();
		model.addObject("students", list);
		model.setViewName("student/queryStuList");
		return model;
	}
}
