package com.jdbc.templae.app.DAO;

import java.util.List;

import javax.sql.DataSource;

import com.jdbc.templae.app.model.Student;

public interface StudentDAO {

	public void setDataSource(DataSource ds);
	
	public int insertStudentRecord(String name,String address);
	
	public int deleteStudentRecord(String name);
	
	public int updateStudentRecord(String name,String address);
	
	public List<Student> getAllStudentList();
	
	public Student getStudnet(int id);
	
}
