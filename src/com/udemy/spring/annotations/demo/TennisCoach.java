package com.udemy.spring.annotations.demo;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	FortuneService fortuneService;
	
	public TennisCoach(FortuneService fortuneService)
	{
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Coming from TennisCoach in annotations' demo";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	

}
