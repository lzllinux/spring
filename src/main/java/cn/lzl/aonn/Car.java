package cn.lzl.aonn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
//@Scope指定作用域
@Component("c1")
public class Car {
	private  int id;
	
	private String name;
	
	private Ctiy C;
	
	public Ctiy getC() {
		return C;
	}

	
	public void setC( Ctiy c) {
		System.out.println("d");
		C = c;
	}


	public int getId() {
		return id;
	}

	
	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Car() {
		
	}
	
}
