package com.cd.learning.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cd.learning.model.Employee;

@Configuration
public class EmployeeConfiguration {

	@Bean(name="employee")
	public Employee employeeInfo() {
		return new Employee();
	}
	
}

