package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.lzl.inter.AandB;
import cn.lzl.spring.bean.Student;

public class TestCase {
	@Test
	public void test1() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Student s1 = ac.getBean("s1",Student.class);
		Student s2 = ac.getBean("s1",Student.class);
		//容器默认创建一个实例
		System.out.println(s1==s2);
		Student s3 = ac.getBean("s2",Student.class);
		Student s4 = ac.getBean("s2",Student.class);
		//容器默认创建一个实例
		System.out.println(s3==s4);
		AandB AB = (AandB)ac.getBean("test");
		AB.print();
	}
}
