package com.cd.learning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cd.learning.importconfig.ImportConfig;
import com.cd.learning.model.Employee;
import com.cd.learning.model.Student;

public class ApplicationConfiguration {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(ImportConfig.class);
	
	    Student stu=(Student)context.getBean("student");
        stu.setName("Rohit");	
        System.out.println(stu.getName());
	    Employee emp=(Employee)context.getBean("employee");
	    emp.setName("Cd Employee");
	    System.out.println(emp.getName());
	    
	    
	
	}
}
