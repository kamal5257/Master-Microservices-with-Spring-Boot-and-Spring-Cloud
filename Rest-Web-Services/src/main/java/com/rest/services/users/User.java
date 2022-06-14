package com.rest.services.users;

import java.util.Date;

public class User {
	
	Integer id;
	String Name;
	Date DOB;
	public synchronized Integer getId() {
		return id;
	}
	public synchronized void setId(Integer id) {
		this.id = id;
	}
	public synchronized String getName() {
		return Name;
	}
	public synchronized void setName(String name) {
		Name = name;
	}
	public synchronized Date getDOB() {
		return DOB;
	}
	public synchronized void setDOB(Date dOB) {
		DOB = dOB;
	}
	public User(int id, String name, Date dOB) {
		super();
		this.id = id;
		Name = name;
		DOB = dOB;
	}
	@Override
	public String toString() {
		return "user [id=" + id + ", Name=" + Name + ", DOB=" + DOB + "]";
	}
	public User() {
		super();
	}
	
	

}
