package com.springframework.di.sfgdi.controller;

import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.springframework.di.sfgdi.service.PropertyGreetingServiceImpl;

@SpringBootTest
public class PropertyBasedInjectionControllerTest {
	
	PropertyBasedInjectionController propertyBasedInjectionController ;
	
	
	@Before
	public void setUp() {
		propertyBasedInjectionController = new PropertyBasedInjectionController();
		propertyBasedInjectionController.greetingService = new PropertyGreetingServiceImpl();
	}
	
	
	@Test
	public void testPrintGreeting() {
		propertyBasedInjectionController.printGreeting();
	}
	
	

}
