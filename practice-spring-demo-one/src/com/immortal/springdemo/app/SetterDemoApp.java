package com.immortal.springdemo.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.immortal.springdemo.subclass.CricketCoach;


public class SetterDemoApp {
	public static void main(String[] java) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CricketCoach theCoach = context.getBean("cricketCoach", CricketCoach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		context.close(); 
	}
}
