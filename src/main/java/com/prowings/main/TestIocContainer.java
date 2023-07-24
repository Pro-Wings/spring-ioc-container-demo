package com.prowings.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prowings.models.Employee;
import com.prowings.models.Student;

public class TestIocContainer {
	
	public static void main(String[] args) {
		
		ApplicationContext context =new ClassPathXmlApplicationContext("springBeans.xml");

		Student s1 = (Student) context.getBean("stud1");
		System.out.println(s1);

		Student s2 = context.getBean("std2", Student.class);
		System.out.println(">>>>>>>std2 >>>>>>"+s2);
		
		System.out.println(s1 == s2);
		
		System.out.println("=======================");
		Employee e = context.getBean("emp2", Employee.class);
		
		System.out.println(e);
		
	}

}
