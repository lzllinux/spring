package cn.lzl.aonn;

import org.springframework.stereotype.Component;

@Component("a")
public class A {
	private String name;

	public A() {
		System.out.println("a");
	}
	
	
}
