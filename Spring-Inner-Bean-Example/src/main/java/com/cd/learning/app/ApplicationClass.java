package com.cd.learning.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cd.learning.app.model.Customer;

public class ApplicationClass {

	public static void main(String[] args) {
	 
		ApplicationContext context =new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Customer cust=context.getBean(Customer.class,"customer");
		
	   System.out.println(cust.displayInfo());

	}

}
