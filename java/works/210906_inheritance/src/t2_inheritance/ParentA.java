package t2_inheritance;

public class ParentA {
	int su1, su2, su3;
	
//	public ParentA() {}
	public ParentA(int su1, int su2) {
		this.su1 = su1;
		this.su2 = su2;
	}
	
	public ParentA(int su1, int su2, int su3) {
		this.su1 = su1;
		this.su2 = su2;
		this.su3 = su3;
	}
	
	public void add(int su1, int su2) {
		System.out.println("합은: " + (su1 + su2));
	}
	
	public void sub(int su1, int su2) {
		System.out.println("차는: " + (su1 - su2));
	}
	
	void area() {
		int area = (su1 + su2) * su3 / 2;
		System.out.println("넓이: " + area);
	}
}
