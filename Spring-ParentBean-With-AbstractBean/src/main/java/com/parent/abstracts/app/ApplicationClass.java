package com.parent.abstracts.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.parent.abstracts.app.model.Cat;

public class ApplicationClass {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		Cat cat = (Cat) context.getBean("catAnimal");

		System.out.println("Name is :" + cat.getName() + "\n "+"Height is :=" + cat.getHeight() +"\n "+ "Color is :" +cat.getColor());

		Cat cat1 =(Cat)context.getBean("catAnimal");
		
		System.out.println("Name is :" + cat1.getName() + "\n "+"Height is :=" + cat1.getHeight() +"\n ");

	}
}
