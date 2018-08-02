package com.set.list.map.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.set.list.map.app.model.Student;

public class Application {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Student stu = (Student) context.getBean("studentBean");
		System.out.println(stu.getList());
		System.out.println(stu.getMap());
		System.out.println(stu.getSet());

	}
}
