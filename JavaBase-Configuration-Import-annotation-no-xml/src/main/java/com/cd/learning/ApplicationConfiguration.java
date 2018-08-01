package com.cd.learning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cd.learning.config.StudentConfiguration;
import com.cd.learning.importconfig.ImportConfig;
import com.cd.learning.model.Employee;
import com.cd.learning.model.Student;

public class ApplicationConfiguration {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(StudentConfiguration.class);
	
	    Student stu=context.getBean(Student.class);
        stu.setName("Rohit");	
        System.out.println(stu.getName());
	    Employee emp=context.getBean(Employee.class);
	    emp.setName("Cd Employee");
	    System.out.println(emp.getName());
	    
	    
	
	}
}
