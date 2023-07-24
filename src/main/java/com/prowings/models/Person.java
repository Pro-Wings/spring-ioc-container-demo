package com.prowings.models;

import java.util.List;
import java.util.Set;

public class Person {
	
	int id;
	String name;
	List<Integer> mobileNumbers;
	
	Set<String> emailIds;
	
	
	
	public Set<String> getEmailIds() {
		return emailIds;
	}
	public void setEmailIds(Set<String> emailIds) {
		this.emailIds = emailIds;
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
	public List<Integer> getMobileNumbers() {
		return mobileNumbers;
	}
	public void setMobileNumbers(List<Integer> mobileNumbers) {
		this.mobileNumbers = mobileNumbers;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", mobileNumbers=" + mobileNumbers + ", emailIds=" + emailIds
				+ "]";
	}


}
