package com.cd.learning.app.model;

public class Customer {

	private Employee employee;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String displayInfo() {
		return "Employee id :=" + employee.getEmpId() + "\n " + "Employee Name :=" + employee.getName() + "\n"
				+ "Employee Address is :=" + employee.getAddress();
	}
}
