package com.guoyasoft.controller.study;

import com.guoyasoft.bean.api.SelectOption;
import com.guoyasoft.bean.api.study.SummaryInitBean;
import com.guoyasoft.bean.db.study.GyExercise;
import com.guoyasoft.bean.db.user.TUserUser;
import com.guoyasoft.service.IStudySvc;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("summarize")
public class SummarizeController {
  @Autowired
  IStudySvc studySvc;

  @RequestMapping(value="init.action",produces = "text/html;charset=UTF-8")
  public String init(HttpSession session,String classCode){
    TUserUser  user=(TUserUser)session.getAttribute("user");
    System.out.println("-------userId="+user.getUserId());

    System.out.println("----------classCode="+classCode+"---------------");
    SummaryInitBean bean=new SummaryInitBean();
    //设置班级
    bean.setClassCode(classCode);
    //设置日期
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    String date=format.format(new Date() );
    bean.setCurrentDate(date);


    //设置组
    List<SelectOption> groups=new ArrayList<SelectOption>();
    //设置学生
    List<SelectOption> students=new ArrayList<SelectOption>();
    //查询所有的学生记录
    GyExercise condition=new GyExercise();
    condition.setClassCode(classCode);
    condition.setEffectStatus(0);
    List<GyExercise> exercies=studySvc.getExercises(condition);
    Set<Integer> groupSet=new HashSet<Integer>();
    for (GyExercise s:exercies){
      groupSet.add(s.getGroupid());
      boolean selected=false;
      if((user.getUserId()+"").equals(s.getSno()+"")){
        selected=true;
      }
      SelectOption select=new SelectOption(s.getSno()+"", s.getSno()+"_"+s.getSname(), selected);
      students.add(select);
    }
    for(Integer i:groupSet){
      String j=(100+i)+"";
      SelectOption select=new SelectOption(i+"", "第"+j.substring(1)+"组", false);
      groups.add(select);
    }
    bean.setGroups(groups);
    bean.setStudents(students);

    session.setAttribute("init", bean);
    return "summarizeInfo";
  }

}
