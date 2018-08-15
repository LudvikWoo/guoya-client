package com.guoyasoft;

import java.io.StringReader;

import org.testng.annotations.Test;

import junit.framework.Assert;

import com.guoyasoft.bean.api.test.queryCustomer.request.Customer;
import com.guoyasoft.bean.api.test.queryCustomer.request.Request;
import com.guoyasoft.bean.api.test.queryCustomer.response.Response;

public class TestAPI {
	public void queryCustomer() throws Exception {
		Request request=new Request();
		request.setOperateType("1");
		Customer customer=new Customer();
		customer.setCustomerId("123123");
		request.setCustomer(customer);
		System.out.println(request.toXMLString());
		
		String result=HttpClientTools.callHttpByStream(300, "http://www.guoyasoft.com:8080/guoya-server/customer/updateCustomer.action", request.toXMLString(), "UTF-8");
		System.out.println(result);
		
		StringReader reader = new StringReader(result);
		Response response=Response.unmarshal(reader);
		
		System.out.println(response.getRespCode());
		Assert.assertEquals("0000", response.getRespCode());
	}
	

	@Test
	public void addCustomer() throws Exception{
		com.guoyasoft.bean.api.test.addCustomer.request.Request request=new com.guoyasoft.bean.api.test.addCustomer.request.Request();
		com.guoyasoft.bean.api.test.addCustomer.request.Customer customer=new com.guoyasoft.bean.api.test.addCustomer.request.Customer();
		customer.setCustomerName("wuling");
		customer.setCstType("0");
		customer.setHeadPortrait("xxxxx");
		customer.setCert("500234198811051856");
		com.guoyasoft.bean.api.test.addCustomer.request.ContactInfo contactInfo=new com.guoyasoft.bean.api.test.addCustomer.request.ContactInfo();
		contactInfo.setEmail("wuling@guoyasoft");
		contactInfo.setPhone("18232423423");
		customer.setContactInfo(contactInfo);
		
		request.setCustomer(customer);
		String xml=request.toXMLString();
		System.out.println(xml);
		
		String result=HttpClientTools.callHttpByStream(3000, "http://www.guoyasoft.com:8080/guoya-server/customer/addCustomer.action", xml, "UTF-8");
		System.out.println(result);
		
		com.guoyasoft.bean.api.test.addCustomer.response.Response response=com.guoyasoft.bean.api.test.addCustomer.response.Response.unmarshal(new StringReader(result));
		String responseCode=response.getRespCode();
		System.out.println(responseCode);
		
		Assert.assertEquals("0000", responseCode);
	}
}
