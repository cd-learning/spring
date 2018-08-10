package com.example.demo.serviceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repos.StudentRepo;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	public StudentRepo repo;

	@Override
	public void save(Student student) {
		repo.save(student);
	}

	@Override
	public void insert(Student student) {

		repo.save(student);

	}

	@Override
	public void delete(Student student) {

		repo.delete(student);
	}

	@Override
	public void update(Student student) {
		repo.save(student);
	}

	@Override
	public List<Student> getAllRecord() {

		List<Student> list = repo.findAll();

		return list;
	}

	@Override
	public List<Student> serachRecord(String name) {
		List<Student> list = repo.findAll();
		//List<Student> list1 = repo.fin;

		return list;
	}

}
