package com.huju.spring.demo3;

/**
 * Bean3的实例工厂
 * @author huju
 *
 */
public class Bean3Factory {

	public Bean3 createBean3(){
		System.out.println("Bean3的实例工厂被调用...");
		return new Bean3();
	}
}
