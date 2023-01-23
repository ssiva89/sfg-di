package com.springframework.di.sfgdi.service;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingServiceImpl implements GreetingService {

	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return "Hello from service - setter based";
	}

}
