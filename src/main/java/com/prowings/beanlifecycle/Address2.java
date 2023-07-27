package com.prowings.beanlifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Address2 {

	int pin;
	String city;
	public Address2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address2(int pin, String city) {
		super();
		this.pin = pin;
		this.city = city;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [pin=" + pin + ", city=" + city + "]";
	}
	
	@PostConstruct
	public void customInit() throws Exception {
		System.out.println("========inside customInit() of address bean=========");
		
	}

	@PreDestroy
	public void myDestroy() throws Exception {
		
		System.out.println("========inside customDestory() of  of address bean=========");
		
	}

	
}
