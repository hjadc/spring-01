package com.huju.spring.demo1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringDemo1 {
	
	/**
	 * 
	 * 传统方式
	 */
    @Test
	public void demo(){
    	UserDao userDao = new UserDaoImpl();
    	userDao.sayHello();
		
	}
    
    /**
     * Spring的方式
     * IOC的底层实现: 工厂+反射+配置文件
     */
    @Test
    public void demo2(){
    	// 创建工厂类
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    	UserDao userDao = (UserDao)applicationContext.getBean("userDao");
    	userDao.sayHello();
    }
    
    /**
     * 加载本地磁盘上的文件
     */
    @Test
    public void demo3(){
    	ApplicationContext applicationContext = new FileSystemXmlApplicationContext("‪C:/applicationContext.xml");
    	UserDao userDao = (UserDao)applicationContext.getBean("userDao");
    	userDao.sayHello();
    }

}
