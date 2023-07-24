package com.prowings.autowiring;

public class Student {
	
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



	public Student(Address address) {
		super();
		this.address = address;
	}



	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		System.out.println("setting roll via setter");
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("setting name via setter");
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		System.out.println("setting address via setter");
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", address=" + address + "]";
	}

//	@Override
//	public String toString() {
//		return "Student [address=" + address + "]";
//	}

	
	
}
