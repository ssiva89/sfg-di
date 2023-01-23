package com.springframework.di.sfgdi.controller;

import org.junit.Before;
import org.junit.Test;

import com.springframework.di.sfgdi.service.GreetingServiceImpl;

public class SetterBasedInjectionControllerTest {

	SetterBasedInjectionController setterBasedInjectionController ;
	
	
	@Before
	public void setUp() {
		setterBasedInjectionController = new SetterBasedInjectionController();
		setterBasedInjectionController.setGreetingSErvice(new GreetingServiceImpl());
	}
	
	
	@Test
	public void testPrintGreeting() {
		setterBasedInjectionController.printGreetings();
	}

}
