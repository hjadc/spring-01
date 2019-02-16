package com.huju.spring.demo4;

/**
 * xml方式:通过set方法设置属性值
 * @author huju
 *
 */
public class Car2 {
	private String name;
	private Double price;
	
	

	public void setName(String name) {
		this.name = name;
	}



	public void setPrice(Double price) {
		this.price = price;
	}



	@Override
	public String toString() {
		return "Car [name=" + name + ", price=" + price + "]";
	}
	
}
