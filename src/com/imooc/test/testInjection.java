package com.imooc.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.imooc.service.injectionService;
import com.imooc.service.injectionServiceImp;

import sun.management.counter.Units;


public class testInjection {
	
	
	
	@Test
	public void test(){
		ApplicationContext ac= new ClassPathXmlApplicationContext("applicationContext.xml");
		injectionService injectionservice = (com.imooc.service.injectionService) ac.getBean("injectionService");
		injectionservice.save("wang");
	}
}
