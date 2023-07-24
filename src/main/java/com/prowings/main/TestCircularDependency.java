package com.prowings.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prowings.circulardependency.A;
import com.prowings.circulardependency.B;

public class TestCircularDependency {
	
	public static void main(String[] args) {
		
		ApplicationContext context =new ClassPathXmlApplicationContext("circularDependencySpringBeans.xml");

		A objA = context.getBean("aBean", A.class);

		System.out.println(objA);
		
		B objB= context.getBean("bBean", B.class);
		
		System.out.println(objB);
		
	}

}
