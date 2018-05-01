package cn.lzl.aonn;

import java.util.Arrays;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("c")
public class Ctiy {
	//@Autowired
	@Resource
	private A a;
	private String Area;

	
	public Ctiy() {
		System.out.println("cc");
		//Area = "beijing";
	}

	public String getArea() {
		return Area;
	}

	public void setArea(String area) {
		Area = area;
	}

	@Override
	public String toString() {
		return "Ctiy [Area=" + Area + "]";
	}


	
}
