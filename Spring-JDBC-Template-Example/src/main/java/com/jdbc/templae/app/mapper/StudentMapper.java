package com.jdbc.templae.app.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import com.jdbc.templae.app.model.Student;
public class StudentMapper implements org.springframework.jdbc.core.RowMapper<Student>{

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
	 
		Student stu= new Student();
		stu.setName(rs.getString("name"));
	    stu.setId(rs.getInt("id"));
	    stu.setAddress(rs.getString("address"));
		return stu;
	}
	
	
	
	
	 
}