package com.prowings.circulardependency;

public class A {
	
	B b;
	
	

	public A(B b) {
		super();
		System.out.println("inside A class constructor!!");
		this.b = b;
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		System.out.println("inside A class setter method!!");
		this.b = b;
	}
	
	

}
