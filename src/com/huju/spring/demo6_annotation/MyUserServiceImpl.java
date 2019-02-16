package com.huju.spring.demo6_annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;


/**
 * @Scope 可以控制作用范围(默认单例)
 * 
 * @author huju
 *
 */
@Service("myUserService")
// @Scope("prototype")
public class MyUserServiceImpl implements MyUserService {
	
	/**
	 * @Value		是注入普通类型的值
	 * @Autowired  	是注入对象类型的值,不是按照名称注入;要想按名称注入,要和@Qualifier一起使用,或者使用下面的这个注解
	 * @Resource	是按照名称来注入
	 * 				
	 */
	/*@Autowired
	@Qualifier("myUserDao")*/
	@Resource(name="myUserDao")
	private MyUserDao userDao;

	@Override
	public void save() {
		System.out.println("Service中的save执行了...");
		userDao.save();
	}
	
	@PostConstruct // 相当于 xml里的 init-method
	public void init(){
		System.out.println("UserService被初始化了...");
	}
	
	@PreDestroy		// 相当于 xml里的destroy-method
	public void destroy(){
		System.out.println("UserService被销毁了...");
	}

}
