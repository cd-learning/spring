package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Student;
import com.example.demo.serviceImple.StudentServiceImpl;

@RestController
public class StudentController {
	@Autowired
	public StudentServiceImpl stuSerImpl;

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public ModelAndView welcomeMessage() {
		return new ModelAndView("welcome", "command", new Student());
	}

	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public ModelAndView updateStudent() {
		return new ModelAndView("update", "command", new Student());

	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public ModelAndView deleteStudent() {
		return new ModelAndView("delete", "command", new Student());
	}

	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public ModelAndView viewStudent() {
		return new ModelAndView("view", "command", new Student());

	}

	@RequestMapping(value = "/searchPage", method = RequestMethod.GET)
	public ModelAndView searchStudent() {
		return new ModelAndView("search", "command", new Student());

	}

	@RequestMapping(value = "/deleteRecord", method = RequestMethod.POST)
	public ModelAndView suucessOrErrorMessage(@RequestParam("id") int name) {
		Student stu = new Student();
		stu.setId(name);
		stuSerImpl.delete(stu);
		return new ModelAndView("message", "message", name);

	}

	@RequestMapping(value = "/updateRecord", method = RequestMethod.POST)
	public ModelAndView updateRecord(@RequestParam("id") int id, @RequestParam("name") String name,
			@RequestParam("address") String address, @RequestParam("phone") long phone) {
		Student stu = new Student();
		stu.setId(id);
		stu.setName(name);
		stu.setAddress(address);
		stu.setPhone(phone);
		stuSerImpl.update(stu);
		String msg = "Finally Update Record ";
		return new ModelAndView("message", "message", msg);

	}

	@RequestMapping(value = "/addCustomer", method = RequestMethod.POST)
	public ModelAndView addCustomer(@RequestParam("id") int id, @RequestParam("name") String name,
			@RequestParam("address") String address, @RequestParam("phone") long phone) {
		Student student = new Student();
		student.setId(id);
		student.setName(name);
		student.setAddress(address);
		student.setPhone(phone);
		stuSerImpl.save(student);
		return new ModelAndView("addStudent", "name", name);
	}

	@RequestMapping(value = "/getAllRecord", method = RequestMethod.GET)
	public ModelAndView getAllRecordFromCustomer() {
		List<Student> listStu = stuSerImpl.getAllRecord();
		return new ModelAndView("view", "listStudent", listStu);
	}

	@RequestMapping(value = "/searchRecord", method = RequestMethod.POST)
	public ModelAndView searchRecordFromCustomer(@RequestParam("name") String name) {
		List<Student> searchStudentList = stuSerImpl.serachRecord(name);
		return new ModelAndView("view", "searchStudentList", searchStudentList);

	}
}
