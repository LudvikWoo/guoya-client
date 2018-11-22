package com.guoyasoft.controller.study;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("exercise")
public class ExerciseControoler {
    @RequestMapping("init.action")
    public String init(HttpSession session,String classCode){
      System.out.println("----------init.action="+classCode+"-------------");
      session.setAttribute("classCode", classCode);
      return "exerciseInfo";
    }
}
