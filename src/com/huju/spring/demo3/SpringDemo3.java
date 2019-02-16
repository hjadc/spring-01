package com.huju.spring.demo3;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Bean的实例化的三种方式
 * @author huju
 *
 */
public class SpringDemo3 {

	/**
	 * 无参构造的方式   -- 最常用 
	 */
	@Test
	public void demo1() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Bean1 bean1 = (Bean1) context.getBean("bean1");
		System.out.println(bean1);
	}
	
	/**
	 * 静态工厂实例化Bean
	 */
	@Test
	public void demo2() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Bean2 bean2 = (Bean2) context.getBean("bean2");
		System.out.println(bean2);
	}
	
	/**
	 * 实例工厂实例化Bean
	 */
	@Test
	public void demo3() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Bean3 bean3 = (Bean3) context.getBean("bean3");
		System.out.println(bean3);
	}

}
