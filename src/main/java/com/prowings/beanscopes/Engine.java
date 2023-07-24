package com.prowings.beanscopes;

public class Engine {

	int capacity;
	String type;
	int hp;
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	@Override
	public String toString() {
		return "Engine [capacity=" + capacity + ", type=" + type + ", hp=" + hp + "]";
	}
	
	
	
}
