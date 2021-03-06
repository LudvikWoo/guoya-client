package com.guoyasoft.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.guoyasoft.bean.db.GyUser;
import com.guoyasoft.bean.db.GyUserExample;
import com.guoyasoft.bean.db.GyUserExample.Criteria;
import com.guoyasoft.dao.GyUserMapper;

@Controller
@RequestMapping(value="login")
public class LoginController {

	@Autowired
	GyUserMapper mapper;
	
	public void loginInit(){
		
	}
	
	@RequestMapping(value = "/login.action")
	public ModelAndView login(HttpServletRequest request,HttpSession session,String userName, String password, String checkCode) {
		System.out.println("userName=" + userName + ",password=" + password
				+ ",checkcode=" + checkCode);

		System.out.println(request.getHeader("User-Agent"));
		// 第1：拿到登录数据

		// 第二：查询数据库的数据
		GyUserExample example = new GyUserExample();

		Criteria c = example.createCriteria();

		c.andUserNameEqualTo(userName);
		c.andPwdEqualTo(password);

		List<GyUser> users = mapper.selectByExample(example);
		ModelAndView modelAndView=new ModelAndView();
		// 第三：判断是否ok
		if (users.size() > 0) {
			String[][] keyValues=new String[5][2];
			keyValues[0][0]="性能测试";
			keyValues[0][1]="20";
			modelAndView.addObject("keyValues",keyValues);
			session.setAttribute("user", users.get(0));
			session.setAttribute("userName", userName);
			modelAndView.addObject("user",users.get(0));
			modelAndView.setViewName("main/index");
		} else {
			modelAndView.setViewName("login/login");
		}
		return modelAndView;
	}

}
