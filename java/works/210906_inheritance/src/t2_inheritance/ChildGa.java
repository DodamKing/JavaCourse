package t2_inheritance;

// 사칙연산이 필요
public class ChildGa extends ParentA {
	public int no1;
	public int no2;
	
	public ChildGa(int no1, int no2) {
		super(no1, no2);
	}
	
	public ChildGa (int no1, int no2, int no3) {
		super(no1, no2, no3);
	}
	
	public void mul (int su1, int su2) {
		System.out.println("곱은: " + (su1 * su2));
	}
	
	public void div (int su1, int su2) {
		System.out.println("몫은: " + (su1 / su2));
	}
	
	public void calc() {
		add(su1, su2);
		sub(su1, su2);
		mul(su1, su2);
		div(su1, su2);
	}
}
