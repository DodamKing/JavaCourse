package t3_override;

public class ChildGa extends ParentA {
	int no1, no2;
	
	public ChildGa(int no1, int no2) {
		super(no1, no2);
	}
	
	void motGaA() {
		System.out.println("modGaA");
		System.out.println("곱: " + (su1 + su2));
	}
	
	void motGaB() {
		System.out.println("modGab");
		System.out.println("몫 " + (su1 - su2));
	}
	
	void mot2() {
		System.out.println("mod2");
		System.out.println("곱: " + (su1 * su2));
	}
}
