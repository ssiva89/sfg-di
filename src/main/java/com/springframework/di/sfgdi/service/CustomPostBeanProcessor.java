package com.springframework.di.sfgdi.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class CustomPostBeanProcessor implements BeanPostProcessor {
	
	@Override
	public Object postProcessBeforeInitialization(Object bean , String beanName) throws BeansException {
		if(bean instanceof BeanLifeCycleDemoService) {
			((BeanLifeCycleDemoService) bean).beforeInit();
		}
		return bean;
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean , String beanName) throws BeansException{
		if(bean instanceof BeanLifeCycleDemoService) {
			((BeanLifeCycleDemoService) bean).afterInit();
		}
		return bean;
	}

}
