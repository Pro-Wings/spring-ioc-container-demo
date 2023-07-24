package com.prowings.models;

public class Employee {
	
	int id;
	String name;
	String department;

//	public Employee() {
//		super();
//		// TODO Auto-generated constructor stub
//	}

	public Employee(int id, String name, String department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
	}
	
	

	public Employee(int id, String name) {
		super();
		System.out.println("inside (int id, string name) constructor!!");
		this.id = id;
		this.name = name;
	}
	
	public Employee(String name, String department) {
		super();
		System.out.println("inside (string name, string department) constructor!!");
		this.department = department;
		this.name = name;
	}

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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + "]";
	}
}
