package com.huju.spring.demo6_annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Component("userDao") 意思是装载到容器,相当于xml方式的配置了一个bean
 * 	 Spring中提供的三个衍生注解(与@Component的效果一致):
 * 		@Controller		: 修饰web层类的
 * 		@Service		: 修饰业务层类的
 * 		@Repository		: 修饰DAO层类的
 * 
 * @author huju
 *
 */
@Component("myUserDao")
public class MyUserDaoImpl implements MyUserDao{

	// 注解方式注入属性
	@Value("德玛西亚")
	private String name;
	
	@Override
	public void sayHello() {
		System.out.println("Hello Spring Annotation..." + name);
		
	}

	@Override
	public void save() {
		System.out.println("DAO中的save执行了...");
	}

}
