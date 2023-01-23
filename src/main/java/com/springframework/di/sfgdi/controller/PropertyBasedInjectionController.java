package com.springframework.di.sfgdi.controller;

import com.springframework.di.sfgdi.service.GreetingService;

public class PropertyBasedInjectionController {
	
	GreetingService greetingService ;
	
	public void printGreeting() {
		System.out.println(greetingService.sayHello());
	}

}
