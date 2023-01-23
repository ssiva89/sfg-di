package com.springframework.di.sfgdi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.springframework.di.sfgdi.service.GreetingService;

@Controller
public class SetterBasedInjectionController {
	
	private GreetingService greetingSErvice;

	@Autowired
	public void setGreetingSErvice(GreetingService greetingSErvice) {
		this.greetingSErvice = greetingSErvice;
	}
	
	public void printGreetings() {
		System.out.println(greetingSErvice.sayHello());
	}
	
	

}
