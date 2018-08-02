package com.cd.learning.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
 
import com.cd.learning.app.model.Student;
@Configuration
public class BeanConfig {
  
	@Bean(name = "studentBean")
	@Scope("prototype")
	public Student student() {
		return new Student();
	}
}
