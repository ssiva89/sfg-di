package com.springframework.di.sfgdi.controller;

import com.springframework.di.sfgdi.service.GreetingService;

public class SetterBasedInjectionController {
	
	private GreetingService greetingSErvice;

	public void setGreetingSErvice(GreetingService greetingSErvice) {
		this.greetingSErvice = greetingSErvice;
	}
	
	public void printGreetings() {
		System.out.println(greetingSErvice.sayHello());
	}
	
	

}
