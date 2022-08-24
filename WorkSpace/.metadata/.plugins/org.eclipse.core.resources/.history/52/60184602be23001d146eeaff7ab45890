package com.ayush.springDemo;

public class CricketCoach implements Coach{
	
	private FortuneService fortuneService;
	
	
	//Create no-arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-args constructor");
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	//Create setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method");
		this.fortuneService = fortuneService;
	}
	

}
