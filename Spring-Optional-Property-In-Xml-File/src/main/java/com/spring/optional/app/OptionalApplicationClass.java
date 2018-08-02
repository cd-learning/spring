package com.spring.optional.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.optional.app.model.CatOpp;

public class OptionalApplicationClass {

	public static void main(String[] args) {
		 ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		CatOpp catObj=(CatOpp)context.getBean("option");
		System.out.println("Id is :"+catObj.getId()+"\n"+"Name is :="+catObj.getName()+"\n"+"Address is :="+catObj.getAddress());
		
	}
}
