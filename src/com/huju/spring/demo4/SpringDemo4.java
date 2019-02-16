package com.huju.spring.demo4;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring的属性注入测试
 * @author huju
 *
 */
public class SpringDemo4 {

	/**
	 * 通过构造方法注入属性
	 */
	@Test
	public void demo1(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Car bean = context.getBean(Car.class);
		System.out.println(bean);
	}
	
	/**
	 * 通过set方法注入属性
	 */
	@Test
	public void demo2(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Car2 bean = (Car2)context.getBean("car2");
		System.out.println(bean);
	}
	
	/**
	 * 通过set方法注入对象属性
	 */
	@Test
	public void demo3(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee bean = (Employee)context.getBean("employee");
		System.out.println(bean);
	}
}
