package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	
	private FortuneService fortuneService;
	
	public CricketCoach() {
		System.out.println("we are inside CricketCoach no-args constructor");
	}
	
   //the setter method that will get called by spring when the dependency is injected
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("we are inside setter method");
		this.fortuneService = fortuneService;
	}




	@Override
	public String getDailyWorkOut() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
