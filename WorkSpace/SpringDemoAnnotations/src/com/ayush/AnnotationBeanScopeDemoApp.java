package com.ayush;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		Coach theAlphaCoach = context.getBean("tennisCoach",Coach.class);
		boolean result = (theCoach == theAlphaCoach);
		System.out.println("\nPointing to the same object: "+result);
		System.out.println("\nMemory location for theCoach: "+theCoach);
		System.out.println("\nMemory location for theAlphaCoach: "+theAlphaCoach);
		context.close();

	}

}
