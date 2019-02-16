package com.huju.spring.demo1;

public class UserDaoImpl implements UserDao {

	private String name;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public void sayHello() {
		System.out.println("你好啊 spring damo1!" + name);
		
	}

}
