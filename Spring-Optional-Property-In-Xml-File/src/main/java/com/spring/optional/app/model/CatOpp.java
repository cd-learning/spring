package com.spring.optional.app.model;

import org.springframework.beans.factory.annotation.Required;

public class CatOpp {

	private int id;
	private String name;
	private String address;

	public int getId() {
		return id;
	}
 
	public void setId(int id) {
		this.id = id;
	}
    @Required
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    @Required
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
