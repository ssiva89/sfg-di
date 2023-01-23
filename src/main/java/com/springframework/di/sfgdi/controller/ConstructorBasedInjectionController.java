package com.springframework.di.sfgdi.controller;

import com.springframework.di.sfgdi.service.GreetingService;

public class ConstructorBasedInjectionController {
	
	private final GreetingService greetingService;
	
	public ConstructorBasedInjectionController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public void printGreetings() {
		System.out.println(greetingService.sayHello());
	}

}
