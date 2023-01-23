package com.springframework.di.sfgdi.controller;

import org.junit.Before;
import org.junit.Test;

import com.springframework.di.sfgdi.service.ConstructorGreetingServiceImpl;

public class ConstructorBasedInjectionControllerTest {
	
	ConstructorBasedInjectionController constructorBasedInjectionController;
	
	@Before
	public void setUp() {
		constructorBasedInjectionController = new ConstructorBasedInjectionController(new ConstructorGreetingServiceImpl());
	}
	
	@Test
	public void testPrintGreeting() {
		constructorBasedInjectionController.printGreetings();
	}

}
