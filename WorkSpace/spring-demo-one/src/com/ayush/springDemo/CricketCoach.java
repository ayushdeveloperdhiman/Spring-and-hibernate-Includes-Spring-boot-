package com.ayush.springDemo;

public class CricketCoach implements Coach{
	
	private FortuneService fortuneService;
	
	//add private fields for email address and team
	private String emailAddress;
	private String team;
	
	
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
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public void setTeam(String team) {
		this.team = team;
	}
	
	public String getEmailAddress() {
		return this.emailAddress;
	}
	
	public String getTeam() {
		return this.team;
	}

}
