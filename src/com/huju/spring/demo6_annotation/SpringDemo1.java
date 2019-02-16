package com.huju.spring.demo6_annotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 该包下为注解方式的测试
 * @author huju
 *
 */
public class SpringDemo1 {

	/**
	 * 传统方式
	 */
	@Test
	public void demo1() {
		MyUserDao userDao = new MyUserDaoImpl();
		userDao.sayHello();
	}

	/**
	 * Spring的注解方式
	 */
	@Test
	public void demo2() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		MyUserDao userDao = (MyUserDao) applicationContext.getBean("myUserDao");
		userDao.sayHello();
	}
	
	/**
	 * Spring的方式: 注入对象类型
	 */
	@Test
	public void demo3() {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		MyUserService userService = (MyUserService) applicationContext.getBean("myUserService");
		System.out.println(userService);
		MyUserService userService2 = (MyUserService) applicationContext.getBean("myUserService");
		System.out.println(userService2);
		userService.save();
		applicationContext.close();
	}

}
