package com.huju.spring.demo2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo2 {

	/**
	 * Bean的作用范围的测试
	 */
	@Test
	public void demo1(){
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		ProductDao dao = applicationContext.getBean(ProductDao.class);
		System.out.println(dao);
		ProductDao dao1 =  (ProductDao)applicationContext.getBean("productDao");
		System.out.println(dao1);
		
		applicationContext.close();
	}
}
