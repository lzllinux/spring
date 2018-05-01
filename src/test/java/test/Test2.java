package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.lzl.aonn.Car;
import cn.lzl.aonn.Ctiy;

public class Test2 {
	@Test
	public void test1() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("aoon.xml");
		Ctiy car = ac.getBean("c",Ctiy.class);
		System.out.println(car);
	}
}
