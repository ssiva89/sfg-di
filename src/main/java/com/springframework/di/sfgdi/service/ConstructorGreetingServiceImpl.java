package com.springframework.di.sfgdi.service;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServiceImpl implements GreetingService {

	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return "Hello from service - constructor based";
	}

}
