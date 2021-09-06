package t1_inheritance;

// 사칙연산이 필요
public class Ga extends A {
	public int no1;
	public int no2;
	
	public void mul (int su1, int su2) {
		System.out.println("곱은: " + (su1 * su2));
	}
	
	public void div (int su1, int su2) {
		System.out.println("몫은: " + (su1 / su2));
	}
	
	public void calc(int su1, int su2) {
		add(su1, su2);
		sub(su1, su2);
		mul(su1, su2);
		div(su1, su2);
	}
}
