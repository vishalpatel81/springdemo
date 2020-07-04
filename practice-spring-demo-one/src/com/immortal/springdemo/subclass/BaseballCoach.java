package com.immortal.springdemo.subclass;

import com.immortal.springdemo.iterfaces.ICoach;
import com.immortal.springdemo.iterfaces.IFortuneService;

public class BaseballCoach implements ICoach{

	private IFortuneService iFortuneService;
	
	public BaseballCoach(IFortuneService iFortuneService) {
		this.iFortuneService = iFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "BaseballCoach -> getDailyWorkout()";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "BaseballCoach -> getDailyFortune(): " + iFortuneService.getFortune();
	}
}
