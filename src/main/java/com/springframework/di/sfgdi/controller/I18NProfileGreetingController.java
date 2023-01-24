package com.springframework.di.sfgdi.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.springframework.di.sfgdi.service.GreetingService;

@Controller("i8")
public class I18NProfileGreetingController {
	
	private final GreetingService greetingService;
	
	public I18NProfileGreetingController(@Qualifier("i18NGreetingService")GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public void printGreeting() {
		System.out.println(greetingService.sayHello());
	}

}
