package com.prowings.models;

public class Student {
	
	private int roll;
	private String name;
	private Address address;
	
	public Student() {
		super();
		System.out.println("no arg constructor is called");
		
	}
	public Student(int roll, String name, Address address) {
		super();
		System.out.println("all arg constructor is called");
		this.roll = roll;
		this.name = name;
		this.address = address;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		System.out.println("setter for roll is called");
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("setter for name is called");
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		System.out.println("setter for address is called");
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", address=" + address + "]";
	}
	
}
