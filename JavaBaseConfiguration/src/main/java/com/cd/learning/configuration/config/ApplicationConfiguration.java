package com.cd.learning.configuration.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cd.learning.configuration.model.Student;

@Configuration
public class ApplicationConfiguration {

	@Bean(name ="student")
	public Student hello() {
		return new Student();
	}
}
