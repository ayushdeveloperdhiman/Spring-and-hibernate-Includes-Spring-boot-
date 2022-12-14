package com.ayush.springDemo;

public class BasketballCoach implements Coach{
	
	//Define a private field for the dependency
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection
	public BasketballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting";
	}

	@Override
	public String getDailyFortune() {
		// Use my fortuneService to get fortune
		return fortuneService.getFortune();
	}

}
