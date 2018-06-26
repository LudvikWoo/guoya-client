package com.guoyasoft.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guoyasoft.bean.api.study.CheckStudy;
import com.guoyasoft.bean.db.GyStudent;

@Controller
@RequestMapping("study")
public class StudyController {
	@RequestMapping("init.action")
	public String init(HttpSession session){
		List<CheckStudy> students=new ArrayList<CheckStudy>();
		for(int i=0;i<students.size();i++){
			students.get(i).setRn(i);
		}
		System.out.println(students.size());
		session.setAttribute("students", students);
		return "study/checkTask";
	}
}