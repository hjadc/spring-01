package com.huju.spring.demo5;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试Spring的集合的属性的注入
 * 
 * @author huju
 *
 */
public class SpringDemo5 {

	@Test
	public void demo1() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		CollectionBean bean = (CollectionBean) context.getBean("collectionBean");
		System.out.println(bean);
	}
}
