package com.prowings.autowiring;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowiring {
	
	public static void main(String[] args) {
		
		ApplicationContext context =new ClassPathXmlApplicationContext("AutowiringSpringBeans.xml");

		Student s1 = context.getBean("std1", Student.class);

		System.out.println(s1);
		
		System.out.println("Total Beans in container :" +context.getBeanDefinitionCount());
		
		String[] beanNames = context.getBeanDefinitionNames();
		
		System.out.println(Arrays.toString(beanNames));
		
		int addrBeanCount = context.getBeanNamesForType(Address.class).length;
		
		System.out.println("Total Number of Address Beans : "+addrBeanCount);
		
		System.out.println(s1.beanCount);
		
		MyDatabaseDetails dbdetails = context.getBean("dbProps",MyDatabaseDetails.class);
		System.out.println(dbdetails);
	}

}
