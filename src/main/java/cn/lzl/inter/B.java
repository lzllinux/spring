package cn.lzl.inter;

public class B implements AandB{

	private AandB AB;
	
	public B() {
	}
	
	public AandB getAB() {
		return AB;
	}

	public void setAB(AandB aB) {
		AB = aB;
	}

	public void print() {
		System.out.println("B");
		
	}

}
