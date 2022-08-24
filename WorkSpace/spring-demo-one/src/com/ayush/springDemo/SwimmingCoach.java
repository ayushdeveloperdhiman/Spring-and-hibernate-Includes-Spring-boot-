package com.ayush.springDemo;

public class SwimmingCoach implements Coach{
	
	
	private FortuneService fortuneService;
	
	
	
	public SwimmingCoach() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SwimmingCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Do swimming for 30 minutes";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just Do it: "+fortuneService.getFortune();
	}
	
	

}
