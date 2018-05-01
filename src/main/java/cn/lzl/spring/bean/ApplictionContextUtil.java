package cn.lzl.spring.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

final class ApplictionContextUtil {
	private static ApplicationContext ctx=null;
	public ApplictionContextUtil() {
		
	}
	static {
		ctx = new ClassPathXmlApplicationContext("aoon.xml");
	}
	public static ApplicationContext getApplicationContext() {
		return ctx;
	}
	
}
