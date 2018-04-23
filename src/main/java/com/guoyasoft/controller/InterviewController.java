package com.guoyasoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="interview")
public class InterviewController {
	
	@RequestMapping(value="add.action")
	public String add(){
		return "interview/query";
	}
	
	@RequestMapping(value="query.action")
	public String query(){
		return "interview/list";
	}
	
	@RequestMapping(value="update.action")
	public String update(){
		return "interview/update";
	}
}
