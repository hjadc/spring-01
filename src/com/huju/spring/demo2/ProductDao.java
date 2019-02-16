package com.huju.spring.demo2;

public class ProductDao {

	// 使用空参构造来查看对象被创建了几次
	public ProductDao() {
		super();
		System.out.println("product新建了一个...");
	}

	public void setup() {
		System.out.println("初始化执行的方法...");
	}

	public void tearDown() {
		System.out.println("销毁时执行的方法...");
	}

}
