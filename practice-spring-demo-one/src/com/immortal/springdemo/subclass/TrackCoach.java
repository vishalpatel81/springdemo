package com.immortal.springdemo.subclass;

import com.immortal.springdemo.iterfaces.ICoach;
import com.immortal.springdemo.iterfaces.IFortuneService;

public class TrackCoach implements ICoach {

	private IFortuneService iFortuneService;
	
	public TrackCoach(IFortuneService iFortuneService) {
		this.iFortuneService = iFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "TrackCoach -> getDailyWorkout()";
	}

	@Override
	public String getDailyFortune() {
		
		return "TrackCoach -> getDailyFortune(): " + iFortuneService.getFortune();
	}
}
