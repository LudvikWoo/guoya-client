package com.guoyasoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="student")
public class StudentController {

	@RequestMapping(value="add.action")
	public String add(){
		
		return "student/query";
	}
	
	@RequestMapping(value="query.action")
	public String query(){
		
		return "student/list";
	}
	
	
	@RequestMapping(value="update.action")
	public String update(){
		
		return "student/list";
	}
	
	
	@RequestMapping(value="statistic.action")
	public String statistic(){
		
		return "student/statisticDetail";
	}
}
