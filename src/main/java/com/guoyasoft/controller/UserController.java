package com.guoyasoft.controller;

import java.util.List;




import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guoyasoft.bean.db.GyUser;
import com.guoyasoft.bean.db.GyUserExample;
import com.guoyasoft.bean.db.GyUserExample.Criteria;
import com.guoyasoft.dao.GyUserMapper;

//注解
@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	GyUserMapper mapper;

	

	@RequestMapping(value = "/login.action")
	public String login(HttpServletRequest request,HttpSession session,String userName, String password, String checkCode) {
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

		// 第三：判断是否ok
		if (users.size() > 0) {
			session.setAttribute("userName", userName);
			return "index";
		} else {
			return "user/login";
		}
	}

}
