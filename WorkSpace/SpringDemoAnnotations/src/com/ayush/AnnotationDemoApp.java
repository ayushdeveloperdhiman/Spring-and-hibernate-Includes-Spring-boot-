package com.ayush;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean from spring container
		Coach tennisCoach = context.getBean("tennisCoach",Coach.class);
		Coach footballCoach = context.getBean("coach1",Coach.class);
		
		//call a method on the bean
		System.out.println(tennisCoach.getDailyWorkout());
		System.out.println(footballCoach.getDailyWorkout());
		System.out.println(tennisCoach.getDailyFortune());
		System.out.println(footballCoach.getDailyFortune());
		
		//close the context
		context.close();
	}

}
