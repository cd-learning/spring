package com.jdbc.templae.app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jdbc.templae.app.DAO.StudentJDBCTemplate;
import com.jdbc.templae.app.model.Student;

public class ApplicationClass {

	public static void main(String[] args) {
	
			ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");	
			StudentJDBCTemplate studentJDBCTemplate = (StudentJDBCTemplate)context.getBean("studentJDBCTemplate");
			//insert Record 
			int count=studentJDBCTemplate.insertStudentRecord("RohitParmar", "Rajula City - 365560");
			System.out.println("No of Row added in database ........................is :="+count);
		  
			//Delete Query
			int deleteRecord=studentJDBCTemplate.deleteStudentRecord("Rohit");
			System.out.println("Delete Record With Id  Number is ........"+deleteRecord);
			
			//Update Query
			int updateCount=studentJDBCTemplate.updateStudentRecord("RohitParmar", "Dubai ");
			System.out.println("Updated record count is  :"+updateCount);
			
			List<Student> stu= studentJDBCTemplate.getAllStudentList();
			for(int i=0;i<stu.size();i++) {
				System.out.println("id " +stu.get(i).getId());
				System.out.println("name " +stu.get(i).getName());
				System.out.println("address " +stu.get(i).getAddress());
				
			}
	}

}
