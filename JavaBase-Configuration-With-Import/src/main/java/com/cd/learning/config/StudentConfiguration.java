package com.cd.learning.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cd.learning.model.Employee;
import com.cd.learning.model.Student;

@Configuration
public class StudentConfiguration {

	@Bean(name="student")
	public Student studentInfo() {
		return new Student();
		
	}

}
