package com.immortal.springdemo.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.immortal.springdemo.iterfaces.ICoach;

public class HelloSpringDemoApp {
	public static void main(String[] java) {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		ICoach theCoach = applicationContext.getBean("myCoach", ICoach.class);
		
		// call methods
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		applicationContext.close();
	}
}