package t6_access.test;

public class Test1 {
	public int t1=10;
	int t2=20;
	private int t3=20;
	
	public void modT1() {
		System.out.println("이곳은 modT1");
	}
	
	void modT2() {
		System.out.println("이곳은 modT1");
	}
	
	private void modT3() {
		System.out.println("이곳은 modT1");
	}
}
