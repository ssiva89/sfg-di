package com.springframework.di.sfgdi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.springframework.di.sfgdi.service.GreetingService;

@Controller
public class PropertyBasedInjectionController {
	
	@Qualifier("propertyGreetingServiceImpl")
	@Autowired
	GreetingService greetingService ;
	
	public void printGreeting() {
		System.out.println(greetingService.sayHello());
	}

}
