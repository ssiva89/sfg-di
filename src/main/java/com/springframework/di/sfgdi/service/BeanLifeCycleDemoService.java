package com.springframework.di.sfgdi.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class BeanLifeCycleDemoService implements InitializingBean , DisposableBean ,
BeanNameAware, BeanFactoryAware, ApplicationContextAware {

	
	//InitializingBean interface
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("inside Initializing bean");
		
	}

	//DisposableBean
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("inside disposable bean");
	}

	//BeanNameAware
	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		System.out.println("bean name from the container:" + name);
		
	}

	//BeanFactoryAware
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("inside bean factory aware");
		System.out.println(beanFactory.getBean("i8"));
		
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("inside postconstruct");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("inside predestroy");
	}

	//ApplicationContextAware
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("inside application context aware");
		
	}
	
	public void beforeInit() {
		System.out.println("inside before init");
	}
	
	public void afterInit() {
		System.out.println("inside after init");
	}

}
