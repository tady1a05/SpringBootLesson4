package com.test.springboot;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myCoachApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); /*get the context from applicationContext.xml*/
		
		Coach coach = context.getBean("myCoach", Coach.class);/*get spring bean object*/
		
		System.out.println(coach.doWorkout());
	}

}
