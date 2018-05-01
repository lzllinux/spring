package cn.lzl.inter;

public class A implements AandB{

	private AandB AB;
	
	public A() {
		
	}

	public AandB getAB() {
		return AB;
	}

	public void setAB(AandB aB) {
		AB = aB;
	}

	public void print() {
		System.out.println("A");
	}
	
	

}
