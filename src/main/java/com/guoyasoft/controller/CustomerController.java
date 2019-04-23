package com.guoyasoft.controller;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.guoyasoft.bean.api.customer.Customer;
import com.guoyasoft.bean.api.customer.CustomerQuery;
import com.guoyasoft.bean.db.user.TUCustomer;
import com.guoyasoft.bean.db.user.TUCustomerExample;
import com.guoyasoft.bean.db.user.VUCustomer;
import com.guoyasoft.bean.db.user.VUCustomerExample;
import com.guoyasoft.bean.db.user.VUCustomerExample.Criteria;
import com.guoyasoft.dao.user.TUCustomerMapper;
import com.guoyasoft.dao.user.VUCustomerMapper;
import com.guoyasoft.tools.StringTools;

@Controller
@RequestMapping(value="customer")
public class CustomerController {
	@Autowired
	TUCustomerMapper cstMapper;
	
	@Autowired
	VUCustomerMapper vCstMapper;

	@RequestMapping(value="add.action")
	public String add(Customer cst){
		try{
			System.out.println(cst.toString());
			//新增客户资料表
			TUCustomer target=new TUCustomer();
			BeanUtils.copyProperties(cst, target);
			SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd");
			if(StringTools.isNotBlank(cst.getEnrollDate())){
				target.setEnrollDate(sf.parse(cst.getEnrollDate()));
			}
			if(StringTools.isNotBlank(cst.getStatus())){
				target.setStatus(Integer.parseInt(cst.getStatus()));
			}
			System.out.println(target.toString());
			cstMapper.insertSelective(target);
			
			return "customer/query";
		}catch(Exception e){
			e.printStackTrace();
			return "customer/add";
		}
	}
	
	@RequestMapping(value="query.action")
	public ModelAndView query(CustomerQuery query){
		System.out.println(query.toString());
		
		VUCustomerExample example=new VUCustomerExample();
		Criteria criteria=example.createCriteria();
		if(StringTools.isNotBlank(query.getCname())){
			criteria.andCnameLike("%"+query.getCname()+"%");
		}
		if(StringTools.isNotBlank(query.getAgeMin())){
			criteria.andAgeGreaterThanOrEqualTo(Integer.parseInt(query.getAgeMin()));
		}
		if(StringTools.isNotBlank(query.getAgeMax())){
			criteria.andAgeLessThanOrEqualTo(Integer.parseInt(query.getAgeMax()));
		}
		if(StringTools.isNotBlank(query.getSex())){
			criteria.andSexEqualTo(query.getSex());
		}
		if(StringTools.isNotBlank(query.getEducation())){
			criteria.andEducationEqualTo(query.getEducation());
		}
		if(StringTools.isNotBlank(query.getComputor())){
			criteria.andComputorEqualTo(query.getComputor());
		}
		if(StringTools.isNotBlank(query.getInsurance())){
			criteria.andInsuranceEqualTo(query.getInsurance());
		}
		if(StringTools.isNotBlank(query.getBoard())){
			criteria.andBoardEqualTo(query.getBoard());
		}
		if(StringTools.isNotBlank(query.getIntroducerDesc())){
			criteria.andIntroducerDescLike("%"+query.getIntroducerDesc()+"%");
		}
		if(StringTools.isNotBlank(query.getCstType())){
			criteria.andCstTypeEqualTo(query.getCstType());
		}
		List<VUCustomer> list=vCstMapper.selectByExample(example);
		System.out.println("查询结果条数："+list.size());
		ModelAndView model=new ModelAndView();
		model.addObject("customers", list);
		model.setViewName("customer/list");
		return model;
	}
	@RequestMapping(value="queryCstNo.action")
	public ModelAndView queryCstNo(CustomerQuery query){
		System.out.println(query.toString());
		
		VUCustomerExample example=new VUCustomerExample();
		Criteria criteria=example.createCriteria();
		if(StringTools.isNotBlank(query.getCname())){
			criteria.andCnameLike("%"+query.getCname()+"%");
		}
		List<VUCustomer> list=vCstMapper.selectByExample(example);
		System.out.println("查询结果条数："+list.size());
		ModelAndView model=new ModelAndView();
		model.addObject("customers", list);
		model.setViewName("customer/queryCstList");
		return model;
	}
	
	@RequestMapping(value="updateInit.action")
	public ModelAndView updateInit(String cno){
		System.out.println("更新客户信息："+cno);
		TUCustomer cst=cstMapper.selectByPrimaryKey(Integer.parseInt(cno));
		ModelAndView model=new ModelAndView();
		model.addObject("cst",	cst);
		model.setViewName("customer/update");
		return model;
	}
	
	@RequestMapping(value="update.action")
	public ModelAndView update(Customer cst){
		ModelAndView model=new ModelAndView();
		try{
			System.out.println("更新客户信息："+cst.toString());
			TUCustomer target=new TUCustomer();
			BeanUtils.copyProperties(cst, target);
			SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd");
			if(StringTools.isNotBlank(cst.getEnrollDate())){
				target.setEnrollDate(sf.parse(cst.getEnrollDate()));
			}
			if(StringTools.isNotBlank(cst.getStatus())){
				target.setStatus(Integer.parseInt(cst.getStatus()));
			}
			System.out.println(target.toString());
			cstMapper.updateByPrimaryKeySelective(target);

			model.setViewName("customer/list");
			return model;
		}catch(Exception e){
			e.printStackTrace();
			model.setViewName("customer/list");
			return model;
		}
	}
	
	
	@RequestMapping(value="statistic.action")
	public String statistic(){
		
		return "customer/statisticDetail";
	}
}
