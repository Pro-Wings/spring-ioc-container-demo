package com.prowings.circulardependency;

public class B {
	
	A a;

	
	public B(A a) {
		super();
		System.out.println("inside B class constructor!!");
		this.a = a;
	}

	public A getA() {
		return a;
	}

	public void setA(A a) {
		System.out.println("inside B class setter method!!");
		this.a = a;
	}
	
	

}
