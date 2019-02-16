package com.huju.spring.demo3;

/**
 * Bean2的静态工厂
 * @author huju
 *
 */
public class Bean2Factory {
	
	public static Bean2 createBean2(){
		System.out.println("Bean2的静态工厂被调用...");
		return new Bean2();
	}

}
