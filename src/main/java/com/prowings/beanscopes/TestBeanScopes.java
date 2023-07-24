package com.prowings.beanscopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeanScopes {
	
	public static void main(String[] args) {
		
		//singleton bean scope example
		ApplicationContext context =new ClassPathXmlApplicationContext("BeanScopeSpringBeans.xml");

		Car c1 = context.getBean("car1", Car.class);
		System.out.println(c1.hashCode());

		Car c2 = context.getBean("car1", Car.class);
		System.out.println(c2.hashCode());
		
		System.out.println(c1 == c2); //reference equality
		
		//singleton bean scope in multiple container example
		ApplicationContext context1 =new ClassPathXmlApplicationContext("BeanScopeSpringBeans.xml");
		
		Car c3 = context1.getBean("car1", Car.class);
		System.out.println(c3.hashCode());
		System.out.println(c1 == c3); //reference equality
		
		//prototype bean scope example
		ApplicationContext context2 =new ClassPathXmlApplicationContext("BeanScopeSpringBeans.xml");
		
		Car c4 = context2.getBean("car2", Car.class);
		System.out.println(c4.hashCode());

		Car c5 = context2.getBean("car2", Car.class);
		System.out.println(c5.hashCode());
		
		System.out.println(c4 == c5); //reference equality
		
	}

}
