package cn.lzl.spring.bean;
import java.util.Calendar;
import java.util.Date;

import org.springframework.context.ApplicationContext;

import cn.lzl.aonn.Ctiy;

public class Main {

	public static void main(String[] args) {
		//创建spring Doc容器
		ApplicationContext ctx = ApplictionContextUtil.getApplicationContext();// new ClassPathXmlApplicationContext("applicationContext.xml");
		//获得bean实例
		//Hello h = (Hello)ctx.getBean("hello");
		//运行bean方法
		///h.setName("lzl"); 
		//h.hello();
		System.out.println("===================");
		//获得student对象seter注入
		//Student s1 = (Student)ctx.getBean("s1");
		//System.out.println(s1);
		//构造方法注入
		///Student s2 = (Student)ctx.getBean("s2");
		//System.out.println(s2);
		//System.out.println(s1==s2);
		//通过静态工厂方法
		//Calendar cal = ctx.getBean("cal",Calendar.class);
		//System.out.println(cal);
		//使用实例工厂方法创建
		//Date date = ctx.getBean("time",Date.class);
		//System.out.println(date);
		Ctiy ce = ctx.getBean("c",Ctiy.class);
		System.out.println(ce.toString());
	}


}
