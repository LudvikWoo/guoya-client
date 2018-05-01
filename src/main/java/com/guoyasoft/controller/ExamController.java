package com.guoyasoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="exam")
public class ExamController {
	@RequestMapping(value="init.action")
	public String init(){
		return "exam/add";
	}
	
	@RequestMapping(value="add.action")
	public String add(){
		return "exam/query";
	}

	@RequestMapping(value="query.action")
	public String query(){
		return "exam/list";
	}

	@RequestMapping(value="answer.action")
	public String answer(){
		return "exam/answer";
	}
	
	@RequestMapping(value="update.action")
	public String update(){
		return "exam/update";
	}
}
