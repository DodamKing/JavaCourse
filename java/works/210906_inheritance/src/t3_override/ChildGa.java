package t3_override;

public class ChildGa extends ParentA {
	int no1, no2;
	
	public ChildGa(int no1, int no2) {
		super(no1, no2);
	}
	
	void motGaA() {
		System.out.println("modGaA");
		System.out.println("곱: " + (su1 * su2));
	}
	
	void motGaB() {
		System.out.println("modGab");
		System.out.println("몫 " + (su1 - su2));
	}
	
	void mot2() {
		System.out.println("mod2");
		System.out.println("나머지: " + (su1 % su2));
	}

	
	// 원 넓이 메소드 오버라이드
	@Override
	void circleArea(int r) {
		System.out.printf("원의 넓이: %.2f\n", r * r * Math.PI);
	}
	
	void circleAreaP(int r) {
		super.circleArea(r);
	}
	
	void fieldPrint(int pa) {
		this.pa = 500;
		System.out.println(this.pa);
	}
	
	
}
