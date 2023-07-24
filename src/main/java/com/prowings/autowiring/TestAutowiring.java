package com.prowings.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowiring {
	
	public static void main(String[] args) {
		
		ApplicationContext context =new ClassPathXmlApplicationContext("AutowiringSpringBeans.xml");

		Student s1 = context.getBean("std1", Student.class);

		System.out.println(s1);
		
	}

}
