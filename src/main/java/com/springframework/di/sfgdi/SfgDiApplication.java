package com.springframework.di.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springframework.di.sfgdi.controller.ConstructorBasedInjectionController;
import com.springframework.di.sfgdi.controller.I18NProfileGreetingController;
import com.springframework.di.sfgdi.controller.PropertyBasedInjectionController;
import com.springframework.di.sfgdi.controller.SetterBasedInjectionController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		
		//property based dI
		PropertyBasedInjectionController propertyBasedInjectionController = (PropertyBasedInjectionController) ctx.getBean("propertyBasedInjectionController");
		propertyBasedInjectionController.printGreeting();
		
		//setter based dI
		SetterBasedInjectionController setterBasedInjectionController = (SetterBasedInjectionController) ctx.getBean("setterBasedInjectionController");
		setterBasedInjectionController.printGreetings();
		
		//constructer based di
		ConstructorBasedInjectionController constructorBasedInjectionController = (ConstructorBasedInjectionController)ctx.getBean("constructorBasedInjectionController");
		constructorBasedInjectionController.printGreetings();
		
		//profiles
		I18NProfileGreetingController i18nProfileGreetingController = (I18NProfileGreetingController) ctx.getBean("i8");
		i18nProfileGreetingController.printGreeting();
	}

}
