package com.immortal.springdemo.fortunes;

import com.immortal.springdemo.iterfaces.IFortuneService;

public class HappyFortuneService implements IFortuneService {

	@Override
	public String getFortune() {
		return "HappyFortuneService -> getFortune()";
	}
}
