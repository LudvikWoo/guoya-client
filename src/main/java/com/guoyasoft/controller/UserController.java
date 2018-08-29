package com.guoyasoft.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guoyasoft.bean.api.user.UserMenuBean;
import com.guoyasoft.bean.db.GyUser;
import com.guoyasoft.bean.db.user.TUserUser;
import com.guoyasoft.bean.db.user.TUserUserExample;
import com.guoyasoft.dao.GyUserMapper;
import com.guoyasoft.dao.user.TUserUserMapper;
import com.guoyasoft.dao.user.UserCommonMapper;

//注解
@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	GyUserMapper mapper;
	
	@Autowired
	TUserUserMapper userMapper;

	@Autowired
	UserCommonMapper commonMapper;

	@RequestMapping(value = "/login.action")
	public String login(HttpServletRequest request,HttpSession session,String userName, String password, String checkCode) {
		System.out.println("userName=" + userName + ",password=" + password
				+ ",checkcode=" + checkCode);

		System.out.println(request.getHeader("User-Agent"));
		// 第1：拿到登录数据

		// 第二：查询数据库的数据
		TUserUserExample example = new TUserUserExample();

		com.guoyasoft.bean.db.user.TUserUserExample.Criteria c = example.createCriteria();

		c.andUserNameEqualTo(userName);
		c.andPwdEqualTo(password);

		List<TUserUser> users = userMapper.selectByExample(example);

		// 第三：判断是否ok
		if (users.size() > 0) {
			session.setAttribute("user", users.get(0));
			session.setAttribute("userName", userName);
			UserMenuBean bean=new UserMenuBean();
			bean.setUser_name(users.get(0).getUserName());
			List<UserMenuBean> menus=commonMapper.selectUserMenu(bean);
			session.setAttribute("menus", menus);
			return "index";
		} else {
			return "user/login";
		}
	}

}
