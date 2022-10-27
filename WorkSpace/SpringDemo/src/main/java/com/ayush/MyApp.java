package com.ayush;

import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MyApp {
public static void main(String[] args) {
		
	
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		
		Employee emp = context.getBean("myEmployee",Employee.class);
		
		
		System.out.println(emp.getDepartmentName());
		System.out.println(emp.getEmpName());
		System.out.println(emp.getEmpId());
		
		context.close();
}
}
