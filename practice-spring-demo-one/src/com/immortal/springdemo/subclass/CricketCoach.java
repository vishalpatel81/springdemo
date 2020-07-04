package com.immortal.springdemo.subclass;

import com.immortal.springdemo.iterfaces.ICoach;
import com.immortal.springdemo.iterfaces.IFortuneService;

public class CricketCoach implements ICoach {

	private IFortuneService iFortuneService;
	
	public void setiFortuneService(IFortuneService iFortuneService) {
		this.iFortuneService = iFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "CircketCoach -> getDailyWorkout()";
	}

	@Override
	public String getDailyFortune() {
		return "CricketCoach -> getDailyFortune(): " + iFortuneService.getFortune();
	}
}
