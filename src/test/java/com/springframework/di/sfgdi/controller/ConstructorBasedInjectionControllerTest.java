package com.springframework.di.sfgdi.controller;

import org.junit.Before;
import org.junit.Test;

import com.springframework.di.sfgdi.service.GreetingServiceImpl;

public class ConstructorBasedInjectionControllerTest {
	
	ConstructorBasedInjectionController constructorBasedInjectionController;
	
	@Before
	public void setUp() {
		constructorBasedInjectionController = new ConstructorBasedInjectionController(new GreetingServiceImpl());
	}
	
	@Test
	public void testPrintGreeting() {
		constructorBasedInjectionController.printGreetings();
	}

}
