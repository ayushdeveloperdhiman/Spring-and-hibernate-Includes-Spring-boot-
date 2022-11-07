package com.ayush;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService{

	public HappyFortuneService() {
		System.out.println(">>HappyFortuneService: inside default constructor");
	}
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Today is your lucky day!!";
	}

}
