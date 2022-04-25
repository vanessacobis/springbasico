package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	/*
	 *  El @Qualifier("randomFortuneService") equivale
	 *  
	 *  FortuneService fortuneService = new RandomFortuneService();
	 * 
	 * */
	
	// define a default constructor
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor");		
	}

	/*
	// define a setter method
	@Autowired
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println(">> TennisCoach: inside setFortuneService() method");
		fortuneService = theFortuneService;
	}
	*/
	
	/*
	// define by method
	@Autowired
	public void doSomeCrazyStuff(FortuneService theFortuneService) {
		System.out.println(">> TennisCoach: inside doSomeCrazyStuff() method");
		fortuneService = theFortuneService;
	}
	*/
	
	/*
	@Autowired
	public TennisCoach(FortuneService thefortuneService) {
		fortuneService = thefortuneService;
	}
	*/
	
	
	/*
	 *   El @Autowired sustituye estas lineas de codigo
	 *   
	 *   
	 *   Coach theCoach = new TennisCoach(new HappyFortuneService())
	 * 
	 * 
	 * */
		
	public String getDailyWorkout() {	
		
		return "Practice your backhand volley";
	}
	
	public String getDailyFortune() {	
		
		return fortuneService.getFortune();
	}
	
}
