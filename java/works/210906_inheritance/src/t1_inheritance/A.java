package t1_inheritance;

// 두수의 합
public class A extends B {
	public int su1;
	public int su2;
	
	public void add(int su1, int su2) {
		System.out.println("합은: " + (su1 + su2));
	}
	
	public void sub(int su1, int su2) {
		System.out.println("차는: " + (su1 - su2));
	}
}
