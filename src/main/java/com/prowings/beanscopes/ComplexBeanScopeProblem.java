package com.prowings.beanscopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComplexBeanScopeProblem {
	
	public static void main(String[] args) {
		
		ApplicationContext context =new ClassPathXmlApplicationContext("ComplexBeanScopProblemSpringBeans.xml");
		
		FourWheeler audi1 = context.getBean("fourWheeler1", FourWheeler.class);
		
		System.out.println("Audi1 : "+audi1);
		
		FourWheeler audi2 = context.getBean("fourWheeler1", FourWheeler.class);
		System.out.println("Audi2 : "+audi2);
				
		System.out.println(audi1 == audi2);

		System.out.println(audi1.getEngine() == audi2.getEngine());
		
		
	}

}
