package t3_override;

public class ParentA {
	int su1, su2;
	
	public ParentA(int su1, int su2) {
		this.su1 = su1;
		this.su2 = su2;
	}
	
	void mot1() {
		System.out.println("mod1");
		System.out.println("합: " + (su1 + su2));
	}
	
	void mot2() {
		System.out.println("mod2");
		System.out.println("차: " + (su1 - su2));
	}
	
}
