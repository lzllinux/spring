package cn.lzl.spring.bean;
import java.util.Calendar;
import java.util.Date;

import org.springframework.context.ApplicationContext;

import cn.lzl.aonn.Ctiy;

public class Main {

	public static void main(String[] args) {
		//����spring Doc����
		ApplicationContext ctx = ApplictionContextUtil.getApplicationContext();// new ClassPathXmlApplicationContext("applicationContext.xml");
		//���beanʵ��
		//Hello h = (Hello)ctx.getBean("hello");
		//����bean����
		///h.setName("lzl"); 
		//h.hello();
		System.out.println("===================");
		//���student����seterע��
		//Student s1 = (Student)ctx.getBean("s1");
		//System.out.println(s1);
		//���췽��ע��
		///Student s2 = (Student)ctx.getBean("s2");
		//System.out.println(s2);
		//System.out.println(s1==s2);
		//ͨ����̬��������
		//Calendar cal = ctx.getBean("cal",Calendar.class);
		//System.out.println(cal);
		//ʹ��ʵ��������������
		//Date date = ctx.getBean("time",Date.class);
		//System.out.println(date);
		Ctiy ce = ctx.getBean("c",Ctiy.class);
		System.out.println(ce.toString());
	}


}
