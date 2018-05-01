package cn.lzl.inter;

public class TestAB implements AandB{

	private AandB AB;
	
	public TestAB() {
		
	}

	public AandB getAB() {
		return AB;
	}

	public void setAB(AandB aB) {
		AB = aB;
	}

	public void print() {
		AB.print();
		
	}
	
}
