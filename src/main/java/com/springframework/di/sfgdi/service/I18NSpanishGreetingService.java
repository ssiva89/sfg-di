package com.springframework.di.sfgdi.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18NGreetingService")
public class I18NSpanishGreetingService implements GreetingService {

	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return "helo mundo - ES";
	}

}
