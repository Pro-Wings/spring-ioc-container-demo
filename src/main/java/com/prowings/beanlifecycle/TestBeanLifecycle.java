package com.prowings.beanlifecycle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeanLifecycle {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("BeanLifeCycle.xml");
		
//		Student s1 = ctx.getBean("std1", Student.class);
//		System.out.println(s1);

		Student2 s2 = ctx.getBean("std2", Student2.class);
		System.out.println(s2);
		
		
		ctx.close();
		
	}
	
}
