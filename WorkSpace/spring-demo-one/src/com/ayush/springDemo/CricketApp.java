package com.ayush.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CricketApp {
	
	public static void main(String[] args) {
		
		//load the configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from the spring container
		CricketCoach theCoach = context.getBean("myCoach2",CricketCoach.class);
		CricketCoach theCoach1 = context.getBean("myCoach3",CricketCoach.class);
		
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeam());
		
		System.out.println(theCoach1.getEmailAddress());
		System.out.println(theCoach1.getTeam());
		
		//close context
		context.close();
		
	}

}
