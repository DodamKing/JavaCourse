package t4_protected;

public class Test1 extends Test0 {
	public int su1;
	int su2;
	private int su3;
	protected int su4;
	
	void test() {
		su1 = tu1;
		su2 = tu2;
//		su3 = tu3; private 호출 불가능
		su4 = tu4;
	}
}
