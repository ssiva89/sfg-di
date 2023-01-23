package com.springframework.di.sfgdi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.springframework.di.sfgdi.service.GreetingService;

@Controller
public class ConstructorBasedInjectionController {
	
	private final GreetingService greetingService;
	
	//autowired annotation not required.
	@Autowired
	public ConstructorBasedInjectionController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public void printGreetings() {
		System.out.println(greetingService.sayHello());
	}

}
