package com.udemy.spring.demo;

public class BaseballCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService theFortuneService)
	{
		fortuneService = theFortuneService;
	}
	
	//public BaseballCoach(){};
	
    public String getDailyWorkout()
    {
        return "Coming from BaseballCoach";
    }

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
}