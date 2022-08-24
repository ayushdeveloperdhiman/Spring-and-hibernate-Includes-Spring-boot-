package com.ayush.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {
	
	public static void main(String[] args) {
		
		//Load the configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from the spring container
		
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		//call methods on the bean
	    System.out.println(theCoach.getDailyWorkout());
	    
	    Coach theCoach1 = context.getBean("myCoach1",Coach.class);
	    System.out.println(theCoach1.getDailyWorkout());
	    
	    //Let's call our new method for fortunes
	    System.out.println(theCoach.getDailyFortune());
	    System.out.println(theCoach1.getDailyFortune());
		//close the context
	    context.close();
		
	}
	
}
