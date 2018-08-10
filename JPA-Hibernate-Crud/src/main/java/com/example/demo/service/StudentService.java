package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Student;

public interface StudentService {

	public void save(Student student);

	@Transactional
	@Modifying
	public void insert(Student student);

	@Transactional
	@Modifying
	public void delete(Student student);

	@Transactional
	@Modifying
	public void update(Student student);

	@Query(name="select * from student")
    public List<Student> getAllRecord();

	@Query(name ="select * from student where name= :name")
	public List<Student> serachRecord(@Param ("name") String name);

}
