package com.ayush.springDemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	

	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run 5km";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just do it: "+fortuneService.getFortune();
	}
	
	//add an init method
	public void doStartupStuff() {
		System.out.println("Inside methode: doStartupStuff()");
		
	}
	
	//add a destroy method
	public void doCleanupStuff() {
		System.out.println("Inside methode: doCleanupStuff()");
		
	}

}
