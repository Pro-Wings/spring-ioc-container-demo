package com.prowings.models;

public class Car {
	
	int model;
	String name;
	String company;

//	public Car() {
//		super();
//		// TODO Auto-generated constructor stub
//	}


	public Car(String name, int model) {
		super();
		System.out.println("Car(String name, int model) called");
		this.model = model;
		this.name = name;
	}
	
//	public Car(int model, String name) {
//		super();
//		System.out.println("Car(int model, String name) called");
//		this.model = model;
//		this.name = name;
//	}
	

//	public Car(String name, String company) {
//		super();
//		System.out.println("Car(String name, String company) called");
//		this.name = name;
//		this.company = company;
//	}

	public Car(int model, String name, String company) {
		super();
		System.out.println("Car(int model, String name, String company) called");
		this.model = model;
		this.name = name;
		this.company = company;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", name=" + name + ", company=" + company + "]";
	}
	
}
