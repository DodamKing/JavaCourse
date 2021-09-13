package t03_memberClass;

import t03_memberClass.C.D;

public class CRun {
	public static void main(String[] args) {
		C c1 = new C();
		System.out.println("c1.suC1 = " + c1.suC1);
		c1.methodC1();
		
		C.D d1 = new C.D();
		System.out.println("d1.suD1 = " + d1.suC$D);
		d1.methodC$D();
		
		System.out.println("D.su2C$D");
		d1.methodC$D();
		D.method2C$D();
		
	}
}


