package com.guoyasoft.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginController extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		// 这句话的意思，是让浏览器用utf8来解析返回的数据
		resp.setHeader("Content-type", "application/json;charset=UTF-8");
		// 这句话的意思，是告诉servlet用UTF-8转码，而不是用默认的ISO8859
		resp.setCharacterEncoding("UTF-8");
		
		String userName=req.getParameter("userName");
		String password=req.getParameter("password");
		System.out.println("username="+userName);
		System.out.println("password="+password);
		//TODO tocken值更新为UUID
		req.getSession().setAttribute("token", "sdfsdfs");
		
		resp.sendRedirect("/guoya-client/");
	}

}
