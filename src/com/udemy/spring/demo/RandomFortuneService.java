package com.udemy.spring.demo;

import java.util.Random;


public class RandomFortuneService implements FortuneService {
	
	private String[] arrayFortune = new String[]{"1", "2", "3"};
	
	@Override
	public String getFortune() {
		Random random=new Random();
		int randomFortune = random.nextInt((arrayFortune.length - 1) + 1) + 1;

		return arrayFortune[randomFortune - 1];
	}

}
