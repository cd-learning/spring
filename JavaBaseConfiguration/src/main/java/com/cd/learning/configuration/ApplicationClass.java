package com.cd.learning.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cd.learning.configuration.config.ApplicationConfiguration;
import com.cd.learning.configuration.model.Student;

public class ApplicationClass {
	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

		Student stu = (Student) applicationContext.getBean("student");
		stu.setName("rohit Parmar");
		System.out.println(stu.sayHello());
	}

}
