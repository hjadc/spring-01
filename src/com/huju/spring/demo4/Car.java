package com.huju.spring.demo4;

/**
 * xml方式:通过构造方法设置属性值
 * @author huju
 *
 */
public class Car {
	private String name;
	private Double price;
	
	
	public Car(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", price=" + price + "]";
	}
}
