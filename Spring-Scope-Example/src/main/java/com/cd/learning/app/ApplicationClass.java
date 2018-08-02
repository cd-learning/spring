package com.cd.learning.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cd.learning.app.config.BeanConfig;
import com.cd.learning.app.model.Student;

public class ApplicationClass {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

		Student stu = (Student) context.getBean("studentBean");
		stu.setId(1);
		stu.setName("Rohit");
		stu.setAddress("Bholabhai lati b/h krushna kumar shigi road rajula city  - 365560");
		System.out.println(stu.allDetail());

		Student stu1 = (Student) context.getBean("studentBean");

		System.out.println(stu1.allDetail());

		Student stu2 = (Student) context.getBean("studentBean");

		System.out.println(stu2.allDetail());
	}

}
