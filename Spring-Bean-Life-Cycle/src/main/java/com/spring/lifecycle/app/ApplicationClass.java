package com.spring.lifecycle.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.spring.lifecycle.app.config.BeanConfig;
import com.spring.lifecycle.app.model.Student;

public class ApplicationClass {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

		Student stu = (Student) context.getBean("studentBean");
		System.out.println("Id is :=" + stu.getId() + "\n" + "Name is :=" + stu.getName() + "\n" + "Address is :="
				+ stu.getAddress());
		System.out.println("Bean Destroy Main call.....................................");

		context.close();
	}
}
