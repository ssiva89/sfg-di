package com.springframework.di.sfgdi.controller;

import org.junit.Before;
import org.junit.Test;

import com.springframework.di.sfgdi.service.SetterGreetingServiceImpl;

public class SetterBasedInjectionControllerTest {

	SetterBasedInjectionController setterBasedInjectionController ;
	
	
	@Before
	public void setUp() {
		setterBasedInjectionController = new SetterBasedInjectionController();
		setterBasedInjectionController.setGreetingSErvice(new SetterGreetingServiceImpl());
	}
	
	
	@Test
	public void testPrintGreeting() {
		setterBasedInjectionController.printGreetings();
	}

}
