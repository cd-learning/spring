package com.jdbc.templae.app.DAO;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.jdbc.templae.app.mapper.StudentMapper;
import com.jdbc.templae.app.model.Student;
public class StudentJDBCTemplate implements StudentDAO {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	public int insertStudentRecord(String name, String address) {
		String SQL = "INSERT INTO student(name,address) values(?,?)";
		int countInsert = jdbcTemplateObject.update(SQL, name, address);
		return countInsert;
	}
	public int deleteStudentRecord(String name) {
		String SQL = "delete from student where name='" + name + "'";
		int countDeleteRecord = jdbcTemplateObject.update(SQL);
		return countDeleteRecord;
	}
	public int updateStudentRecord(String name, String address) {
		String SQL = "update student set address=? where name = ?";
		int updateCount=jdbcTemplateObject.update(SQL, address,name);
		return updateCount;
	}
	public List<Student> getAllStudentList() {
		String sql = "SELECT * FROM student";	 
		List<Student> student = jdbcTemplateObject.query(sql, new StudentMapper());
		
		return student;	 
	}
	public Student getStudnet(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
