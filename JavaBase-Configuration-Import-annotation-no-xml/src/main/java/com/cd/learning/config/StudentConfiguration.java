package com.cd.learning.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.cd.learning.model.Student;

@Configuration
@Import({EmployeeConfiguration.class})
public class StudentConfiguration {

	@Bean
	public Student studentInfo() {
		return new Student();
		
	}

}
