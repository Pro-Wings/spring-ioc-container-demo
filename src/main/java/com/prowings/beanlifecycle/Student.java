package com.prowings.beanlifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean, DisposableBean{
	
	int roll;
	String name;
	Address address;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int roll, String name, Address address) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", address=" + address + "]";
	}

	public void destroy() throws Exception {
		
		System.out.println("========Before destruction of student bean=========");
		
	}
	public void afterPropertiesSet() throws Exception {
		System.out.println("========Initializing the student bean=========");
		
	}
	
	

}
