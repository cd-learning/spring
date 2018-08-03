package com.spring.lifecycle.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.lifecycle.app.model.Student;

@Configuration
public class BeanConfig {

	@Bean(name="studentBean")
	public Student studentInfo() {
		Student stu =new Student();
		stu.setId(1);
		stu.setName("Rohit");
		stu.setAddress("Bholabhai lati b/h krushna kumar shigi road rajula city ");

		return stu;

	}
}
