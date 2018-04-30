package com.udemy.spring.demo;

public class TrackCoach implements Coach {
	private FortuneService fortuneService;
	
	
	
    public TrackCoach() {
		
	}

	public TrackCoach(FortuneService fortuneService) {
		//super();
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
        return "Coming from TrackCoach";
    }

	@Override
	public String getDailyFortune() {
		return "TrackCoach : " + fortuneService.getFortune();
	}
}