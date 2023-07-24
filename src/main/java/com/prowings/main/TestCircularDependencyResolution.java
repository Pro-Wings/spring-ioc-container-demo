package com.prowings.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prowings.circulardependency.A;
import com.prowings.circulardependency.A2;
import com.prowings.circulardependency.B;
import com.prowings.circulardependency.B2;

public class TestCircularDependencyResolution {
	
	public static void main(String[] args) {
		
		ApplicationContext context =new ClassPathXmlApplicationContext("circularDependencySpringBeans2.xml");

//		A2 objA = context.getBean("a2Bean", A2.class);
//
//		System.out.println(objA);
//		

		System.out.println("aaaaaaaaaaaaaaaaaa");
		B2 objB= context.getBean("b2Bean", B2.class);
//		
//		System.out.println(objB);
		
	}

}
