package t03_memberClass;

public class ARun {
	public static void main(String[] args) {
		A a1 = new A();
		System.out.println("a1.suA1 = " + a1.suA1);
		a1.methodA1();
		
		A.B b1 = a1.new B();
		System.out.println(b1.suA$B);
		b1.methodA$B();
	}
}


