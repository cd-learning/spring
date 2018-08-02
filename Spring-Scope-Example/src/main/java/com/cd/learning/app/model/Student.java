package com.cd.learning.app.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
public class Student {

	private int id;
    private String name;
    private String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
    
	public String allDetail() {
		return "Id is :="+id+"\n"+"Name is :="+name+"\n"+"Address is :="+address+"\n"+"-------------------";
	}
}
